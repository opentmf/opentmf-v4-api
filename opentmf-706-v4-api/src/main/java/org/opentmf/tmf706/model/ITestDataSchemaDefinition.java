package org.opentmf.tmf706.model;

import org.opentmf.common.model.IAttachment;

/**
 * Test data schema definition.
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
public interface ITestDataSchemaDefinition extends IAttachment {

  /**
   * The test data schema code.
   */
  String getCode();
}
