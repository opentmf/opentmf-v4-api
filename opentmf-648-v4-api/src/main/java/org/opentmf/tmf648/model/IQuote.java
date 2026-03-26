package org.opentmf.tmf648.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * Quote can be used to negotiate service and product acquisition or
 * modification between a customer and a service provider. Quote contain list of
 * quote items, a reference to customer (partyRole), a list of productOffering
 * and attached prices and conditions.
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
public interface IQuote extends IQuoteUpdate {

  /**
   * Hyperlink to access the quote.
   */
  URI getHref();

  /**
   * Unique identifier - attributed by quoting system.
   */
  String getId();

  /**
   * Date and time when the quote was created.
   */
  OffsetDateTime getQuoteDate();
}
