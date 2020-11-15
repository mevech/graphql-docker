
# ClusterInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **String** | The ID of the swarm. |  [optional]
**version** | [**ObjectVersion**](ObjectVersion.md) |  |  [optional]
**createdAt** | **String** | Date and time at which the swarm was initialised in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  |  [optional]
**updatedAt** | **String** | Date and time at which the swarm was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  |  [optional]
**spec** | [**SwarmSpec**](SwarmSpec.md) |  |  [optional]
**tlSInfo** | [**TLSInfo**](TLSInfo.md) |  |  [optional]
**rootRotationInProgress** | **Boolean** | Whether there is currently a root CA rotation in progress for the swarm  |  [optional]
**dataPathPort** | **Integer** | DataPathPort specifies the data path port number for data traffic. Acceptable port range is 1024 to 49151. If no port is set or is set to 0, the default port (4789) is used.  |  [optional]
**defaultAddrPool** | **List&lt;String&gt;** | Default Address Pool specifies default subnet pools for global scope networks.  |  [optional]
**subnetSize** | **Integer** | SubnetSize specifies the subnet size of the networks created from the default subnet pool.  |  [optional]



