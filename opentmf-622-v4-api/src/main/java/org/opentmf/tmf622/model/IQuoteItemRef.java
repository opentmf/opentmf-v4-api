package org.opentmf.tmf622.model;

import java.net.URI;
import org.opentmf.common.model.IEntityRef;

/**
 * It's a Quote item that has been executed previously.
 *
 * <p><br/>
 * <strong>Required:</strong> id, quoteId<br/>
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
public interface IQuoteItemRef extends IEntityRef {

  /**
   * Reference of the related entity.
   */
  URI getQuoteHref();

  /**
   * Unique identifier of a related entity.
   */
  String getQuoteId();

  /**
   * Name of the related entity.
   */
  String getQuoteName();
}
