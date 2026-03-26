package org.opentmf.tmf908.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-908: IoT Agent and Device Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IGSMACommons extends IExtensible {

  String getAlternateName();

  String getDataProvider();

  OffsetDateTime getDateCreated();

  OffsetDateTime getDateModified();

  String getDescription();

  String getName();

  String getSource();
}
