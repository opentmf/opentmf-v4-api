package org.opentmf.tmf730.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IQuantity;

/**
 * A SoftwareSpecification deployed using the SoftwareSupportPackage on platform
 * which meets the HostingPlatformRequirements.
 *
 * <p><br/>
 * <strong>Required:</strong> href, id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IInstalledSoftware extends ISoftwareResource {

  /**
   * Indicates whether this software uses absolute (UTC) time.
   */
  Boolean getIsUTCTime();

  /**
   * The time of the last start of this software.
   */
  OffsetDateTime getLastStartTime();

  /**
   * The current number of total processes that the Software can support at any
   * given time.
   */
  Integer getNumProcessesActiveCurrent();

  /**
   * The ccurrent number of users of the Sofware.
   */
  Integer getNumUsersCurrent();

  /**
   * An amount in a given unit.
   */
  IQuantity getPagingFileSizeCurrent();

  /**
   * An amount in a given unit.
   */
  IQuantity getProcessMemorySizeCurrent();

  /**
   * A set of identifying characters and/or numbers assigned to, and usually
   * marked on, each of a series of identical Software instances.
   */
  String getSerialNumber();

  /**
   * An amount in a given unit.
   */
  IQuantity getSwapSpaceUsedCurrent();
}
