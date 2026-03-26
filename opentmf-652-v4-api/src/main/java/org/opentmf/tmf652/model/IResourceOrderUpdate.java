package org.opentmf.tmf652.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IRelatedParty;

/**
 * A Resource Order is a request to provision a set of Resources (logical and
 * physical) triggered by the request to provision a Service through a Service
 * Order
 * <br/>Skipped properties: id,href,completionDate,orderDate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-652: Resource Order Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceOrderUpdate extends IExtensible {

  /**
   * Used to categorize the order from a business perspective that can be useful
   * for the OM system.
   */
  String getCategory();

  /**
   * free-text description of the Resource Order.
   */
  String getDescription();

  /**
   * Date when the order was completed.
   */
  OffsetDateTime getExpectedCompletionDate();

  /**
   * DEPRECATED: Use externalReference Instead. ID given by the consumer (to
   * facilitate searches afterwards).
   */
  String getExternalId();

  /**
   * List of: An identification of an entity that is owned by or originates in a
   * software system different from the current system, for example a ProductOrder
   * handed off from a commerce platform into an order handling system. The
   * structure identifies the system itself, the nature of the entity within the
   * system (e.g. class name) and the unique ID of the entity within the system.
   * It is anticipated that multiple external IDs can be held for a single entity,
   * e.g. if the entity passed through multiple systems on the way to the current
   * system. In this case the consumer is expected to sequence the IDs in the
   * array in reverse order of provenance, i.e. most recent system first in the
   * list.
   */
  List<? extends IExternalId> getExternalReferences();

  /**
   * A string used to give a name to the Resource Order.
   */
  String getName();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * List of: An identified part of the order. A resource order is decomposed into
   * one or more order items.
   */
  List<? extends IResourceOrderItem> getOrderItems();

  /**
   * Name of the Resource Order type.
   */
  String getOrderType();

  /**
   * A way that can be used by consumers to prioritize orders in OM system (from 0
   * to 4 : 0 is the highest priority, and 4 the lowest).
   */
  Integer getPriority();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Requested delivery date from the requester perspective.
   */
  OffsetDateTime getRequestedCompletionDate();

  /**
   * Order start date wished by the requester.
   */
  OffsetDateTime getRequestedStartDate();

  /**
   * Date when the order was actually started.
   */
  OffsetDateTime getStartDate();

  /**
   * The life cycle state of the resource.
   */
  String getState();
}
