package org.opentmf.tmf714.model;

import java.util.List;
import org.opentmf.common.model.ITerminationError;

/**
 * A WorkQualificationItem relates to a specific unit of work being checked in a
 * qualification operation.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICheckWorkQualificationItem extends IWorkQualificationItem {

  /**
   * List of: Alternate work proposal is used when the requested unit of work is
   * not valid as specified in the request. An alternate proposal could be a
   * distinct workSpecification close to the requested one or the same
   * specification as requested but with a different parameters.
   */
  List<? extends IAlternateWorkProposal> getAlternateWorkProposals();

  /**
   * List of: Structure used to describe relationship between WorkQualification
   * items from the same WorkQualification .
   */
  List<? extends IWorkQualificationItemRelationship> getQualificationItemRelationships();

  /**
   * List of: Structure used to describe relationship between WorkQualification
   * item from the same WorkQualification.
   */
  List<? extends IWorkQualificationRelationship> getQualificationRelationships();

  /**
   * Qualification result for workQualification item. It could be: - qualified
   * (requested unit of work is valid), - unqualified (requested unit of work not
   * valid and not alternative available), - alternate (requested unit of work not
   * valid but alternate proposal available).
   */
  String getQualificationResult();

  /**
   * State of the qualification item (acknowledged, inProgress,
   * terminatedWithError, done).
   */
  String getState();

  /**
   * If qualificationItem has not been done properly this lists the error(s) that
   * caused termination of the qualification.
   */
  List<? extends ITerminationError> getTerminationErrors();
}
