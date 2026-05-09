package org.opentmf.common.model;


/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-663: Shopping Cart Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICartTerm extends IExtensible {

  String getDescription();

  /**
   * An amount in a given unit.
   */
  IQuantity getDuration();

  String getName();
}
