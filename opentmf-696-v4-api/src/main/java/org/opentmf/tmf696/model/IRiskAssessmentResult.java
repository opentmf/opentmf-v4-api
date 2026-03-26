package org.opentmf.tmf696.model;

import java.math.BigDecimal;
import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * This resource reflects the risk assessment.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-696: Risk Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRiskAssessmentResult extends IExtensible {

  /**
   * An overall assessment of the risk, composed from the individual scores.
   */
  BigDecimal getOverallScore();

  /**
   * Additional characteristics for which the risk might be assessed, optional
   * input to the task.
   */
  List<? extends IRiskScore> getScores();
}
