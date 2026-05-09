# opentmf-resource-v4-api

Getter-only Java interfaces for the **Resource** common group. Membership follows TM Forum’s official Open API portfolio grouping — see [Open APIs](https://www.tmforum.org/open-digital-architecture/open-apis).

These interfaces are shared across multiple TMF modules:
- TMF-634: Resource Catalog Management API, version: 4.1.1
- TMF-639: Resource Inventory Management API, version: 4.1.1
- TMF-642: Alarm Management API, version: 4.1.1
- TMF-652: Resource Order Management API, version: 4.1.1
- TMF-664: Resource Function Activation Management API, version: 4.1.1
- TMF-687: Stock Management API, version: 4.1.1
- TMF-702: Resource Activation Management API, version: 4.1.1
- TMF-716: ResourceReservation, version: 4.1.1
- TMF-730: Software And Compute Management API, version: 4.1.1
- TMF-908: IoT Agent and Device Management API, version: 4.1.1

## Usage

This module is automatically pulled in as a transitive dependency by any TMF API module in the
Resource portfolio. Normally there is no need to declare it explicitly.

If a direct dependency is required:

```xml
<dependency>
    <groupId>org.opentmf.model</groupId>
    <artifactId>opentmf-resource-v4-api</artifactId>
    <version>4.1.1</version>
</dependency>
```
