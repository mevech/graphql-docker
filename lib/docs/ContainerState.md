
# ContainerState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | String representation of the container state. Can be one of \&quot;created\&quot;, \&quot;running\&quot;, \&quot;paused\&quot;, \&quot;restarting\&quot;, \&quot;removing\&quot;, \&quot;exited\&quot;, or \&quot;dead\&quot;.  |  [optional]
**running** | **Boolean** | Whether this container is running.  Note that a running container can be _paused_. The &#x60;Running&#x60; and &#x60;Paused&#x60; booleans are not mutually exclusive:  When pausing a container (on Linux), the freezer cgroup is used to suspend all processes in the container. Freezing the process requires the process to be running. As a result, paused containers are both &#x60;Running&#x60; _and_ &#x60;Paused&#x60;.  Use the &#x60;Status&#x60; field instead to determine if a container&#39;s state is \&quot;running\&quot;.  |  [optional]
**paused** | **Boolean** | Whether this container is paused. |  [optional]
**restarting** | **Boolean** | Whether this container is restarting. |  [optional]
**ooMKilled** | **Boolean** | Whether this container has been killed because it ran out of memory.  |  [optional]
**dead** | **Boolean** |  |  [optional]
**pid** | **Integer** | The process ID of this container |  [optional]
**exitCode** | **Integer** | The last exit code of this container |  [optional]
**error** | **String** |  |  [optional]
**startedAt** | **String** | The time when this container was last started. |  [optional]
**finishedAt** | **String** | The time when this container last exited. |  [optional]
**health** | [**Health**](Health.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CREATED | &quot;created&quot;
RUNNING | &quot;running&quot;
PAUSED | &quot;paused&quot;
RESTARTING | &quot;restarting&quot;
REMOVING | &quot;removing&quot;
EXITED | &quot;exited&quot;
DEAD | &quot;dead&quot;



