package org.opentmf.tmf648.model;

/**
 * The event data structure.
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
public interface IQuoteStateChangeEventPayload {

  /**
   * Quote can be used to negotiate service and product acquisition or
   * modification between a customer and a service provider. Quote contain list of
   * quote items, a reference to customer (partyRole), a list of productOffering
   * and attached prices and conditions.
   */
  IQuote getQuote();
}
