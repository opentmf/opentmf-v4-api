package org.opentmf.tmf696.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedPlace;
import org.opentmf.common.model.IShoppingCartRef;

/**
 * This is a task resource allowing assessment of the risks associated with a
 * shopping cart - presumably created by a party role and containing one or more
 * product offerings
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> shoppingCart<br/>
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
public interface IShoppingCartRiskAssessmentCreate extends IExtensible {

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
   * ShoppingCart (ShoppingCartRef) . The shopping cart which the recommendation
   * is related with.
   */
  IShoppingCartRef getShoppingCart();

  /**
   * The status of the risk assessment, such as Succeeded, In Progress, Failed,
   * output from the task.
   */
  String getStatus();
}
