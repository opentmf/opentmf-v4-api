package org.opentmf.tmf649.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.general.model.IThresholdRule;

/**
 * A threshold base entity containing threshold rules.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name, thresholdRule<br/>
 * </p>
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
public interface IThresholdCreate extends IExtensible {

  /**
   * A description of the threshold.
   */
  String getDescription();

  /**
   * A word, term, or phrase by which a Performance threshold is known and
   * distinguished from other thresholds.
   */
  String getName();

  /**
   * A Performance Threshold contains a set of Performance threshold rules of
   * different conditions (Raise, Clear) and different severities.
   */
  List<? extends IThresholdRule> getThresholdRules();
}
