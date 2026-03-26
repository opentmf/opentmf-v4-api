package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * Quote can be used to negotiate service and product acquisition or
 * modification between a customer and a service provider. Quote contain list of
 * quote items, a reference to customer (partyRole), a list of productOffering
 * and attached prices and conditions.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360QuoteVO extends IEntity {

  /**
   * Used to categorize the quote from a business perspective that can be useful
   * for the CRM system (e.g. "enterprise", "residential", ...).
   */
  String getCategory();

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
   * Date and time when the quote was created.
   */
  OffsetDateTime getQuoteDate();

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
