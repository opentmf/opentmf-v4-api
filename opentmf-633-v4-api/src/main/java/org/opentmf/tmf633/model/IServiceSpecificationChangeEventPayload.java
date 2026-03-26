package org.opentmf.tmf633.model;

import org.opentmf.common.model.IServiceSpecification;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceSpecificationChangeEventPayload {

  /**
   * ServiceSpecification is a class that offers characteristics to describe a
   * type of service.
   * <br/>Functionally, it acts as a template by which Services may be
   * instantiated. By sharing the same specification, these services would
   * therefore share the same set of characteristics.
   */
  IServiceSpecification getServiceSpecification();
}
