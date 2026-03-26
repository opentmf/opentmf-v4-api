package org.opentmf.tmf633.model;

import java.util.List;
import org.opentmf.common.model.IEntityCatalogUpdateBase;
import org.opentmf.common.model.IServiceSpecificationRef;
import org.opentmf.service.model.IServiceCategoryRef;

/**
 * ServiceCandidate is an entity that makes a service specification available to
 * a catalog. A
 * <br/>ServiceCandidate and its associated service specification may be
 * published - made visible - in any number of service catalogs, or in none. One
 * service specification can be composed of other service specifications.
 * <br/>Skipped properties: id,href,lastUpdate.
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
public interface IServiceCandidateUpdate extends IEntityCatalogUpdateBase {

  /**
   * List of categories for this candidate.
   */
  List<? extends IServiceCategoryRef> getCategories();

  /**
   * Service specification reference: ServiceSpecification(s) required to realize
   * a ProductSpecification.
   */
  IServiceSpecificationRef getServiceSpecification();
}
