package org.opentmf.tmf645.model;

import java.util.List;
import org.opentmf.common.model.IServiceQualificationItemRelationship;
import org.opentmf.common.model.IServiceQualificationRelationship;
import org.opentmf.common.model.ITerminationError;

/**
 * A ServiceQualificationItem relates to a specific service being checked in a
 * qualification operation.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-645: Service Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICheckServiceQualificationItem extends IServiceQualificationItem {

  /**
   * Alternate service proposal is used when the requested service is not
   * available with characteristic and date asked for. An alternate proposal could
   * be a distinct service Spec close to requested one or same as requested but
   * with a different availability date.
   */
  List<? extends IAlternateServiceProposal> getAlternateServiceProposals();

  /**
   * A list of eligibility unavailability reasons (EligibilityUnavailabilityReason
   * [*]). Reason for eligibility result if the serviceQualification result is no
   * (meaning the service is not available).
   */
  List<? extends IServiceEligibilityUnavailabilityReason> getEligibilityUnavailabilityReasons();

  /**
   * A list of qualification item relationships used to describe relationship
   * between serviceQualification item from the same serviceQualification.
   */
  List<? extends IServiceQualificationItemRelationship> getQualificationItemRelationships();

  /**
   * Structure used to describe relationship between serviceQualification item
   * from the same serviceQualification.
   */
  List<? extends IServiceQualificationRelationship> getQualificationRelationships();

  /**
   * Qualification result for serviceQualification item. It could be: - qualified
   * (request service are available), - unqualified (requested not available and
   * not alternate available), - alternate (requested not available but proposal
   * available).
   */
  String getQualificationResult();

  /**
   * State of the serviceQualification item (acknowledged, inProgress,
   * terminatedWithError, done).
   */
  String getState();

  /**
   * If qualificationItem has not been done properly this lists the error(s) that
   * caused termination of the qualification.
   */
  List<? extends ITerminationError> getTerminationErrors();
}
