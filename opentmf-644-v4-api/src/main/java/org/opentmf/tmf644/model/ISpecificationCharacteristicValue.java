package org.opentmf.tmf644.model;

import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * A number or text that can be assigned to a SpecificationCharacteristic.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-644: Privacy Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ISpecificationCharacteristicValue extends IEntity {

  /**
   * If true, the Boolean Indicates if the value is the default value for a
   * characteristic.
   */
  Boolean getIsDefault();

  /**
   * An indicator that specifies the inclusion or exclusion of the valueFrom and
   * valueTo attributes. If applicable, possible values are "open", "closed",
   * "closedBottom" and "closedTop".
   */
  String getRangeInterval();

  /**
   * A regular expression constraint for given value.
   */
  String getRegex();

  /**
   * unit of measure for the valueCould be minutes, GB, etc.
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
  Integer getValueFrom();

  /**
   * The upper range value that a characteristic can take on.
   */
  Integer getValueTo();

  /**
   * A kind of value that the characteristic value can take on, such as numeric,
   * text and so forth.
   */
  String getValueType();
}
