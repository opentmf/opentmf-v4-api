package org.opentmf.tmf622.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAgreementRef;
import org.opentmf.common.model.IBillingAccountRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IProductOfferingQualificationRef;
import org.opentmf.common.model.IQuoteRef;
import org.opentmf.common.model.IRelatedChannel;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.customer.model.IPaymentRef;

/**
 * A Product Order is a type of order which can be used to place an order
 * between a customer and a service provider or between a service provider and a
 * partner and vice versa,
 * <br/>Skipped properties:
 * id,href,completionDate,orderDate,state,expectedCompletionDate,productOrderItem.state.
 *
 * <p><br/>
 * <strong>Required:</strong> productOrderItem<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOrderCreate extends IExtensible {

  /**
   * A reference to an agreement defined in the context of the product order.
   */
  List<? extends IAgreementRef> getAgreements();

  /**
   * BillingAccount reference. A BillingAccount is a detailed description of a
   * bill structure.
   */
  IBillingAccountRef getBillingAccount();

  /**
   * Date when the order is cancelled. This is used when order is cancelled.
   */
  OffsetDateTime getCancellationDate();

  /**
   * Reason why the order is cancelled. This is used when order is cancelled.
   */
  String getCancellationReason();

  /**
   * Used to categorize the order from a business perspective that can be useful
   * for the OM system (e.g. "enterprise", "residential", ...).
   */
  String getCategory();

  /**
   * List of: Related channel to another entity. May be online web, mobile app,
   * social ,etc.
   */
  List<? extends IRelatedChannel> getChannels();

  /**
   * Description of the product order.
   */
  String getDescription();

  /**
   * ID given by the consumer and only understandable by him (to facilitate his
   * searches afterwards).
   */
  String getExternalId();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * Contact attached to the order to send back information regarding this order.
   */
  String getNotificationContact();

  /**
   * List of: An amount, usually of money, that represents the actual price paid
   * by the Customer for this item or this order.
   */
  List<? extends IOrderPrice> getOrderTotalPrices();

  /**
   * List of: If an immediate payment has been done at the product order
   * submission, the payment information are captured and stored (as a reference)
   * in the order.
   */
  List<? extends IPaymentRef> getPayments();

  /**
   * A way that can be used by consumers to prioritize orders in OM system (from 0
   * to 4 : 0 is the highest priority, and 4 the lowest).
   */
  String getPriority();

  /**
   * List of: It's a productOfferingQualification that has been executed
   * previously.
   */
  List<? extends IProductOfferingQualificationRef> getProductOfferingQualifications();

  /**
   * List of: An identified part of the order. A product order is decomposed into
   * one or more order items.
   */
  List<? extends IProductOrderItem> getProductOrderItems();

  /**
   * List of: It's a Quote that has been executed previously.
   */
  List<? extends IQuoteRef> getQuotes();

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
   * Order fulfillment start date wished by the requester. This is used when, for
   * any reason, requester cannot allow seller to begin to operationally begin the
   * fulfillment before a date.
   */
  OffsetDateTime getRequestedStartDate();
}
