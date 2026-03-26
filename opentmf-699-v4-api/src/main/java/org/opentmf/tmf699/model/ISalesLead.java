package org.opentmf.tmf699.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * A Sales Lead is the identification of a person or organization that has an
 * interest in the goods and/or services provided in the prospect of them
 * becoming Customers with one or more Subscriptions.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-699: Sales Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ISalesLead extends ISalesLeadUpdate {

  /**
   * Date and time of the salesLead creation.
   */
  OffsetDateTime getCreationDate();

  /**
   * Reference of the salesLead.
   */
  URI getHref();

  /**
   * Unique identifier of the salesLead.
   */
  String getId();
}
