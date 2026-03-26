package org.opentmf.tmf632.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IContactMedium;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IExternalReference;
import org.opentmf.common.model.IIndividualIdentification;
import org.opentmf.common.model.IPartyCreditProfile;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITaxExemptionCertificate;

/**
 * Individual represents a single human being (a man, woman or child). The
 * individual can be a customer, an employee or any other person that the
 * organization needs to store information about.
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
public interface IIndividualUpdate extends IExtensible {

  /**
   * e.g. Baron, Graf, Earl,….
   */
  String getAristocraticTitle();

  /**
   * Birth date.
   */
  OffsetDateTime getBirthDate();

  /**
   * List of: Indicates the contact medium that could be used to contact the
   * party.
   */
  List<? extends IContactMedium> getContactMediums();

  /**
   * Country where the individual was born.
   */
  String getCountryOfBirth();

  /**
   * List of: An individual might be evaluated for its worthiness and this
   * evaluation might be based on a credit rating given by a credit agency.
   */
  List<? extends IPartyCreditProfile> getCreditRatings();

  /**
   * Date of death.
   */
  OffsetDateTime getDeathDate();

  /**
   * List of: Lack or inadequate strength or ability.
   */
  List<? extends IDisability> getDisabilities();

  /**
   * List of: External reference of the individual or reference in other system.
   */
  List<? extends IExternalReference> getExternalReferences();

  /**
   * Contains the non-chosen or inherited name. Also known as last name in the
   * Western context.
   */
  String getFamilyName();

  /**
   * Family name prefix.
   */
  String getFamilyNamePrefix();

  /**
   * A fully formatted name in one string with all of its pieces in their proper
   * place and all of the necessary punctuation. Useful for specific contexts
   * (Chinese, Japanese, Korean,…).
   */
  String getFormattedName();

  /**
   * Full name flatten (first, middle, and last names).
   */
  String getFullName();

  /**
   * Gender.
   */
  String getGender();

  /**
   * e.g.. Sr, Jr, III (the third),….
   */
  String getGeneration();

  /**
   * First name of the individual.
   */
  String getGivenName();

  /**
   * List of: Represents our registration of information used as proof of identity
   * by an individual (passport, national identity card, drivers license, social
   * security number, birth certificate).
   */
  List<? extends IIndividualIdentification> getIndividualIdentifications();

  /**
   * List of: Ability of an individual to understand or converse in a language.
   */
  List<? extends ILanguageAbility> getLanguageAbilities();

  /**
   * Legal name or birth name (name one has for official purposes).
   */
  String getLegalName();

  /**
   * Temporary current location od the individual (may be used if the individual
   * has approved its sharing).
   */
  String getLocation();

  /**
   * Marital status (married, divorced, widow ...).
   */
  String getMaritalStatus();

  /**
   * Middles name or initial.
   */
  String getMiddleName();

  /**
   * Nationality.
   */
  String getNationality();

  /**
   * List of: Keeps track of other names, for example the old name of a woman
   * before marriage or an artist name.
   */
  List<? extends IOtherNameIndividual> getOtherNames();

  /**
   * List of: Describes a given characteristic of an object or entity through a
   * name/value pair.
   */
  List<? extends ICharacteristic> getPartyCharacteristics();

  /**
   * Reference to the place where the individual was born.
   */
  String getPlaceOfBirth();

  /**
   * Contains the chosen name by which the individual prefers to be addressed.
   * Note: This name may be a name other than a given name, such as a nickname.
   */
  String getPreferredGivenName();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * List of: Skills evaluated for an individual with a level and possibly with a
   * limited validity when an obsolescence is defined (Ex: the first-aid
   * certificate first level is limited to one year and an update training is
   * required each year to keep the level).
   */
  List<? extends ISkill> getSkills();

  /**
   * Valid values for the lifecycle state of the individual
   * <br/><p>Recommended values: initialized, validated, deceaded.
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
   * Useful for titles (aristocratic, social,...) Pr, Dr, Sir, ...
   */
  String getTitle();
}
