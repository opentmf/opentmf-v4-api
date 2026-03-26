package org.opentmf.common.model;

import java.util.List;

/**
 * Generic Party structure used to define commonalities between sub concepts of
 * Individual and Organization.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-632: Party Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IParty extends IEntity {

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
   * List of: External reference of the individual or reference in other system.
   */
  List<? extends IExternalReference> getExternalReferences();

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
   * List of: A tax exemption certificate represents a tax exemption granted to a
   * party (individual or organization) by a tax jurisdiction which may be a city,
   * state, country,... An exemption has a certificate identifier (received from
   * the jurisdiction that levied the tax) and a validity period. An exemption is
   * per tax types and determines for each type of tax what portion of the tax is
   * exempted (partial by percentage or complete) via the tax definition.
   */
  List<? extends ITaxExemptionCertificate> getTaxExemptionCertificates();
}
