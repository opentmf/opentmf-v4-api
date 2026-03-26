package org.opentmf.tmf915.model;

import org.opentmf.common.model.INamedEntity;

/**
 * A counter/KPI to be used by the threshold rule.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMeasurement extends INamedEntity {

  /**
   * This attribute indicates different forms in which the measurement data can be
   * captured (please see details below).
   */
  String getCollectionType();

  /**
   * A description of the measurement.
   */
  String getDescription();

  /**
   * A formula that is used to calculate a measurement (a string).
   */
  String getMeasurementFormula();

  /**
   * A category of the measurement (different SDOs may be using different
   * categories).
   */
  String getMeasurementType();

  /**
   * The unit of the measurement (e.g. second, bytes, Celsius, etc.).
   */
  String getMeasurementUnit();
}
