package org.opentmf.tmf666.model;

/**
 * The event data structure.
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
public interface IPartyAccountStateChangeEventPayload {

  /**
   * Account used for billing or for settlement purposes concerning a given party
   * (an organization or an individual). It is a specialization of entity Account.
   */
  IPartyAccount getPartyAccount();
}
