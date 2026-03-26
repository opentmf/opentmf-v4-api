package org.opentmf.tmf716.model;

import org.opentmf.common.model.IExtensible;

/**
 * Quantity that defines the Capacity.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-716: ResourceReservation</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICapacityAmount extends IExtensible {

  /**
   * A value and units that define the CapacityAmount, such as 10000 ea, 10B Mb.
   * Instance values are mutually exclusive with From and To capacityAmounts and
   * range interval.
   */
  String getCapacityAmount();

  /**
   * The low range value that a Capacity Amount can take on.
   */
  String getCapacityAmountFrom();

  /**
   * The upper range value that CapacityAmount can take on.
   */
  String getCapacityAmountTo();

  /**
   * An indicator that specifies the inclusion or exclusion of the capacityAmount
   * From and capacityAmountTo attributes. 
   * <br/>Possible values are "open", "closed", "closedBottom" and "closedTop".
   */
  String getRangeInterval();
}
