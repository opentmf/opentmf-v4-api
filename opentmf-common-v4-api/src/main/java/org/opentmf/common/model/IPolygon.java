package org.opentmf.common.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * An array of linear rings.
 *
 * <p><br/>
 * <strong>Required:</strong> coordinates, type<br/>
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
public interface IPolygon extends IExtensible {

  /**
   * List of: GeoJSON: An array of linear rings.
   */
  List<List<List<BigDecimal>>> getCoordinates();

  String getType();
}
