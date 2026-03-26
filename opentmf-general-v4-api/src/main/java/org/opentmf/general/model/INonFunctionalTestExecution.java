package org.opentmf.general.model;

/**
 * REST resource for the non-functional test execution lifecycle.
 *
 * <p><br/>
 * <strong>Required:</strong> testEnvironmentProvisioningExecution<br/>
 * </p>
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
public interface INonFunctionalTestExecution extends ITestExecution {

  /**
   * A reference to a managed non-functional test model resource.
   */
  INonFunctionalTestModelRef getNonFunctionalTestModel();
}
