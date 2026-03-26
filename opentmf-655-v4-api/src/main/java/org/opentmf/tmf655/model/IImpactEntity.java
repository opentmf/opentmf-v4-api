package org.opentmf.tmf655.model;

import org.opentmf.common.model.IRelatedEntityRefOrValue;

/**
 * A reference to an imapcted entity.
 *
 * <p><br/>
 * <strong>Required:</strong> @referredType, id, role<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-655: Change Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IImpactEntity extends IRelatedEntityRefOrValue {

  /**
   * The action on an entity.
   */
  String getAction();
}
