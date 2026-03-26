package org.opentmf.tmf674.model;

import org.opentmf.common.model.IExtensible;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-674: Geographic Site Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IHourPeriod extends IExtensible {

  /**
   * The time when the status ends applying.
   */
  String getEndHour();

  /**
   * The time when the status starts applying.
   */
  String getStartHour();
}
