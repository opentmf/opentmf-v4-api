package org.opentmf.general.model;

import java.util.List;
import org.opentmf.common.model.IEntity;

/**
 * The base for all Execution resources.
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
public interface IExecution extends IEntity {

  /**
   * Data correlation ID passed in by the API consumer.
   */
  String getDataCorrelationId();

  /**
   * List of: A reference to a managed general test artifact resource.
   */
  List<? extends IGeneralTestArtifactRef> getGeneralTestArtifacts();

  /**
   * Possible values for the state of the execution
   * <br/><p>Recommended values: acknowledged, rejected, pending, inProgress,
   * cancelled, completed, failed.
   */
  String getState();
}
