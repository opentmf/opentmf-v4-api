package org.opentmf.tmf915.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAiContractSpecificationDeleteEventPayload {

  /**
   * A template of an agreement that can be used when establishing partnerships.
   */
  IAiContractSpecification getAiContractSpecification();
}
