package org.opentmf.tmf714.model;

import java.net.URI;
import java.time.OffsetDateTime;

/**
 * CheckWorkQualification is used to validate specific units of work.
 *
 * <p><br/>
 * <strong>Required:</strong> workQualificationItem<br/>
 * </p>
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
public interface ICheckWorkQualification extends ICheckWorkQualificationUpdate {

  /**
   * Date when the workQualification was submitted.
   */
  OffsetDateTime getCheckWorkQualificationDate();

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
