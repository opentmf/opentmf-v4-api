package org.opentmf.tmf716.model;

import java.util.List;

/**
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
public interface IResourceReservation extends IReservation {

  List<? extends IResourceReservationItem> getReservationItems();
}
