package org.opentmf.tmf634.model;

import java.util.List;
import org.opentmf.common.model.IAssociationCreateBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * The root entity for resource catalog management.
 * <br/>A resource catalog is a group of resource specifications made available
 * through resource candidates that an organization provides to the consumers
 * (internal consumers like its employees or B2B customers or B2C customers).
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
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
public interface IResourceCatalogCreate extends IAssociationCreateBase {

  /**
   * List of root categories contained in this catalog.
   */
  List<? extends IResourceCategoryRef> getCategories();

  /**
   * List of parties involved in this catalog.
   */
  List<? extends IRelatedParty> getRelatedParties();
}
