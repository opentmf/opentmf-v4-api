package org.opentmf.common.model;


/**
 * Description of a productTerm linked to this orderItem. This represents a
 * commitment with a duration.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IOrderTerm extends IExtensible {

  /**
   * Description of the productOrderTerm.
   */
  String getDescription();

  /**
   * An amount in a given unit.
   */
  IQuantity getDuration();

  /**
   * Name of the productOrderTerm.
   */
  String getName();
}
