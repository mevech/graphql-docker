# ServiceApi

All URIs are relative to *http://localhost/v1.40*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceCreate**](ServiceApi.md#serviceCreate) | **POST** /services/create | Create a service
[**serviceDelete**](ServiceApi.md#serviceDelete) | **DELETE** /services/{id} | Delete a service
[**serviceInspect**](ServiceApi.md#serviceInspect) | **GET** /services/{id} | Inspect a service
[**serviceList**](ServiceApi.md#serviceList) | **GET** /services | List services
[**serviceLogs**](ServiceApi.md#serviceLogs) | **GET** /services/{id}/logs | Get service logs
[**serviceUpdate**](ServiceApi.md#serviceUpdate) | **POST** /services/{id}/update | Update a service


<a name="serviceCreate"></a>
# **serviceCreate**
> ServiceCreateResponse serviceCreate(body, xRegistryAuth)

Create a service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
object body = new object(); // object | 
String xRegistryAuth = "xRegistryAuth_example"; // String | A base64url-encoded auth configuration for pulling from private registries.  Refer to the [authentication section](#section/Authentication) for details. 
try {
    ServiceCreateResponse result = apiInstance.serviceCreate(body, xRegistryAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#serviceCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**object**](.md)|  |
 **xRegistryAuth** | **String**| A base64url-encoded auth configuration for pulling from private registries.  Refer to the [authentication section](#section/Authentication) for details.  | [optional]

### Return type

[**ServiceCreateResponse**](ServiceCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="serviceDelete"></a>
# **serviceDelete**
> serviceDelete(id)

Delete a service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
String id = "id_example"; // String | ID or name of service.
try {
    apiInstance.serviceDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#serviceDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID or name of service. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/plain

<a name="serviceInspect"></a>
# **serviceInspect**
> Service serviceInspect(id, insertDefaults)

Inspect a service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
String id = "id_example"; // String | ID or name of service.
Boolean insertDefaults = false; // Boolean | Fill empty fields with default values.
try {
    Service result = apiInstance.serviceInspect(id, insertDefaults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#serviceInspect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID or name of service. |
 **insertDefaults** | **Boolean**| Fill empty fields with default values. | [optional] [default to false]

### Return type

[**Service**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/plain

<a name="serviceList"></a>
# **serviceList**
> List&lt;Service&gt; serviceList(filters)

List services

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
String filters = "filters_example"; // String | A JSON encoded value of the filters (a `map[string][]string`) to process on the services list.  Available filters:  - `id=<service id>` - `label=<service label>` - `mode=[\"replicated\"|\"global\"]` - `name=<service name>` 
try {
    List<Service> result = apiInstance.serviceList(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#serviceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**| A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the services list.  Available filters:  - &#x60;id&#x3D;&lt;service id&gt;&#x60; - &#x60;label&#x3D;&lt;service label&gt;&#x60; - &#x60;mode&#x3D;[\&quot;replicated\&quot;|\&quot;global\&quot;]&#x60; - &#x60;name&#x3D;&lt;service name&gt;&#x60;  | [optional]

### Return type

[**List&lt;Service&gt;**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/plain

<a name="serviceLogs"></a>
# **serviceLogs**
> byte[] serviceLogs(id, details, follow, stdout, stderr, since, timestamps, tail)

Get service logs

Get &#x60;stdout&#x60; and &#x60;stderr&#x60; logs from a service. See also [&#x60;/containers/{id}/logs&#x60;](#operation/ContainerLogs).  **Note**: This endpoint works only for services with the &#x60;local&#x60;, &#x60;json-file&#x60; or &#x60;journald&#x60; logging drivers. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
String id = "id_example"; // String | ID or name of the service
Boolean details = false; // Boolean | Show service context and extra details provided to logs.
Boolean follow = false; // Boolean | Keep connection after returning logs.
Boolean stdout = false; // Boolean | Return logs from `stdout`
Boolean stderr = false; // Boolean | Return logs from `stderr`
Integer since = 0; // Integer | Only return logs since this time, as a UNIX timestamp
Boolean timestamps = false; // Boolean | Add timestamps to every log line
String tail = "all"; // String | Only return this number of log lines from the end of the logs. Specify as an integer or `all` to output all log lines. 
try {
    byte[] result = apiInstance.serviceLogs(id, details, follow, stdout, stderr, since, timestamps, tail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#serviceLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID or name of the service |
 **details** | **Boolean**| Show service context and extra details provided to logs. | [optional] [default to false]
 **follow** | **Boolean**| Keep connection after returning logs. | [optional] [default to false]
 **stdout** | **Boolean**| Return logs from &#x60;stdout&#x60; | [optional] [default to false]
 **stderr** | **Boolean**| Return logs from &#x60;stderr&#x60; | [optional] [default to false]
 **since** | **Integer**| Only return logs since this time, as a UNIX timestamp | [optional] [default to 0]
 **timestamps** | **Boolean**| Add timestamps to every log line | [optional] [default to false]
 **tail** | **String**| Only return this number of log lines from the end of the logs. Specify as an integer or &#x60;all&#x60; to output all log lines.  | [optional] [default to all]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json, text/plain

<a name="serviceUpdate"></a>
# **serviceUpdate**
> ServiceUpdateResponse serviceUpdate(id, body, version, registryAuthFrom, rollback, xRegistryAuth)

Update a service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
String id = "id_example"; // String | ID or name of service.
object body = new object(); // object | 
Integer version = 56; // Integer | The version number of the service object being updated. This is required to avoid conflicting writes. This version number should be the value as currently set on the service *before* the update. You can find the current version by calling `GET /services/{id}` 
String registryAuthFrom = "spec"; // String | If the `X-Registry-Auth` header is not specified, this parameter indicates where to find registry authorization credentials. 
String rollback = "rollback_example"; // String | Set to this parameter to `previous` to cause a server-side rollback to the previous service spec. The supplied spec will be ignored in this case. 
String xRegistryAuth = "xRegistryAuth_example"; // String | A base64url-encoded auth configuration for pulling from private registries.  Refer to the [authentication section](#section/Authentication) for details. 
try {
    ServiceUpdateResponse result = apiInstance.serviceUpdate(id, body, version, registryAuthFrom, rollback, xRegistryAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#serviceUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID or name of service. |
 **body** | [**object**](.md)|  |
 **version** | **Integer**| The version number of the service object being updated. This is required to avoid conflicting writes. This version number should be the value as currently set on the service *before* the update. You can find the current version by calling &#x60;GET /services/{id}&#x60;  |
 **registryAuthFrom** | **String**| If the &#x60;X-Registry-Auth&#x60; header is not specified, this parameter indicates where to find registry authorization credentials.  | [optional] [default to spec] [enum: spec, previous-spec]
 **rollback** | **String**| Set to this parameter to &#x60;previous&#x60; to cause a server-side rollback to the previous service spec. The supplied spec will be ignored in this case.  | [optional]
 **xRegistryAuth** | **String**| A base64url-encoded auth configuration for pulling from private registries.  Refer to the [authentication section](#section/Authentication) for details.  | [optional]

### Return type

[**ServiceUpdateResponse**](ServiceUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

