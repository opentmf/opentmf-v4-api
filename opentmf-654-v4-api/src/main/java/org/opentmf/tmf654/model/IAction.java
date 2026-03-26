package org.opentmf.tmf654.model;

import java.net.URI;

/**
 * an abstract resource. example extensions are BalanceTopup, BalanceDeduct.
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
public interface IAction extends IReserveBalanceUpdate {

  /**
   * A reference to the resource.
   */
  URI getHref();

  /**
   * Unique Identifier for the resource.
   */
  String getId();
}
