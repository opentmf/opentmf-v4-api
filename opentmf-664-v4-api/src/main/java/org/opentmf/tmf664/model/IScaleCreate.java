package org.opentmf.tmf664.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.resource.model.IScheduleRef;

/**
 * Task Resource used to request scaling of a Resource Function
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> numberOfSteps, resourceFunction, scaleType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IScaleCreate extends IExtensible {

  /**
   * Scaling aspect is the dimension along which the Resource Function needs to be
   * scaled. The id of the aspect is provided here.
   */
  String getAspectId();

  /**
   * Name of the Scale task resource.
   */
  String getName();

  /**
   * Number of scaling steps in the direction indicated by type of scale.
   */
  Integer getNumberOfSteps();

  /**
   * Resource Function reference.
   */
  IResourceFunctionRef getResourceFunction();

  /**
   * Type of scaling requested.
   */
  String getScaleType();

  /**
   * Schedule for the scale. If not provided then needs to be actioned
   * immediately.
   */
  List<? extends IScheduleRef> getSchedules();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();
}
