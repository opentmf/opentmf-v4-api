package org.opentmf.tmf908.model;

import java.net.URI;

/**
 * #TODO.
 *
 * <p><br/>
 * <strong>Required:</strong> category, id<br/>
 * </p>
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
public interface IIotDevice extends IIotDeviceUpdate {

  /**
   * The URI for the object itself.
   */
  URI getHref();

  /**
   * Identifier of an instance of the resource. Required to be unique within the
   * resource type. Used in URIs as the identifier for specific instances of a
   * type.
   */
  String getId();
}
