package org.opentmf.tmf632.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Ability of an individual to understand or converse in a language.
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
public interface ILanguageAbility extends IExtensible {

  /**
   * A “true” value specifies whether the language is considered by the individual
   * as his favourite one.
   */
  Boolean getIsFavouriteLanguage();

  /**
   * Language code (RFC 5646).
   */
  String getLanguageCode();

  /**
   * Language name.
   */
  String getLanguageName();

  /**
   * Listening proficiency evaluated for this language.
   */
  String getListeningProficiency();

  /**
   * Reading proficiency evaluated for this language.
   */
  String getReadingProficiency();

  /**
   * Speaking proficiency evaluated for this language.
   */
  String getSpeakingProficiency();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * Writing proficiency evaluated for this language.
   */
  String getWritingProficiency();
}
