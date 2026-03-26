package org.opentmf.tmf701.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * ProcessFlowSpecification is a class that allow to describe a processFlow
 * design. A ProcessFlow instance as used in TMF701 will use a
 * ProcessFlowSpecification as reference.
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
public interface IProcessFlowSpecification extends IProcessFlowSpecificationCreate {

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
   * Date and time of the last update of the processFlowspecification.
   */
  OffsetDateTime getLastUpdate();
}
