package org.opentmf.tmf680.model;

import java.net.URI;
import org.opentmf.common.model.ITimePeriod;

/**
 * Recommendation API is used to recommend offering quickly based on the history
 * and real-time context of customer. It is a real-time and personalized
 * recommendation API. It is usually provided by e-commerce or BSS, CRM system
 * in omni-channel.
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
public interface IQueryProductRecommendation extends IQueryProductRecommendationCreate {

  /**
   * Hypertext Reference of the queryProductRecommendation.
   */
  URI getHref();

  /**
   * Unique identifier of the queryProductRecommendation.
   */
  String getId();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
