package org.opentmf.tmf691.model;

import java.util.List;
import org.opentmf.common.model.IEntitlement;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> entityType, id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-691: Federated ID Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUserAsset {

  /**
   * Second level to define the type of managed element for
   * product/service/resource managed entities (e.g.: mobile line subscription,
   * video platform license, mobile equipment, etc). Allows identifying the
   * specific asset within the server referenced. Supported values are
   * implementation and application specific. Other values can be added if those
   * listed are not enough.
   */
  String getAssetType();

  /**
   * information about individual entitlements to define access levels to operate
   * over different functions that can be defined in an asset.
   */
  List<? extends IEntitlement> getEntitlements();

  /**
   * Type of managed entity (e.g.: product, resource, service, customer, account).
   */
  String getEntityType();

  /**
   * Unique identifier of referenced entity within the entity/asset pair
   * (customerId, accountId, mobile line number, ...).
   */
  String getId();

  /**
   * Represents the part played by an individual in relation to being granted a
   * set of entitlements for manageable assets (e.g.: owner, user, viewer, ...).
   */
  String getRole();
}
