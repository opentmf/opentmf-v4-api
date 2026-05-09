package org.opentmf.tmf701.model;

import org.opentmf.common.model.IAssociationSpecRef;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * A relationship (triggers, delegates, etc...) between/among ProcessFlow
 * specifications.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-701: Process Flow Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProcessFlowSpecificationRelationship extends INamedEntity {

  /**
   * reference to an AssociationSpecification object.
   */
  IAssociationSpecRef getAssociationSpec();

  /**
   * Type of relationship such as triggers, delegates, etc.
   */
  String getRelationshipType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
