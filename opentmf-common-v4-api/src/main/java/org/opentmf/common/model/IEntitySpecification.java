package org.opentmf.common.model;

import java.util.List;

/**
 * EntitySpecification is a class that offers characteristics to describe a type
 * of entity. Entities are generic constructs that may be used to describe
 * bespoke business entities that are not effectively covered by the existing
 * SID model.
 * <br/>Functionally, the entity specification acts as a template by which
 * entities may be instantiated and described. By sharing the same
 * specification, these entities would therefore share the same set of
 * characteristics.
 * <br/>Note: The ‘configurable’ attribute on the specCharacteristics determines
 * if an entity instantiated from the entity specification can override the
 * value of the attribute. When set to false, the entity instance may not define
 * a value that differs from the value in the specification.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-635: Usage Management API</li>
 *   <li>TMF-653: Service Test Management API</li>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-667: Document Management API</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEntitySpecification extends IAssociationBase {

  /**
   * Attachments that may be of relevance to this specification, such as picture,
   * document, media.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * Relationship to another specification.
   */
  List<? extends IEntitySpecificationRelationship> getEntitySpecRelationships();

  /**
   * isBundle determines whether specification represents a single specification
   * (false), or a bundle of specifications (true).
   */
  Boolean getIsBundle();

  /**
   * Parties who manage or otherwise have an interest in this specification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * List of characteristics that the entity can take.
   */
  List<? extends ICharacteristicSpecification> getSpecCharacteristics();

  /**
   * The reference object to the schema and type of target entity which is
   * described by a specification.
   */
  ITargetEntitySchema getTargetEntitySchema();
}
