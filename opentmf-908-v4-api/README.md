# opentmf-908-v4-api

Getter-only Java interfaces for **TMF-908 IoT Agent and Device Management API**.

This module contains `I*` interfaces that define the read contract for every model class in the
TMF-908 specification. The corresponding model implementation lives in **opentmf-908-v4-model**
(the model module), which depends on this API module.

## Usage

This module is typically consumed as a transitive dependency of the model module. If you need to
depend on the interfaces directly:

```xml
<dependency>
    <groupId>org.opentmf.model</groupId>
    <artifactId>opentmf-908-v4-api</artifactId>
    <version>4.1.1.11</version>
</dependency>
```
