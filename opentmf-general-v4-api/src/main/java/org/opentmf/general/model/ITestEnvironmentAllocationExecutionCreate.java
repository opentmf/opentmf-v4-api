package org.opentmf.general.model;

import java.net.URI;
import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * REST resource for test environment allocation lifecycle
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> resourceManagerUrl<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-708: Test Execution Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestEnvironmentAllocationExecutionCreate extends IExtensible {

  /**
   * A reference to a managed test abstract environment resource.
   */
  IAbstractEnvironmentRef getAbstractEnvironment();

  /**
   * List of: Individual mapping from an abstract resource to a list of concrete
   * resources.
   */
  List<? extends IConcreteResourceMapping> getConcreteResourceMappings();

  /**
   * Data correlation ID passed in by the API consumer.
   */
  String getDataCorrelationId();

  /**
   * List of: A reference to a managed general test artifact resource.
   */
  List<? extends IGeneralTestArtifactRef> getGeneralTestArtifacts();

  URI getResourceManagerUrl();

  /**
   * Possible values for the state of the execution
   * <br/><p>Recommended values: acknowledged, rejected, pending, inProgress,
   * cancelled, completed, failed.
   */
  String getState();

  /**
   * A reference to a managed test scenario resource.
   */
  ITestScenarioRef getTestScenario();
}
