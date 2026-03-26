package org.opentmf.tmf686.model;

import java.net.URI;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * An aggregation, migration, substitution, dependency or exclusivity
 * relationship between/among VertexSpecificationCharacteristics. The
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
public interface IVertexSpecificationCharacteristicRelationship extends IExtensible {

  /**
   * Unique identifier of the characteristic within the specification.
   */
  String getCharacteristicSpecificationId();

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

  /**
   * Hyperlink reference to the vertex specification containing the target
   * characteristic.
   */
  URI getVertexSpecificationHref();

  /**
   * Unique identifier of the vertex specification containing the target
   * characteristic.
   */
  String getVertexSpecificationId();
}
