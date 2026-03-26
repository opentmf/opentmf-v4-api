package org.opentmf.tmf654.model;

import java.net.URI;

/**
 * The ReserveBalance resource allows adjustments to be made to the original
 * BalanceTopup eg increment the amount, alter the recharge periodicity.
 *
 * <p><br/>
 * <strong>Required:</strong> status<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-654: Prepay Balance Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IReserveBalance extends IReserveBalanceUpdate {

  /**
   * A reference to the resource.
   */
  URI getHref();

  /**
   * Unique Identifier for the resource.
   */
  String getId();
}
