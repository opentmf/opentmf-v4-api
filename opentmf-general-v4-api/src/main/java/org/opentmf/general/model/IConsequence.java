package org.opentmf.general.model;

import org.opentmf.common.model.INamedEntity;

/**
 * A threshold crossing or a threshold ceased to be crossing results in a
 * Performance consequence.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-649: Performance Thresholding Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IConsequence extends INamedEntity {

  /**
   * A description of a Consequence.
   */
  String getDescription();

  /**
   * The suggested action.
   */
  String getPrescribedAction();
}
