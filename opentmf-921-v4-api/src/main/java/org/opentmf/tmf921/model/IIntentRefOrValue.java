package org.opentmf.tmf921.model;


/**
 * Intent Ref (if Intent already exists) or Value (if Intent be created or its
 * details be presented).
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
public interface IIntentRefOrValue extends IProbeIntent {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();
}
