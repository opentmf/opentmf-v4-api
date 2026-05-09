package org.opentmf.tmf701.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IRelatedEntity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITaskFlowSpecificationRef;

/**
 * Skipped properties:
 * id,href,taskFlowSpecification,{@literal @}baseType,{@literal @}schemaLocation,{@literal @}type,startDate,completionDate.
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
public interface ITaskFlowUpdate {

  /**
   * A list of channel(s) where this taskFlow is executed.
   */
  List<? extends IChannelRef> getChannels();

  /**
   * A list of characteristic(s) associated to this taskFlow.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * TaskFlow completion method.
   */
  String getCompletionMethod();

  /**
   * Indicate mandatory TaskFlow.
   */
  Boolean getIsMandatory();

  /**
   * TaskFlow priority.
   */
  Integer getPriority();

  /**
   * A list of related entity(ies) to this taskFlow.
   */
  List<? extends IRelatedEntity> getRelatedEntities();

  /**
   * A list of related party(ies) to this task.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Requested completion date for this task.
   */
  OffsetDateTime getRequestedCompletionDate();

  /**
   * Requested start date for this task.
   */
  OffsetDateTime getRequestedStartDate();

  /**
   * Valid values for the lifecycle state of the taskFlow
   * <br/><p>Recommended values: new, active, hold, cancelled, completed.
   */
  String getState();

  /**
   * A list of taskFlows related to this taskFlow.
   */
  List<? extends ITaskFlowRelationship> getTaskFlowRelationships();

  /**
   * A reference to a TaskFlowSpecification defined design-time.
   */
  ITaskFlowSpecificationRef getTaskFlowSpecificationRef();
}
