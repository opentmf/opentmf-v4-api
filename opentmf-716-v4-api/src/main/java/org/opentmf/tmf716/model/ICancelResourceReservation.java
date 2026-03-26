package org.opentmf.tmf716.model;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> resourceReservation<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-716: ResourceReservation</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICancelResourceReservation extends ICancelReservation {

  IResourceReservationRef getResourceReservation();
}
