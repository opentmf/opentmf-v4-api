package org.opentmf.tmf677.model;

import java.util.List;
import org.opentmf.common.model.IEntityRef;

/**
 * Service reference, for when Service is used by other entities.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-677: Usage Consumption Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IUsageConsumptionServiceRef extends IEntityRef {

  /**
   * List of: The consumption counters (called ConsumptionSummary in the SID
   * model) detail for example the different kind of consumption done on the
   * bucket.
   */
  List<? extends IConsumptionSummary> getConsumptionSummaries();
}
