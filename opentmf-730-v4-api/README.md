# opentmf-730-v4-api

Getter-only Java interfaces for **TMF-730 Software And Compute Management API**.

This module contains `I*` interfaces that define the read contract for every model class in the
TMF-730 specification. The corresponding model implementation lives in **opentmf-730-v4-model**
(the model module), which depends on this API module.

## Usage

This module is typically consumed as a transitive dependency of the model module. If you need to
depend on the interfaces directly:

```xml
<dependency>
    <groupId>org.opentmf.model</groupId>
    <artifactId>opentmf-730-v4-api</artifactId>
    <version>4.1.1.11</version>
</dependency>
```
