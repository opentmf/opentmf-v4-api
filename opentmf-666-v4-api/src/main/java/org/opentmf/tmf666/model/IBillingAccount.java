package org.opentmf.tmf666.model;

import java.net.URI;

/**
 * A party account used for billing purposes. It includes a description of the
 * bill structure (frequency, presentation media, format and so on). It is a
 * specialization of entity PartyAccount.
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
public interface IBillingAccount extends IBillingAccountCreate {

  /**
   * Unique reference of the account.
   */
  URI getHref();

  /**
   * Unique identifier of the account.
   */
  String getId();
}
