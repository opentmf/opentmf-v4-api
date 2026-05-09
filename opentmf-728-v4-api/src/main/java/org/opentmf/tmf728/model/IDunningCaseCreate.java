package org.opentmf.tmf728.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAccountBalance;
import org.opentmf.common.model.IBillingAccountRef;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IDunningScenarioRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;

/**
 * The DunningCase represents a type of cases open for a customer. Whenever a
 * customer enters the dunning process, a dunning case is linked to his customer
 * account debt and it contains all details pertaining to the debt, such as
 * dunning case rules, interactions… The status of a dunning case evolves
 * according to internal or external events (payments made by the customer,
 * payment schedule granted…)
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> billingAccount, dunningCaseRule, dunningScenario<br/>
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
public interface IDunningCaseCreate extends IExtensible {

  /**
   * BillingAccount reference. A BillingAccount is a detailed description of a
   * bill structure.
   */
  IBillingAccountRef getBillingAccount();

  /**
   * A categorization of a Dunning Case. It could be either "HardDunning" or
   * "SoftDunning".
   */
  String getCategory();

  /**
   * The date on which the dunning case was created.
   */
  OffsetDateTime getCreationDate();

  /**
   * A detailed description of the dunning case.
   */
  String getDescription();

  /**
   * List of: The Dunning Case Rule represents an action performed by the company
   * (or on its behalf) to recover a debt.
   */
  List<? extends IDunningCaseRule> getDunningCaseRules();

  /**
   * A dunning scenario reference.
   */
  IDunningScenarioRef getDunningScenario();

  /**
   * Balances linked to the account.
   */
  IAccountBalance getFinalBalance();

  /**
   * Balances linked to the account.
   */
  IAccountBalance getInitialBalance();

  /**
   * The date and time that the dunning case had its latest activity.
   */
  OffsetDateTime getLastActivityDate();

  /**
   * The date and time that the dunning case was last updated.
   */
  OffsetDateTime getLastUpdateDate();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getNotes();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * The current status of the dunning case.
   */
  String getStatus();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
