package org.opentmf.tmf716.model;

import java.util.List;
import org.opentmf.common.model.IResourceRefOrValue;

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
public interface IResourceReservationItem extends IReservationItem {

  List<? extends IResourceReservationItem> getReservationItems();

  /**
   * Resource is an abstract entity that describes the common set of attributes
   * shared by all concrete resources. The polymorphic attributes {@literal @}type,
   * {@literal @}schemaLocation & {@literal @}referredType are related to the Resource entity and not
   * the related ResourceRefOrValue class itself.
   */
  IResourceRefOrValue getResource();
}
