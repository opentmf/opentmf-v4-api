package org.opentmf.tmf687.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IProductStockRef;

/**
 * Linked product stock with a type relationship.
 *
 * <p><br/>
 * <strong>Required:</strong> relationshipType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-687: Stock Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductStockRelationship extends IExtensible {

  /**
   * The type of relationship between product stock.
   */
  String getRelationshipType();

  /**
   * ProductStockRef is a reference to a product stock.
   */
  IProductStockRef getStockLevel();
}
