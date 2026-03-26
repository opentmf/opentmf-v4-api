package org.opentmf.tmf680.model;

import org.opentmf.common.model.IAddressableEventBase;

/**
 * The notification data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-680: Recommendation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQueryProductRecommendationCreateEvent extends IAddressableEventBase {

  /**
   * The event data structure.
   */
  IQueryProductRecommendationCreateEventPayload getEvent();
}
