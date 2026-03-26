package org.opentmf.tmf649.model;

import java.util.List;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.general.model.IThresholdRule;

/**
 * A threshold base entity containing threshold rules.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-649: Performance Thresholding Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IThreshold extends INamedEntity {

  /**
   * A description of the threshold.
   */
  String getDescription();

  /**
   * A Performance Threshold contains a set of Performance threshold rules of
   * different conditions (Raise, Clear) and different severities.
   */
  List<? extends IThresholdRule> getThresholdRules();
}
