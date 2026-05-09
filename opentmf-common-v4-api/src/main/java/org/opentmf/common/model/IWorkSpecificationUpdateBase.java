package org.opentmf.common.model;

import java.util.List;

/**
 * Synthesized abstract parent for 6 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>AiContractSpecificationUpdate (915)</li>
 *   <li>EntitySpecificationUpdate (662)</li>
 *   <li>ServiceSpecificationUpdate (633)</li>
 *   <li>UsageSpecificationCreate (635)</li>
 *   <li>UsageSpecificationUpdate (635)</li>
 *   <li>WarrantySpecificationUpdate (715)</li>
 *   <li>WorkSpecificationUpdate (713)</li>
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
