package org.opentmf.tmf657.model;

import org.opentmf.common.model.ITimePeriod;

/**
 * A Service Level Specification represents a pre-defined or negotiated set of
 * Service Level 
 * <br/>Objectives. In addition, certain consequences are associated with not
 * meeting the Service Level 
 * <br/>Objectives. Service Level Agreements are expressed in terms of Service
 * Level Specifications.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name, relatedServiceLevelObjective<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-657: Service Quality Management Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceLevelSpecificationCreate extends IServiceLevelSpecificationUpdate {

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
