package org.opentmf.tmf908.model;

import java.net.URI;

/**
 * #TODO.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IIotDeviceSpecification extends IIotDeviceSpecificationCreate {

  /**
   * Reference of the service specification.
   */
  URI getHref();

  /**
   * Unique identifier of the service specification.
   */
  String getId();
}
