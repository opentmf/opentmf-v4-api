package org.opentmf.tmf686.model;

import java.util.List;
import org.opentmf.common.model.IAssociationCreateBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * A directed Edge connects Vertices in a Graph.
 * <br/>An EdgeSpecification is a base class that represents a generic means for
 * implementing a particular type of Edge. In essence, an EdgeSpecification
 * defines the common attributes and relationships of a set of related Edges,
 * while Edge defines a specific instance that is based on a particular
 * EdgeSpecification.
 * <br/>Skipped properties: id,href.
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
public interface IEdgeSpecificationUpdate extends IAssociationCreateBase {

  /**
   * A characteristic quality or distinctive feature of an EdgeSpecification.
   */
  List<? extends IEdgeSpecificationCharacteristic> getEdgeSpecCharacteristics();

  /**
   * A related party defines party or party role linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();
}
