package org.opentmf.tmf686.model;

import java.net.URI;
import org.opentmf.common.model.IExtensible;

/**
 * Graph vertex collection reference.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-686: Topology API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IVertexCollectionRef extends IExtensible {

  /**
   * The type of the referred entity.
   */
  URI getAtReferredType();

  /**
   * Hyperlink reference.
   */
  URI getHref();
}
