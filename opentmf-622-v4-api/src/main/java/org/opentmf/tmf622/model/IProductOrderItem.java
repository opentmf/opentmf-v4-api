package org.opentmf.tmf622.model;

import java.util.List;
import org.opentmf.common.model.IAppointmentRef;
import org.opentmf.common.model.IBillingAccountRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductRefOrValue;
import org.opentmf.customer.model.IPaymentRef;
import org.opentmf.customer.model.IProductOfferingQualificationItemRef;
import org.opentmf.customer.model.IProductOfferingQualificationRef;

/**
 * An identified part of the order. A product order is decomposed into one or
 * more order items.
 *
 * <p><br/>
 * <strong>Required:</strong> action, id<br/>
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
public interface IProductOrderItem extends IExtensible {

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
   * BillingAccount reference. A BillingAccount is a detailed description of a
   * bill structure.
   */
  IBillingAccountRef getBillingAccount();

  /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03,
   * ...).
   */
  String getId();

  /**
   * List of: An amount, usually of money, that represents the actual price paid
   * by the Customer for this item or this order.
   */
  List<? extends IOrderPrice> getItemPrices();

  /**
   * List of: Description of a productTerm linked to this orderItem. This
   * represents a commitment with a duration.
   */
  List<? extends IOrderTerm> getItemTerms();

  /**
   * List of: An amount, usually of money, that represents the actual price paid
   * by the Customer for this item or this order.
   */
  List<? extends IOrderPrice> getItemTotalPrices();

  /**
   * List of: If an immediate payment has been done at the product order
   * submission, the payment information are captured and stored (as a reference)
   * in the order.
   */
  List<? extends IPaymentRef> getPayments();

  /**
   * A product to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the product entity and not the RelatedProductRefOrValue class itself.
   */
  IProductRefOrValue getProduct();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();

  /**
   * It's a productOfferingQualification item that has been executed previously.
   */
  IProductOfferingQualificationItemRef getProductOfferingQualificationItem();

  /**
   * List of: An identified part of the order. A product order is decomposed into
   * one or more order items.
   */
  List<? extends IProductOrderItem> getProductOrderItems();

  List<? extends IOrderItemRelationship> getProductOrderItemRelationships();

  /**
   * List of: It's a productOfferingQualification that has been executed
   * previously.
   */
  List<? extends IProductOfferingQualificationRef> getQualifications();

  /**
   * Quantity ordered.
   */
  Integer getQuantity();

  /**
   * It's a Quote item that has been executed previously.
   */
  IQuoteItemRef getQuoteItem();

  /**
   * Possible values for the state of the product order item
   * <br/><p>Recommended values: acknowledged, rejected, pending, held,
   * inProgress, cancelled, completed, failed, assessingCancellation,
   * pendingCancellation.
   */
  String getState();
}
