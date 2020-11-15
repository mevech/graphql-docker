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
import io.swagger.client.model.GenericResources;
import io.swagger.client.model.ObjectVersion;
import io.swagger.client.model.TaskSpec;
import io.swagger.client.model.TaskState;
import io.swagger.client.model.TaskStatus;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Task
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class Task {
  @SerializedName("ID")
  private String ID = null;

  @SerializedName("Version")
  private ObjectVersion version = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Labels")
  private Map<String, String> labels = null;

  @SerializedName("Spec")
  private TaskSpec spec = null;

  @SerializedName("ServiceID")
  private String serviceID = null;

  @SerializedName("Slot")
  private Integer slot = null;

  @SerializedName("NodeID")
  private String nodeID = null;

  @SerializedName("AssignedGenericResources")
  private GenericResources assignedGenericResources = null;

  @SerializedName("Status")
  private TaskStatus status = null;

  @SerializedName("DesiredState")
  private TaskState desiredState = null;

  public Task ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * The ID of the task.
   * @return ID
  **/
  @ApiModelProperty(value = "The ID of the task.")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public Task version(ObjectVersion version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public ObjectVersion getVersion() {
    return version;
  }

  public void setVersion(ObjectVersion version) {
    this.version = version;
  }

  public Task createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Task updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Task name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the task.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the task.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Task labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Task putLabelsItem(String key, String labelsItem) {
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

  public Task spec(TaskSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @ApiModelProperty(value = "")
  public TaskSpec getSpec() {
    return spec;
  }

  public void setSpec(TaskSpec spec) {
    this.spec = spec;
  }

  public Task serviceID(String serviceID) {
    this.serviceID = serviceID;
    return this;
  }

   /**
   * The ID of the service this task is part of.
   * @return serviceID
  **/
  @ApiModelProperty(value = "The ID of the service this task is part of.")
  public String getServiceID() {
    return serviceID;
  }

  public void setServiceID(String serviceID) {
    this.serviceID = serviceID;
  }

  public Task slot(Integer slot) {
    this.slot = slot;
    return this;
  }

   /**
   * Get slot
   * @return slot
  **/
  @ApiModelProperty(value = "")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public Task nodeID(String nodeID) {
    this.nodeID = nodeID;
    return this;
  }

   /**
   * The ID of the node that this task is on.
   * @return nodeID
  **/
  @ApiModelProperty(value = "The ID of the node that this task is on.")
  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public Task assignedGenericResources(GenericResources assignedGenericResources) {
    this.assignedGenericResources = assignedGenericResources;
    return this;
  }

   /**
   * Get assignedGenericResources
   * @return assignedGenericResources
  **/
  @ApiModelProperty(value = "")
  public GenericResources getAssignedGenericResources() {
    return assignedGenericResources;
  }

  public void setAssignedGenericResources(GenericResources assignedGenericResources) {
    this.assignedGenericResources = assignedGenericResources;
  }

  public Task status(TaskStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public TaskStatus getStatus() {
    return status;
  }

  public void setStatus(TaskStatus status) {
    this.status = status;
  }

  public Task desiredState(TaskState desiredState) {
    this.desiredState = desiredState;
    return this;
  }

   /**
   * Get desiredState
   * @return desiredState
  **/
  @ApiModelProperty(value = "")
  public TaskState getDesiredState() {
    return desiredState;
  }

  public void setDesiredState(TaskState desiredState) {
    this.desiredState = desiredState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.ID, task.ID) &&
        Objects.equals(this.version, task.version) &&
        Objects.equals(this.createdAt, task.createdAt) &&
        Objects.equals(this.updatedAt, task.updatedAt) &&
        Objects.equals(this.name, task.name) &&
        Objects.equals(this.labels, task.labels) &&
        Objects.equals(this.spec, task.spec) &&
        Objects.equals(this.serviceID, task.serviceID) &&
        Objects.equals(this.slot, task.slot) &&
        Objects.equals(this.nodeID, task.nodeID) &&
        Objects.equals(this.assignedGenericResources, task.assignedGenericResources) &&
        Objects.equals(this.status, task.status) &&
        Objects.equals(this.desiredState, task.desiredState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, version, createdAt, updatedAt, name, labels, spec, serviceID, slot, nodeID, assignedGenericResources, status, desiredState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    assignedGenericResources: ").append(toIndentedString(assignedGenericResources)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    desiredState: ").append(toIndentedString(desiredState)).append("\n");
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
