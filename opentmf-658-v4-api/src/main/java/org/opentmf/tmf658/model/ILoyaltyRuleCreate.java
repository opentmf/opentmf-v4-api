package org.opentmf.tmf658.model;

import java.util.List;
import org.opentmf.common.model.ILoyaltyActionRef;
import org.opentmf.common.model.ILoyaltyConditionRef;
import org.opentmf.common.model.ILoyaltyEventTypeRef;

/**
 * Loyalty rule, containing conditions, event types and actions.
 * <br/>Skipped properties: id,href.
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
public interface ILoyaltyRuleCreate {

  /**
   * A user-friendly identifier of the loyalty rule.
   */
  String getCommonName();

  /**
   * A free-form description of the rule.
   */
  String getDescription();

  /**
   * This is a Boolean attribute that, if true, defines the condition clause of
   * this rule to be represented in Conjunctive Normal Form (e.g., an AND of ORs).
   * If the value of this attribute is false, then the condition clause will be
   * represented in Disjunctive Normal Form (e.g., an OR of ANDs).
   */
  Boolean getIsCNF();

  /**
   * A Boolean attribute that, if true, signifies that evaluation (and possibly
   * action execution) of this entity is mandatory and must be attempted. If the
   * Mandatory property value of this entity is false, then the evaluation of this
   * entity is considered to be 'best effort' and may be ignored.
   */
  Boolean getIsMandatoryEvaluation();

  /**
   * A string attribute that defines a set of one or more keywords that a policy
   * administrator may use to assist in characterizing or categorizing a policy
   * object to facilitate search operations.
   */
  String getKeywords();

  /**
   * References to linked actions.
   */
  List<? extends ILoyaltyActionRef> getLoyaltyActions();

  /**
   * References to linked conditions.
   */
  List<? extends ILoyaltyConditionRef> getLoyaltyConditions();

  /**
   * References to linked event types.
   */
  List<? extends ILoyaltyEventTypeRef> getLoyaltyEventTypes();

  /**
   * A generic naming attribute that can be used to identify different policy
   * entities.
   */
  String getPolicyName();

  /**
   * References to sub-rules.
   */
  List<? extends ILoyaltyRule> getSubRules();

  /**
   * A free-form string attribute that recommends how this policy object should be
   * used.
   */
  String getUsage();
}
