package org.opentmf.tmf651.model;

import org.opentmf.partner.model.IAgreement;

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
public interface IAgreementStateChangeEventPayload {

  /**
   * An agreement represents a contract or arrangement, either written or verbal
   * and sometimes enforceable by law, such as a service level agreement or a
   * customer price agreement. An agreement involves a number of other business
   * entities, such as products, services, and resources and/or their
   * specifications.
   */
  IAgreement getAgreement();
}
