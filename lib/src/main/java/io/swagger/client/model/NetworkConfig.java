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
import io.swagger.client.model.IPAM;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * NetworkConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class NetworkConfig {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("CheckDuplicate")
  private Boolean checkDuplicate = null;

  @SerializedName("Driver")
  private String driver = "bridge";

  @SerializedName("Internal")
  private Boolean internal = null;

  @SerializedName("Attachable")
  private Boolean attachable = null;

  @SerializedName("Ingress")
  private Boolean ingress = null;

  @SerializedName("IPAM")
  private IPAM IPAM = null;

  @SerializedName("EnableIPv6")
  private Boolean enableIPv6 = null;

  @SerializedName("Options")
  private Map<String, String> options = null;

  @SerializedName("Labels")
  private Map<String, String> labels = null;

  public NetworkConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The network&#39;s name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The network's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NetworkConfig checkDuplicate(Boolean checkDuplicate) {
    this.checkDuplicate = checkDuplicate;
    return this;
  }

   /**
   * Check for networks with duplicate names. Since Network is primarily keyed based on a random ID and not on the name, and network name is strictly a user-friendly alias to the network which is uniquely identified using ID, there is no guaranteed way to check for duplicates. CheckDuplicate is there to provide a best effort checking of any networks which has the same name but it is not guaranteed to catch all name collisions. 
   * @return checkDuplicate
  **/
  @ApiModelProperty(value = "Check for networks with duplicate names. Since Network is primarily keyed based on a random ID and not on the name, and network name is strictly a user-friendly alias to the network which is uniquely identified using ID, there is no guaranteed way to check for duplicates. CheckDuplicate is there to provide a best effort checking of any networks which has the same name but it is not guaranteed to catch all name collisions. ")
  public Boolean isCheckDuplicate() {
    return checkDuplicate;
  }

  public void setCheckDuplicate(Boolean checkDuplicate) {
    this.checkDuplicate = checkDuplicate;
  }

  public NetworkConfig driver(String driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Name of the network driver plugin to use.
   * @return driver
  **/
  @ApiModelProperty(value = "Name of the network driver plugin to use.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public NetworkConfig internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Restrict external access to the network.
   * @return internal
  **/
  @ApiModelProperty(value = "Restrict external access to the network.")
  public Boolean isInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public NetworkConfig attachable(Boolean attachable) {
    this.attachable = attachable;
    return this;
  }

   /**
   * Globally scoped network is manually attachable by regular containers from workers in swarm mode. 
   * @return attachable
  **/
  @ApiModelProperty(value = "Globally scoped network is manually attachable by regular containers from workers in swarm mode. ")
  public Boolean isAttachable() {
    return attachable;
  }

  public void setAttachable(Boolean attachable) {
    this.attachable = attachable;
  }

  public NetworkConfig ingress(Boolean ingress) {
    this.ingress = ingress;
    return this;
  }

   /**
   * Ingress network is the network which provides the routing-mesh in swarm mode. 
   * @return ingress
  **/
  @ApiModelProperty(value = "Ingress network is the network which provides the routing-mesh in swarm mode. ")
  public Boolean isIngress() {
    return ingress;
  }

  public void setIngress(Boolean ingress) {
    this.ingress = ingress;
  }

  public NetworkConfig IPAM(IPAM IPAM) {
    this.IPAM = IPAM;
    return this;
  }

   /**
   * Optional custom IP scheme for the network.
   * @return IPAM
  **/
  @ApiModelProperty(value = "Optional custom IP scheme for the network.")
  public IPAM getIPAM() {
    return IPAM;
  }

  public void setIPAM(IPAM IPAM) {
    this.IPAM = IPAM;
  }

  public NetworkConfig enableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
    return this;
  }

   /**
   * Enable IPv6 on the network.
   * @return enableIPv6
  **/
  @ApiModelProperty(value = "Enable IPv6 on the network.")
  public Boolean isEnableIPv6() {
    return enableIPv6;
  }

  public void setEnableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
  }

  public NetworkConfig options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public NetworkConfig putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Network specific options to be used by the drivers.
   * @return options
  **/
  @ApiModelProperty(value = "Network specific options to be used by the drivers.")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public NetworkConfig labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public NetworkConfig putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * User-defined key/value metadata.
   * @return labels
  **/
  @ApiModelProperty(value = "User-defined key/value metadata.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkConfig networkConfig = (NetworkConfig) o;
    return Objects.equals(this.name, networkConfig.name) &&
        Objects.equals(this.checkDuplicate, networkConfig.checkDuplicate) &&
        Objects.equals(this.driver, networkConfig.driver) &&
        Objects.equals(this.internal, networkConfig.internal) &&
        Objects.equals(this.attachable, networkConfig.attachable) &&
        Objects.equals(this.ingress, networkConfig.ingress) &&
        Objects.equals(this.IPAM, networkConfig.IPAM) &&
        Objects.equals(this.enableIPv6, networkConfig.enableIPv6) &&
        Objects.equals(this.options, networkConfig.options) &&
        Objects.equals(this.labels, networkConfig.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, checkDuplicate, driver, internal, attachable, ingress, IPAM, enableIPv6, options, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkConfig {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checkDuplicate: ").append(toIndentedString(checkDuplicate)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    attachable: ").append(toIndentedString(attachable)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    IPAM: ").append(toIndentedString(IPAM)).append("\n");
    sb.append("    enableIPv6: ").append(toIndentedString(enableIPv6)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

