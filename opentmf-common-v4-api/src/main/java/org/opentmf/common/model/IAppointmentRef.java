package org.opentmf.common.model;


/**
 * Refers an appointment, such as a Customer presentation or internal meeting or
 * site visit.
 *
 * <p><br/>
 * <strong>Required:</strong> id<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-622: Product Ordering Management API</li>
 *   <li>TMF-641: Service Ordering Management API</li>
 *   <li>TMF-648: Quote Management API</li>
 *   <li>TMF-652: Resource Order Management API</li>
 *   <li>TMF-713: Work Management</li>
 *   <li>TMF-714: Work Qualification Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IAppointmentRef extends IEntity {

  /**
   * The actual type of the target instance when needed for disambiguation.
   */
  String getAtReferredType();

  /**
   * An explanatory text regarding the appointment made with a party.
   */
  String getDescription();
}
