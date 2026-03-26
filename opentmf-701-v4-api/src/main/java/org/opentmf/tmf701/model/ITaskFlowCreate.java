package org.opentmf.tmf701.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedEntity;
import org.opentmf.common.model.IRelatedParty;

/**
 * Skipped properties: id,href,state,priority,isMandatory,completionMethod,url.
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
public interface ITaskFlowCreate extends IExtensible {

  /**
   * A list of channel(s) where this taskFlow is executed.
   */
  List<? extends IChannelRef> getChannels();

  /**
   * A list of characteristic(s) associated to this taskFlow.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * Effective completion date for this task.
   */
  OffsetDateTime getCompletionDate();

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
   * Effective start date for this task.
   */
  OffsetDateTime getStartDate();

  /**
   * A list of taskFlows related to this taskFlow.
   */
  List<? extends ITaskFlowRelationship> getTaskFlowRelationships();

  /**
   * Reference of the TaskFlowSpecification.
   */
  String getTaskFlowSpecification();

  /**
   * A reference to a TaskFlowSpecification defined design-time.
   */
  ITaskFlowSpecificationRef getTaskFlowSpecificationRef();
}
