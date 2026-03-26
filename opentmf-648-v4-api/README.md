# opentmf-648-v4-api

Getter-only Java interfaces for **TMF-648 Quote Management API**.

This module contains `I*` interfaces that define the read contract for every model class in the
TMF-648 specification. The corresponding model implementation lives in **opentmf-648-v4-model**
(the model module), which depends on this API module.

## Usage

This module is typically consumed as a transitive dependency of the model module. If you need to
depend on the interfaces directly:

```xml
<dependency>
    <groupId>org.opentmf.model</groupId>
    <artifactId>opentmf-648-v4-api</artifactId>
    <version>4.0.0.10</version>
</dependency>
```
