package org.opentmf.tmf680.model;

/**
 * The event data structure.
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
public interface IQueryProductRecommendationCreateEventPayload {

  /**
   * Recommendation API is used to recommend offering quickly based on the history
   * and real-time context of customer. It is a real-time and personalized
   * recommendation API. It is usually provided by e-commerce or BSS, CRM system
   * in omni-channel.
   */
  IQueryProductRecommendation getQueryProductRecommendation();
}
