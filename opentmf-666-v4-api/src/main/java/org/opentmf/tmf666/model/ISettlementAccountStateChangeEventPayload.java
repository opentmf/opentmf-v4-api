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
public interface ISettlementAccountStateChangeEventPayload {

  /**
   * A party account used for settlement purposes. It includes a description of
   * the bill structure (frequency, presentation media, format and so on). It is a
   * specialization of entity PartyAccount.
   */
  ISettlementAccount getSettlementAccount();
}
