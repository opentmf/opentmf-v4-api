package org.opentmf.tmf915.model;

import org.opentmf.common.model.IExtensible;

/**
 * Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRuleUpdate extends IExtensible {

  /**
   * The name of the rule.
   */
  String getName();
}
