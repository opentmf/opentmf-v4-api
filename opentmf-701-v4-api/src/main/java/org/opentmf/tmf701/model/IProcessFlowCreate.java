package org.opentmf.tmf701.model;

import java.util.List;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedEntity;
import org.opentmf.common.model.IRelatedParty;

/**
 * Skipped properties: id,href,state,taskFlow,processFlowDate.
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
public interface IProcessFlowCreate extends IExtensible {

  /**
   * A list of channel(s) where this processFlow is executed.
   */
  List<? extends IChannelRef> getChannels();

  /**
   * A list of characteristic(s) associated to this processFlow.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * Identifier of the Process flow specification.
   */
  String getProcessFlowSpecification();

  /**
   * A reference to a ProcessFlowSpecification defined design-time.
   */
  IProcessFlowSpecificationRef getProcessFlowSpecificationRef();

  /**
   * A list of related entity(ies) to this processFlow.
   */
  List<? extends IRelatedEntity> getRelatedEntities();

  /**
   * A list of related party(ies) to this processFlow.
   */
  List<? extends IRelatedParty> getRelatedParties();
}
