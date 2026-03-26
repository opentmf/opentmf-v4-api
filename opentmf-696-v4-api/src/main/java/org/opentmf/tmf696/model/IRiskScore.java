package org.opentmf.tmf696.model;

import java.math.BigDecimal;
import org.opentmf.common.model.IExtensible;

/**
 * This resource reflects a score for a specific risk.
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
public interface IRiskScore extends IExtensible {

  /**
   * Types of risk that can be assessed
   * <br/><p>Recommended values: FraudRisk, BadPaymentRisk, CreditGamingRisk,
   * IDConfidenceRisk, PaymentMethodRisk.
   */
  String getRiskName();

  /**
   * The risk score.
   */
  BigDecimal getScore();
}
