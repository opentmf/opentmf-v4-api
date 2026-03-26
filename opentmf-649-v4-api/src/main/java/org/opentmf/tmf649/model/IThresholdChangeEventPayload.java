package org.opentmf.tmf649.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-649: Performance Thresholding Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IThresholdChangeEventPayload {

  /**
   * A threshold base entity containing threshold rules.
   */
  IThreshold getThreshold();
}
