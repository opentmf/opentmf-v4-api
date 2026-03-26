package org.opentmf.tmf714.model;

import org.opentmf.common.model.IEventBase;

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
public interface ICheckWorkQualificationStateChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  ICheckWorkQualificationStateChangeEventPayload getEvent();
}
