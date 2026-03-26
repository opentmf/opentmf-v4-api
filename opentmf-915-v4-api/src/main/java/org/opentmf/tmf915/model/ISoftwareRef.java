package org.opentmf.tmf915.model;

import org.opentmf.common.model.IEntityRef;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ISoftwareRef extends IEntityRef {

  /**
   * software version.
   */
  String getSoftwareVersion();
}
