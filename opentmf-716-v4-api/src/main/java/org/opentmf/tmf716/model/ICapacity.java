package org.opentmf.tmf716.model;

import java.util.List;
import org.opentmf.common.model.ICapacityRef;
import org.opentmf.common.model.ICapacitySpecRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IPlaceRefOrValue;

/**
 * Specific ability of an entity measured in quantity and units of quantity over
 * an extended period.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-716: ResourceReservation</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICapacity extends IExtensible {

  /**
   * The period of time for which Capacity or CapacityDemand applies.
   */
  List<? extends IApplicableTimePeriod> getApplicableTimePeriods();

  /**
   * Quantity that defines the Capacity.
   */
  ICapacityAmount getCapacityAmount();

  ICapacitySpecRef getCapacitySpec();

  /**
   * A place described by reference or by value linked to a specific entity. The
   * polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to
   * the place entity and not the PlaceRefOrValue class itself.
   */
  IPlaceRefOrValue getPlace();

  /**
   * An indicator that specifies whether the capacity is planned or actual.
   */
  String getPlannedOrActualCapacity();

  /**
   * related capacity.
   */
  List<? extends ICapacityRef> getRelatedCapacities();
}
