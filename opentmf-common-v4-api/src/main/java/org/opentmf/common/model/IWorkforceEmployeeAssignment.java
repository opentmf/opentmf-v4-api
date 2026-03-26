package org.opentmf.common.model;

import java.util.List;

/**
 * Represents an assignment of a particular WorforceEmployeeRole for a
 * particular unit of work in a specific timeframe. For example, assignment of a
 * person in a network engineer role to a trouble shooting unit of work for at
 * least 2 hours. The assignment is associated with a TimeSlot.
 *
 * <p><br/>
 * <strong>Required:</strong> description, id, skillType, workforceEmployee<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkforceEmployeeAssignment extends IExtensible {

  String getDescription();

  String getId();

  /**
   * Ex: primarySkill, secondarySkill.
   */
  String getSkillType();

  /**
   * Recommended values: acknowledged, rejected, pending, held, inProgress,
   * cancelled, completed, failed, partial.
   */
  String getState();

  List<? extends ITimeSlot> getTimeSlots();

  IPartyRefOrValue getWorkforceEmployee();
}
