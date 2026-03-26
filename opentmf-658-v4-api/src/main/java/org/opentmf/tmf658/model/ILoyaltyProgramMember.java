package org.opentmf.tmf658.model;

import java.net.URI;

/**
 * A person or group that opts in to a loyalty program.
 *
 * <p><br/>
 * <strong>Required:</strong> name, roleType<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-658: Loyalty</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ILoyaltyProgramMember extends ILoyaltyProgramMemberUpdate {

  /**
   * A reference to the loyalty program member.
   */
  URI getHref();

  /**
   * Unique identifier for the loyalty program member.
   */
  String getId();
}
