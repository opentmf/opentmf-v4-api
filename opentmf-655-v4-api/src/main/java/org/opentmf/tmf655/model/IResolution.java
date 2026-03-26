package org.opentmf.tmf655.model;

import java.util.List;
import org.opentmf.common.model.INamedEntity;

/**
 * The way one or more change request has been implementation through a direct
 * remedy or task.
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
public interface IResolution extends INamedEntity {

  /**
   * The resolutions code, it can be configured as a multiple level hierarchy.
   */
  String getCode();

  /**
   * The description of the resolution.
   */
  String getDescription();

  /**
   * List of: A step or task along in the process of implementation a Change
   * Request.
   */
  List<? extends ITask> getTasks();
}
