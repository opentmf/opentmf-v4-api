package org.opentmf.tmf728.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;

/**
 * Represents rules to apply to create a dunning case: the events that trigger
 * dunning rules evaluation, the conditions to evaluate and the actions that
 * must be done
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> dunningAction, dunningEvent<br/>
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
public interface IDunningRuleCreate extends IExtensible {

  /**
   * The action to be executed when the dunningEvent occurs if the dunning
   * condition evaluates to true. Can be either "DunningNotification",
   * "AppliedCustomerFeeCharge", "ProductOrder", "CustomerBill" or
   * "DunningWriteOff".
   */
  String getDunningAction();

  /**
   * A condition to check on the customer account or the customer bill, after a
   * dunning event has been fired, before dunning action is executed. Format is
   * the same as the predicate used for querying resources with attribute
   * filtering. Format for the values and variables of the expression is
   * implementation dependent.
   */
  String getDunningCondition();

  /**
   * A string describing the name of the fields of an event that should be
   * monitored for changes. It should be in the same format as the query string
   * used to subscribe to events from an API following hub/notification pattern.
   */
  String getDunningEvent();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getDunningRuleCharacteristics();

  /**
   * Name of the dunning rule.
   */
  String getName();
}
