package org.opentmf.tmf677.model;

import org.opentmf.common.model.IExtensible;

/**
 * Linked bucket to the one instantiate, such as [isAggregated] if the bucket is
 * a part of other or [aggregator] is the bucket holds others.
 *
 * <p><br/>
 * <strong>Required:</strong> bucketRefOrValue, relationshipType<br/>
 * </p>
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
public interface IBucketRelationship extends IExtensible {

  /**
   * A bucket (called UsageVolumProduct in the SID Model) represents and tracks a
   * quantity of usage (remaining or consumed). It could be either a quantity or
   * an amount in a currency. It can represent a fixed number of SMS,MMS, call
   * minutes, quantity of data and so on.
   */
  IBucketRefOrValue getBucketRefOrValue();

  /**
   * Type of the bucket relationship, such as [isAggregated] if the bucket is a
   * part of other or [aggregator] is the bucket holds others.
   */
  String getRelationshipType();
}
