package org.opentmf.tmf664.model;

import java.net.URI;

/**
 * Task Resource used to request healing of a Resource Function.
 *
 * <p><br/>
 * <strong>Required:</strong> cause, degreeOfHealing, resourceFunction<br/>
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
public interface IHeal extends IHealCreate {

  /**
   * Reference to the Heal task resource.
   */
  URI getHref();

  /**
   * Unique identifier of the Heal task resource.
   */
  String getId();
}
