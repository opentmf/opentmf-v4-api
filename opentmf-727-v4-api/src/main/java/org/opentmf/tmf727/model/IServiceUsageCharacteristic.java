package org.opentmf.tmf727.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristicRelationship;
import org.opentmf.common.model.IExtensible;

/**
 * Provides the value of a given characteristic.
 *
 * <p><br/>
 * <strong>Required:</strong> name, value<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-727: Service Usage Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceUsageCharacteristic extends IExtensible {

  /**
   * List of: Another Characteristic that is related to the current
   * Characteristic;.
   */
  List<? extends ICharacteristicRelationship> getCharacteristicRelationships();

  /**
   * Unique identifier of the characteristic.
   */
  String getId();

  /**
   * Name of the characteristic.
   */
  String getName();

  Object getValue();

  /**
   * Data type of the value of the characteristic.
   */
  String getValueType();
}
