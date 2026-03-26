package org.opentmf.tmf908.model;

import org.opentmf.common.model.IPlace;
import org.opentmf.common.model.ITimePeriod;

/**
 * An aggregation, migration, substitution, dependency or exclusivity
 * relationship between/among resourceSpecCharacteristics.
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
public interface IResourceSpecCharRelationship extends IPlace {

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
