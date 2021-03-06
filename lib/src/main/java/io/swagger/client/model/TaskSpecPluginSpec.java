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
import io.swagger.client.model.Body;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Plugin spec for the service.  *(Experimental release only.)*  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are &gt; mutually exclusive. PluginSpec is only used when the Runtime field &gt; is set to &#x60;plugin&#x60;. NetworkAttachmentSpec is used when the Runtime &gt; field is set to &#x60;attachment&#x60;. 
 */
@ApiModel(description = "Plugin spec for the service.  *(Experimental release only.)*  <p><br /></p>  > **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are > mutually exclusive. PluginSpec is only used when the Runtime field > is set to `plugin`. NetworkAttachmentSpec is used when the Runtime > field is set to `attachment`. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class TaskSpecPluginSpec {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Remote")
  private String remote = null;

  @SerializedName("Disabled")
  private Boolean disabled = null;

  @SerializedName("PluginPrivilege")
  private List<Body> pluginPrivilege = null;

  public TaskSpecPluginSpec name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name or &#39;alias&#39; to use for the plugin.
   * @return name
  **/
  @ApiModelProperty(value = "The name or 'alias' to use for the plugin.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskSpecPluginSpec remote(String remote) {
    this.remote = remote;
    return this;
  }

   /**
   * The plugin image reference to use.
   * @return remote
  **/
  @ApiModelProperty(value = "The plugin image reference to use.")
  public String getRemote() {
    return remote;
  }

  public void setRemote(String remote) {
    this.remote = remote;
  }

  public TaskSpecPluginSpec disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Disable the plugin once scheduled.
   * @return disabled
  **/
  @ApiModelProperty(value = "Disable the plugin once scheduled.")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public TaskSpecPluginSpec pluginPrivilege(List<Body> pluginPrivilege) {
    this.pluginPrivilege = pluginPrivilege;
    return this;
  }

  public TaskSpecPluginSpec addPluginPrivilegeItem(Body pluginPrivilegeItem) {
    if (this.pluginPrivilege == null) {
      this.pluginPrivilege = new ArrayList<Body>();
    }
    this.pluginPrivilege.add(pluginPrivilegeItem);
    return this;
  }

   /**
   * Get pluginPrivilege
   * @return pluginPrivilege
  **/
  @ApiModelProperty(value = "")
  public List<Body> getPluginPrivilege() {
    return pluginPrivilege;
  }

  public void setPluginPrivilege(List<Body> pluginPrivilege) {
    this.pluginPrivilege = pluginPrivilege;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecPluginSpec taskSpecPluginSpec = (TaskSpecPluginSpec) o;
    return Objects.equals(this.name, taskSpecPluginSpec.name) &&
        Objects.equals(this.remote, taskSpecPluginSpec.remote) &&
        Objects.equals(this.disabled, taskSpecPluginSpec.disabled) &&
        Objects.equals(this.pluginPrivilege, taskSpecPluginSpec.pluginPrivilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, remote, disabled, pluginPrivilege);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecPluginSpec {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    pluginPrivilege: ").append(toIndentedString(pluginPrivilege)).append("\n");
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

