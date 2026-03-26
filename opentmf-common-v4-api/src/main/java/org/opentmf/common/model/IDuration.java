package org.opentmf.common.model;


/**
 * A time interval in a given unit of time.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-653: Service Test Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDuration {

  /**
   * Time interval (number of seconds, minutes, hours, etc.).
   */
  Integer getAmount();

  /**
   * Unit of time (seconds, minutes, hours, etc.).
   */
  String getUnits();
}
