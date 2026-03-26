package org.opentmf.common.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * GeoJSON: A collection of Points forming a connected line.
 *
 * <p><br/>
 * <strong>Required:</strong> coordinates<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-675: Geographic Location Management API</li>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILineString extends IExtensible {

  /**
   * List of: GeoJSON: An array of two or more positions.
   */
  List<List<BigDecimal>> getCoordinates();
}
