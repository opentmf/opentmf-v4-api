package org.opentmf.tmf680.model;

import java.net.URI;
import org.opentmf.common.model.IExtensible;

/**
 * Describes a specific item contained in a parent element.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-680: Recommendation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IItemRef extends IExtensible {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * Hypertext Reference of the parent element.
   */
  URI getEntityHref();

  /**
   * Unique identifier of the parent element.
   */
  String getEntityId();

  /**
   * Unique identifier of the considered item.
   */
  String getItemId();

  /**
   * Name of the related entity.
   */
  String getName();
}
