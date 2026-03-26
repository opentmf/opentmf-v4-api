package org.opentmf.tmf658.model;

import java.util.List;
import org.opentmf.common.model.IAccountRef;
import org.opentmf.common.model.IAgreementRef;
import org.opentmf.common.model.ICategoryRef;
import org.opentmf.common.model.IContactMedium;
import org.opentmf.common.model.ICustomerCreateBase;
import org.opentmf.common.model.IPaymentMethodRef;
import org.opentmf.common.model.IRelatedParty;

/**
 * A partner engaged in the Loyalty Program
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> engagedParty, name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILoyaltyProgramPartnerUpdate extends ICustomerCreateBase {

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
   * List of: Indicates the contact medium that could be used to contact the
   * party.
   */
  List<? extends IContactMedium> getContactMediums();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getEngagedParty();

  /**
   * The partner catalog category reference maps to a category containing the
   * partner product offerings.
   */
  List<? extends ICategoryRef> getPartnerCatalogs();

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
}
