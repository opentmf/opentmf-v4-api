package org.opentmf.product.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.IProductRef;

/**
 * An occurrence of employing a product for its intended purpose with all rating
 * details.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-635: Usage Management API</li>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRatedProductUsage extends IExtensible {

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getBucketValueConvertedInAmount();

  /**
   * Boolean indicating if usage have been billed or not.
   */
  Boolean getIsBilled();

  /**
   * Indicates if the rated amount is exempt of tax.
   */
  Boolean getIsTaxExempt();

  /**
   * Type of tariff applied.
   */
  String getOfferTariffType();

  IProductRef getProductRef();

  /**
   * Type of amount.
   */
  String getRatingAmountType();

  /**
   * Date of usage rating.
   */
  OffsetDateTime getRatingDate();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxExcludedRatingAmount();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getTaxIncludedRatingAmount();

  /**
   * Tax rate.
   */
  BigDecimal getTaxRate();

  /**
   * Tag value: [usage]: the usage is always rated outside a usage bundle
   * <br/>[included usage]: the usage is rated inside a usage bundle
   * <br/>[non included usage]: the usage bundle is exhausted. The usage is rated
   * outside the usage bundle.
   */
  String getUsageRatingTag();
}
