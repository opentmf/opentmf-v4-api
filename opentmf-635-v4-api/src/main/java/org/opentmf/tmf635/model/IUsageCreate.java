package org.opentmf.tmf635.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.product.model.IRatedProductUsage;
import org.opentmf.product.model.IUsageCharacteristic;
import org.opentmf.product.model.IUsageSpecificationRef;

/**
 * An occurrence of employing a Product, Service, or Resource for its intended
 * purpose, which is of interest to the business and can have charges applied to
 * it. It is comprised of characteristics, which represent attributes of usage.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-635: Usage Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUsageCreate extends IExtensible {

  /**
   * Description of usage.
   */
  String getDescription();

  /**
   * List of: An occurrence of employing a product for its intended purpose with
   * all rating details.
   */
  List<? extends IRatedProductUsage> getRatedProductUsages();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Possible values for the status of the Usage
   * <br/><p>Recommended values: received, rejected, recycled, guided, rated,
   * rerated, billed.
   */
  String getStatus();

  /**
   * List of: Provides the value of a given characteristic.
   */
  List<? extends IUsageCharacteristic> getUsageCharacteristics();

  /**
   * Date of usage.
   */
  OffsetDateTime getUsageDate();

  /**
   * UsageSpecification reference. UsageSpecification is a detailed description of
   * a usage event that are of interest to the business and can have charges
   * applied to it. It is comprised of characteristics, which define all
   * attributes known for a particular type of usage.
   */
  IUsageSpecificationRef getUsageSpecification();

  /**
   * Type of usage.
   */
  String getUsageType();
}
