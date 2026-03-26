package org.opentmf.common.model;

import java.util.List;

/**
 * Synthesized abstract parent for 5 model classes.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-638: Service Inventory Management API</li>
 *   <li>TMF-640: Service Activation Management API</li>
 *   <li>TMF-715: Warranty Management</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWarrantyBase extends IExtensible {

  /**
   * Free-text description of the service.
   */
  String getDescription();

  /**
   * If true, the service is a ServiceBundle which regroup a service hierarchy. If
   * false, the service is a 'atomic' service (hierarchy leaf).
   */
  Boolean getIsBundle();

  /**
   * Name of the service.
   */
  String getName();

  /**
   * A list of notes made on this service.
   */
  List<? extends INote> getNotes();

  /**
   * Valid values for the lifecycle state of the service
   * <br/><p>Recommended values: feasibilityChecked, designed, reserved, inactive,
   * active, terminated.
   */
  String getState();
}
