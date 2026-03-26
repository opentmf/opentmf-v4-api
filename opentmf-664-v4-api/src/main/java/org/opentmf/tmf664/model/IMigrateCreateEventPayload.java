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
public interface IMigrateCreateEventPayload {

  /**
   * Task resource used to request migration of the Resource Function.
   */
  IMigrate getMigrate();
}
