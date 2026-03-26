package org.opentmf.tmf664.model;

import org.opentmf.resource.model.IResourceFunction;

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
public interface IResourceFunctionStateChangeEventPayload {

  /**
   * A ResourceFunction is a behavior to transform inputs of any nature into
   * outputs of any nature independently from the way it is provided.
   */
  IResourceFunction getResourceFunction();
}
