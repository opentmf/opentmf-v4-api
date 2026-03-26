package org.opentmf.tmf705.model;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-705: Test Environment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IConcreteEnvironmentMetaModelStateChangeEventPayload {

  /**
   * A managed concrete environment resource metamodel resource.
   */
  IConcreteEnvironmentMetaModel getConcreteEnvironmentMetaModel();
}
