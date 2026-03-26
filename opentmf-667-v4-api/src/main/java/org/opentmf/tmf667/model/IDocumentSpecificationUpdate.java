package org.opentmf.tmf667.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICharacteristicSpecification;
import org.opentmf.common.model.IConstraintRef;
import org.opentmf.common.model.IEntitySpecificationRelationship;
import org.opentmf.common.model.IProductOfferingUpdateBase;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITargetEntitySchema;

/**
 * A DocumentSpecification provides the characteristics and constraints that
 * describe a particular type of Document. It follows the EntitySpecification
 * pattern, so allows you to define the characteristics expected, as well as the
 * nature of the values of those characteristics (eg: integer range
 * [valueFrom/valueTo], regular expression or unitOfMeasure).
 * <br/>Skipped properties: id,href,{@literal @}type,{@literal @}baseType,{@literal @}schemaLocation.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-667: Document Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDocumentSpecificationUpdate extends IProductOfferingUpdateBase {

  /**
   * Attachments that may be of relevance to this specification, such as picture,
   * document, media.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * This is a list of constraint references applied to this specification.
   */
  List<? extends IConstraintRef> getConstraints();

  /**
   * Relationship to another specification.
   */
  List<? extends IEntitySpecificationRelationship> getEntitySpecRelationships();

  /**
   * Date and time of the last update of the specification.
   */
  OffsetDateTime getLastUpdate();

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
