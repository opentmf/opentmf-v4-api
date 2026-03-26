package org.opentmf.tmf686.model;

import java.net.URI;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * An aggregation, migration, substitution, dependency or exclusivity
 * relationship between/among EdgeSpecificationCharacteristics. The
 * specification characteristic is embedded within the specification whose ID
 * and href are in this entity, and identified by its ID.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-686: Topology API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IEdgeSpecificationCharacteristicRelationship extends IExtensible {

  /**
   * Unique identifier of the characteristic within the specification.
   */
  String getCharacteristicSpecificationId();

  /**
   * Hyperlink reference to the edge specification containing the target
   * characteristic.
   */
  URI getEdgeSpecificationHref();

  /**
   * Unique identifier of the edge specification containing the target
   * characteristic.
   */
  String getEdgeSpecificationId();

  /**
   * Name of the target characteristic within the specification.
   */
  String getName();

  /**
   * Type of relationship such as aggregation, migration, substitution,
   * dependency, exclusivity.
   */
  String getRelationshipType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
