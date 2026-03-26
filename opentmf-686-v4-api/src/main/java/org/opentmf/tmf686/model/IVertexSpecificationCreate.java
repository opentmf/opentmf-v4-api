package org.opentmf.tmf686.model;

import java.util.List;
import org.opentmf.common.model.IAssociationCreateBase;
import org.opentmf.common.model.IRelatedParty;

/**
 * A Vertex is connected by directed Edges to other vertices in a Graph.
 * <br/>A VertexSpecification is a base class that represents a generic means
 * for implementing a particular type of Vertex. In essence, a
 * VertexSpecification defines the common attributes and relationships of a set
 * of related Vertices, while Vertex defines a specific instance that is based
 * on a particular VertexSpecification.
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
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
public interface IVertexSpecificationCreate extends IAssociationCreateBase {

  /**
   * A related party defines party or party role linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A characteristic quality or distinctive feature of a VertexSpecification.
   */
  List<? extends IVertexSpecificationCharacteristic> getVertexSpecCharacteristics();
}
