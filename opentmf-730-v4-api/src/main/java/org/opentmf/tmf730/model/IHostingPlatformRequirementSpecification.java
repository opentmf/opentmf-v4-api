package org.opentmf.tmf730.model;

import org.opentmf.resource.model.IResourceSpecification;

/**
 * This is a base class that is used to define the invariant characteristics and
 * behavior (attributes, constraints, and relationships) of a
 * HostingPlatformRequirement Resource.
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
public interface IHostingPlatformRequirementSpecification extends IResourceSpecification {

  /**
   * True if the Capacity required can be virtualized.
   */
  Boolean getIsVirtualizable();
}
