package org.opentmf.tmf701.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;

/**
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
public interface IProcessFlow extends IProcessFlowCreate {

  /**
   * Reference of the ProcessFlow.
   */
  URI getHref();

  /**
   * Identifier of the Process flow.
   */
  String getId();

  /**
   * Is the date when the processFlow was created in basse (timestamp).
   */
  OffsetDateTime getProcessFlowDate();

  /**
   * Valid values for the lifecycle state of the processFlow
   * <br/><p>Recommended values: active, cancelled, hold, completed.
   */
  String getState();

  /**
   * A list of taskflow related to this processFlow.
   */
  List<? extends ITaskFlowRef> getTaskFlows();
}
