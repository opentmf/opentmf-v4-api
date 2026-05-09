package org.opentmf.tmf701.model;

import org.opentmf.common.model.ITaskFlowRef;

/**
 * Describes relationship between taskFlow.
 *
 * <p><br/>
 * <strong>Required:</strong> relationshipType, taskFlow<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-701: Process Flow Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITaskFlowRelationship {

  /**
   * The type of taskFlow relationship (requires, triggers, etc.).
   */
  String getRelationshipType();

  ITaskFlowRef getTaskFlow();
}
