package org.opentmf.tmf713.model;

import java.time.OffsetDateTime;

/**
 * Definition of the nature of a Work Unit. For example, could be wiring,
 * equipment installation, etc.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-713: Work Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWorkSpecificationCreate extends IWorkSpecificationUpdate {

  /**
   * Date and time of the last update of the specification.
   */
  OffsetDateTime getLastUpdate();
}
