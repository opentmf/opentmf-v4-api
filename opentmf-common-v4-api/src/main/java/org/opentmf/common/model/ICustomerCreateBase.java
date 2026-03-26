package org.opentmf.common.model;

import java.util.List;

/**
 * Synthesized abstract parent for 6 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-629: Customer Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-669: Party Role Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomerCreateBase extends IExtensible {

  /**
   * Describes the characteristic of a customer.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * List of: Credit profile for the party (containing credit scoring, ...). By
   * default, only the current credit profile is retrieved. It can be used as a
   * list to give the party credit profiles history, the first one in the list
   * will be the current one.
   */
  List<? extends ICreditProfile> getCreditProfiles();

  /**
   * A word, term, or phrase by which the Customer is known and distinguished from
   * other Customers.
   */
  String getName();

  /**
   * Used to track the lifecycle status of the customer.
   */
  String getStatus();

  /**
   * A string providing an explanation on the value of the status lifecycle. For
   * instance if the status is Rejected, statusReason will provide the reason for
   * rejection.
   */
  String getStatusReason();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
