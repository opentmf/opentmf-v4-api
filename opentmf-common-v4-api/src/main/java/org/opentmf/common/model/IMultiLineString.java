package org.opentmf.common.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * A collection of distinct LineStrings.
 *
 * <p><br/>
 * <strong>Required:</strong> coordinates, type<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-673: Geographic Address Management API</li>
 *   <li>TMF-675: Geographic Location Management API</li>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IMultiLineString extends IExtensible {

  /**
   * List of: GeoJSON: An array of two or more positions.
   */
  List<List<List<BigDecimal>>> getCoordinates();

  String getType();
}
