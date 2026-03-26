package org.opentmf.tmf644.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;

/**
 * A Party Privacy Profile represents the set of Privacy settings defined for a
 * Party
 * <br/>Skipped properties: id,href,creationDate.
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
public interface IPartyPrivacyProfileUpdate extends IExtensible {

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getAgreedByParty();

  /**
   * Reference to Party Privacy Agreement resource.
   */
  IPartyPrivacyAgreementRef getAgreement();

  /**
   * Related Party reference. A related party defines party or party role linked
   * to a specific entity.
   */
  IRelatedParty getApplicableForParty();

  /**
   * Description of the privacy profile.
   */
  String getDescription();

  /**
   * Name of the privacy profile.
   */
  String getName();

  /**
   * List of characteristics of the privacy profile.
   */
  List<? extends IPartyPrivacyProfileCharacteristic> getPartyPrivacyProfileCharacteristics();

  /**
   * Reference to Party Privacy Specification resource.
   */
  IPartyPrivacyProfileSpecificationRef getPartyPrivacyProfileSpecification();

  /**
   * The status of this profile (for example: created, terminated, etc.).
   */
  String getStatus();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
