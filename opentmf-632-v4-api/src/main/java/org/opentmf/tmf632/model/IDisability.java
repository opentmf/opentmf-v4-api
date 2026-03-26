package org.opentmf.tmf632.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Lack or inadequate strength or ability.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDisability extends IExtensible {

  /**
   * Code of the disability.
   */
  String getDisabilityCode();

  /**
   * Name of the disability.
   */
  String getDisabilityName();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
