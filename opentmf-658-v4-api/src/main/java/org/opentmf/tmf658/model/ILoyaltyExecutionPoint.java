package org.opentmf.tmf658.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IAddressable;

/**
 * A record of a loyalty action that was applied.
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
public interface ILoyaltyExecutionPoint extends IAddressable {

  /**
   * The HTTP operation to be used when calling the endpoint.
   */
  String getAction();

  Object getActionAttributes();

  Object getBody();

  /**
   * A user-friendly identifier of the loyalty execution point.
   */
  String getCommonName();

  /**
   * The timestamp that the action was applied.
   */
  OffsetDateTime getDatetime();

  /**
   * A free-form description of the loyalty execution point.
   */
  String getDescription();

  /**
   * The endpoint called to trigger the Loyalty Program reward.
   */
  String getEndpoint();

  Object getHeaders();

  /**
   * A person or group that opts in to a loyalty program.
   */
  ILoyaltyProgramMember getLoyaltyProgramMember();

  /**
   * An instance of a loyalty program specification, linked to a specified loyalty
   * member.
   */
  ILoyaltyProgramProduct getLoyaltyProgramProduct();

  /**
   * The type of loyalty action.
   */
  String getType();

  /**
   * A string that identifies the version of the loyalty action.
   */
  String getVersion();
}
