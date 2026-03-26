package org.opentmf.tmf653.model;

import java.net.URI;

/**
 * A service test is an entity that exists for a controlled test invocation on a
 * service. The service 
 * <br/>test is executed according to a schedule and contains service test
 * configuration parameters that are to be 
 * <br/>applied at execution time, and service test measures that result.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name, relatedService, testSpecification<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-653: Service Test Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceTestCreate extends IServiceTestUpdate {

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
