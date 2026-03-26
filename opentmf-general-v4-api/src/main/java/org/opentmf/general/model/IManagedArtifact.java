package org.opentmf.general.model;

import java.util.List;
import org.opentmf.common.model.IEntity;
import org.opentmf.common.model.IRelatedPartyWithContactInfo;

/**
 * General information about a managed artifact.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-704: Test Case Management API</li>
 *   <li>TMF-705: Test Environment Management API</li>
 *   <li>TMF-706: Test Data Management API</li>
 *   <li>TMF-709: Test Scenario Management API</li>
 *   <li>TMF-710: General Test Artifact Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IManagedArtifact extends IEntity {

  ITestAgreement getAgreement();

  List<? extends IAttribute> getAttributes();

  /**
   * The description for the artifact.
   */
  String getDescription();

  /**
   * List of: Related party specialization that includes contact information.
   */
  List<? extends IRelatedPartyWithContactInfo> getRelatedParties();

  /**
   * Possible values for the state of a managed artifact: 'incomplete', 'beta',
   * 'stable', 'deprecated'
   * <br/><p>Recommended values: incomplete, beta, stable, deprecated.
   */
  String getState();

  /**
   * The artifact version.
   */
  String getVersion();

  /**
   * The artifact version description.
   */
  String getVersionDescription();
}
