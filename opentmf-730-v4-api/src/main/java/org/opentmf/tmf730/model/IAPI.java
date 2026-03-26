package org.opentmf.tmf730.model;

import java.time.OffsetDateTime;
import org.opentmf.resource.model.ILogicalResource;

/**
 * An Application Program Interface (API) is a set of routines, protocols, and
 * tools for building software applications.
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
public interface IAPI extends ILogicalResource {

  /**
   * True defines this SoftwareResource as being currently distributed across
   * several Resource nodes.
   */
  Boolean getIsDistributedCurrent();

  /**
   * The time of the last update of this resource.
   */
  OffsetDateTime getLastUpdate();

  /**
   * Defines the target platform that the SoftwareResource will be deployed on.
   */
  String getTargetPlatform();
}
