package org.opentmf.tmf666.model;

/**
 * A party account used for settlement purposes. It includes a description of
 * the bill structure (frequency, presentation media, format and so on). It is a
 * specialization of entity PartyAccount.
 * <br/>Skipped properties: id,href.
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
public interface ISettlementAccountCreate extends IBillingAccountCreate {
}
