package org.opentmf.tmf634.model;

import org.opentmf.common.model.IImportJob;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IImportJobStateChangeEventPayload {

  /**
   * Represents a task used to import resources from a file.
   */
  IImportJob getImportJob();
}
