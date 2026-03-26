package org.opentmf.tmf641.model;

import java.util.List;
import org.opentmf.common.model.IAppointmentRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IServiceRefOrValue;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> action, id, service<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-641: Service Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceOrderItem extends IExtensible {

  /**
   * action to be performed on the product
   * <br/><p>Recommended values: add, modify, delete, noChange.
   */
  String getAction();

  /**
   * Refers an appointment, such as a Customer presentation or internal meeting or
   * site visit.
   */
  IAppointmentRef getAppointment();

  /**
   * the error(s) cause an order item status change.
   */
  List<? extends IServiceOrderItemErrorMessage> getErrorMessages();

  /**
   * Identifier of the individual line item.
   */
  String getId();

  /**
   * Quantity ordered.
   */
  Integer getQuantity();

  /**
   * A Service to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the Service entity and not the RelatedServiceRefOrValue class itself.
   */
  IServiceRefOrValue getService();

  /**
   * A list of order items embedded to this order item.
   */
  List<? extends IServiceOrderItem> getServiceOrderItems();

  /**
   * A list of order items related to this order item.
   */
  List<? extends IServiceOrderItemRelationship> getServiceOrderItemRelationships();

  /**
   * Possible values for the state of the order item
   * <br/><p>Recommended values: acknowledged, rejected, pending, held,
   * inProgress, cancelled, completed, failed, assessingCancellation,
   * pendingCancellation, partial.
   */
  String getState();
}
