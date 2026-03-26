package org.opentmf.tmf666.model;

/**
 * Account used for billing or for settlement purposes concerning a given party
 * (an organization or an individual). It is a specialization of entity Account.
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
public interface IPartyAccountCreate extends IBillingAccountCreate {
}
