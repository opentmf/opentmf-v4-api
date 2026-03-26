package org.opentmf.tmf677.model;

import java.net.URI;
import java.util.List;

/**
 * An QueryUsageConsumption allows to manage the calculation request of an usage
 * consumption.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-677: Usage Consumption Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQueryUsageConsumption extends IQueryUsageConsumptionCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();

  /**
   * Report with current counters and balances.
   */
  List<? extends IUsageConsumption> getUsageConsumptions();
}
