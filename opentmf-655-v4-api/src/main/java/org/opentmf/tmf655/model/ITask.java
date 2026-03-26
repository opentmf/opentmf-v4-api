package org.opentmf.tmf655.model;

import org.opentmf.common.model.INamedEntity;

/**
 * A step or task along in the process of implementation a Change Request.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-655: Change Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITask extends INamedEntity {

  /**
   * The description of the task.
   */
  String getDescription();

  /**
   * The state of the task.
   */
  String getState();
}
