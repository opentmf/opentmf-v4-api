package org.opentmf.common.model;


/**
 * A counter/KPI to be used by the threshold rule.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-649: Performance Thresholding Management API</li>
 *   <li>TMF-common: common</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPerformanceMeasurement extends IEntity {

  /**
   * A free-text description of the performance measurement.
   */
  String getDescription();

  /**
   * A category of the measurement (different SDOs may be using different
   * categories).
   */
  String getIndicatorCategory();

  /**
   * A word, term, or phrase by which a measurement is known and distinguished
   * from other performance measurements.
   */
  String getIndicatorName();

  /**
   * This attribute indicates different forms in which the measurement data can be
   * captured (please see details below).
   */
  String getIndicatorType();

  /**
   * The unit of the measurement (e.g. second, bytes, Celsius, etc.).
   */
  String getIndicatorUnit();

  IMeasurementCollectionJobRef getMeasurementCollectionJob();

  /**
   * The measurement value.
   */
  String getObservedValue();

  /**
   * PerformanceIndicatorSpecification reference: A
   * PerformanceIndicatorSpecification is a detailed description of a tangible or
   * intangible object made available externally in the form of a
   * PerformanceIndicatorSpecification to customers or other parties playing a
   * party role.
   */
  IPerformanceIndicatorSpecificationRef getPerformanceIndicatorSpecification();

  IResourceRef getReportingSystem();

  IResourceRef getSourceSystem();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
