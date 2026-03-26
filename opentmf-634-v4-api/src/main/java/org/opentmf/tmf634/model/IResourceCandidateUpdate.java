package org.opentmf.tmf634.model;

import java.util.List;
import org.opentmf.common.model.IAssociationCreateBase;
import org.opentmf.common.model.IResourceSpecificationRef;

/**
 * ResourceCandidate is an entity that makes a resource specification available
 * to a catalog. A ResourceCandidate and its associated resource specification
 * may be published - made visible - in any number of resource catalogs, or in
 * none.
 * <br/>Skipped properties: id,href.
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
public interface IResourceCandidateUpdate extends IAssociationCreateBase {

  /**
   * The categories in which this candidate is exposed.
   */
  List<? extends IResourceCategoryRef> getCategories();

  /**
   * Resources are physical or non-physical components (or some combination of
   * these) within an enterprise's infrastructure or inventory. They are typically
   * consumed or used by services (for example a physical port assigned to a
   * service) or contribute to the realization of a Product (for example, a SIM
   * card). They can be drawn from the Application, Computing and Network domains,
   * and include, for example, Network Elements, software, IT systems, content and
   * information, and technology components.
   * <br/>A ResourceSpecification is an abstract base class for representing a
   * generic means for implementing a particular type of Resource. In essence, a
   * ResourceSpecification defines the common attributes and relationships of a
   * set of related Resources, while Resource defines a specific instance that is
   * based on a particular ResourceSpecification.
   */
  IResourceSpecificationRef getResourceSpecification();
}
