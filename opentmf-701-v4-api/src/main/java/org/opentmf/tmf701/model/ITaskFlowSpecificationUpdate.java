package org.opentmf.tmf701.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.ICharacteristicSpecification;
import org.opentmf.common.model.IIntentUpdateBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * TaskFlowSpecification is a class that allow to describe a TaskFlow
 * specification design. A TaskFlow instance as used in TMF701 will use a
 * TaskFlowSpecification as reference.
 * <br/>Skipped properties: id,href,{@literal @}baseType,{@literal @}schemaLocation,{@literal @}type,lastUpdate.
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
public interface ITaskFlowSpecificationUpdate extends IIntentUpdateBase {

  /**
   * Attachments that may be of relevance to this TaskFlowSpecification, such as
   * picture, document, media. This could be for example a how-to or a faq to
   * explain this TaskFlowSpecification.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * A list of channel(s) where this TaskFlowSpecification instance could be
   * executed.
   */
  List<? extends IChannelRef> getChannels();

  /**
   * A list of entity specification that will be managed by this
   * TaskFlowSpecification.
   */
  List<? extends IRelatedEntitySpecification> getRelatedEntitySpecifications();

  /**
   * Parties who manage or otherwise have an interest in this
   * TaskFlowSpecification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A related ProcessFlowSpecification (for example when the
   * taskFlowSpecification completion required another ProcessFLowSpecification to
   * be triggered & completed).
   */
  List<? extends IRelatedEntitySpecification> getRelatedProcessFlowSpecifications();

  /**
   * Relationship to sub-TaskFlowSpecification.
   */
  List<? extends ITaskFlowSpecification> getTaskFlowSpecifications();

  /**
   * List of characteristics that the TaskFlowSpecification can take.
   */
  List<? extends ICharacteristicSpecification> getTaskFlowSpecificationCharacteristics();

  /**
   * Relationship to another TaskFlowSpecification from a same
   * ProcessFlowSpecification.
   */
  List<? extends ITaskFlowSpecificationRelationship> getTaskFlowSpecificationRelationships();

  /**
   * Type of the TaskFlowSpecification like send task, receive task, user task,
   * manual task, script task, business rule task.
   */
  String getTaskFlowSpecificationType();
}
