package org.opentmf.tmf687.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMarketSegmentRef;
import org.opentmf.common.model.IRelatedEntity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.common.model.ITimePeriod;

/**
 * ReserveProductStock is used to request a product stock reservation
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> reserveProductStockItem<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-687: Stock Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IReserveProductStockCreate extends IExtensible {

  /**
   * Channel(s) beneficiary(ies) for this reservation.
   */
  List<? extends IChannelRef> getChannels();

  /**
   * Date when the ReserveProductStock was created (whatever its status).
   */
  OffsetDateTime getCreationDate();

  /**
   * Market segment(s) beneficiary(ies) for this reservation.
   */
  List<? extends IMarketSegmentRef> getMarketSegments();

  /**
   * Related Entity reference. A related place defines a place described by
   * reference or by value linked to a specific entity. The polymorphic attributes
   * {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place entity and
   * not the RelatedPlaceRefOrValue class itself.
   */
  IRelatedPlaceRefOrValue getPlace();

  /**
   * A list of related entity in relationship with this stock reservation (trouble
   * ticket, quote, product order, etc...).
   */
  List<? extends IRelatedEntity> getRelatedEntities();

  /**
   * A list of related party references (RelatedParty [*]). A related party
   * defines party or party role linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Requested product availability date for the reservation.
   */
  OffsetDateTime getRequiredAvailabilityDate();

  /**
   * A list of product stock item reservation.
   */
  List<? extends IReserveProductStockItem> getReserveProductStockItems();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getReserveProductStockState();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
