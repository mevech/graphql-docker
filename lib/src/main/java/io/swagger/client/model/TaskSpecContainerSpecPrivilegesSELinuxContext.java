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
 * SELinux labels of the container
 */
@ApiModel(description = "SELinux labels of the container")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class TaskSpecContainerSpecPrivilegesSELinuxContext {
  @SerializedName("Disable")
  private Boolean disable = null;

  @SerializedName("User")
  private String user = null;

  @SerializedName("Role")
  private String role = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Level")
  private String level = null;

  public TaskSpecContainerSpecPrivilegesSELinuxContext disable(Boolean disable) {
    this.disable = disable;
    return this;
  }

   /**
   * Disable SELinux
   * @return disable
  **/
  @ApiModelProperty(value = "Disable SELinux")
  public Boolean isDisable() {
    return disable;
  }

  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext user(String user) {
    this.user = user;
    return this;
  }

   /**
   * SELinux user label
   * @return user
  **/
  @ApiModelProperty(value = "SELinux user label")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext role(String role) {
    this.role = role;
    return this;
  }

   /**
   * SELinux role label
   * @return role
  **/
  @ApiModelProperty(value = "SELinux role label")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext type(String type) {
    this.type = type;
    return this;
  }

   /**
   * SELinux type label
   * @return type
  **/
  @ApiModelProperty(value = "SELinux type label")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext level(String level) {
    this.level = level;
    return this;
  }

   /**
   * SELinux level label
   * @return level
  **/
  @ApiModelProperty(value = "SELinux level label")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecPrivilegesSELinuxContext taskSpecContainerSpecPrivilegesSELinuxContext = (TaskSpecContainerSpecPrivilegesSELinuxContext) o;
    return Objects.equals(this.disable, taskSpecContainerSpecPrivilegesSELinuxContext.disable) &&
        Objects.equals(this.user, taskSpecContainerSpecPrivilegesSELinuxContext.user) &&
        Objects.equals(this.role, taskSpecContainerSpecPrivilegesSELinuxContext.role) &&
        Objects.equals(this.type, taskSpecContainerSpecPrivilegesSELinuxContext.type) &&
        Objects.equals(this.level, taskSpecContainerSpecPrivilegesSELinuxContext.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disable, user, role, type, level);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecPrivilegesSELinuxContext {\n");
    
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

