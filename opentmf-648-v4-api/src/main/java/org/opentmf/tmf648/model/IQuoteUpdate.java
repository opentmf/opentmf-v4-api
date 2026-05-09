package org.opentmf.tmf648.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAgreementRef;
import org.opentmf.common.model.IBillingAccountRef;
import org.opentmf.common.model.IContactMedium;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IProductOfferingQualificationRef;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;

/**
 * Quote can be used to negotiate service and product acquisition or
 * modification between a customer and a service provider. Quote contain list of
 * quote items, a reference to customer (partyRole), a list of productOffering
 * and attached prices and conditions.
 * <br/>Skipped properties: id,href,quoteDate.
 *
 * <p><br/>
 * <strong>Required:</strong> quoteItem<br/>
 * </p>
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
public interface IQuoteUpdate extends IExtensible {

  /**
   * A reference to an agreement defining the context of the quote.
   */
  List<? extends IAgreementRef> getAgreements();

  /**
   * An authorization provided for the quote.
   */
  List<? extends IAuthorization> getAuthorizations();

  /**
   * A reference to a billing account to provide quote context information.
   */
  List<? extends IBillingAccountRef> getBillingAccounts();

  /**
   * Used to categorize the quote from a business perspective that can be useful
   * for the CRM system (e.g. "enterprise", "residential", ...).
   */
  String getCategory();

  /**
   * Information contact related to the quote requester.
   */
  List<? extends IContactMedium> getContactMediums();

  /**
   * Description of the quote.
   */
  String getDescription();

  /**
   * Date when the quote has been completed.
   */
  OffsetDateTime getEffectiveQuoteCompletionDate();

  /**
   * this is the date wished by the requester to have the requested quote item
   * delivered.
   */
  OffsetDateTime getExpectedFulfillmentStartDate();

  /**
   * This is expected date - from quote supplier - to be able to send back a
   * response for this quote.
   */
  OffsetDateTime getExpectedQuoteCompletionDate();

  /**
   * ID given by the consumer and only understandable by him (to facilitate his
   * searches afterwards).
   */
  String getExternalId();

  /**
   * An indicator which when the value is "true" means that requester expects to
   * get quoting result immediately in the response. If the indicator is true then
   * the response code of 200 indicates the operation is successful otherwise a
   * task is created with a response 201.
   */
  Boolean getInstantSyncQuote();

  /**
   * Free form text associated with the quote.
   */
  List<? extends INote> getNotes();

  /**
   * A reference to a previously done product offering qualification.
   */
  List<? extends IProductOfferingQualificationRef> getProductOfferingQualifications();

  /**
   * An item of the quote - it is used to descirbe an operation on a product to be
   * quoted.
   */
  List<? extends IQuoteItem> getQuoteItems();

  /**
   * Quote total price.
   */
  List<? extends IQuotePrice> getQuoteTotalPrices();

  /**
   * A reference to a party playing a role in this quote (customer, seller,
   * requester, etc.).
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * This is requested date - from quote requester - to get a complete response
   * for this quote.
   */
  OffsetDateTime getRequestedQuoteCompletionDate();

  /**
   * Possible values for the state of the quote
   * <br/><p>Recommended values: rejected, pending, inProgress, cancelled,
   * approved, accepted.
   */
  String getState();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Quote version - if the customer rejected the quote but negotiations still
   * open a new version of the quote is managed.
   */
  String getVersion();
}
