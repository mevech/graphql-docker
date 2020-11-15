/*
 * Docker Engine API
 * The Engine API is an HTTP API served by Docker Engine. It is the API the Docker client uses to communicate with the Engine, so everything the Docker client can do can be done with the API.  Most of the client's commands map directly to API endpoints (e.g. `docker ps` is `GET /containers/json`). The notable exception is running containers, which consists of several API calls.  # Errors  The API uses standard HTTP status codes to indicate the success or failure of the API call. The body of the response will be JSON in the following format:  ``` {   \"message\": \"page not found\" } ```  # Versioning  The API is usually changed in each release, so API calls are versioned to ensure that clients don't break. To lock to a specific version of the API, you prefix the URL with its version, for example, call `/v1.30/info` to use the v1.30 version of the `/info` endpoint. If the API version specified in the URL is not supported by the daemon, a HTTP `400 Bad Request` error message is returned.  If you omit the version-prefix, the current version of the API (v1.40) is used. For example, calling `/info` is the same as calling `/v1.40/info`. Using the API without a version-prefix is deprecated and will be removed in a future release.  Engine releases in the near future should support this version of the API, so your client will continue to work even if it is talking to a newer Engine.  The API uses an open schema model, which means server may add extra properties to responses. Likewise, the server will ignore any extra query parameters and request body properties. When you write clients, you need to ignore additional properties in responses to ensure they do not break when talking to newer daemons.   # Authentication  Authentication for registries is handled client side. The client has to send authentication details to various endpoints that need to communicate with registries, such as `POST /images/(name)/push`. These are sent as `X-Registry-Auth` header as a [base64url encoded](https://tools.ietf.org/html/rfc4648#section-5) (JSON) string with the following structure:  ``` {   \"username\": \"string\",   \"password\": \"string\",   \"email\": \"string\",   \"serveraddress\": \"string\" } ```  The `serveraddress` is a domain/IP without a protocol. Throughout this structure, double quotes are required.  If you have already got an identity token from the [`/auth` endpoint](#operation/SystemAuth), you can just pass this instead of credentials:  ``` {   \"identitytoken\": \"9cbaf023786cd7...\" } ``` 
 *
 * OpenAPI spec version: 1.40
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * File represents a specific target that is backed by a file.  &lt;p&gt;&lt;br /&gt;&lt;p&gt;  &gt; **Note**: &#x60;Configs.File&#x60; and &#x60;Configs.Runtime&#x60; are mutually exclusive 
 */
@ApiModel(description = "File represents a specific target that is backed by a file.  <p><br /><p>  > **Note**: `Configs.File` and `Configs.Runtime` are mutually exclusive ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class TaskSpecContainerSpecFile1 {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("UID")
  private String UID = null;

  @SerializedName("GID")
  private String GID = null;

  @SerializedName("Mode")
  private Integer mode = null;

  public TaskSpecContainerSpecFile1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name represents the final filename in the filesystem. 
   * @return name
  **/
  @ApiModelProperty(value = "Name represents the final filename in the filesystem. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskSpecContainerSpecFile1 UID(String UID) {
    this.UID = UID;
    return this;
  }

   /**
   * UID represents the file UID.
   * @return UID
  **/
  @ApiModelProperty(value = "UID represents the file UID.")
  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }

  public TaskSpecContainerSpecFile1 GID(String GID) {
    this.GID = GID;
    return this;
  }

   /**
   * GID represents the file GID.
   * @return GID
  **/
  @ApiModelProperty(value = "GID represents the file GID.")
  public String getGID() {
    return GID;
  }

  public void setGID(String GID) {
    this.GID = GID;
  }

  public TaskSpecContainerSpecFile1 mode(Integer mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Mode represents the FileMode of the file.
   * @return mode
  **/
  @ApiModelProperty(value = "Mode represents the FileMode of the file.")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecFile1 taskSpecContainerSpecFile1 = (TaskSpecContainerSpecFile1) o;
    return Objects.equals(this.name, taskSpecContainerSpecFile1.name) &&
        Objects.equals(this.UID, taskSpecContainerSpecFile1.UID) &&
        Objects.equals(this.GID, taskSpecContainerSpecFile1.GID) &&
        Objects.equals(this.mode, taskSpecContainerSpecFile1.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, UID, GID, mode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecFile1 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
    sb.append("    GID: ").append(toIndentedString(GID)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
