package org.opentmf.tmf648.model;

import java.util.List;
import org.opentmf.common.model.IAppointmentRef;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductRefOrValue;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.customer.model.IProductOfferingQualificationItemRef;

/**
 * A quote items describe an action to be performed on a productOffering or a
 * product in order to get pricing elements and condition.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-648: Quote Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQuoteItem extends IExtensible {

  /**
   * Action to be performed on this quote item (add, modify, remove, etc.).
   */
  String getAction();

  /**
   * A reference to appointment(s) associated with this quote item.
   */
  List<? extends IAppointmentRef> getAppointments();

  /**
   * A reference to attachment(s) associated with this quote item.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * Identifier of the quote item (generally it is a sequence number 01, 02, 03,
   * ...).
   */
  String getId();

  /**
   * Free form text associated with the quote item.
   */
  List<? extends INote> getNotes();

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
   * Quantity asked for this quote item.
   */
  Integer getQuantity();

  /**
   * A structure to embedded quote item within quote item.
   */
  List<? extends IQuoteItem> getQuoteItems();

  /**
   * Authorization related to this quote item.
   */
  List<? extends IAuthorization> getQuoteItemAuthorizations();

  /**
   * Price for this quote item.
   */
  List<? extends IQuotePrice> getQuoteItemPrices();

  /**
   * A relationship from item within a quote.
   */
  List<? extends IQuoteItemRelationship> getQuoteItemRelationships();

  /**
   * A reference to a party playing a role in this quote item.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * State of the quote item : described in the state machine diagram.
   */
  String getState();
}
