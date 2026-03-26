package org.opentmf.common.model;


/**
 * An applied billing rate has dynamic characteristics according to the its type
 * (characteristics are based on the service type, line of business or on others
 * parameters).
 *
 * <p><br/>
 * <strong>Required:</strong> name, value<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-678: Customer Bill Management API</li>
 *   <li>TMF-common: common</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAppliedBillingRateCharacteristic extends IExtensible {

  /**
   * Name of the characteristic.
   */
  String getName();

  Object getValue();

  /**
   * Data type of the value of the characteristic.
   */
  String getValueType();
}
