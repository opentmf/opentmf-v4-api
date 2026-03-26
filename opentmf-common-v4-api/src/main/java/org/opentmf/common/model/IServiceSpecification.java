package org.opentmf.common.model;

import java.util.List;

/**
 * ServiceSpecification is a class that offers characteristics to describe a
 * type of service.
 * <br/>Functionally, it acts as a template by which Services may be
 * instantiated. By sharing the same specification, these services would
 * therefore share the same set of characteristics.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceSpecification extends IEntitySpecification {

  /**
   * A list of Features for this specification.
   */
  List<? extends IFeatureSpecification> getFeatureSpecifications();

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
