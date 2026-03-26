package org.opentmf.common.model;

import java.util.List;

/**
 * The part played by a party in a given context.
 *
 * <p><br/>
 * <strong>Required:</strong> engagedParty, name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-668: Partnership Type</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartner extends INamedEntity {

  /**
   * List of: Account reference. An account may be a party account or a financial
   * account.
   */
  List<? extends IAccountRef> getAccounts();

  /**
   * List of: Agreement reference. An agreement represents a contract or
   * arrangement, either written or verbal and sometimes enforceable by law, such
   * as a service level agreement or a customer price agreement. An agreement
   * involves a number of other business entities, such as products, services, and
   * resources and/or their specifications.
   */
  List<? extends IAgreementRef> getAgreements();

  /**
   * Describes the characteristic of a partner.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * List of: Indicates the contact medium that could be used to contact the
   * party.
   */
  List<? extends IContactMedium> getContactMediums();

  /**
   * List of: Credit profile for the party (containing credit scoring, ...). By
   * default, only the current credit profile is retrieved. It can be used as a
   * list to give the party credit profiles history, the first one in the list
   * will be the current one.
   */
  List<? extends ICreditProfile> getCreditProfiles();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getEngagedParty();

  /**
   * List of: PaymentMethod reference. A payment method defines a specific mean of
   * payment (e.g. direct debit).
   */
  List<? extends IPaymentMethodRef> getPaymentMethods();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Used to track the lifecycle status of the partner.
   */
  String getStatus();

  /**
   * A string providing an explanation on the value of the status lifecycle. For
   * instance if the status is Rejected, statusReason will provide the reason for
   * rejection.
   */
  String getStatusReason();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
