package org.opentmf.tmf620.model;

import org.opentmf.common.model.IDuration;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * A condition under which a ProductOffering is made available to Customers. For
 * instance, a productOffering can be offered with multiple commitment periods.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOfferingTerm extends IExtensible {

  /**
   * Description of the productOfferingTerm.
   */
  String getDescription();

  /**
   * A time interval in a given unit of time.
   */
  IDuration getDuration();

  /**
   * Name of the productOfferingTerm.
   */
  String getName();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
