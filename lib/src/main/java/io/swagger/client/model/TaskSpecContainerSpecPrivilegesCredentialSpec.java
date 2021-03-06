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
 * CredentialSpec for managed service account (Windows only)
 */
@ApiModel(description = "CredentialSpec for managed service account (Windows only)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-15T02:09:16.436+01:00")
public class TaskSpecContainerSpecPrivilegesCredentialSpec {
  @SerializedName("Config")
  private String config = null;

  @SerializedName("File")
  private String file = null;

  @SerializedName("Registry")
  private String registry = null;

  public TaskSpecContainerSpecPrivilegesCredentialSpec config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Load credential spec from a Swarm Config with the given ID. The specified config must also be present in the Configs field with the Runtime property set.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;   &gt; **Note**: &#x60;CredentialSpec.File&#x60;, &#x60;CredentialSpec.Registry&#x60;, &gt; and &#x60;CredentialSpec.Config&#x60; are mutually exclusive. 
   * @return config
  **/
  @ApiModelProperty(example = "0bt9dmxjvjiqermk6xrop3ekq", value = "Load credential spec from a Swarm Config with the given ID. The specified config must also be present in the Configs field with the Runtime property set.  <p><br /></p>   > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. ")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public TaskSpecContainerSpecPrivilegesCredentialSpec file(String file) {
    this.file = file;
    return this;
  }

   /**
   * Load credential spec from this file. The file is read by the daemon, and must be present in the &#x60;CredentialSpecs&#x60; subdirectory in the docker data directory, which defaults to &#x60;C:\\ProgramData\\Docker\\&#x60; on Windows.  For example, specifying &#x60;spec.json&#x60; loads &#x60;C:\\ProgramData\\Docker\\CredentialSpecs\\spec.json&#x60;.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: &#x60;CredentialSpec.File&#x60;, &#x60;CredentialSpec.Registry&#x60;, &gt; and &#x60;CredentialSpec.Config&#x60; are mutually exclusive. 
   * @return file
  **/
  @ApiModelProperty(example = "spec.json", value = "Load credential spec from this file. The file is read by the daemon, and must be present in the `CredentialSpecs` subdirectory in the docker data directory, which defaults to `C:\\ProgramData\\Docker\\` on Windows.  For example, specifying `spec.json` loads `C:\\ProgramData\\Docker\\CredentialSpecs\\spec.json`.  <p><br /></p>  > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. ")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public TaskSpecContainerSpecPrivilegesCredentialSpec registry(String registry) {
    this.registry = registry;
    return this;
  }

   /**
   * Load credential spec from this value in the Windows registry. The specified registry value must be located in:  &#x60;HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Virtualization\\Containers\\CredentialSpecs&#x60;  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;   &gt; **Note**: &#x60;CredentialSpec.File&#x60;, &#x60;CredentialSpec.Registry&#x60;, &gt; and &#x60;CredentialSpec.Config&#x60; are mutually exclusive. 
   * @return registry
  **/
  @ApiModelProperty(value = "Load credential spec from this value in the Windows registry. The specified registry value must be located in:  `HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Virtualization\\Containers\\CredentialSpecs`  <p><br /></p>   > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. ")
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecPrivilegesCredentialSpec taskSpecContainerSpecPrivilegesCredentialSpec = (TaskSpecContainerSpecPrivilegesCredentialSpec) o;
    return Objects.equals(this.config, taskSpecContainerSpecPrivilegesCredentialSpec.config) &&
        Objects.equals(this.file, taskSpecContainerSpecPrivilegesCredentialSpec.file) &&
        Objects.equals(this.registry, taskSpecContainerSpecPrivilegesCredentialSpec.registry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, file, registry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecPrivilegesCredentialSpec {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
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

