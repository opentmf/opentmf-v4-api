package org.opentmf.tmf696.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IRelatedPartyRef;
import org.opentmf.common.model.IRelatedPlace;

/**
 * This is a task resource allowing assessment of the risks associated with a
 * party or party role that considers acquiring a specific product offering
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> partyRole, productOffering<br/>
 * </p>
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
public interface IPartyRoleProductOfferingRiskAssessmentCreate extends IProductOfferingRiskAssessmentCreate {

  /**
   * Additional characteristics for which the risk might be assessed, optional
   * input to the task.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * RelatedParty reference. A related party defines party or party role linked to
   * a specific entity.
   */
  IRelatedPartyRef getPartyRole();

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
