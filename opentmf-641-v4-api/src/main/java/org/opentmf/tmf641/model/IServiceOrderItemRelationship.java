package org.opentmf.tmf641.model;

import org.opentmf.common.model.IExtensible;

/**
 * Linked service order item to the one containing this attribute.
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
public interface IServiceOrderItemRelationship extends IExtensible {

  IServiceOrderItemRef getOrderItem();

  /**
   * The type of related order item, can be: dependency if the order item needs to
   * be not started until another order item is complete.
   */
  String getRelationshipType();
}
