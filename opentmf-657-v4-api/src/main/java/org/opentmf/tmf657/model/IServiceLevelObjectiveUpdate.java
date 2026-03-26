package org.opentmf.tmf657.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Service level objectives are defined in terms of parameters and metrics,
 * thresholds, and tolerances 
 * <br/>associated with the parameters.
 * <br/>Skipped properties: id,href,validFor.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-657: Service Quality Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceLevelObjectiveUpdate extends IExtensible {

  /**
   * An operator that specifies whether a Service Level Objective is 
   * <br/>violated above or below the conformanceTarget.
   */
  String getConformanceComparator();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getConformancePeriod();

  /**
   * A value used to determine if Service Level Objective is met. 
   * <br/>The data type should be adjusted case by case.
   */
  String getConformanceTarget();

  /**
   * The number of times an objective can remain un-updated without 
   * <br/>a violation of a Service Level Agreement in reference to a measurement
   * period and/or Service Level Agreement reporting period.
   */
  String getGraceTimes();

  /**
   * The name of the service level objectives.
   */
  String getName();

  /**
   * A list of consequences for this objective.
   */
  List<? extends IServiceLevelSpecConsequence> getServiceLevelObjectiveConsequences();

  /**
   * Service Level Specification parameters can be one of two types. A Key Quality
   * Indicator (KQI) 
   * <br/>provides a measurement of a specific aspect of the performance of a
   * Product (i.e., Product 
   * <br/>Specification, Product Offering, or Product) or a Service (i.e., Service
   * Specification or Service).
   */
  IServiceLevelSpecParameter getServiceLevelObjectiveParameter();

  /**
   * A value that used to specify when a warning should be used 
   * <br/>that indicates an objective is danger of not being met. Notice, the data
   * type should be adjusted case by case.
   */
  String getThresholdTarget();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getTolerancePeriod();

  /**
   * A value that specifies the allowable variation of a conformance 
   * <br/>Target. The data type should be adjusted case by case.
   */
  String getToleranceTarget();
}
