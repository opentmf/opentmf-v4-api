package org.opentmf.tmf664.model;

import java.net.URI;

/**
 * Task resource used to request migration of the Resource Function.
 *
 * <p><br/>
 * <strong>Required:</strong> cause, resourceFunction<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-664: Resource Function Activation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMigrate extends IMigrateCreate {

  /**
   * Reference to the Migrate task resource.
   */
  URI getHref();

  /**
   * Unique identifier of the Migrate task resource.
   */
  String getId();
}
