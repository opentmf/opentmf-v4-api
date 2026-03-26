package org.opentmf.tmf701.model;

import org.opentmf.common.model.IRelatedEntityRefOrValue;

/**
 * A reference to an entity specification, where the type of the entity
 * specification is not known in advance.
 *
 * <p><br/>
 * <strong>Required:</strong> @referredType, id, role<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-701: Process Flow Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRelatedEntitySpecification extends IRelatedEntityRefOrValue {

  /**
   * EntitySpecification version.
   */
  String getVersion();
}
