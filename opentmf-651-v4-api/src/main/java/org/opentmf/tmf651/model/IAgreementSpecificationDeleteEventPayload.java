package org.opentmf.tmf651.model;

import org.opentmf.common.model.IAgreementSpecification;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-651: Agreement Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAgreementSpecificationDeleteEventPayload {

  /**
   * A template of an agreement that can be used when establishing partnerships.
   */
  IAgreementSpecification getAgreementSpecification();
}
