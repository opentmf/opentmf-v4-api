package org.opentmf.common.model;


/**
 * Account reference. An account may be a party account or a financial account.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-629: Customer Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-666: Account Management API</li>
 *   <li>TMF-668: Partnership Type</li>
 *   <li>TMF-669: Party Role Management API</li>
 *   <li>TMF-670: Payment Method Management API</li>
 *   <li>TMF-676: Payment Management API</li>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAccountRef extends IEntityRef {

  /**
   * Detailed description of the account.
   */
  String getDescription();
}
