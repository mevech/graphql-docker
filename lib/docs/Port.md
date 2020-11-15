
# Port

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IP** | **String** | Host IP address that the container&#39;s port is mapped to |  [optional]
**privatePort** | **Integer** | Port on the container | 
**publicPort** | **Integer** | Port exposed on the host |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TCP | &quot;tcp&quot;
UDP | &quot;udp&quot;
SCTP | &quot;sctp&quot;



