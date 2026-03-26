package org.opentmf.general.model;

import java.util.List;
import org.opentmf.common.model.IEntity;

/**
 * Individual mapping from an abstract resource to a list of concrete resources.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-707: Test Result Management API</li>
 *   <li>TMF-708: Test Execution Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IConcreteResourceMapping extends IEntity {

  String getAbstractResource();

  List<? extends IConcreteResource> getConcreteResources();
}
