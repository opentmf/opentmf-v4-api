package org.opentmf.tmf653.model;

import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;

/**
 * A TestMeasure specifies a measure of a specific aspect of a product, service,
 * or resource test, such as lost packets or connectivity status.
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
public interface ITestMeasure extends IExtensible {

  /**
   * The number of digits of accuracy captured for associated Metrics.
   */
  BigDecimal getAccuracy();

  /**
   * The date and time that the metric was captured.
   */
  OffsetDateTime getCaptureDateTime();

  /**
   * The method used to capture the Metrics (This may be replaced by a set of
   * entities similar to the Performance Monitoring Ref).
   */
  String getCaptureMethod();

  /**
   * Brief description of the metric.
   */
  String getMetricDescription();

  /**
   * Hyperlink to access a metric for detail information.
   */
  URI getMetricHref();

  /**
   * The name of the metric.
   */
  String getMetricName();

  /**
   * A list of rules that were violated in this test measure.
   */
  List<? extends IMeasureThresholdRuleViolation> getRuleViolations();

  /**
   * The unit of measure for the metric values, such as meters, cubic yards,
   * kilograms [ISO 1000].
   */
  String getUnitOfMeasure();

  /**
   * Describes a given characteristic of an object or entity through a name/value
   * pair.
   */
  ICharacteristic getValue();
}
