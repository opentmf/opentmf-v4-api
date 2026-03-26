package org.opentmf.tmf678.model;

import org.opentmf.common.model.IBillRef;
import org.opentmf.common.model.IBillingAccountRef;
import org.opentmf.common.model.IRelatedPartyRef;

/**
 * This resource is used to manage the creation request of a customer bill in
 * real-time (on demand).
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-678: Customer Bill Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomerBillOnDemandCreate extends ICustomerBillUpdate {

  /**
   * BillingAccount reference. A BillingAccount is a detailed description of a
   * bill structure.
   */
  IBillingAccountRef getBillingAccount();

  /**
   * Bill reference.
   */
  IBillRef getCustomerBill();

  /**
   * Additional data describing the customer bill on demand request.
   */
  String getDescription();

  /**
   * The last date time when the customer bill on demand has been updated.
   */
  String getLastUpdate();

  /**
   * Friendly name to identify the customer bill on demand request.
   */
  String getName();

  /**
   * RelatedParty reference. A related party defines party or party role linked to
   * a specific entity.
   */
  IRelatedPartyRef getRelatedParty();
}
