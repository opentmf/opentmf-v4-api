package org.opentmf.tmf653.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-653: Service Test Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceTestSpecificationAttributeValueChangeEventPayload {

  /**
   * The service test specification describes the service test in terms of
   * parameters to be configured and 
   * <br/>measures to be taken.
   */
  IServiceTestSpecification getServiceTestSpecification();
}
