package org.opentmf.tmf714.model;

import org.opentmf.common.model.IAttributeValueChangeEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICheckWorkQualificationInformationRequiredEvent extends IAttributeValueChangeEventBase {

  /**
   * The event data structure.
   */
  ICheckWorkQualificationInformationRequiredEventPayload getEvent();
}
