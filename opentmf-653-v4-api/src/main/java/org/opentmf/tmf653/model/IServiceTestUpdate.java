package org.opentmf.tmf653.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IServiceRef;
import org.opentmf.common.model.ITimePeriod;

/**
 * A service test is an entity that exists for a controlled test invocation on a
 * service. The service 
 * <br/>test is executed according to a schedule and contains service test
 * configuration parameters that are to be 
 * <br/>applied at execution time, and service test measures that result.
 * <br/>Skipped properties: id,href,{@literal @}type,{@literal @}schemaLocation,{@literal @}baseType.
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
public interface IServiceTestUpdate {

  /**
   * List of characteristics with values that define the test run.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * Description of the service test.
   */
  String getDescription();

  /**
   * The end date and time of the service test.
   */
  OffsetDateTime getEndDateTime();

  /**
   * An indication of whether the service test is running in 
   * <br/>"PROACTIVE" or "ONDEMAND" mode.
   */
  String getMode();

  /**
   * The name of the service test.
   */
  String getName();

  /**
   * Party related to the test.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Service reference, for when Service is used by other entities.
   */
  IServiceRef getRelatedService();

  /**
   * The start date and time of the service test.
   */
  OffsetDateTime getStartDateTime();

  /**
   * The actual state the service test is in. Recommended states are found in
   * ExecutionStateType schema possible values include acknowledged, rejected,
   * pending, inProgress, cancelled, completed and failed.
   */
  String getState();

  /**
   * The results of the test in terms of the measured metrics.
   */
  List<? extends ITestMeasure> getTestMeasures();

  /**
   * The service test specification used by the service test.
   */
  IServiceTestSpecificationRef getTestSpecification();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
