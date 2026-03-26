package org.opentmf.tmf633.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IFeatureSpecification;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IResourceSpecificationRef;
import org.opentmf.common.model.IServiceLevelSpecificationRef;
import org.opentmf.common.model.IServiceSpecRelationship;
import org.opentmf.common.model.IWorkSpecificationUpdateBase;

/**
 * ServiceSpecification is a class that offers characteristics to describe a
 * type of service.
 * <br/>Functionally, it acts as a template by which Services may be
 * instantiated. By sharing the same specification, these services would
 * therefore share the same set of characteristics.
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
public interface IServiceSpecificationUpdate extends IWorkSpecificationUpdateBase {

  /**
   * Attachments that may be of relevance to this specification, such as picture,
   * document, media.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * A list of Features for this specification.
   */
  List<? extends IFeatureSpecification> getFeatureSpecifications();

  /**
   * Parties who manage or otherwise have an interest in this specification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A list of resource specification references (ResourceSpecificationRef [*]).
   * The ResourceSpecification is required for a service specification with type
   * ResourceFacingServiceSpecification (RFSS).
   */
  List<? extends IResourceSpecificationRef> getResourceSpecifications();

  /**
   * A list of service level specifications related to this service specification,
   * and which will need to be satisfiable for corresponding service instances;
   * e.g. Gold, Platinum.
   */
  List<? extends IServiceLevelSpecificationRef> getServiceLevelSpecifications();

  /**
   * A list of service specifications related to this specification, e.g.
   * migration, substitution, dependency or exclusivity relationship.
   */
  List<? extends IServiceSpecRelationship> getServiceSpecRelationships();
}
