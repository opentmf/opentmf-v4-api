package org.opentmf.resource.model;

import org.opentmf.common.model.IResource;

/**
 * A HostingPlatformRequirement implements a
 * HostingPlatformRequirementSpecification for a specific InstalledSoftware.
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
public interface IHostingPlatformRequirement extends IResource {

  /**
   * the value of the logical resource. E.g '0746712345' for MSISDN's.
   */
  String getValue();
}
