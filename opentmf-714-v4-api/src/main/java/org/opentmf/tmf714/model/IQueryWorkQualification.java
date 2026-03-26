package org.opentmf.tmf714.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * QueryWorkQualification is used to retrieve a list of units of work that are
 * valid in the context of the interaction.
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
public interface IQueryWorkQualification extends IWorkQualification {

  /**
   * Date when the workQualification was submitted.
   */
  OffsetDateTime getQueryWorkQualificationDate();

  /**
   * A WorkQualificationItem relates to a specific unit of work being checked in a
   * qualification operation.
   */
  IWorkQualificationItem getSearchCriteria();

  /**
   * List of: A WorkQualificationItem relates to a specific unit of work being
   * checked in a qualification operation.
   */
  List<? extends IWorkQualificationItem> getWorkQualificationItems();
}
