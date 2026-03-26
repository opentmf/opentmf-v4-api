package org.opentmf.tmf634.model;

import java.net.URI;

/**
 * ResourceCandidate is an entity that makes a resource specification available
 * to a catalog. A ResourceCandidate and its associated resource specification
 * may be published - made visible - in any number of resource catalogs, or in
 * none.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceCandidate extends IResourceCandidateUpdate {

  /**
   * Hyperlink reference to this REST resource.
   */
  URI getHref();

  /**
   * Unique identifier of this REST resource.
   */
  String getId();
}
