package org.opentmf.tmf677.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.IPartyAccountRef;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ITimePeriod;

/**
 * An usage consumption enables to know at a given point the balances and the
 * consumption counters related to various buckets (SMS, Voice, Data for
 * example). It could be calculated for a device identified by a public key
 * (msisdn number for a mobile device for example or PSTN or VOIP number for a
 * fix device), for a subscribed offer or option or for an user.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-677: Usage Consumption Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUsageConsumption extends INamedEntity {

  /**
   * Bucket(s) included in the offer or option subscribed.
   */
  List<? extends IBucketRefOrValue> getBucketRefOrValues();

  /**
   * Date and time of the request creation.
   */
  OffsetDateTime getCreationDate();

  /**
   * Free short text describing the usage consumption content.
   */
  String getDescription();

  /**
   * Date when the status was last changed.
   */
  OffsetDateTime getLastUpdate();

  /**
   * List of: reference to the LogicalResource eg MSISDN.
   */
  List<? extends IUsageConsumptionLogicalResourceRef> getLogicalResources();

  /**
   * A reference to the account that owns the bucket.
   */
  List<? extends IPartyAccountRef> getPartyAccounts();

  List<? extends IUsageConsumptionProductRef> getProducts();

  /**
   * Reference and role of the related parties for which the usage consumption is
   * requested.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * List of: Service reference, for when Service is used by other entities.
   */
  List<? extends IUsageConsumptionServiceRef> getServices();

  /**
   * Possible values for the state of a task
   * <br/><p>Recommended values: acknowledged, terminatedWithError, inProgress,
   * done.
   */
  String getState();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidPeriod();
}
