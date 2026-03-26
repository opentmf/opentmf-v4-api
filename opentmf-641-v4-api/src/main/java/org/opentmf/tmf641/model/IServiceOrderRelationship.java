package org.opentmf.tmf641.model;

import org.opentmf.common.model.ICharacteristicRelationship;

/**
 * Linked service order to the one containing this attribute.
 *
 * <p><br/>
 * <strong>Required:</strong> id, relationshipType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-641: Service Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceOrderRelationship extends ICharacteristicRelationship {

  /**
   * The entity type of the related order.
   */
  String getAtReferredType();
}
