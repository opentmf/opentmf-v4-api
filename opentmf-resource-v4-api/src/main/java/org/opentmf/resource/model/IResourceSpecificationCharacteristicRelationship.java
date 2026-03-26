package org.opentmf.resource.model;

import java.net.URI;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * An aggregation, migration, substitution, dependency or exclusivity
 * relationship between/among ResourceSpecificationCharacteristics. The
 * specification characteristic is embedded within the specification whose ID
 * and href are in this entity, and identified by its ID.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceSpecificationCharacteristicRelationship extends IExtensible {

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
   * Hyperlink reference to the resource specification containing the target
   * characteristic.
   */
  URI getResourceSpecificationHref();

  /**
   * Unique identifier of the resource specification containing the target
   * characteristic.
   */
  String getResourceSpecificationId();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
