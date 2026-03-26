package org.opentmf.tmf632.model;

import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * Skills evaluated for an individual with a level and possibly with a limited
 * validity when an obsolescence is defined (Ex: the first-aid certificate first
 * level is limited to one year and an update training is required each year to
 * keep the level).
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
public interface ISkill extends IExtensible {

  /**
   * A free text comment linked to the evaluation done.
   */
  String getComment();

  /**
   * Level of expertise in a skill evaluated for an individual.
   */
  String getEvaluatedLevel();

  /**
   * Code of the skill.
   */
  String getSkillCode();

  /**
   * Name of the skill such as Java language,….
   */
  String getSkillName();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
