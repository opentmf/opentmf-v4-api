package org.opentmf.tmf921.model;

import java.net.URI;

/**
 * An Probe Intent instance is the formal description of all expectations
 * including requirements, goals, and constraints given to a technical system.
 *
 * <p><br/>
 * <strong>Required:</strong> expression<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-921: Intent Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProbeIntent extends IIntentCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
