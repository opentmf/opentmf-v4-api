package org.opentmf.tmf655.model;

import java.net.URI;

/**
 * Change Request is a type of request which can be used for the management and
 * control of Change Management process 
 * <br/> -within a service provider organisation or 
 * <br/> -between a customer and a service provider or 
 * <br/> -between a service provider and a partner and vice versa.
 *
 * <p><br/>
 * <strong>Required:</strong> targetEntity<br/>
 * </p>
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
public interface IChangeRequest extends IChangeRequestUpdate {

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

  /**
   * Hyperlink to access a change request.
   */
  URI getHref();

  /**
   * Identifier of a Change Request. It is created on repository side (a Change
   * Management system).
   */
  String getId();
}
