package org.opentmf.tmf671.model;

import java.net.URI;
import java.util.List;

/**
 * Promotion is used to provide the additional discount, voucher, bonus or gift
 * to the customer who meets the pre-defined criteria. Using promotion, the
 * enterprise is able to attract the users and encourage more consumption,
 * especially continuous purchases. Normally Promotion is not regarded as one
 * type of product or product offering. It is often applied when the customer
 * buys the product offerings with the price or amount surpassing the certain
 * limit.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
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
public interface IPromotionCreate extends IPromotionUpdate {

  /**
   * The base type for use in polymorphic collections.
   */
  String getAtBaseType();

  /**
   * A link to the schema describing a resource (for type extension).
   */
  URI getAtSchemaLocation();

  /**
   * The class type of the actual resource (for type extension).
   */
  String getAtType();

  /**
   * List of: Contains the conditions and benefits of the promotion toan eligible
   * party.
   */
  List<? extends IPromotionPattern> getPatterns();
}
