package org.opentmf.tmf713.model;

import java.net.URI;

/**
 * Definition of the nature of a Work Unit. For example, could be wiring,
 * equipment installation, etc.
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
public interface IWorkSpecification extends IWorkSpecificationCreate {

  /**
   * Hyperlink reference.
   */
  URI getHref();

  /**
   * unique identifier.
   */
  String getId();
}
