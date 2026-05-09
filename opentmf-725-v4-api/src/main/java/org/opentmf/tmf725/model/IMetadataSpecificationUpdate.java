package org.opentmf.tmf725.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICharacteristicSpecification;
import org.opentmf.common.model.IEntitySpecificationRelationship;
import org.opentmf.common.model.IPromotionUpdateBase;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITargetEntitySchema;
import org.opentmf.general.model.IPolicySpecificationRef;

/**
 * MetadataSpecification is a class that describes the specification of a
 * specific metadata asset
 * <br/>Skipped properties: id,href,lastUpdate,{@literal @}baseType,{@literal @}schemaLocation,{@literal @}type.
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
public interface IMetadataSpecificationUpdate extends IPromotionUpdateBase {

  /**
   * Attachments that may be of relevance to this specification, such as picture,
   * document, media.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * A type of MetadataSpecification that belongs to a grouping of
   * MetadataSpecifications. It inherits of all attributes of
   * MetadataSpecification.
   */
  List<? extends ICompositeMetadataSpecification> getCompositeMetadataSpecifications();

  /**
   * Relationship to another specification.
   */
  List<? extends IEntitySpecificationRelationship> getEntitySpecRelationships();

  /**
   * Indicates if the metadata specification is part of a composite specification.
   */
  Boolean getIsComposed();

  /**
   * List of characteristics that the entity can take.
   */
  List<? extends ICharacteristicSpecification> getMetadataSpecCharacteristics();

  /**
   * This is a list of policy references applied to this specification.
   */
  List<? extends IPolicySpecificationRef> getPolicySpecificationRefs();

  /**
   * Parties who manage or otherwise have an interest in this specification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * The reference object to the schema and type of target entity which is
   * described by a specification.
   */
  ITargetEntitySchema getTargetEntitySchema();
}
