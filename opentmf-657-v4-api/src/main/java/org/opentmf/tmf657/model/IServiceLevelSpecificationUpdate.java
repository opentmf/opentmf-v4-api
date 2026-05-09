package org.opentmf.tmf657.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IServiceLevelObjectiveRef;

/**
 * A Service Level Specification represents a pre-defined or negotiated set of
 * Service Level 
 * <br/>Objectives. In addition, certain consequences are associated with not
 * meeting the Service Level 
 * <br/>Objectives. Service Level Agreements are expressed in terms of Service
 * Level Specifications.
 * <br/>Skipped properties: id,href,validFor.
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
public interface IServiceLevelSpecificationUpdate extends IExtensible {

  /**
   * A brief introduction of a service level specification.
   */
  String getDescription();

  /**
   * The name of Service Level Specification.
   */
  String getName();

  /**
   * A list of objectives related to this service level specification.
   */
  List<? extends IServiceLevelObjectiveRef> getRelatedServiceLevelObjectives();
}
