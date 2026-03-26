package org.opentmf.tmf632.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Keeps track of other names, for example the old name of a woman before
 * marriage or an artist name.
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
public interface IOtherNameIndividual extends IExtensible {

  /**
   * e.g. Baron, Graf, Earl,….
   */
  String getAristocraticTitle();

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
   * . A fully formatted name in one string with all of its pieces in their proper
   * place and all of the necessary punctuation. Useful for specific contexts
   * (Chinese, Japanese, Korean,…).
   */
  String getFormattedName();

  /**
   * Full name flatten (first, middle, and last names).
   */
  String getFullName();

  /**
   * e.g. Sr, Jr….
   */
  String getGeneration();

  /**
   * First name.
   */
  String getGivenName();

  /**
   * Legal name or birth name (name one has for official purposes).
   */
  String getLegalName();

  /**
   * Middle name or initial.
   */
  String getMiddleName();

  /**
   * Contains the chosen name by which the person prefers to be addressed. Note:
   * This name may be a name other than a given name, such as a nickname.
   */
  String getPreferredGivenName();

  /**
   * Use for titles (aristocratic, social, ...): Pr, Dr, Sir,....
   */
  String getTitle();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
