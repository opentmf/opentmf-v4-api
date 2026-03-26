package org.opentmf.tmf701.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * TaskFlowSpecification is a class that allow to describe a TaskFlow
 * specification design. A TaskFlow instance as used in TMF701 will use a
 * TaskFlowSpecification as reference.
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
public interface ITaskFlowSpecification extends ITaskFlowSpecificationCreate {

  /**
   * When subclassing, this defines the super-class.
   */
  String getAtBaseType();

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();

  /**
   * Date and time of the last update of the TaskFlowspecification.
   */
  OffsetDateTime getLastUpdate();
}
