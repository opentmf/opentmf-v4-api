package org.opentmf.tmf632.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Keeps track of other names, for example the old name of an organization.
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
public interface IOtherNameOrganization extends IExtensible {

  /**
   * Organization name (department name for example).
   */
  String getName();

  /**
   * Co. , Inc. , Ltd. , Pty Ltd. , Plc; , Gmbh.
   */
  String getNameType();

  /**
   * The name that the organization trades under.
   */
  String getTradingName();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
