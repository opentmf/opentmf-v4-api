package org.opentmf.tmf727.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IServiceRef;

/**
 * An occurrence of usage on a Service derived from various Resource usages,
 * which can be used for determining the Product usage. It is comprised of
 * characteristics, which represent attributes of service usage.
 * <br/>Skipped properties: id,href,usageDate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-727: Service Usage Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceUsageUpdate extends IExtensible {

  /**
   * Description of service usage.
   */
  String getDescription();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Service reference, for when Service is used by other entities.
   */
  IServiceRef getService();

  /**
   * Possible values for the status of the Usage
   * <br/><p>Recommended values: generated, archived.
   */
  String getStatus();

  /**
   * List of: Provides the value of a given characteristic.
   */
  List<? extends IServiceUsageCharacteristic> getUsageCharacteristics();

  /**
   * UsageSpecification reference. UsageSpecification is a detailed description of
   * a service usage event that are of interest to the business. It is comprised
   * of characteristics, which define all attributes known for a particular type
   * of usage.
   */
  IServiceUsageSpecificationRef getUsageSpecification();

  /**
   * Type of usage.
   */
  String getUsageType();
}
