package org.opentmf.general.model;

import java.math.BigDecimal;
import java.util.List;
import org.opentmf.common.model.IEntityRef;

/**
 * A GeographicLocation is a pure-virtual super-class to the GeoJSON-aligned
 * geometries of Point (addresses and locations), MultiPoint, LineString
 * (streets, highways and boundaries), MultiLineString and Polygon (countries,
 * provinces, tracts of land). Use the {@literal @}type attribute to specify which of these
 * is being specified by the geometry attribute.
 *
 * <p><br/>
 * <strong>Required:</strong> @type<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-673: Geographic Address Management API</li>
 *   <li>TMF-691: Federated ID Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeographicLocationRefOrValue extends IEntityRef {

  /**
   * A bounding box array that contains the geometry. The axes order follows the
   * axes order of the geometry.
   */
  List<BigDecimal> getBbox();
}
