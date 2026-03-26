package org.opentmf.tmf671.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IPromotionUpdateBase;

/**
 * Promotion is used to provide the additional discount, voucher, bonus or gift
 * to the customer who meets the pre-defined criteria. Using promotion, the
 * enterprise is able to attract the users and encourage more consumption,
 * especially continuous purchases. Normally Promotion is not regarded as one
 * type of product or product offering. It is often applied when the customer
 * buys the product offerings with the price or amount surpassing the certain
 * limit.
 * <br/>Skipped properties: id,href,pattern,{@literal @}baseType,{@literal @}type,{@literal @}schemaLocation.
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
public interface IPromotionUpdate extends IPromotionUpdateBase {

  /**
   * List of: An attachment by value or by reference. An attachment complements
   * the description of an element, for example through a document, a video, a
   * picture.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * Latest update date of promotion.
   */
  OffsetDateTime getLastUpdate();

  /**
   * Type of promotion. The basic type are Award/Discount/Reduction.
   */
  String getPromotionType();
}
