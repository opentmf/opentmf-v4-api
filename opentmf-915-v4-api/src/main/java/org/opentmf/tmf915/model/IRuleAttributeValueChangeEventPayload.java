package org.opentmf.tmf915.model;

import org.opentmf.common.model.IRule;

/**
 * The event data structure.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IRuleAttributeValueChangeEventPayload {

  IRule getRule();
}
