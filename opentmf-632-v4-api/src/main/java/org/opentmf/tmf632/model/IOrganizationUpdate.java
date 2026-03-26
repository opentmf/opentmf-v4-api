package org.opentmf.tmf632.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IContactMedium;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IExternalReference;
import org.opentmf.common.model.IPartyCreditProfile;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITaxExemptionCertificate;
import org.opentmf.common.model.ITimePeriod;

/**
 * Organization represents a group of people identified by shared interests or
 * purpose. Examples include business, department and enterprise. Because of the
 * complex nature of many businesses, both organizations and organization units
 * are represented by the same data.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IOrganizationUpdate extends IExtensible {

  /**
   * List of: Indicates the contact medium that could be used to contact the
   * party.
   */
  List<? extends IContactMedium> getContactMediums();

  /**
   * List of: An individual might be evaluated for its worthiness and this
   * evaluation might be based on a credit rating given by a credit agency.
   */
  List<? extends IPartyCreditProfile> getCreditRatings();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getExistsDuring();

  /**
   * List of: External reference of the individual or reference in other system.
   */
  List<? extends IExternalReference> getExternalReferences();

  /**
   * If value is true, the organization is the head office.
   */
  Boolean getIsHeadOffice();

  /**
   * If value is true, the organization is a legal entity known by a national
   * referential.
   */
  Boolean getIsLegalEntity();

  /**
   * Organization name (department name for example).
   */
  String getName();

  /**
   * Type of the name : Co, Inc, Ltd,….
   */
  String getNameType();

  /**
   * List of: Child references of an organization in a structure of organizations.
   */
  List<? extends IOrganizationChildRelationship> getOrganizationChildRelationships();

  /**
   * List of: Represents our registration of information used as proof of identity
   * by an organization.
   */
  List<? extends IOrganizationIdentification> getOrganizationIdentifications();

  /**
   * Parent references of an organization in a structure of organizations.
   */
  IOrganizationParentRelationship getOrganizationParentRelationship();

  /**
   * Type of Organization (company, department...).
   */
  String getOrganizationType();

  /**
   * List of: Keeps track of other names, for example the old name of an
   * organization.
   */
  List<? extends IOtherNameOrganization> getOtherNames();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getPartyCharacteristics();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Valid values for the lifecycle state of the organization
   * <br/><p>Recommended values: initialized, validated, closed.
   */
  String getStatus();

  /**
   * List of: A tax exemption certificate represents a tax exemption granted to a
   * party (individual or organization) by a tax jurisdiction which may be a city,
   * state, country,... An exemption has a certificate identifier (received from
   * the jurisdiction that levied the tax) and a validity period. An exemption is
   * per tax types and determines for each type of tax what portion of the tax is
   * exempted (partial by percentage or complete) via the tax definition.
   */
  List<? extends ITaxExemptionCertificate> getTaxExemptionCertificates();

  /**
   * Name that the organization (unit) trades under.
   */
  String getTradingName();
}
