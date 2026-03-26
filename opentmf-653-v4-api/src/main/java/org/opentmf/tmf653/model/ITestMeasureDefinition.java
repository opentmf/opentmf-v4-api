package org.opentmf.tmf653.model;

import java.net.URI;
import java.util.List;
import org.opentmf.common.model.IDuration;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * A TestMeasureDefinition specifies a measure of a specific aspect of a
 * product, service, or resource test, such as lost packets or connectivity
 * status.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-653: Service Test Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestMeasureDefinition extends IExtensible {

  /**
   * The frequency of capture for the metric. Note: This may be replaced by a set
   * of entities similar to the Performance Monitoring.
   */
  String getCaptureFrequency();

  /**
   * The method used to capture the Metric. Note: This may be replaced by a set of
   * entities similar to the Performance Monitoring.
   */
  String getCaptureMethod();

  /**
   * A time interval in a given unit of time.
   */
  IDuration getCapturePeriod();

  /**
   * Brief description of the metric.
   */
  String getMetricDescription();

  /**
   * Hyperlink to access a metric for detail information.
   */
  URI getMetricHref();

  /**
   * The name of a metric that in the test measure.
   */
  String getMetricName();

  /**
   * The name of the TestMeasureDefinition.
   */
  String getName();

  /**
   * The rule(s) associated with the measure threshold.
   */
  List<? extends IMetricDefMeasureThresholdRule> getThresholdRules();

  /**
   * Name of a service test specification.
   */
  String getUnitOfMeasure();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * A kind of value that the Metric value can take on, such as numeric, text, and
   * so forth.
   */
  String getValueType();
}
