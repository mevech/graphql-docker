
# TaskSpecContainerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image** | **String** | The image name to use for the container |  [optional]
**labels** | **Map&lt;String, String&gt;** | User-defined key/value data. |  [optional]
**command** | **List&lt;String&gt;** | The command to be run in the image. |  [optional]
**args** | **List&lt;String&gt;** | Arguments to the command. |  [optional]
**hostname** | **String** | The hostname to use for the container, as a valid [RFC 1123](https://tools.ietf.org/html/rfc1123) hostname.  |  [optional]
**env** | **List&lt;String&gt;** | A list of environment variables in the form &#x60;VAR&#x3D;value&#x60;.  |  [optional]
**dir** | **String** | The working directory for commands to run in. |  [optional]
**user** | **String** | The user inside the container. |  [optional]
**groups** | **List&lt;String&gt;** | A list of additional groups that the container process will run as.  |  [optional]
**privileges** | [**TaskSpecContainerSpecPrivileges**](TaskSpecContainerSpecPrivileges.md) |  |  [optional]
**TTY** | **Boolean** | Whether a pseudo-TTY should be allocated. |  [optional]
**openStdin** | **Boolean** | Open &#x60;stdin&#x60; |  [optional]
**readOnly** | **Boolean** | Mount the container&#39;s root filesystem as read only. |  [optional]
**mounts** | [**List&lt;Mount&gt;**](Mount.md) | Specification for mounts to be added to containers created as part of the service.  |  [optional]
**stopSignal** | **String** | Signal to stop the container. |  [optional]
**stopGracePeriod** | **Long** | Amount of time to wait for the container to terminate before forcefully killing it.  |  [optional]
**healthCheck** | [**HealthConfig**](HealthConfig.md) |  |  [optional]
**hosts** | **List&lt;String&gt;** | A list of hostname/IP mappings to add to the container&#39;s &#x60;hosts&#x60; file. The format of extra hosts is specified in the [hosts(5)](http://man7.org/linux/man-pages/man5/hosts.5.html) man page:      IP_address canonical_hostname [aliases...]  |  [optional]
**dnSConfig** | [**TaskSpecContainerSpecDNSConfig**](TaskSpecContainerSpecDNSConfig.md) |  |  [optional]
**secrets** | [**List&lt;TaskSpecContainerSpecSecrets&gt;**](TaskSpecContainerSpecSecrets.md) | Secrets contains references to zero or more secrets that will be exposed to the service.  |  [optional]
**configs** | [**List&lt;TaskSpecContainerSpecConfigs&gt;**](TaskSpecContainerSpecConfigs.md) | Configs contains references to zero or more configs that will be exposed to the service.  |  [optional]
**isolation** | [**IsolationEnum**](#IsolationEnum) | Isolation technology of the containers running the service. (Windows only)  |  [optional]
**init** | **Boolean** | Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used.  |  [optional]
**sysctls** | **Map&lt;String, String&gt;** | Set kernel namedspaced parameters (sysctls) in the container. The Sysctls option on services accepts the same sysctls as the are supported on containers. Note that while the same sysctls are supported, no guarantees or checks are made about their suitability for a clustered environment, and it&#39;s up to the user to determine whether a given sysctl will work properly in a Service.  |  [optional]


<a name="IsolationEnum"></a>
## Enum: IsolationEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
PROCESS | &quot;process&quot;
HYPERV | &quot;hyperv&quot;



