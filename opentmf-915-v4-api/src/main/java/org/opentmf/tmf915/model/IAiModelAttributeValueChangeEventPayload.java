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
public interface IAiModelAttributeValueChangeEventPayload {

  /**
   * AiModel is a base class for defining the AiModel hierarchy.
   */
  IAiModel getAiModel();
}
