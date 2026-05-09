# opentmf-service-v4-api

Getter-only Java interfaces for the **Service** common group. Membership follows TM Forum’s official Open API portfolio grouping — see [Open APIs](https://www.tmforum.org/open-digital-architecture/open-apis).

These interfaces are shared across multiple TMF modules:
- TMF-633: Service Catalog Management API, version: 4.1.1
- TMF-638: Service Inventory Management API, version: 4.1.1
- TMF-640: Service Activation Management API, version: 4.1.1
- TMF-641: Service Ordering Management API, version: 4.1.1
- TMF-645: Service Qualification Management API, version: 4.1.1
- TMF-653: Service Test Management API, version: 4.1.1
- TMF-657: Service Quality Management Management API, version: 4.1.1
- TMF-727: Service Usage Management API, version: 4.1.1

## Usage

This module is automatically pulled in as a transitive dependency by any TMF API module in the
Service portfolio. Normally there is no need to declare it explicitly.

If a direct dependency is required:

```xml
<dependency>
    <groupId>org.opentmf.model</groupId>
    <artifactId>opentmf-service-v4-api</artifactId>
    <version>4.1.1</version>
</dependency>
```
