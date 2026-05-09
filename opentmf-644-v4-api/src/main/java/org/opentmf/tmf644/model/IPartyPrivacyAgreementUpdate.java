package org.opentmf.tmf644.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IAgreementRef;
import org.opentmf.common.model.IAgreementSpecificationRef;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IPartyPrivacyProfileRef;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;
import org.opentmf.partner.model.IAgreementAuthorization;
import org.opentmf.partner.model.IAgreementItem;

/**
 * A specific type of agreement that formalizes the privacy profiles requested
 * for a party
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> agreementItem, agreementType, engagedParty, name<br/>
 * </p>
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
public interface IPartyPrivacyAgreementUpdate extends IExtensible {

  /**
   * List of: A business participant that is responsible for approving the
   * agreement.
   */
  List<? extends IAgreementAuthorization> getAgreementAuthorizations();

  /**
   * List of: A part of the agreement expressed in terms of a product offering and
   * possibly including specific terms and conditions.
   */
  List<? extends IAgreementItem> getAgreementItems();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getAgreementPeriod();

  /**
   * Agreement specification reference. An AgreementSpecification represents a
   * template of an agreement that can be used when establishing partnerships.
   */
  IAgreementSpecificationRef getAgreementSpecification();

  /**
   * The type of the agreement. For example commercial.
   */
  String getAgreementType();

  /**
   * List of: Agreement reference. An agreement represents a contract or
   * arrangement, either written or verbal and sometimes enforceable by law, such
   * as a service level agreement or a customer price agreement. An agreement
   * involves a number of other business entities, such as products, services, and
   * resources and/or their specifications.
   */
  List<? extends IAgreementRef> getAssociatedAgreements();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getCharacteristics();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getCompletionDate();

  /**
   * Narrative that explains the agreement and details about it, such as why the
   * agreement is taking place.
   */
  String getDescription();

  /**
   * A reference number assigned to an Agreement that follows a prescribed
   * numbering system.
   */
  Integer getDocumentNumber();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getEngagedParties();

  /**
   * Date at which the agreement was initialized.
   */
  OffsetDateTime getInitialDate();

  /**
   * A human-readable name for the agreement.
   */
  String getName();

  /**
   * The privacy profiles that are the subject of the agreement.
   */
  List<? extends IPartyPrivacyProfileRef> getPartyPrivacyProfiles();

  /**
   * A list of (typically) high criticality characteristics whose chosen privacy
   * rules are included in the agreement.
   */
  List<? extends IPartyPrivacyProfileCharacteristic> getPartyPrivacyProfileCharacteristics();

  /**
   * An overview and goals of the Agreement.
   */
  String getStatementOfIntent();

  /**
   * The current status of the agreement. Typical values are: in process, approved
   * and rejected.
   */
  String getStatus();

  /**
   * A string identifying the version of the agreement.
   */
  String getVersion();
}
