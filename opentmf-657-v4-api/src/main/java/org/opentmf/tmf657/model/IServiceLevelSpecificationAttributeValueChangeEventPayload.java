package org.opentmf.tmf657.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-657: Service Quality Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceLevelSpecificationAttributeValueChangeEventPayload {

  /**
   * A Service Level Specification represents a pre-defined or negotiated set of
   * Service Level 
   * <br/>Objectives. In addition, certain consequences are associated with not
   * meeting the Service Level 
   * <br/>Objectives. Service Level Agreements are expressed in terms of Service
   * Level Specifications.
   */
  IServiceLevelSpecification getServiceLevelSpecification();
}
