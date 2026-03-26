package org.opentmf.common.model;


/**
 * ServiceCandidate reference. ServiceCandidate is an entity that makes a
 * ServiceSpecification available to a catalog.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-633: Service Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceCandidateRef extends IEntityRef {

  /**
   * Version of the service candidate.
   */
  String getVersion();
}
