package org.opentmf.tmf908.model;

/**
 * The event data structure.
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
public interface IIotDeviceBatchEventPayload {

  /**
   * #TODO.
   */
  IIotDevice getIotDevice();
}
