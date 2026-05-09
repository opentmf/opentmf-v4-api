package org.opentmf.tmf728.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAppliedCustomerBillingRate;
import org.opentmf.common.model.ICustomerBillRef;
import org.opentmf.common.model.IDunningRuleRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IProductOrderRef;

/**
 * The Dunning Case Rule represents an action performed by the company (or on
 * its behalf) to recover a debt.
 *
 * <p><br/>
 * <strong>Required:</strong> action, id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-728: Dunning Case Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDunningCaseRule extends IExtensible {

  /**
   * The action this dunning case rule is triggering. Can be either
   * "DunningNotification", "AppliedCustomerFeeCharge", "ProductOrder",
   * "CustomerBill" or "DunningWriteOff".
   */
  String getAction();

  /**
   * A customer bill displays applied billing rates created before or during the
   * billing process.
   */
  IAppliedCustomerBillingRate getAppliedPenaltyCharge();

  /**
   * The date on which the dunning case rule was created.
   */
  OffsetDateTime getCreationDate();

  /**
   * Bill reference.
   */
  ICustomerBillRef getCustomerBill();

  /**
   * A communication or joint activity from the Telecommunication Operator to the
   * customer to ask for a CustomerPayment or negotiate a PaymentPlan.
   */
  List<? extends IPartyInteractionRef> getDunningNotifications();

  /**
   * Dunning rule reference.
   */
  IDunningRuleRef getDunningRule();

  /**
   * The DunningWriteOff corresponds, in a dunning context, to a credit to
   * definitively balance the CustomerAccount before being able to close it.
   */
  IDunningWriteOff getDunningWriteOff();

  /**
   * Unique identifier for the dunning case rule.
   */
  String getId();

  /**
   * ProductOrder (ProductOrder) .The product order which the recommendation is
   * related with.
   */
  IProductOrderRef getProductOrder();
}
