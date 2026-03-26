package org.opentmf.tmf679.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.ICategoryRef;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;

/**
 * ProductOfferingQualification is used to perform a commercial eligibility. It
 * allows to retrieve a list of productOffering that are commercially available
 * in the context of the interaction (defined be place, channel, party,
 * product).
 * <br/>Skipped properties:
 * id,href,state,expectedPOQCompletionDate,effectiveQualificationDate,expirationDate,productOfferingQualificationDate,qualificationResult,productOfferingQualificationItem.state,productOfferingQualificationItem.qualificationItemResult,productOfferingQualificationItem.alternateProductOfferingProposal.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-679: Product Offering Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IProductOfferingQualificationCreate extends IExtensible {

  /**
   * The category for grouping recommendations.
   */
  ICategoryRef getCategory();

  /**
   * The channel to which the resource reference to. e.g. channel for selling
   * product offerings, channel for opening a trouble ticket etc..
   */
  IChannelRef getChannel();

  /**
   * Description of the productOfferingQualification.
   */
  String getDescription();

  /**
   * An indicator which when the value is "true" means that requester expects to
   * get qualifcation result immediately in the response. If the indicator is true
   * then the response code of 200 indicates the operation is successful otherwise
   * a task is created with a response 201.
   */
  Boolean getInstantSyncQualification();

  /**
   * Free form text associated with the qualification request.
   */
  List<? extends INote> getNotes();

  /**
   * List of: Related Entity reference. A related place defines a place described
   * by reference or by value linked to a specific entity. The polymorphic
   * attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related to the place
   * entity and not the RelatedPlaceRefOrValue class itself.
   */
  List<? extends IRelatedPlaceRefOrValue> getPlaces();

  /**
   * Qualification item for a product or a category.
   */
  List<? extends IProductOfferingQualificationItem> getProductOfferingQualificationItems();

  /**
   * An indicator which when the value is "true" means that alternative solutions
   * should be provided.
   */
  Boolean getProvideAlternative();

  /**
   * An indicator which when the value is "true" means that only available product
   * offering must be listed in the response.
   */
  Boolean getProvideOnlyAvailable();

  /**
   * An indicator which when the value is "true" means that unavailability reason
   * are expected for non available product offering.
   */
  Boolean getProvideUnavailabilityReason();

  /**
   * Party playing a role for this qualification (as requester for example).
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Deadline date when the requester expected a qualification answer.
   */
  OffsetDateTime getRequestedPOQCompletionDate();
}
