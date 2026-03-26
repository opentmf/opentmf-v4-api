package org.opentmf.tmf664.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IScaleAttributeValueChangeEventPayload {

  /**
   * Task Resource used to request scaling of a Resource Function.
   */
  IScale getScale();
}
