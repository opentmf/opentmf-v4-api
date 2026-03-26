package org.opentmf.partner.model;

import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * Aspects of the agreement not formally specified elsewhere in the agreement
 * and that cannot be captured elsewhere in a formal notation, or automatically
 * monitored and require a more human level of management.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-644: Privacy Management API</li>
 *   <li>TMF-651: Agreement Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAgreementTermOrCondition extends IEntity {

  /**
   * Text that explains the term or condition of the agreement.
   */
  String getDescription();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
