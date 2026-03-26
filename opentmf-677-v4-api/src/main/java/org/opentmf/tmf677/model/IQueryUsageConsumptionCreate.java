package org.opentmf.tmf677.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IPartyAccountRef;
import org.opentmf.common.model.IRelatedParty;

/**
 * An QueryUsageConsumption allows to manage the calculation request of an usage
 * consumption
 * <br/>Skipped properties: id,href,usageConsumption.
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
public interface IQueryUsageConsumptionCreate extends IExtensible {

  /**
   * A reference to the account that owns the bucket.
   */
  List<? extends IPartyAccountRef> getPartyAccounts();

  /**
   * Date when the query was submitted.
   */
  OffsetDateTime getQueryUsageConsumptionDate();

  /**
   * Reference and role of the related parties for which the usage consumption is
   * requested.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * An usage consumption enables to know at a given point the balances and the
   * consumption counters related to various buckets (SMS, Voice, Data for
   * example). It could be calculated for a device identified by a public key
   * (msisdn number for a mobile device for example or PSTN or VOIP number for a
   * fix device), for a subscribed offer or option or for an user.
   */
  IUsageConsumption getSearchCriteria();
}
