# TaskApi

All URIs are relative to *http://localhost/v1.40*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taskInspect**](TaskApi.md#taskInspect) | **GET** /tasks/{id} | Inspect a task
[**taskList**](TaskApi.md#taskList) | **GET** /tasks | List tasks
[**taskLogs**](TaskApi.md#taskLogs) | **GET** /tasks/{id}/logs | Get task logs


<a name="taskInspect"></a>
# **taskInspect**
> Task taskInspect(id)

Inspect a task

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String id = "id_example"; // String | ID of the task
try {
    Task result = apiInstance.taskInspect(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#taskInspect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the task |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="taskList"></a>
# **taskList**
> List&lt;Task&gt; taskList(filters)

List tasks

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String filters = "filters_example"; // String | A JSON encoded value of the filters (a `map[string][]string`) to process on the tasks list.  Available filters:  - `desired-state=(running | shutdown | accepted)` - `id=<task id>` - `label=key` or `label=\"key=value\"` - `name=<task name>` - `node=<node id or name>` - `service=<service name>` 
try {
    List<Task> result = apiInstance.taskList(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#taskList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**| A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the tasks list.  Available filters:  - &#x60;desired-state&#x3D;(running | shutdown | accepted)&#x60; - &#x60;id&#x3D;&lt;task id&gt;&#x60; - &#x60;label&#x3D;key&#x60; or &#x60;label&#x3D;\&quot;key&#x3D;value\&quot;&#x60; - &#x60;name&#x3D;&lt;task name&gt;&#x60; - &#x60;node&#x3D;&lt;node id or name&gt;&#x60; - &#x60;service&#x3D;&lt;service name&gt;&#x60;  | [optional]

### Return type

[**List&lt;Task&gt;**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="taskLogs"></a>
# **taskLogs**
> byte[] taskLogs(id, details, follow, stdout, stderr, since, timestamps, tail)

Get task logs

Get &#x60;stdout&#x60; and &#x60;stderr&#x60; logs from a task. See also [&#x60;/containers/{id}/logs&#x60;](#operation/ContainerLogs).  **Note**: This endpoint works only for services with the &#x60;local&#x60;, &#x60;json-file&#x60; or &#x60;journald&#x60; logging drivers. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String id = "id_example"; // String | ID of the task
Boolean details = false; // Boolean | Show task context and extra details provided to logs.
Boolean follow = false; // Boolean | Keep connection after returning logs.
Boolean stdout = false; // Boolean | Return logs from `stdout`
Boolean stderr = false; // Boolean | Return logs from `stderr`
Integer since = 0; // Integer | Only return logs since this time, as a UNIX timestamp
Boolean timestamps = false; // Boolean | Add timestamps to every log line
String tail = "all"; // String | Only return this number of log lines from the end of the logs. Specify as an integer or `all` to output all log lines. 
try {
    byte[] result = apiInstance.taskLogs(id, details, follow, stdout, stderr, since, timestamps, tail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#taskLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the task |
 **details** | **Boolean**| Show task context and extra details provided to logs. | [optional] [default to false]
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

