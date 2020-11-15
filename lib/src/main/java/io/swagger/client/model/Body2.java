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
 * Body2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class Body2 {
  @SerializedName("ListenAddr")
  private String listenAddr = null;

  @SerializedName("AdvertiseAddr")
  private String advertiseAddr = null;

  @SerializedName("DataPathAddr")
  private String dataPathAddr = null;

  @SerializedName("RemoteAddrs")
  private List<String> remoteAddrs = null;

  @SerializedName("JoinToken")
  private String joinToken = null;

  public Body2 listenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
    return this;
  }

   /**
   * Listen address used for inter-manager communication if the node gets promoted to manager, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). 
   * @return listenAddr
  **/
  @ApiModelProperty(value = "Listen address used for inter-manager communication if the node gets promoted to manager, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). ")
  public String getListenAddr() {
    return listenAddr;
  }

  public void setListenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
  }

  public Body2 advertiseAddr(String advertiseAddr) {
    this.advertiseAddr = advertiseAddr;
    return this;
  }

   /**
   * Externally reachable address advertised to other nodes. This can either be an address/port combination in the form &#x60;192.168.1.1:4567&#x60;, or an interface followed by a port number, like &#x60;eth0:4567&#x60;. If the port number is omitted, the port number from the listen address is used. If &#x60;AdvertiseAddr&#x60; is not specified, it will be automatically detected when possible. 
   * @return advertiseAddr
  **/
  @ApiModelProperty(value = "Externally reachable address advertised to other nodes. This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the port number from the listen address is used. If `AdvertiseAddr` is not specified, it will be automatically detected when possible. ")
  public String getAdvertiseAddr() {
    return advertiseAddr;
  }

  public void setAdvertiseAddr(String advertiseAddr) {
    this.advertiseAddr = advertiseAddr;
  }

  public Body2 dataPathAddr(String dataPathAddr) {
    this.dataPathAddr = dataPathAddr;
    return this;
  }

   /**
   * Address or interface to use for data path traffic (format: &#x60;&lt;ip|interface&gt;&#x60;), for example,  &#x60;192.168.1.1&#x60;, or an interface, like &#x60;eth0&#x60;. If &#x60;DataPathAddr&#x60; is unspecified, the same addres as &#x60;AdvertiseAddr&#x60; is used.  The &#x60;DataPathAddr&#x60; specifies the address that global scope network drivers will publish towards other nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster. 
   * @return dataPathAddr
  **/
  @ApiModelProperty(value = "Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same addres as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster. ")
  public String getDataPathAddr() {
    return dataPathAddr;
  }

  public void setDataPathAddr(String dataPathAddr) {
    this.dataPathAddr = dataPathAddr;
  }

  public Body2 remoteAddrs(List<String> remoteAddrs) {
    this.remoteAddrs = remoteAddrs;
    return this;
  }

  public Body2 addRemoteAddrsItem(String remoteAddrsItem) {
    if (this.remoteAddrs == null) {
      this.remoteAddrs = new ArrayList<String>();
    }
    this.remoteAddrs.add(remoteAddrsItem);
    return this;
  }

   /**
   * Addresses of manager nodes already participating in the swarm. 
   * @return remoteAddrs
  **/
  @ApiModelProperty(value = "Addresses of manager nodes already participating in the swarm. ")
  public List<String> getRemoteAddrs() {
    return remoteAddrs;
  }

  public void setRemoteAddrs(List<String> remoteAddrs) {
    this.remoteAddrs = remoteAddrs;
  }

  public Body2 joinToken(String joinToken) {
    this.joinToken = joinToken;
    return this;
  }

   /**
   * Secret token for joining this swarm.
   * @return joinToken
  **/
  @ApiModelProperty(value = "Secret token for joining this swarm.")
  public String getJoinToken() {
    return joinToken;
  }

  public void setJoinToken(String joinToken) {
    this.joinToken = joinToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body2 body2 = (Body2) o;
    return Objects.equals(this.listenAddr, body2.listenAddr) &&
        Objects.equals(this.advertiseAddr, body2.advertiseAddr) &&
        Objects.equals(this.dataPathAddr, body2.dataPathAddr) &&
        Objects.equals(this.remoteAddrs, body2.remoteAddrs) &&
        Objects.equals(this.joinToken, body2.joinToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenAddr, advertiseAddr, dataPathAddr, remoteAddrs, joinToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body2 {\n");
    
    sb.append("    listenAddr: ").append(toIndentedString(listenAddr)).append("\n");
    sb.append("    advertiseAddr: ").append(toIndentedString(advertiseAddr)).append("\n");
    sb.append("    dataPathAddr: ").append(toIndentedString(dataPathAddr)).append("\n");
    sb.append("    remoteAddrs: ").append(toIndentedString(remoteAddrs)).append("\n");
    sb.append("    joinToken: ").append(toIndentedString(joinToken)).append("\n");
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
