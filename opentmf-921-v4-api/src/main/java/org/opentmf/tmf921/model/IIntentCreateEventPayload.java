package org.opentmf.tmf921.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-921: Intent Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIntentCreateEventPayload {

  /**
   * An Intent instance is the formal description of all expectations including
   * requirements, goals, and constraints given to a technical system.
   */
  IIntent getIntent();
}
