package org.opentmf.tmf710.model;

import org.opentmf.common.model.IEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-710: General Test Artifact Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeneralTestArtifactChangeEvent extends IEventBase {

  /**
   * The event data structure.
   */
  IGeneralTestArtifactChangeEventPayload getEvent();
}
