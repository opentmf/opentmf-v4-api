package org.opentmf.tmf701.model;

import java.net.URI;

/**
 * ProcessFlowSpecification is a class that allow to describe a processFlow
 * design. A ProcessFlow instance as used in TMF701 will use a
 * ProcessFlowSpecification as reference.
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
public interface IProcessFlowSpecificationCreate extends IProcessFlowSpecificationUpdate {

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
