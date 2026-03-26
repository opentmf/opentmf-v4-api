# opentmf-product-v4-api

Getter-only Java interfaces for the **Product** common group. Membership follows TM Forum’s official Open API portfolio grouping — see [Open APIs](https://www.tmforum.org/open-digital-architecture/open-apis).

These interfaces are shared across multiple TMF modules:

- TMF-620: Product Catalog Management API, version: 4.1.0
- TMF-635: Usage Management API, version: 4.0.0
- TMF-637: Product Inventory Management API, version: 4.0.0
- TMF-658: Loyalty, version: 4.0.0
- TMF-671: Promotion Management API, version: 4.1.0
- TMF-677: Usage Consumption Management API, version: 4.0.0
- TMF-679: Product Offering Qualification Management API, version: 4.0.0

## Usage

This module is automatically pulled in as a transitive dependency by any TMF API module in the
Product portfolio. Normally there is no need to declare it explicitly.

If a direct dependency is required:

```xml
<dependency>
    <groupId>org.opentmf.model</groupId>
    <artifactId>opentmf-product-v4-api</artifactId>
    <version>4.1.0.0</version>
</dependency>
```
