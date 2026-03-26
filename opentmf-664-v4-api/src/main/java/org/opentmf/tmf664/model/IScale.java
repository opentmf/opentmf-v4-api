package org.opentmf.tmf664.model;

import java.net.URI;

/**
 * Task Resource used to request scaling of a Resource Function.
 *
 * <p><br/>
 * <strong>Required:</strong> numberOfSteps, resourceFunction, scaleType<br/>
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
public interface IScale extends IScaleCreate {

  /**
   * Reference to the Scale task resource.
   */
  URI getHref();

  /**
   * Unique identifier of the Scale task resource.
   */
  String getId();
}
