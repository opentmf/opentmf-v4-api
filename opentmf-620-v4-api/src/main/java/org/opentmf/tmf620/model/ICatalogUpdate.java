package org.opentmf.tmf620.model;

import java.net.URI;
import java.util.List;
import org.opentmf.common.model.ICategoryRef;
import org.opentmf.common.model.IIntentUpdateBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * A collection of Product Offerings, intended for a specific
 * DistributionChannel, enhanced with additional information such as SLA
 * parameters, invoicing and shipping details
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
public interface ICatalogUpdate extends IIntentUpdateBase {

  /**
   * A URI to a JSON-Schema file that defines additional attributes and
   * relationships.
   */
  URI getAtSchemaLocation();

  /**
   * Indicates if the catalog is a product, service or resource catalog.
   */
  String getCatalogType();

  /**
   * List of root categories contained in this catalog.
   */
  List<? extends ICategoryRef> getCategories();

  /**
   * List of parties involved in this catalog.
   */
  List<? extends IRelatedParty> getRelatedParties();
}
