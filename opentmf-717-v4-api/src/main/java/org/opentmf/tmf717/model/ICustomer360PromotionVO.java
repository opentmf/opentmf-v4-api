package org.opentmf.tmf717.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.ITimePeriod;

/**
 * Promotion Resource is used to provide the additional discount, voucher, bonus
 * or gift to the customer who meets the pre-defined criteria. Using promotion,
 * the enterprise is able to attract the users and encourage more consumption,
 * especially continuous purchases.  Normally Promotion is not regarded as one
 * type of product or product offering. It is often applied when the customer
 * buys the product offerings with the price or amount surpassing the certain
 * limit.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360PromotionVO extends INamedEntity {

  /**
   * Description of Promotion.
   */
  String getDescription();

  /**
   * Latest update date of Promotion.
   */
  OffsetDateTime getLastUpdate();

  /**
   * Status of Promotion, including
   * draft/Test/WaitForApproval/Release/Suspend/Retirement.
   */
  String getLifecycleStatus();

  /**
   * Type of promotion.The basic type is Award/Discount/Reduction. More types can
   * be extended in future.
   */
  String getType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
