package org.opentmf.common.model;


/**
 * A number or text that can be assigned to an agreement specification
 * characteristic.
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
public interface IAgreementSpecCharacteristicValue extends IEntity {

  /**
   * Indicates if the value is the default value for a characteristic.
   */
  Boolean getDefaultValue();

  /**
   * Unit of measure for the characteristic, such as minutes, gigabytes (GB) and
   * so on.
   */
  String getUnitOfMeasure();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  Object getValue();

  /**
   * The low range value that a characteristic can take on.
   */
  String getValueFrom();

  /**
   * The upper range value that a characteristic can take on.
   */
  String getValueTo();

  /**
   * A kind of value that the characteristic can take on, such as numeric, text,
   * and so forth.
   */
  String getValueType();
}
