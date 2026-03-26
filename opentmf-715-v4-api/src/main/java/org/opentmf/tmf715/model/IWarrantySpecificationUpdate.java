package org.opentmf.tmf715.model;

import java.util.List;
import org.opentmf.common.model.IAgreementSpecification;
import org.opentmf.common.model.IAttachmentRefOrValue;
import org.opentmf.common.model.IProductSpecificationRef;
import org.opentmf.common.model.IQuantity;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IResourceSpecificationRef;
import org.opentmf.common.model.IWorkSpecificationUpdateBase;

/**
 * Skipped properties: id,href,lastUpdate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-715: Warranty Management</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IWarrantySpecificationUpdate extends IWorkSpecificationUpdateBase {

  /**
   * Attachments that may be of relevance to this specification, such as picture,
   * document, media.
   */
  List<? extends IAttachmentRefOrValue> getAttachments();

  /**
   * List of: Product specification reference: A ProductSpecification is a
   * detailed description of a tangible or intangible object made available
   * externally in the form of a ProductOffering to customers or other parties
   * playing a party role.
   */
  List<? extends IProductSpecificationRef> getProductSpecs();

  /**
   * Parties who manage or otherwise have an interest in this specification.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * List of: Resources are physical or non-physical components (or some
   * combination of these) within an enterprise's infrastructure or inventory.
   * They are typically consumed or used by services (for example a physical port
   * assigned to a service) or contribute to the realization of a Product (for
   * example, a SIM card). They can be drawn from the Application, Computing and
   * Network domains, and include, for example, Network Elements, software, IT
   * systems, content and information, and technology components.
   * <br/>A ResourceSpecification is an abstract base class for representing a
   * generic means for implementing a particular type of Resource. In essence, a
   * ResourceSpecification defines the common attributes and relationships of a
   * set of related Resources, while Resource defines a specific instance that is
   * based on a particular ResourceSpecification.
   */
  List<? extends IResourceSpecificationRef> getResourceSpecs();

  /**
   * List of: A template of an agreement that can be used when establishing
   * partnerships.
   */
  List<? extends IAgreementSpecification> getWarrantyAgreementSpecifications();

  /**
   * An amount in a given unit.
   */
  IQuantity getWarrantyDuration();

  /**
   * List of: A migration, substitution, dependency or exclusivity relationship
   * between/among entity specifications.
   */
  List<? extends IWarrantySpecificationRelationship> getWarrantySpecRelationships();

  List<? extends IWarrantySpecification> getWarrantySpecifications();
}
