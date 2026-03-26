package org.opentmf.tmf620.model;

import java.net.URI;
import java.util.List;
import org.opentmf.common.model.ICategoryRef;
import org.opentmf.common.model.IIntentUpdateBase;
import org.opentmf.common.model.IProductOfferingRef;

/**
 * The category resource is used to group product offerings, service and
 * resource candidates in logical containers. Categories can contain other
 * categories and/or product offerings, resource or service candidates.
 * <br/>Skipped properties: id,href,lastUpdate,{@literal @}type,{@literal @}baseType.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICategoryUpdate extends IIntentUpdateBase {

  /**
   * A URI to a JSON-Schema file that defines additional attributes and
   * relationships.
   */
  URI getAtSchemaLocation();

  /**
   * If true, this Boolean indicates that the category is a root of categories.
   */
  Boolean getIsRoot();

  /**
   * Unique identifier of the parent category.
   */
  String getParentId();

  /**
   * A product offering represents entities that are orderable from the provider
   * of the catalog, this resource includes pricing information.
   */
  List<? extends IProductOfferingRef> getProductOfferings();

  /**
   * The category resource is used to group product offerings, service and
   * resource candidates in logical containers. Categories can contain other
   * (sub-)categories and/or product offerings.
   */
  List<? extends ICategoryRef> getSubCategories();
}
