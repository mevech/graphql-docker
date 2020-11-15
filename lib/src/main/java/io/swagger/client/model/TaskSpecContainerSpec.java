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
import io.swagger.client.model.HealthConfig;
import io.swagger.client.model.Mount;
import io.swagger.client.model.TaskSpecContainerSpecConfigs;
import io.swagger.client.model.TaskSpecContainerSpecDNSConfig;
import io.swagger.client.model.TaskSpecContainerSpecPrivileges;
import io.swagger.client.model.TaskSpecContainerSpecSecrets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Container spec for the service.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are &gt; mutually exclusive. PluginSpec is only used when the Runtime field &gt; is set to &#x60;plugin&#x60;. NetworkAttachmentSpec is used when the Runtime &gt; field is set to &#x60;attachment&#x60;. 
 */
@ApiModel(description = "Container spec for the service.  <p><br /></p>  > **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are > mutually exclusive. PluginSpec is only used when the Runtime field > is set to `plugin`. NetworkAttachmentSpec is used when the Runtime > field is set to `attachment`. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class TaskSpecContainerSpec {
  @SerializedName("Image")
  private String image = null;

  @SerializedName("Labels")
  private Map<String, String> labels = null;

  @SerializedName("Command")
  private List<String> command = null;

  @SerializedName("Args")
  private List<String> args = null;

  @SerializedName("Hostname")
  private String hostname = null;

  @SerializedName("Env")
  private List<String> env = null;

  @SerializedName("Dir")
  private String dir = null;

  @SerializedName("User")
  private String user = null;

  @SerializedName("Groups")
  private List<String> groups = null;

  @SerializedName("Privileges")
  private TaskSpecContainerSpecPrivileges privileges = null;

  @SerializedName("TTY")
  private Boolean TTY = null;

  @SerializedName("OpenStdin")
  private Boolean openStdin = null;

  @SerializedName("ReadOnly")
  private Boolean readOnly = null;

  @SerializedName("Mounts")
  private List<Mount> mounts = null;

  @SerializedName("StopSignal")
  private String stopSignal = null;

  @SerializedName("StopGracePeriod")
  private Long stopGracePeriod = null;

  @SerializedName("HealthCheck")
  private HealthConfig healthCheck = null;

  @SerializedName("Hosts")
  private List<String> hosts = null;

  @SerializedName("DNSConfig")
  private TaskSpecContainerSpecDNSConfig dnSConfig = null;

  @SerializedName("Secrets")
  private List<TaskSpecContainerSpecSecrets> secrets = null;

  @SerializedName("Configs")
  private List<TaskSpecContainerSpecConfigs> configs = null;

  /**
   * Isolation technology of the containers running the service. (Windows only) 
   */
  @JsonAdapter(IsolationEnum.Adapter.class)
  public enum IsolationEnum {
    DEFAULT("default"),
    
    PROCESS("process"),
    
    HYPERV("hyperv");

    private String value;

    IsolationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsolationEnum fromValue(String text) {
      for (IsolationEnum b : IsolationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IsolationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsolationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsolationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IsolationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Isolation")
  private IsolationEnum isolation = null;

  @SerializedName("Init")
  private Boolean init = null;

  @SerializedName("Sysctls")
  private Map<String, String> sysctls = null;

  public TaskSpecContainerSpec image(String image) {
    this.image = image;
    return this;
  }

   /**
   * The image name to use for the container
   * @return image
  **/
  @ApiModelProperty(value = "The image name to use for the container")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public TaskSpecContainerSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public TaskSpecContainerSpec putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * User-defined key/value data.
   * @return labels
  **/
  @ApiModelProperty(value = "User-defined key/value data.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public TaskSpecContainerSpec command(List<String> command) {
    this.command = command;
    return this;
  }

  public TaskSpecContainerSpec addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<String>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * The command to be run in the image.
   * @return command
  **/
  @ApiModelProperty(value = "The command to be run in the image.")
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }

  public TaskSpecContainerSpec args(List<String> args) {
    this.args = args;
    return this;
  }

  public TaskSpecContainerSpec addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<String>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Arguments to the command.
   * @return args
  **/
  @ApiModelProperty(value = "Arguments to the command.")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public TaskSpecContainerSpec hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * The hostname to use for the container, as a valid [RFC 1123](https://tools.ietf.org/html/rfc1123) hostname. 
   * @return hostname
  **/
  @ApiModelProperty(value = "The hostname to use for the container, as a valid [RFC 1123](https://tools.ietf.org/html/rfc1123) hostname. ")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public TaskSpecContainerSpec env(List<String> env) {
    this.env = env;
    return this;
  }

  public TaskSpecContainerSpec addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<String>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * A list of environment variables in the form &#x60;VAR&#x3D;value&#x60;. 
   * @return env
  **/
  @ApiModelProperty(value = "A list of environment variables in the form `VAR=value`. ")
  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }

  public TaskSpecContainerSpec dir(String dir) {
    this.dir = dir;
    return this;
  }

   /**
   * The working directory for commands to run in.
   * @return dir
  **/
  @ApiModelProperty(value = "The working directory for commands to run in.")
  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public TaskSpecContainerSpec user(String user) {
    this.user = user;
    return this;
  }

   /**
   * The user inside the container.
   * @return user
  **/
  @ApiModelProperty(value = "The user inside the container.")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public TaskSpecContainerSpec groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public TaskSpecContainerSpec addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of additional groups that the container process will run as. 
   * @return groups
  **/
  @ApiModelProperty(value = "A list of additional groups that the container process will run as. ")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public TaskSpecContainerSpec privileges(TaskSpecContainerSpecPrivileges privileges) {
    this.privileges = privileges;
    return this;
  }

   /**
   * Get privileges
   * @return privileges
  **/
  @ApiModelProperty(value = "")
  public TaskSpecContainerSpecPrivileges getPrivileges() {
    return privileges;
  }

  public void setPrivileges(TaskSpecContainerSpecPrivileges privileges) {
    this.privileges = privileges;
  }

  public TaskSpecContainerSpec TTY(Boolean TTY) {
    this.TTY = TTY;
    return this;
  }

   /**
   * Whether a pseudo-TTY should be allocated.
   * @return TTY
  **/
  @ApiModelProperty(value = "Whether a pseudo-TTY should be allocated.")
  public Boolean isTTY() {
    return TTY;
  }

  public void setTTY(Boolean TTY) {
    this.TTY = TTY;
  }

  public TaskSpecContainerSpec openStdin(Boolean openStdin) {
    this.openStdin = openStdin;
    return this;
  }

   /**
   * Open &#x60;stdin&#x60;
   * @return openStdin
  **/
  @ApiModelProperty(value = "Open `stdin`")
  public Boolean isOpenStdin() {
    return openStdin;
  }

  public void setOpenStdin(Boolean openStdin) {
    this.openStdin = openStdin;
  }

  public TaskSpecContainerSpec readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Mount the container&#39;s root filesystem as read only.
   * @return readOnly
  **/
  @ApiModelProperty(value = "Mount the container's root filesystem as read only.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public TaskSpecContainerSpec mounts(List<Mount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public TaskSpecContainerSpec addMountsItem(Mount mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<Mount>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

   /**
   * Specification for mounts to be added to containers created as part of the service. 
   * @return mounts
  **/
  @ApiModelProperty(value = "Specification for mounts to be added to containers created as part of the service. ")
  public List<Mount> getMounts() {
    return mounts;
  }

  public void setMounts(List<Mount> mounts) {
    this.mounts = mounts;
  }

  public TaskSpecContainerSpec stopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
    return this;
  }

   /**
   * Signal to stop the container.
   * @return stopSignal
  **/
  @ApiModelProperty(value = "Signal to stop the container.")
  public String getStopSignal() {
    return stopSignal;
  }

  public void setStopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
  }

  public TaskSpecContainerSpec stopGracePeriod(Long stopGracePeriod) {
    this.stopGracePeriod = stopGracePeriod;
    return this;
  }

   /**
   * Amount of time to wait for the container to terminate before forcefully killing it. 
   * @return stopGracePeriod
  **/
  @ApiModelProperty(value = "Amount of time to wait for the container to terminate before forcefully killing it. ")
  public Long getStopGracePeriod() {
    return stopGracePeriod;
  }

  public void setStopGracePeriod(Long stopGracePeriod) {
    this.stopGracePeriod = stopGracePeriod;
  }

  public TaskSpecContainerSpec healthCheck(HealthConfig healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @ApiModelProperty(value = "")
  public HealthConfig getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(HealthConfig healthCheck) {
    this.healthCheck = healthCheck;
  }

  public TaskSpecContainerSpec hosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public TaskSpecContainerSpec addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<String>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * A list of hostname/IP mappings to add to the container&#39;s &#x60;hosts&#x60; file. The format of extra hosts is specified in the [hosts(5)](http://man7.org/linux/man-pages/man5/hosts.5.html) man page:      IP_address canonical_hostname [aliases...] 
   * @return hosts
  **/
  @ApiModelProperty(value = "A list of hostname/IP mappings to add to the container's `hosts` file. The format of extra hosts is specified in the [hosts(5)](http://man7.org/linux/man-pages/man5/hosts.5.html) man page:      IP_address canonical_hostname [aliases...] ")
  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }

  public TaskSpecContainerSpec dnSConfig(TaskSpecContainerSpecDNSConfig dnSConfig) {
    this.dnSConfig = dnSConfig;
    return this;
  }

   /**
   * Get dnSConfig
   * @return dnSConfig
  **/
  @ApiModelProperty(value = "")
  public TaskSpecContainerSpecDNSConfig getDnSConfig() {
    return dnSConfig;
  }

  public void setDnSConfig(TaskSpecContainerSpecDNSConfig dnSConfig) {
    this.dnSConfig = dnSConfig;
  }

  public TaskSpecContainerSpec secrets(List<TaskSpecContainerSpecSecrets> secrets) {
    this.secrets = secrets;
    return this;
  }

  public TaskSpecContainerSpec addSecretsItem(TaskSpecContainerSpecSecrets secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<TaskSpecContainerSpecSecrets>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * Secrets contains references to zero or more secrets that will be exposed to the service. 
   * @return secrets
  **/
  @ApiModelProperty(value = "Secrets contains references to zero or more secrets that will be exposed to the service. ")
  public List<TaskSpecContainerSpecSecrets> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<TaskSpecContainerSpecSecrets> secrets) {
    this.secrets = secrets;
  }

  public TaskSpecContainerSpec configs(List<TaskSpecContainerSpecConfigs> configs) {
    this.configs = configs;
    return this;
  }

  public TaskSpecContainerSpec addConfigsItem(TaskSpecContainerSpecConfigs configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<TaskSpecContainerSpecConfigs>();
    }
    this.configs.add(configsItem);
    return this;
  }

   /**
   * Configs contains references to zero or more configs that will be exposed to the service. 
   * @return configs
  **/
  @ApiModelProperty(value = "Configs contains references to zero or more configs that will be exposed to the service. ")
  public List<TaskSpecContainerSpecConfigs> getConfigs() {
    return configs;
  }

  public void setConfigs(List<TaskSpecContainerSpecConfigs> configs) {
    this.configs = configs;
  }

  public TaskSpecContainerSpec isolation(IsolationEnum isolation) {
    this.isolation = isolation;
    return this;
  }

   /**
   * Isolation technology of the containers running the service. (Windows only) 
   * @return isolation
  **/
  @ApiModelProperty(value = "Isolation technology of the containers running the service. (Windows only) ")
  public IsolationEnum getIsolation() {
    return isolation;
  }

  public void setIsolation(IsolationEnum isolation) {
    this.isolation = isolation;
  }

  public TaskSpecContainerSpec init(Boolean init) {
    this.init = init;
    return this;
  }

   /**
   * Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used. 
   * @return init
  **/
  @ApiModelProperty(value = "Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used. ")
  public Boolean isInit() {
    return init;
  }

  public void setInit(Boolean init) {
    this.init = init;
  }

  public TaskSpecContainerSpec sysctls(Map<String, String> sysctls) {
    this.sysctls = sysctls;
    return this;
  }

  public TaskSpecContainerSpec putSysctlsItem(String key, String sysctlsItem) {
    if (this.sysctls == null) {
      this.sysctls = new HashMap<String, String>();
    }
    this.sysctls.put(key, sysctlsItem);
    return this;
  }

   /**
   * Set kernel namedspaced parameters (sysctls) in the container. The Sysctls option on services accepts the same sysctls as the are supported on containers. Note that while the same sysctls are supported, no guarantees or checks are made about their suitability for a clustered environment, and it&#39;s up to the user to determine whether a given sysctl will work properly in a Service. 
   * @return sysctls
  **/
  @ApiModelProperty(value = "Set kernel namedspaced parameters (sysctls) in the container. The Sysctls option on services accepts the same sysctls as the are supported on containers. Note that while the same sysctls are supported, no guarantees or checks are made about their suitability for a clustered environment, and it's up to the user to determine whether a given sysctl will work properly in a Service. ")
  public Map<String, String> getSysctls() {
    return sysctls;
  }

  public void setSysctls(Map<String, String> sysctls) {
    this.sysctls = sysctls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpec taskSpecContainerSpec = (TaskSpecContainerSpec) o;
    return Objects.equals(this.image, taskSpecContainerSpec.image) &&
        Objects.equals(this.labels, taskSpecContainerSpec.labels) &&
        Objects.equals(this.command, taskSpecContainerSpec.command) &&
        Objects.equals(this.args, taskSpecContainerSpec.args) &&
        Objects.equals(this.hostname, taskSpecContainerSpec.hostname) &&
        Objects.equals(this.env, taskSpecContainerSpec.env) &&
        Objects.equals(this.dir, taskSpecContainerSpec.dir) &&
        Objects.equals(this.user, taskSpecContainerSpec.user) &&
        Objects.equals(this.groups, taskSpecContainerSpec.groups) &&
        Objects.equals(this.privileges, taskSpecContainerSpec.privileges) &&
        Objects.equals(this.TTY, taskSpecContainerSpec.TTY) &&
        Objects.equals(this.openStdin, taskSpecContainerSpec.openStdin) &&
        Objects.equals(this.readOnly, taskSpecContainerSpec.readOnly) &&
        Objects.equals(this.mounts, taskSpecContainerSpec.mounts) &&
        Objects.equals(this.stopSignal, taskSpecContainerSpec.stopSignal) &&
        Objects.equals(this.stopGracePeriod, taskSpecContainerSpec.stopGracePeriod) &&
        Objects.equals(this.healthCheck, taskSpecContainerSpec.healthCheck) &&
        Objects.equals(this.hosts, taskSpecContainerSpec.hosts) &&
        Objects.equals(this.dnSConfig, taskSpecContainerSpec.dnSConfig) &&
        Objects.equals(this.secrets, taskSpecContainerSpec.secrets) &&
        Objects.equals(this.configs, taskSpecContainerSpec.configs) &&
        Objects.equals(this.isolation, taskSpecContainerSpec.isolation) &&
        Objects.equals(this.init, taskSpecContainerSpec.init) &&
        Objects.equals(this.sysctls, taskSpecContainerSpec.sysctls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, labels, command, args, hostname, env, dir, user, groups, privileges, TTY, openStdin, readOnly, mounts, stopSignal, stopGracePeriod, healthCheck, hosts, dnSConfig, secrets, configs, isolation, init, sysctls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpec {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    TTY: ").append(toIndentedString(TTY)).append("\n");
    sb.append("    openStdin: ").append(toIndentedString(openStdin)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    stopSignal: ").append(toIndentedString(stopSignal)).append("\n");
    sb.append("    stopGracePeriod: ").append(toIndentedString(stopGracePeriod)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    dnSConfig: ").append(toIndentedString(dnSConfig)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    isolation: ").append(toIndentedString(isolation)).append("\n");
    sb.append("    init: ").append(toIndentedString(init)).append("\n");
    sb.append("    sysctls: ").append(toIndentedString(sysctls)).append("\n");
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

