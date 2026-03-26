package org.opentmf.tmf658.model;


/**
 * A condition, comprised of a attribute that will be tested against a value.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> attribute, operator, value<br/>
 * </p>
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
public interface ILoyaltyConditionCreate {

  /**
   * The attribute to evaluate.
   */
  String getAttribute();

  /**
   * Comparison operator to be used in the evaluation.
   */
  String getOperator();

  /**
   * The value of the attribute to be evaluated.
   */
  String getValue();
}
