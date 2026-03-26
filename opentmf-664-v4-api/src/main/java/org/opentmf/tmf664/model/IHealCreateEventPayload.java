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
public interface IHealCreateEventPayload {

  /**
   * Task Resource used to request healing of a Resource Function.
   */
  IHeal getHeal();
}
