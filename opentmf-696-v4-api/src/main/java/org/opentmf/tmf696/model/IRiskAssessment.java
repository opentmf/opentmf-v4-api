package org.opentmf.tmf696.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IRelatedPlace;

/**
 * This is a generalized task resource allowing assessment of risks - it is
 * expected that the resource will be specialized to reflect specific risks,
 * such as risks associated with a party, or with an order, etc.
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
public interface IRiskAssessment extends IEntity {

  /**
   * Additional characteristics for which the risk might be assessed, optional
   * input to the task.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * A Place and an associated role as installation adress, delivery address,
   * etc....
   */
  IRelatedPlace getPlace();

  /**
   * This resource reflects the risk assessment.
   */
  IRiskAssessmentResult getRiskAssessmentResult();

  /**
   * The status of the risk assessment, such as Succeeded, In Progress, Failed,
   * output from the task.
   */
  String getStatus();
}
