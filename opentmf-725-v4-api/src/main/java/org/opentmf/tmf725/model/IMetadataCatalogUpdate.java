package org.opentmf.tmf725.model;

import java.util.List;
import org.opentmf.common.model.IAttachment;
import org.opentmf.common.model.IRelatedParty;

/**
 * Additional information to describe the catalog
 * <br/>Skipped properties:
 * id,href,lastUpdateDate,{@literal @}baseType,{@literal @}schemaLocation,{@literal @}type.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-725: Metadata Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMetadataCatalogUpdate {

  /**
   * Complements the description of an element (for instance a product) through
   * video, pictures...
   */
  IAttachment getAttachment();

  /**
   * A narrative text describing the content of the MetadataCatalog.
   */
  String getDescription();

  /**
   * The categories used in this catalog.
   */
  List<? extends IMetadataCategoryRef> getMetadataCategories();

  /**
   * The name of the MetadataCatalog.
   */
  String getName();

  /**
   * Parties who manage or otherwise have an interest in this specification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Catalog version.
   */
  String getVersion();
}
