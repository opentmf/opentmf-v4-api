package org.opentmf.tmf653.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.ICharacteristicSpecification;
import org.opentmf.common.model.IConstraintRef;
import org.opentmf.common.model.IDocumentUpdateBase;
import org.opentmf.common.model.IEntitySpecificationRelationship;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IServiceSpecificationRef;
import org.opentmf.common.model.IServiceTestSpecRelationship;
import org.opentmf.common.model.ITargetEntitySchema;

/**
 * The service test specification describes the service test in terms of
 * parameters to be configured and 
 * <br/>measures to be taken.
 * <br/>Skipped properties: id,href,validFor,{@literal @}type,{@literal @}schemaLocation,{@literal @}baseType.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-653: Service Test Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceTestSpecificationUpdate extends IDocumentUpdateBase {

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
   * isBundle determines whether specification represents a single specification
   * (false), or a bundle of specifications (true).
   */
  Boolean getIsBundle();

  /**
   * Used to indicate the current lifecycle status of this catalog item.
   */
  String getLifecycleStatus();

  /**
   * Parties who manage or otherwise have an interest in this specification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * The related service specification may relate to more than one service
   * specification.
   */
  List<? extends IServiceSpecificationRef> getRelatedServiceSpecifications();

  /**
   * A list of service test specifications related to this specification e.g.
   * dependency, substitution.
   */
  List<? extends IServiceTestSpecRelationship> getServiceTestSpecRelationships();

  /**
   * List of characteristics that the entity can take.
   */
  List<? extends ICharacteristicSpecification> getSpecCharacteristics();

  /**
   * The reference object to the schema and type of target entity which is
   * described by a specification.
   */
  ITargetEntitySchema getTargetEntitySchema();

  /**
   * A list of definitions for the measurements for the test defined by this
   * specification.
   */
  List<? extends ITestMeasureDefinition> getTestMeasureDefinitions();
}
