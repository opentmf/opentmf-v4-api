package org.opentmf.tmf701.model;

import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.ICharacteristicSpecification;
import org.opentmf.common.model.IIntentUpdateBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * ProcessFlowSpecification is a class that allow to describe a processFlow
 * design. A ProcessFlow instance as used in TMF701 will use a
 * ProcessFlowSpecification as reference.
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
public interface IProcessFlowSpecificationUpdate extends IIntentUpdateBase {

  /**
   * Attachments that may be of relevance to this processFlowSpecification, such
   * as picture, document, media. This could be for example a how-to o a faq to
   * explain this processFlowSpecification.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * A list of channel(s) where this processFlowSpecification instance could be
   * executed.
   */
  List<? extends IChannelRef> getChannels();

  /**
   * List of characteristics that the processFlowSpecification can take.
   */
  List<? extends ICharacteristicSpecification> getProcessFlowSpecificationCharacteristics();

  /**
   * Relationship to another processFlowSpecification.
   */
  List<? extends IProcessFlowSpecificationRelationship> getProcessFlowSpecificationRelationships();

  /**
   * A list of entity specification that will be managed by this
   * processFlowSpecification.
   */
  List<? extends IRelatedEntitySpecification> getRelatedEntitySpecifications();

  /**
   * Parties who manage or otherwise have an interest in this
   * processFlowSpecification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A list of taskFlowSpecification that will be managed by this
   * processFlowSpecification.
   */
  List<? extends ITaskFlowSpecificationRef> getTaskFlowSpecifications();
}
