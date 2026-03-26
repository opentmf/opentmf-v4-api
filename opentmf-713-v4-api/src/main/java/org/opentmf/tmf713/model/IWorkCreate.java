package org.opentmf.tmf713.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAgreementRef;
import org.opentmf.common.model.IAppointmentRef;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.common.model.IRelatedWorkOrderItem;
import org.opentmf.common.model.ITimePeriod;
import org.opentmf.common.model.IWorkPrice;
import org.opentmf.common.model.IWorkRefOrValue;
import org.opentmf.common.model.IWorkRelationship;
import org.opentmf.common.model.IWorkSpecificationRef;
import org.opentmf.common.model.IWorkforceEmployeeAssignment;

/**
 * Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkCreate extends IExtensible {

  /**
   * An amount in a given unit.
   */
  IQuantity getActualDuration();

  /**
   * List of: Agreement reference. An agreement represents a contract or
   * arrangement, either written or verbal and sometimes enforceable by law, such
   * as a service level agreement or a customer price agreement. An agreement
   * involves a number of other business entities, such as products, services, and
   * resources and/or their specifications.
   */
  List<? extends IAgreementRef> getAgreements();

  /**
   * Refers an appointment, such as a Customer presentation or internal meeting or
   * site visit.
   */
  IAppointmentRef getAppointment();

  /**
   * Date when the order was completed.
   */
  OffsetDateTime getCompletionDate();

  /**
   * An amount in a given unit.
   */
  IQuantity getCurrentDuration();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getDeliveryTimeSlot();

  /**
   * Is the description of the work unit. It could be the same as the description
   * of the work specification.
   */
  String getDescription();

  /**
   * Date when the requester expects the work to be completed.
   */
  OffsetDateTime getExpectedCompletionDate();

  /**
   * Name of the work unit. It could be the same as the name of the work
   * specification.
   */
  String getName();

  /**
   * Extra information about a given entity.
   */
  INote getNote();

  /**
   * Date at which the work order which triggered this unit of work's
   * creation/change/termination was created.
   */
  OffsetDateTime getOrderDate();

  BigDecimal getPercentageComplete();

  /**
   * List of: Related Entity reference. A related place defines a place described
   * by reference or by value linked to a specific entity. The polymorphic
   * attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place
   * entity and not the RelatedPlaceRefOrValue class itself.
   */
  List<? extends IRelatedPlaceRefOrValue> getPlaces();

  /**
   * An amount in a given unit.
   */
  IQuantity getPlannedDuration();

  /**
   * An amount in a given unit.
   */
  IQuantity getQuantity();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * An amount in a given unit.
   */
  IQuantity getScheduledDuration();

  /**
   * Recommended values: acknowledged, rejected, pending, held, inProgress,
   * cancelled, completed, failed, partial.
   */
  String getState();

  /**
   * List of: A Unit of Work defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation &amp; {@literal @}referredType are
   * related to the work entity and not the related WorkRefOrValue class itself.
   */
  List<? extends IWorkRefOrValue> getWorks();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getWorkCharacteristics();

  /**
   * List of: RelatedWorkOrderItem (WorkOrder item). The work order item which
   * triggered this unit of work's creation/change/termination.
   */
  List<? extends IRelatedWorkOrderItem> getWorkOrderItems();

  /**
   * List of: An amount, usually of money, that represents the actual price paid
   * by the Customer for this item or this order.
   */
  List<? extends IWorkPrice> getWorkPrices();

  String getWorkPriority();

  List<? extends IWorkRelationship> getWorkRelationships();

  /**
   * Work specification reference.
   */
  IWorkSpecificationRef getWorkSpecification();

  String getWorkType();

  /**
   * List of: Represents an assignment of a particular WorforceEmployeeRole for a
   * particular unit of work in a specific timeframe. For example, assignment of a
   * person in a network engineer role to a trouble shooting unit of work for at
   * least 2 hours. The assignment is associated with a TimeSlot.
   */
  List<? extends IWorkforceEmployeeAssignment> getWorkforceEmployeeAssignments();
}
