# opentmf-customer-v4-api

Getter-only Java interfaces for the **Customer** common group. Membership follows TM Forum’s official Open API portfolio grouping — see [Open APIs](https://www.tmforum.org/open-digital-architecture/open-apis).

These interfaces are shared across multiple TMF modules:

- TMF-622: Product Ordering Management API, version: 4.0.0
- TMF-629: Customer Management API, version: 4.0.0
- TMF-646: Appointment Management API, version: 4.0.0
- TMF-648: Quote Management API, version: 4.0.0
- TMF-654: Prepay Balance Management API, version: 4.0.0
- TMF-663: Shopping Cart Management API, version: 4.0.0
- TMF-670: Payment Method Management API, version: 4.0.0
- TMF-676: Payment Management API, version: 4.0.0
- TMF-678: Customer Bill Management API, version: 4.0.0
- TMF-680: Recommendation Management API, version: 4.0.0
- TMF-696: Risk Management API, version: 4.0.0
- TMF-717: Customer360 Management API, version: 4.0.0

## Usage

This module is automatically pulled in as a transitive dependency by any TMF API module in the
Customer portfolio. Normally there is no need to declare it explicitly.

If a direct dependency is required:

```xml
<dependency>
    <groupId>org.opentmf.model</groupId>
    <artifactId>opentmf-customer-v4-api</artifactId>
    <version>4.0.0.10</version>
</dependency>
```
