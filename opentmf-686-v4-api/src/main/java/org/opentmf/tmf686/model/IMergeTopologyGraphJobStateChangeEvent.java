package org.opentmf.tmf686.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-686: Topology API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMergeTopologyGraphJobStateChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IMergeTopologyGraphJobStateChangeEventPayload getEvent();
}
