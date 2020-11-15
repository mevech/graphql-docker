
# HealthcheckResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time at which this check started in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  |  [optional]
**end** | **String** | Date and time at which this check ended in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  |  [optional]
**exitCode** | **Integer** | ExitCode meanings:  - &#x60;0&#x60; healthy - &#x60;1&#x60; unhealthy - &#x60;2&#x60; reserved (considered unhealthy) - other values: error running probe  |  [optional]
**output** | **String** | Output from last check |  [optional]



