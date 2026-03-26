package org.opentmf.tmf646.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedEntity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.common.model.ITimeSlot;

/**
 * This task resource is used to retrieve available time slots. One of this
 * available time slot is after used to create or reschedule an appointment
 * <br/>Skipped properties:
 * id,href,status,searchDate,searchResult,availableTimeSlot.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-646: Appointment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ISearchTimeSlotCreate extends IExtensible {

  /**
   * List of: A reference to an entity, where the type of the entity is not known
   * in advance.
   */
  List<? extends IRelatedEntity> getRelatedEntities();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getRelatedParty();

  /**
   * Related Entity reference. A related place defines a place described by
   * reference or by value linked to a specific entity. The polymorphic attributes
   * {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place entity and
   * not the RelatedPlaceRefOrValue class itself.
   */
  IRelatedPlaceRefOrValue getRelatedPlace();

  List<? extends ITimeSlot> getRequestedTimeSlots();
}
