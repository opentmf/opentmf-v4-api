package org.opentmf.tmf649.model;

import java.util.List;
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
public interface IMonthlyScheduleDayOfWeekDefinition extends IExtensible {

  List<? extends IDayOfMonthRecurrence> getDayOfMonthRecurrences();

  String getRecurringDaySequence();
}
