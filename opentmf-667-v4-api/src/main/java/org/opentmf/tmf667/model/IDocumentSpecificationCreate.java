package org.opentmf.tmf667.model;

import java.net.URI;

/**
 * A DocumentSpecification provides the characteristics and constraints that
 * describe a particular type of Document. It follows the EntitySpecification
 * pattern, so allows you to define the characteristics expected, as well as the
 * nature of the values of those characteristics (eg: integer range
 * [valueFrom/valueTo], regular expression or unitOfMeasure).
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-667: Document Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDocumentSpecificationCreate extends IDocumentSpecificationUpdate {

  /**
   * When subclassing, this defines the super-class.
   */
  String getAtBaseType();

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
