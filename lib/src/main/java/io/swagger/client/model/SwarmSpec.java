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
import io.swagger.client.model.SwarmSpecCAConfig;
import io.swagger.client.model.SwarmSpecDispatcher;
import io.swagger.client.model.SwarmSpecEncryptionConfig;
import io.swagger.client.model.SwarmSpecOrchestration;
import io.swagger.client.model.SwarmSpecRaft;
import io.swagger.client.model.SwarmSpecTaskDefaults;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User modifiable swarm configuration.
 */
@ApiModel(description = "User modifiable swarm configuration.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class SwarmSpec {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Labels")
  private Map<String, String> labels = null;

  @SerializedName("Orchestration")
  private SwarmSpecOrchestration orchestration = null;

  @SerializedName("Raft")
  private SwarmSpecRaft raft = null;

  @SerializedName("Dispatcher")
  private SwarmSpecDispatcher dispatcher = null;

  @SerializedName("CAConfig")
  private SwarmSpecCAConfig caConfig = null;

  @SerializedName("EncryptionConfig")
  private SwarmSpecEncryptionConfig encryptionConfig = null;

  @SerializedName("TaskDefaults")
  private SwarmSpecTaskDefaults taskDefaults = null;

  public SwarmSpec name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the swarm.
   * @return name
  **/
  @ApiModelProperty(example = "default", value = "Name of the swarm.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SwarmSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SwarmSpec putLabelsItem(String key, String labelsItem) {
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
  @ApiModelProperty(example = "{\"com.example.corp.type\":\"production\",\"com.example.corp.department\":\"engineering\"}", value = "User-defined key/value metadata.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public SwarmSpec orchestration(SwarmSpecOrchestration orchestration) {
    this.orchestration = orchestration;
    return this;
  }

   /**
   * Get orchestration
   * @return orchestration
  **/
  @ApiModelProperty(value = "")
  public SwarmSpecOrchestration getOrchestration() {
    return orchestration;
  }

  public void setOrchestration(SwarmSpecOrchestration orchestration) {
    this.orchestration = orchestration;
  }

  public SwarmSpec raft(SwarmSpecRaft raft) {
    this.raft = raft;
    return this;
  }

   /**
   * Get raft
   * @return raft
  **/
  @ApiModelProperty(value = "")
  public SwarmSpecRaft getRaft() {
    return raft;
  }

  public void setRaft(SwarmSpecRaft raft) {
    this.raft = raft;
  }

  public SwarmSpec dispatcher(SwarmSpecDispatcher dispatcher) {
    this.dispatcher = dispatcher;
    return this;
  }

   /**
   * Get dispatcher
   * @return dispatcher
  **/
  @ApiModelProperty(value = "")
  public SwarmSpecDispatcher getDispatcher() {
    return dispatcher;
  }

  public void setDispatcher(SwarmSpecDispatcher dispatcher) {
    this.dispatcher = dispatcher;
  }

  public SwarmSpec caConfig(SwarmSpecCAConfig caConfig) {
    this.caConfig = caConfig;
    return this;
  }

   /**
   * Get caConfig
   * @return caConfig
  **/
  @ApiModelProperty(value = "")
  public SwarmSpecCAConfig getCaConfig() {
    return caConfig;
  }

  public void setCaConfig(SwarmSpecCAConfig caConfig) {
    this.caConfig = caConfig;
  }

  public SwarmSpec encryptionConfig(SwarmSpecEncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
    return this;
  }

   /**
   * Get encryptionConfig
   * @return encryptionConfig
  **/
  @ApiModelProperty(value = "")
  public SwarmSpecEncryptionConfig getEncryptionConfig() {
    return encryptionConfig;
  }

  public void setEncryptionConfig(SwarmSpecEncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
  }

  public SwarmSpec taskDefaults(SwarmSpecTaskDefaults taskDefaults) {
    this.taskDefaults = taskDefaults;
    return this;
  }

   /**
   * Get taskDefaults
   * @return taskDefaults
  **/
  @ApiModelProperty(value = "")
  public SwarmSpecTaskDefaults getTaskDefaults() {
    return taskDefaults;
  }

  public void setTaskDefaults(SwarmSpecTaskDefaults taskDefaults) {
    this.taskDefaults = taskDefaults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpec swarmSpec = (SwarmSpec) o;
    return Objects.equals(this.name, swarmSpec.name) &&
        Objects.equals(this.labels, swarmSpec.labels) &&
        Objects.equals(this.orchestration, swarmSpec.orchestration) &&
        Objects.equals(this.raft, swarmSpec.raft) &&
        Objects.equals(this.dispatcher, swarmSpec.dispatcher) &&
        Objects.equals(this.caConfig, swarmSpec.caConfig) &&
        Objects.equals(this.encryptionConfig, swarmSpec.encryptionConfig) &&
        Objects.equals(this.taskDefaults, swarmSpec.taskDefaults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, orchestration, raft, dispatcher, caConfig, encryptionConfig, taskDefaults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpec {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    orchestration: ").append(toIndentedString(orchestration)).append("\n");
    sb.append("    raft: ").append(toIndentedString(raft)).append("\n");
    sb.append("    dispatcher: ").append(toIndentedString(dispatcher)).append("\n");
    sb.append("    caConfig: ").append(toIndentedString(caConfig)).append("\n");
    sb.append("    encryptionConfig: ").append(toIndentedString(encryptionConfig)).append("\n");
    sb.append("    taskDefaults: ").append(toIndentedString(taskDefaults)).append("\n");
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

