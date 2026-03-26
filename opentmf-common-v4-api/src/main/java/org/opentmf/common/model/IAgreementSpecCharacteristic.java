package org.opentmf.common.model;

import java.util.List;

/**
 * A characteristic quality or distinctive feature of an agreement.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-651: Agreement Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAgreementSpecCharacteristic extends INamedEntity {

  /**
   * If true, the Boolean indicates that the characteristic is configurable.
   */
  Boolean getConfigurable();

  /**
   * A narrative that explains in detail what the characteristic is.
   */
  String getDescription();

  /**
   * List of: A number or text that can be assigned to an agreement specification
   * characteristic.
   */
  List<? extends IAgreementSpecCharacteristicValue> getSpecCharacteristicValues();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * A kind of value that the characteristic can take on, such as numeric, text
   * and so forth.
   */
  String getValueType();
}
