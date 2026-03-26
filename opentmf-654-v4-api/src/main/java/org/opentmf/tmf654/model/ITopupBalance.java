package org.opentmf.tmf654.model;

import java.net.URI;

/**
 * Represents a detailed description of a recharge operation requested over a
 * bucket (defined by a specific product or reference to a product (i.e.: a
 * commercial id such as an msisidn) and a service type).
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
public interface ITopupBalance extends ITopupBalanceUpdate {

  /**
   * A reference to the resource.
   */
  URI getHref();

  /**
   * Unique Identifier for the resource.
   */
  String getId();
}
