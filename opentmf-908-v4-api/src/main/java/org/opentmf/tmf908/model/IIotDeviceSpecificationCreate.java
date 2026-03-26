package org.opentmf.tmf908.model;

import java.time.OffsetDateTime;

/**
 * #TODO
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
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
public interface IIotDeviceSpecificationCreate extends IIotDeviceSpecificationUpdate {

  /**
   * Date and time of the last update of the service specification.
   */
  OffsetDateTime getLastUpdate();
}
