package org.opentmf.general.model;

import java.util.List;
import org.opentmf.common.model.IExtensible;

/**
 * Synthesized abstract parent for 11 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>AbstractEnvironmentUpdate (705)</li>
 *   <li>ConcreteEnvironmentMetaModelUpdate (705)</li>
 *   <li>GeneralTestArtifactUpdate (710)</li>
 *   <li>NonFunctionalTestModelUpdate (704)</li>
 *   <li>ProvisioningArtifactUpdate (705)</li>
 *   <li>TestCaseUpdate (704)</li>
 *   <li>TestDataInstanceUpdate (706)</li>
 *   <li>TestDataSchemaUpdate (706)</li>
 *   <li>TestResourceAPIUpdate (705)</li>
 *   <li>TestScenarioUpdate (709)</li>
 *   <li>TestSuiteUpdate (704)</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUpdateBase extends IExtensible {

  List<? extends IAttribute> getAttributes();

  /**
   * The description for the artifact.
   */
  String getDescription();

  /**
   * Possible values for the state of a managed artifact: 'incomplete', 'beta',
   * 'stable', 'deprecated'
   * <br/><p>Recommended values: incomplete, beta, stable, deprecated.
   */
  String getState();

  /**
   * The artifact version description.
   */
  String getVersionDescription();
}
