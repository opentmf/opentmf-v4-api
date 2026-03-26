package org.opentmf.tmf713.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkSpecificationStateChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IWorkSpecificationStateChangeEventPayload getEvent();
}
