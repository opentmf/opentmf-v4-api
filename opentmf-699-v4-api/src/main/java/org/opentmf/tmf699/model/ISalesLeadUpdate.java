package org.opentmf.tmf699.model;

import java.time.OffsetDateTime;

/**
 * A Sales Lead is the identification of a person or organization that has an
 * interest in the goods and/or services provided in the prospect of them
 * becoming Customers with one or more Subscriptions.
 * <br/>Skipped properties: id,href,creationDate.
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
public interface ISalesLeadUpdate extends ISalesLeadCreate {

  /**
   * Valid values for the lifecycle state of a salesLead resource
   * <br/><p>Recommended values: accepted, acknowledged, cancelled, inProgress,
   * pending, rejected.
   */
  String getStatus();

  /**
   * Date and time of the last update.
   */
  OffsetDateTime getStatusChangeDate();
}
