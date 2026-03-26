package org.opentmf.tmf706.model;

import java.util.List;
import org.opentmf.common.model.IRelatedPartyWithContactInfo;
import org.opentmf.general.model.ITestAgreement;
import org.opentmf.general.model.IUpdateBase;

/**
 * A managed test data schema resource
 * <br/>Skipped properties: id,href,version.
 *
 * <p><br/>
 * <strong>Required:</strong> testDataSchemaDefinition<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-706: Test Data Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ITestDataSchemaUpdate extends IUpdateBase {

  ITestAgreement getAgreement();

  /**
   * List of: Related party specialization that includes contact information.
   */
  List<? extends IRelatedPartyWithContactInfo> getRelatedParties();

  /**
   * Test data schema definition.
   */
  ITestDataSchemaDefinition getTestDataSchemaDefinition();
}
