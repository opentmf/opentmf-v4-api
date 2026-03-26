package org.opentmf.common.model;


/**
 * Identifies the details of the threshold that has been crossed.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-642: Alarm Management API</li>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICrossedThresholdInformation extends IExtensible {

  /**
   * Indicates the threshold crossing direction: up or down.
   */
  String getDirection();

  /**
   * Indicates the granularity at which the indicator is evaluated for threshold
   * crossing.
   */
  String getGranularity();

  /**
   * Indicates the name of indicator which crossed the threshold.
   */
  String getIndicatorName();

  /**
   * Indicates the unit of the measurement of the indicator corresponding to the
   * threshold that has been crossed.
   */
  String getIndicatorUnit();

  /**
   * Indicates the value of the indicator which crossed the threshold.
   */
  String getObservedValue();

  IThresholdRef getThreshold();

  /**
   * Indicates further information on the threshold crossing alarm.
   */
  String getThresholdCrossingDescription();
}
