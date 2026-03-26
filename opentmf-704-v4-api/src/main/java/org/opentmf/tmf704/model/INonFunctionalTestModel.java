package org.opentmf.tmf704.model;

import org.opentmf.general.model.IManagedArtifact;

/**
 * A managed non-functional test model resource.
 *
 * <p><br/>
 * <strong>Required:</strong> nonFunctionalTestModelDefinition<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-704: Test Case Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface INonFunctionalTestModel extends IManagedArtifact {

  /**
   * Non-functional test model definition.
   */
  INonFunctionalTestModelDefinition getNonFunctionalTestModelDefinition();
}
