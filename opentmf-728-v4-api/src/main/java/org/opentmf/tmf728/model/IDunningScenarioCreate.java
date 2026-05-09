package org.opentmf.tmf728.model;

import java.util.List;
import org.opentmf.common.model.IDunningRuleRef;
import org.opentmf.common.model.IExtensible;

/**
 * A dunning scenario describes a company’s dunning strategy. It must be easily
 * configurable to describe the dunning rules to apply to a case, the order in
 * which applying them, the events that trigger dunning rules evaluation and the
 * actions that must be done
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> dunningRule, name<br/>
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
public interface IDunningScenarioCreate extends IExtensible {

  /**
   * A categorization of an entry in the list of dunning scenarios such as
   * residentials or low risk.
   */
  String getCategory();

  /**
   * A detailed description of the dunning scenario.
   */
  String getDescription();

  /**
   * List of: Dunning rule reference.
   */
  List<? extends IDunningRuleRef> getDunningRules();

  /**
   * If true, indicates that the DunningScenario is the one to use by default if
   * no specific DunningScenario is specified for the CustomerAccount.
   */
  Boolean getIsDefault();

  /**
   * A word or phrase by which a dunning scenario is known and distinguished from
   * other dunning scenarios.
   */
  String getName();
}
