package org.opentmf.tmf705.model;

import java.util.List;
import org.opentmf.common.model.IRelatedPartyWithContactInfo;
import org.opentmf.general.model.ITestAgreement;
import org.opentmf.general.model.IUpdateBase;

/**
 * A managed concrete environment resource metamodel resource
 * <br/>Skipped properties: id,href,version.
 *
 * <p><br/>
 * <strong>Required:</strong> concreteEnvironmentMetaModelDefinition<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-705: Test Environment Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IConcreteEnvironmentMetaModelUpdate extends IUpdateBase {

  ITestAgreement getAgreement();

  /**
   * Test environment metamodel definition.
   */
  IConcreteEnvironmentMetaModelDefinition getConcreteEnvironmentMetaModelDefinition();

  /**
   * List of: Related party specialization that includes contact information.
   */
  List<? extends IRelatedPartyWithContactInfo> getRelatedParties();
}
