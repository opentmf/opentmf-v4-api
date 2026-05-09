package org.opentmf.common.model;


/**
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
public interface IResourceCharacteristic extends IExtensible {

  /**
   * name of the characteristic.
   */
  String getName();

  /**
   * value of the characteristic.
   */
  String getValue();
}
