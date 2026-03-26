package org.opentmf.tmf644.model;

import java.util.List;
import org.opentmf.common.model.ITimePeriod;
import org.opentmf.partner.model.IRoleSpecification;

/**
 * A characteristic of the party privacy profile, whose value(s) would be
 * supplied at runtime. For example, email address.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-644: Privacy Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyPrivacyProfileSpecificationCharacteristic {

  /**
   * A list of roles in the organization who are allowed access to this
   * characteristic.
   */
  List<? extends IRoleSpecification> getAllowedRoles();

  /**
   * Level of criticality for this characteristic of personal identifiable
   * information (e.g. in terms of the damage if this item was breached), such as
   * low, medium, high.
   */
  String getCriticalityLevel();

  /**
   * Description of the characteristic.
   */
  String getDescription();

  String getId();

  /**
   * Name of the characteristic.
   */
  String getName();

  /**
   * List of values that can be assigned to this characteristic at runtime.
   */
  List<? extends ISpecificationCharacteristicValue> getPartyPrivacyProfileSpecCharacteristicValues();

  /**
   * Type of privacy (e.g. Internal Purpose, External Purpose, Internal Retention,
   * External Retention).
   */
  String getPrivacyType();

  /**
   * Defines the purpose authorized or refused for the characteristic (e.g. ADMIN,
   * INFORMATION, MARKETING, RESEARCH).
   */
  String getPrivacyUsagePurpose();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
