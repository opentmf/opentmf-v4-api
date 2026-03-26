package org.opentmf.tmf728.model;

import java.net.URI;

/**
 * Represents rules to apply to create a dunning case: the events that trigger
 * dunning rules evaluation, the conditions to evaluate and the actions that
 * must be done.
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
public interface IDunningRule extends IDunningRuleUpdate {

  /**
   * Hyperlink, a reference to the dunning rule.
   */
  URI getHref();

  /**
   * Unique identifier for the dunning rule.
   */
  String getId();
}
