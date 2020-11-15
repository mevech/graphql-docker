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
 * Specification for DNS related configurations in resolver configuration file (&#x60;resolv.conf&#x60;). 
 */
@ApiModel(description = "Specification for DNS related configurations in resolver configuration file (`resolv.conf`). ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class TaskSpecContainerSpecDNSConfig {
  @SerializedName("Nameservers")
  private List<String> nameservers = null;

  @SerializedName("Search")
  private List<String> search = null;

  @SerializedName("Options")
  private List<String> options = null;

  public TaskSpecContainerSpecDNSConfig nameservers(List<String> nameservers) {
    this.nameservers = nameservers;
    return this;
  }

  public TaskSpecContainerSpecDNSConfig addNameserversItem(String nameserversItem) {
    if (this.nameservers == null) {
      this.nameservers = new ArrayList<String>();
    }
    this.nameservers.add(nameserversItem);
    return this;
  }

   /**
   * The IP addresses of the name servers.
   * @return nameservers
  **/
  @ApiModelProperty(value = "The IP addresses of the name servers.")
  public List<String> getNameservers() {
    return nameservers;
  }

  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }

  public TaskSpecContainerSpecDNSConfig search(List<String> search) {
    this.search = search;
    return this;
  }

  public TaskSpecContainerSpecDNSConfig addSearchItem(String searchItem) {
    if (this.search == null) {
      this.search = new ArrayList<String>();
    }
    this.search.add(searchItem);
    return this;
  }

   /**
   * A search list for host-name lookup.
   * @return search
  **/
  @ApiModelProperty(value = "A search list for host-name lookup.")
  public List<String> getSearch() {
    return search;
  }

  public void setSearch(List<String> search) {
    this.search = search;
  }

  public TaskSpecContainerSpecDNSConfig options(List<String> options) {
    this.options = options;
    return this;
  }

  public TaskSpecContainerSpecDNSConfig addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<String>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * A list of internal resolver variables to be modified (e.g., &#x60;debug&#x60;, &#x60;ndots:3&#x60;, etc.). 
   * @return options
  **/
  @ApiModelProperty(value = "A list of internal resolver variables to be modified (e.g., `debug`, `ndots:3`, etc.). ")
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecDNSConfig taskSpecContainerSpecDNSConfig = (TaskSpecContainerSpecDNSConfig) o;
    return Objects.equals(this.nameservers, taskSpecContainerSpecDNSConfig.nameservers) &&
        Objects.equals(this.search, taskSpecContainerSpecDNSConfig.search) &&
        Objects.equals(this.options, taskSpecContainerSpecDNSConfig.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameservers, search, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecDNSConfig {\n");
    
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

