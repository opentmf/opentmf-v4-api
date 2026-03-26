package org.opentmf.tmf654.model;

import java.util.List;
import org.opentmf.common.model.INamedEntity;
import org.opentmf.common.model.IPartyAccountRef;
import org.opentmf.common.model.IProductRef;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.IRelatedParty;

/**
 * Represents and tracks the aggregated amount remained or owed in certain
 * account which is owned by certain customer for a set of buckets.
 *
 * <p><br/>
 * <strong>Required:</strong> bucket, name, totalBalance<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-654: Prepay Balance Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAccumulatedBalance extends INamedEntity {

  /**
   * A reference to the buckets involved in the aggregation.
   */
  List<? extends IBucketRef> getBuckets();

  /**
   * Text describing the contents of the aggregated balance.
   */
  String getDescription();

  /**
   * reference to the LogicalResource eg MSISDN.
   */
  ILogicalResourceRef getLogicalResource();

  /**
   * PartyAccount reference. A party account is an arrangement that a party has
   * with an enterprise that provides products to the party.
   */
  IPartyAccountRef getPartyAccount();

  /**
   * A reference to the product whose consumption is managed by the bucket . This
   * is an array to allow scenarios where a buckets are shared between different
   * products.
   */
  List<? extends IProductRef> getProducts();

  /**
   * Used to provide information about any other entity with relation to the
   * balance, for instance to define customer hierarchy for the balance (e.g.:
   * customerId, userId, ).
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * An amount in a given unit.
   */
  IQuantity getTotalBalance();
}
