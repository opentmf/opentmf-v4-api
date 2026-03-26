package org.opentmf.common.model;

import java.util.List;

/**
 * Synthesized abstract parent for 6 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-635: Usage Management API</li>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkSpecificationUpdateBase extends IExtensible {

  /**
   * This is a list of constraint references applied to this specification.
   */
  List<? extends IConstraintRef> getConstraints();

  /**
   * Description of the specification.
   */
  String getDescription();

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
   * Name given to the specification.
   */
  String getName();

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
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * specification version.
   */
  String getVersion();
}
