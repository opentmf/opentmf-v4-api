package org.opentmf.tmf645.model;

/**
 * The event data structure.
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
public interface IQueryServiceQualificationDeleteEventPayload {

  /**
   * QueryServiceQualification is used to retrieve a list of services that are
   * technically available in the context of the interaction (place, party,
   * service characteristics, ...).
   */
  IQueryServiceQualification getQueryServiceQualification();
}
