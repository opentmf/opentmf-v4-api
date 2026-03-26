package org.opentmf.tmf645.model;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * QueryServiceQualification is used to retrieve a list of services that are
 * technically available in the context of the interaction (place, party,
 * service characteristics, ...).
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-645: Service Qualification Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IQueryServiceQualification extends IServiceQualification {

  /**
   * Date when the serviceQualification was submitted.
   */
  OffsetDateTime getQueryServiceQualificationDate();

  /**
   * A ServiceQualificationItem relates to a specific service being checked in a
   * qualification operation.
   */
  IServiceQualificationItem getSearchCriteria();

  /**
   * A list of service qualification items.
   */
  List<? extends IServiceQualificationItem> getServiceQualificationItems();
}
