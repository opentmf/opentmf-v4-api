package org.opentmf.tmf701.model;

import java.net.URI;

/**
 * TaskFlowSpecification is a class that allow to describe a TaskFlow
 * specification design. A TaskFlow instance as used in TMF701 will use a
 * TaskFlowSpecification as reference.
 * <br/>Skipped properties: id,href,lastUpdate,{@literal @}baseType.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
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
public interface ITaskFlowSpecificationCreate extends ITaskFlowSpecificationUpdate {

  /**
   * A URI to a JSON-Schema file that defines additional attributes and
   * relationships.
   */
  URI getAtSchemaLocation();

  /**
   * When subclassing, this defines the subclass Extensible name.
   */
  String getAtType();
}
