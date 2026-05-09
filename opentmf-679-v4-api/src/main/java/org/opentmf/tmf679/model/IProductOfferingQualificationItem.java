package org.opentmf.tmf679.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IEligibilityUnavailabilityReason;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductRefOrValue;
import org.opentmf.common.model.IQualificationItemRelationship;
import org.opentmf.common.model.ITerminationError;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
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
public interface IProductOfferingQualificationItem extends IExtensible {

  /**
   * action to be performed on the product
   * <br/><p>Recommended values: add, modify, delete, noChange.
   */
  String getAction();

  /**
   * List of: Alternate product Offering proposal is used when the requested
   * product offering is not available with characteristic and date asked for. An
   * alternate proposal could be a distinct product offering or product Spec close
   * to requested one or same as requested but with a different activation date.
   */
  List<? extends IAlternateProductOfferingProposal> getAlternateProductOfferingProposals();

  /**
   * List of: Reason for eligibility result if the productOfferingQualification
   * result is no (meaning the productOffering or productSpec is not available).
   */
  List<? extends IEligibilityUnavailabilityReason> getEligibilityUnavailabilityReasons();

  /**
   * Date when the requester look for productOfferingQualification activation.
   */
  OffsetDateTime getExpectedActivationDate();

  /**
   * Id of the productOfferingQualification item.
   */
  String getId();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * A product to be created defined by value or existing defined by reference.
   * The polymorphic attributes {@literal @}type, {@literal @}schemaLocation & {@literal @}referredType are related
   * to the product entity and not the RelatedProductRefOrValue class itself.
   */
  IProductRefOrValue getProduct();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();

  /**
   * List of: Structure used to describe relationship between
   * productOfferingQualification item from the same ProductOfferingQualification.
   */
  List<? extends IQualificationItemRelationship> getQualificationItemRelationships();

  /**
   * Qualification result for this productOfferingQualification item. It could be:
   * <br/>
   * <br/> qualified (request productOffering or productSpecification are
   * available), 
   * <br/> unqualified (requested not available and not alternate available),
   * <br/> alternate (requested not available but proposal available).
   */
  String getQualificationItemResult();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();

  /**
   * List of: This indicates an error that caused a qualificationItem to be
   * terminated.
   */
  List<? extends ITerminationError> getTerminationErrors();
}
