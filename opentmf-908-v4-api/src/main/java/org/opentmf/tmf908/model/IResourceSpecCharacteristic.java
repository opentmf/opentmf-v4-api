package org.opentmf.tmf908.model;

import java.net.URI;
import java.util.List;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.ITimePeriod;

/**
 * This class represents the key features of this service specification. For
 * example, bandwidth is a characteristic of many different types of services;
 * if bandwidth is a relevant characteristic (e.g., from the point-of-view of a
 * Customer obtaining this Service via a Product) then bandwidth would be a
 * ServiceSpecCharacteristic for that particular Service.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceSpecCharacteristic extends IExtensible {

  /**
   * This (optional) field provides a link to the schema describing the value
   * type.
   */
  URI getAtValueSchemaLocation();

  /**
   * If true, the Boolean indicates that the serviceSpecCharacteristic is
   * configurable.
   */
  Boolean getConfigurable();

  /**
   * A narrative that explains in detail what the serviceSpecCharacteristic is.
   */
  String getDescription();

  /**
   * An indicator that specifies that the values for the characteristic can be
   * extended by adding new values when instantiating a characteristic for an
   * Entity.
   */
  Boolean getExtensible();

  /**
   * An indicator that specifies if a value is unique for the specification.
   * Possible values are; "unique while value is in effect" and "unique whether
   * value is in effect or not".
   */
  Boolean getIsUnique();

  /**
   * The maximum number of instances a CharacteristicValue can take on. For
   * example, zero to five phone numbers in a group calling plan, where five is
   * the value for the maxCardinality.
   */
  Integer getMaxCardinality();

  /**
   * The minimum number of instances a CharacteristicValue can take on. For
   * example, zero to five phone numbers in a group calling plan, where zero is
   * the value for the minCardinality.
   */
  Integer getMinCardinality();

  /**
   * A word, term, or phrase by which this characteristic specification is known
   * and distinguished from other characteristic specifications.
   */
  String getName();

  /**
   * A rule or principle represented in regular expression used to derive the
   * value of a characteristic value.
   */
  String getRegex();

  /**
   * A list of resource spec char relationships (ResourceSpecCharRelationship
   * [*]). An aggregation, migration, substitution, dependency or exclusivity
   * relationship between/among Specification Characteristics.
   */
  List<? extends IResourceSpecCharRelationship> getResourceSpecCharRelationships();

  /**
   * A list of resource spec characteristic values
   * (ResourceSpecCharacteristicValue [*]). A ResourceSpecCharacteristicValue
   * object is used to define a set of attributes, each of which can be assigned
   * to a corresponding set of attributes in a ResourceSpecCharacteristic object.
   * The values of the attributes in the ResourceSpecCharacteristicValue object
   * describe the values of the attributes that a corresponding
   * ResourceSpecCharacteristic object can take on.
   */
  List<? extends IResourceSpecCharacteristicValue> getResourceSpecCharacteristicValues();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();

  /**
   * A kind of value that the characteristic can take on, such as numeric, text
   * and so forth.
   */
  String getValueType();
}
