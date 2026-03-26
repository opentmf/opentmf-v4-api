package org.opentmf.tmf728.model;

import java.net.URI;

/**
 * A dunning scenario describes a company’s dunning strategy. It must be easily
 * configurable to describe the dunning rules to apply to a case, the order in
 * which applying them, the events that trigger dunning rules evaluation and the
 * actions that must be done.
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
public interface IDunningScenario extends IDunningScenarioUpdate {

  /**
   * Hyperlink, a reference to the dunning scenario.
   */
  URI getHref();

  /**
   * Unique identifier for the dunning scenario.
   */
  String getId();
}
