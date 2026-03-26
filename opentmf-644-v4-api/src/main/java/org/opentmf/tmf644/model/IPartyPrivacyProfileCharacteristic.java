package org.opentmf.tmf644.model;

import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IRelatedParty;

/**
 * A characteristic for an instantiated party profile, where the value indicates
 * the allowed use of the characteristic.
 *
 * <p><br/>
 * <strong>Required:</strong> name, value<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-644: Privacy Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IPartyPrivacyProfileCharacteristic extends ICharacteristic {

  /**
   * Defines the purpose authorized or refused for the characteristic (e.g. ADMIN,
   * INFORMATION, MARKETING, RESEARCH, etc.
   */
  String getPrivacyUsagePurpose();

  /**
   * A list of parties to which the allowed use of the characteristic applies.
   */
  List<? extends IRelatedParty> getRelatedParties();
}
