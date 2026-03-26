package org.opentmf.resource.model;

import java.util.List;
import org.opentmf.common.model.IFeatureRelationship;

/**
 * A migration, substitution, dependency or exclusivity relationship
 * between/among resource specifications.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-634: Resource Catalog Management API</li>
 *   <li>TMF-730: Software And Compute Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IResourceSpecificationRelationship extends IFeatureRelationship {

  /**
   * A characteristic that refines the relationship. For example, consider the
   * relationship between a slot and a card. For a half-height card it is
   * important to know the position at which the card is inserted, so a
   * characteristic Position might be defined on the relationship to allow
   * capturing of this in the inventory.
   */
  List<? extends IResourceSpecificationCharacteristic> getCharacteristics();

  /**
   * The default number of the related resource that should be instantiated, for
   * example a rack would typically have 4 cards, although it could support more.
   */
  Integer getDefaultQuantity();

  /**
   * The maximum number of the related resource that should be instantiated, for
   * example a rack supports a maximum of 16 cards.
   */
  Integer getMaximumQuantity();

  /**
   * The minimum number of the related resource that should be instantiated, for
   * example a rack must have at least 1 card.
   */
  Integer getMinimumQuantity();

  /**
   * The association role for this resource specification.
   */
  String getRole();
}
