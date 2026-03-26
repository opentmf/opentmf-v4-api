package org.opentmf.tmf654.model;

import org.opentmf.common.model.IRelatedEntityRefOrValue;

/**
 * Related Entity reference. A related balance topup defines a relationship via
 * a role to another balance topup. Used in the PrepayBalanceManagement API to
 * track child topups that are related to the parent (initiating balance topup
 * resource). PrepayBalanceManagement defines the child role.
 *
 * <p><br/>
 * <strong>Required:</strong> @referredType, id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-654: Prepay Balance Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRelatedTopupBalance extends IRelatedEntityRefOrValue {
}
