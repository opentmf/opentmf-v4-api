package org.opentmf.tmf915.model;

import org.opentmf.common.model.IAttachmentRef;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IRuleRef;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> actualValue, consequence, operator, referenceValue<br/>
 * </p>
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
public interface IViolation extends IEntity {

  String getActualValue();

  /**
   * Attachment reference. An attachment complements the description of an element
   * (for instance a product) through video, pictures.
   */
  IAttachmentRef getAttachment();

  String getComment();

  String getConsequence();

  String getOperator();

  String getReferenceValue();

  /**
   * Rule reference. Rule is a common pattern or Template for the SLA parameters,
   * metrics, and thresholds.
   */
  IRuleRef getRule();

  String getTolerance();

  String getUnit();

  String getViolationAverage();
}
