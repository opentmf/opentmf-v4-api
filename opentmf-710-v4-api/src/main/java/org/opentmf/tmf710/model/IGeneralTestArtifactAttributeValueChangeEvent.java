package org.opentmf.tmf710.model;

import org.opentmf.common.model.IAttributeValueChangeEventBase;

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
public interface IGeneralTestArtifactAttributeValueChangeEvent extends IAttributeValueChangeEventBase {

  /**
   * The event data structure.
   */
  IGeneralTestArtifactAttributeValueChangeEventPayload getEvent();
}
