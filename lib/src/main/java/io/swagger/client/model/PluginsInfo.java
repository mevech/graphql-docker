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
import java.util.ArrayList;
import java.util.List;

/**
 * Available plugins per type.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: Only unmanaged (V1) plugins are included in this list. &gt; V1 plugins are \&quot;lazily\&quot; loaded, and are not returned in this list &gt; if there is no resource using the plugin. 
 */
@ApiModel(description = "Available plugins per type.  <p><br /></p>  > **Note**: Only unmanaged (V1) plugins are included in this list. > V1 plugins are \"lazily\" loaded, and are not returned in this list > if there is no resource using the plugin. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class PluginsInfo {
  @SerializedName("Volume")
  private List<String> volume = null;

  @SerializedName("Network")
  private List<String> network = null;

  @SerializedName("Authorization")
  private List<String> authorization = null;

  @SerializedName("Log")
  private List<String> log = null;

  public PluginsInfo volume(List<String> volume) {
    this.volume = volume;
    return this;
  }

  public PluginsInfo addVolumeItem(String volumeItem) {
    if (this.volume == null) {
      this.volume = new ArrayList<String>();
    }
    this.volume.add(volumeItem);
    return this;
  }

   /**
   * Names of available volume-drivers, and network-driver plugins.
   * @return volume
  **/
  @ApiModelProperty(example = "[\"local\"]", value = "Names of available volume-drivers, and network-driver plugins.")
  public List<String> getVolume() {
    return volume;
  }

  public void setVolume(List<String> volume) {
    this.volume = volume;
  }

  public PluginsInfo network(List<String> network) {
    this.network = network;
    return this;
  }

  public PluginsInfo addNetworkItem(String networkItem) {
    if (this.network == null) {
      this.network = new ArrayList<String>();
    }
    this.network.add(networkItem);
    return this;
  }

   /**
   * Names of available network-drivers, and network-driver plugins.
   * @return network
  **/
  @ApiModelProperty(example = "[\"bridge\",\"host\",\"ipvlan\",\"macvlan\",\"null\",\"overlay\"]", value = "Names of available network-drivers, and network-driver plugins.")
  public List<String> getNetwork() {
    return network;
  }

  public void setNetwork(List<String> network) {
    this.network = network;
  }

  public PluginsInfo authorization(List<String> authorization) {
    this.authorization = authorization;
    return this;
  }

  public PluginsInfo addAuthorizationItem(String authorizationItem) {
    if (this.authorization == null) {
      this.authorization = new ArrayList<String>();
    }
    this.authorization.add(authorizationItem);
    return this;
  }

   /**
   * Names of available authorization plugins.
   * @return authorization
  **/
  @ApiModelProperty(example = "[\"img-authz-plugin\",\"hbm\"]", value = "Names of available authorization plugins.")
  public List<String> getAuthorization() {
    return authorization;
  }

  public void setAuthorization(List<String> authorization) {
    this.authorization = authorization;
  }

  public PluginsInfo log(List<String> log) {
    this.log = log;
    return this;
  }

  public PluginsInfo addLogItem(String logItem) {
    if (this.log == null) {
      this.log = new ArrayList<String>();
    }
    this.log.add(logItem);
    return this;
  }

   /**
   * Names of available logging-drivers, and logging-driver plugins.
   * @return log
  **/
  @ApiModelProperty(example = "[\"awslogs\",\"fluentd\",\"gcplogs\",\"gelf\",\"journald\",\"json-file\",\"logentries\",\"splunk\",\"syslog\"]", value = "Names of available logging-drivers, and logging-driver plugins.")
  public List<String> getLog() {
    return log;
  }

  public void setLog(List<String> log) {
    this.log = log;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginsInfo pluginsInfo = (PluginsInfo) o;
    return Objects.equals(this.volume, pluginsInfo.volume) &&
        Objects.equals(this.network, pluginsInfo.network) &&
        Objects.equals(this.authorization, pluginsInfo.authorization) &&
        Objects.equals(this.log, pluginsInfo.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume, network, authorization, log);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginsInfo {\n");
    
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

