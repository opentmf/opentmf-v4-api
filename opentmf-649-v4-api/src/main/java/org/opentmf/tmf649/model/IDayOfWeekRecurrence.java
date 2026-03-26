package org.opentmf.tmf649.model;

import java.time.OffsetDateTime;
import org.opentmf.common.model.IExtensible;

/**
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-649: Performance Thresholding Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDayOfWeekRecurrence extends IExtensible {

  OffsetDateTime getDates();
}
