package org.opentmf.tmf710.model;

import java.util.List;
import org.opentmf.common.model.IRelatedPartyWithContactInfo;
import org.opentmf.general.model.ITestAgreement;
import org.opentmf.general.model.IUpdateBase;

/**
 * A managed general test artifact resource
 * <br/>Skipped properties: id,href,version.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-710: General Test Artifact Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGeneralTestArtifactUpdate extends IUpdateBase {

  ITestAgreement getAgreement();

  /**
   * General test artifact definition.
   */
  IGeneralTestArtifactDefinition getGeneralArtifactDefinition();

  /**
   * List of: Related party specialization that includes contact information.
   */
  List<? extends IRelatedPartyWithContactInfo> getRelatedParties();
}
