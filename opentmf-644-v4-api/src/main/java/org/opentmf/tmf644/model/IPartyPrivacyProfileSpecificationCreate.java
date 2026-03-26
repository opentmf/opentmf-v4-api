package org.opentmf.tmf644.model;

import java.util.List;
import org.opentmf.common.model.IDocumentUpdateBase;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;

/**
 * Party Privacy Profile Specification serves as a template for creating Privacy
 * Profiles. The specification defines characteristics for the profile. For
 * example there might be a profile specification for residential customers, and
 * a different specification for partners.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> partyPrivacyProfileSpecCharacteristic<br/>
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
public interface IPartyPrivacyProfileSpecificationCreate extends IDocumentUpdateBase {

  /**
   * A list of roles to which this specification can apply. For example: Shop
   * Agent, Call Center Agent.
   */
  List<? extends IPartyPrivacyRoleSpecification> getApplicableRoles();

  /**
   * List of characteristics of the specification, whose values would typically be
   * supplied when the profile is instantiated.
   */
  List<? extends IPartyPrivacyProfileSpecificationCharacteristic> getPartyPrivacyProfileSpecCharacteristics();

  /**
   * List of: ProductOffering reference. A product offering represents entities
   * that are orderable from the provider of the catalog, this resource includes
   * pricing information.
   */
  List<? extends IProductOfferingRef> getProductOfferings();

  /**
   * List of parties or party roles involved in the definition or management of
   * the specification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Lifecycle status of the specification (for example: In Design, Active,
   * Rejected, Retired).
   */
  String getStatus();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
