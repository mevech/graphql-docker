
# IPAM

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driver** | **String** | Name of the IPAM driver to use. |  [optional]
**config** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) | List of IPAM configuration options, specified as a map:  &#x60;&#x60;&#x60; {\&quot;Subnet\&quot;: &lt;CIDR&gt;, \&quot;IPRange\&quot;: &lt;CIDR&gt;, \&quot;Gateway\&quot;: &lt;IP address&gt;, \&quot;AuxAddress\&quot;: &lt;device_name:IP address&gt;} &#x60;&#x60;&#x60;  |  [optional]
**options** | **Map&lt;String, String&gt;** | Driver-specific options, specified as a map. |  [optional]



