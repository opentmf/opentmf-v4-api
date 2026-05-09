package org.opentmf.tmf658.model;

import org.opentmf.common.model.IPartnershipRef;
import org.opentmf.common.model.IProductOfferingRef;

/**
 * Contains information on a loyalty action that should be applied should
 * certain conditions be met for a loyalty rule and program.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILoyaltyActionUpdate {

  /**
   * The HTTP operation to be used when calling the endpoint.
   */
  String getAction();

  Object getActionAttributes();

  /**
   * The type of loyalty action.
   */
  String getActionType();

  Object getBody();

  /**
   * A user-friendly identifier of the loyalty execution point.
   */
  String getCommonName();

  /**
   * A free-form description of the loyalty execution point.
   */
  String getDescription();

  /**
   * The endpoint to call to trigger a BusinessInteraction, CustomerOrder or
   * LoyaltyEarn.
   */
  String getEndpoint();

  Object getHeaders();

  /**
   * Partnership reference. A partnership contains all the information for the
   * setup of a partnership of a given kind. This includes the list of identified
   * role types for the partnership with the corresponding agreement
   * specifications.
   */
  IPartnershipRef getPartnership();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();

  /**
   * A string that identifies the version of the loyalty action.
   */
  String getVersion();
}
