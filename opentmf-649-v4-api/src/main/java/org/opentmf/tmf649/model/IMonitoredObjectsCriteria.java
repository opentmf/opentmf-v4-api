package org.opentmf.tmf649.model;


/**
 * Monitored objects are specified by the MonitoredObjectsCriteria.
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
public interface IMonitoredObjectsCriteria {

  /**
   * A filter that can be used in conjunction with the monitored object class for
   * specifying the set of instances that are referenced.
   */
  String getMonitoredObjectFilter();
}
