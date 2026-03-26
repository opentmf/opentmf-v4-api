package org.opentmf.tmf677.model;

/**
 * The event data structure.
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
public interface IQueryUsageConsumptionDeleteEventPayload {

  /**
   * An QueryUsageConsumption allows to manage the calculation request of an usage
   * consumption.
   */
  IQueryUsageConsumption getQueryUsageConsumption();
}
