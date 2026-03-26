package org.opentmf.tmf666.model;

import java.net.URI;

/**
 * Account used for billing or for settlement purposes concerning a given party
 * (an organization or an individual). It is a specialization of entity Account.
 *
 * <p><br/>
 * <strong>Required:</strong> name, relatedParty<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-666: Account Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyAccount extends IBillingAccountCreate {

  /**
   * Unique reference of the account.
   */
  URI getHref();

  /**
   * Unique identifier of the account.
   */
  String getId();
}
