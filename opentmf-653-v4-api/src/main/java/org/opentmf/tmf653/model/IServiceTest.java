package org.opentmf.tmf653.model;

import java.net.URI;

/**
 * A service test is an entity that exists for a controlled test invocation on a
 * service. The service 
 * <br/>test is executed according to a schedule and contains service test
 * configuration parameters that are to be 
 * <br/>applied at execution time, and service test measures that result.
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
public interface IServiceTest extends IServiceTestCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
