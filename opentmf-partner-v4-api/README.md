# opentmf-partner-v4-api

Getter-only Java interfaces for the **Partner** common group. Membership follows TM Forum’s official Open API portfolio grouping — see [Open APIs](https://www.tmforum.org/open-digital-architecture/open-apis).

These interfaces are shared across multiple TMF modules:

- TMF-632: Party Management API, version: 4.0.0
- TMF-644: Privacy Management API, version: 4.0.0
- TMF-651: Agreement Management API, version: 4.0.0
- TMF-666: Account Management API, version: 4.0.0
- TMF-668: Partnership Type, version: 4.0.0
- TMF-669: Party Role Management API, version: 4.0.0
- TMF-672: User Role Permission Management API, version: 4.0.0
- TMF-683: Party Interaction Management API, version: 4.0.0
- TMF-700: Shipping Order Management API, version: 4.0.0
- TMF-711: Shipment Management Management API, version: 4.0.0
- TMF-713: Work Management, version: 4.0.0

## Usage

This module is automatically pulled in as a transitive dependency by any TMF API module in the
Partner portfolio. Normally there is no need to declare it explicitly.

If a direct dependency is required:

```xml
<dependency>
    <groupId>org.opentmf.model</groupId>
    <artifactId>opentmf-partner-v4-api</artifactId>
    <version>4.0.0.10</version>
</dependency>
```
