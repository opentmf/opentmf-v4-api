package org.opentmf.tmf633.model;

import java.time.OffsetDateTime;

/**
 * ServiceCandidate is an entity that makes a service specification available to
 * a catalog. A
 * <br/>ServiceCandidate and its associated service specification may be
 * published - made visible - in any number of service catalogs, or in none. One
 * service specification can be composed of other service specifications.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name, serviceSpecification<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceCandidateCreate extends IServiceCandidateUpdate {

  /**
   * Date and time of the last update of this REST resource.
   */
  OffsetDateTime getLastUpdate();
}
