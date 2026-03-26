package org.opentmf.tmf671.model;

import org.opentmf.common.model.IEntityRef;
import org.opentmf.common.model.IExtensible;

/**
 * Action of the promotion. When the customer meets the conditions in the
 * promotion pattern, the customer can be given the benefits in the action.
 *
 * <p><br/>
 * <strong>Required:</strong> actionType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-671: Promotion Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPromotionAction extends IExtensible {

  /**
   * Entity reference schema to be used for all entityRef class.
   */
  IEntityRef getActionEntityRef();

  /**
   * Action type can be one of the following: voice (minute), data (MB), data
   * (GB), SMS, bonus point, physical gift, voucher, promotion code, an existing
   * offering, currency.
   */
  String getActionType();

  /**
   * When the Promotion type is 1: Award, it means the amount or value of the
   * awards decided by actionType, such as: Amount of gift, Amount of bonus, Value
   * of discount; 
   * <br/> • When the Promotion type is 2: Discount, it means the value of the
   * discount; 
   * <br/> • When the Promotion type is 3: reduction, it means the value of the
   * reduced money.
   */
  String getActionValue();

  /**
   * Unique identifier.
   */
  String getId();
}
