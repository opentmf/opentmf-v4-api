package org.opentmf.tmf714.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IEligibilityUnavailabilityReason;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IWorkRefOrValue;

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
public interface IWorkQualificationItem extends IExtensible {

  /**
   * List of: Reason for eligibility result if the productOfferingQualification
   * result is no (meaning the productOffering or productSpec is not available).
   */
  List<? extends IEligibilityUnavailabilityReason> getEligibilityUnavailabilityReasons();

  /**
   * The date when the work is expected to take place.
   */
  OffsetDateTime getExpectedWorkDate();

  /**
   * Date when the qualification item response expires.
   */
  OffsetDateTime getExpirationDate();

  /**
   * Id of the Work Qualification Item.
   */
  String getId();

  /**
   * A Unit of Work defined by value or existing defined by reference. The
   * polymorphic attributes {@literal @}type, {@literal @}schemaLocation &amp; {@literal @}referredType are related
   * to the work entity and not the related WorkRefOrValue class itself.
   */
  IWorkRefOrValue getWork();
}
