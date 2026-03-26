package org.opentmf.general.model;

import java.net.URI;

/**
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
public interface ITestAgreement {

  /**
   * The agreement name.
   */
  String getName();

  /**
   * The terms of the agreement.
   */
  String getTerms();

  /**
   * The agreement URL.
   */
  URI getUrl();
}
