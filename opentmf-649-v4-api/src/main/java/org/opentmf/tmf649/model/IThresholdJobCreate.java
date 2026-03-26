package org.opentmf.tmf649.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> granularity<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-649: Performance Thresholding Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IThresholdJobCreate {

  String getAdminState();

  OffsetDateTime getCreationTime();

  String getExecutionState();

  String getGranularity();

  Integer getJobPriority();

  OffsetDateTime getLastModifiedTime();

  /**
   * List of: Monitored objects are specified by the MonitoredObjectsCriteria.
   */
  List<? extends IMonitoredObjectsCriteria> getMonitoredObjectsCriterias();

  /**
   * A threshold base entity containing threshold rules.
   */
  IThreshold getPerformanceThreshold();

  /**
   * The schedule definition for running jobs.
   */
  IScheduleDefinition getScheduleDefinition();

  String getTrackingRecord();
}
