package org.opentmf.common.model;


/**
 * specification of a value (number or text or an object) that can be assigned
 * to a Characteristic.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-620: Product Catalog Management API</li>
 *   <li>TMF-633: Service Catalog Management API</li>
 *   <li>TMF-634: Resource Catalog Management API</li>
 *   <li>TMF-635: Usage Management API</li>
 *   <li>TMF-653: Service Test Management API</li>
 *   <li>TMF-658: Loyalty</li>
 *   <li>TMF-662: Entity Catalog Management API</li>
 *   <li>TMF-667: Document Management API</li>
 *   <li>TMF-686: Topology API</li>
 *   <li>TMF-700: Shipping Order Management API</li>
 *   <li>TMF-701: Process Flow Management API</li>
 *   <li>TMF-711: Shipment Management Management API</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-725: Metadata Catalog Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICharacteristicValueSpecification extends IExtensible {

  /**
   * If true, the Boolean Indicates if the value is the default value for a
   * characteristic.
   */
  Boolean getIsDefault();

  /**
   * An indicator that specifies the inclusion or exclusion of the valueFrom and
   * valueTo attributes. If applicable, possible values are "open", "closed",
   * "closedBottom" and "closedTop".
   */
  String getRangeInterval();

  /**
   * A regular expression constraint for given value.
   */
  String getRegex();

  /**
   * A length, surface, volume, dry measure, liquid measure, money, weight, time,
   * and the like. In general, a determinate quantity or magnitude of the kind
   * designated, taken as a standard of comparison for others of the same kind, in
   * assigning to them numerical values, as 1 foot, 1 yard, 1 mile, 1 square foot.
   */
  String getUnitOfMeasure();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  Object getValue();

  /**
   * The low range value that a characteristic can take on.
   */
  Integer getValueFrom();

  /**
   * The upper range value that a characteristic can take on.
   */
  Integer getValueTo();

  /**
   * A kind of value that the characteristic value can take on, such as numeric,
   * text and so forth.
   */
  String getValueType();
}
