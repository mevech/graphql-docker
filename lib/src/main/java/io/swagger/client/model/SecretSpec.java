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
import io.swagger.client.model.Driver;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SecretSpec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class SecretSpec {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Labels")
  private Map<String, String> labels = null;

  @SerializedName("Data")
  private String data = null;

  @SerializedName("Driver")
  private Driver driver = null;

  @SerializedName("Templating")
  private Driver templating = null;

  public SecretSpec name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User-defined name of the secret.
   * @return name
  **/
  @ApiModelProperty(value = "User-defined name of the secret.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecretSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SecretSpec putLabelsItem(String key, String labelsItem) {
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
  @ApiModelProperty(example = "{\"com.example.some-label\":\"some-value\",\"com.example.some-other-label\":\"some-other-value\"}", value = "User-defined key/value metadata.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public SecretSpec data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) data to store as secret.  This field is only used to _create_ a secret, and is not returned by other endpoints. 
   * @return data
  **/
  @ApiModelProperty(example = "", value = "Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) data to store as secret.  This field is only used to _create_ a secret, and is not returned by other endpoints. ")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public SecretSpec driver(Driver driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Name of the secrets driver used to fetch the secret&#39;s value from an external secret store. 
   * @return driver
  **/
  @ApiModelProperty(value = "Name of the secrets driver used to fetch the secret's value from an external secret store. ")
  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public SecretSpec templating(Driver templating) {
    this.templating = templating;
    return this;
  }

   /**
   * Templating driver, if applicable  Templating controls whether and how to evaluate the config payload as a template. If no driver is set, no templating is used. 
   * @return templating
  **/
  @ApiModelProperty(value = "Templating driver, if applicable  Templating controls whether and how to evaluate the config payload as a template. If no driver is set, no templating is used. ")
  public Driver getTemplating() {
    return templating;
  }

  public void setTemplating(Driver templating) {
    this.templating = templating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretSpec secretSpec = (SecretSpec) o;
    return Objects.equals(this.name, secretSpec.name) &&
        Objects.equals(this.labels, secretSpec.labels) &&
        Objects.equals(this.data, secretSpec.data) &&
        Objects.equals(this.driver, secretSpec.driver) &&
        Objects.equals(this.templating, secretSpec.templating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, data, driver, templating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretSpec {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    templating: ").append(toIndentedString(templating)).append("\n");
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

