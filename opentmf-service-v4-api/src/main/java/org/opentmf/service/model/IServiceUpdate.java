package org.opentmf.service.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.ICharacteristic;
import org.opentmf.common.model.IFeature;
import org.opentmf.common.model.IRelatedEntityRefOrValue;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.IRelatedPlaceRefOrValue;
import org.opentmf.common.model.IRelatedServiceOrderItem;
import org.opentmf.common.model.IResourceRef;
import org.opentmf.common.model.IServiceRefOrValue;
import org.opentmf.common.model.IServiceRelationship;
import org.opentmf.common.model.IServiceSpecificationRef;
import org.opentmf.common.model.IWarrantyBase;

/**
 * Service is a base class for defining the Service hierarchy. All Services are
 * characterized as either being possibly visible and usable by a Customer or
 * not. This gives rise to the two subclasses of Service: CustomerFacingService
 * and ResourceFacingService.
 * <br/>Skipped properties: id,href,serviceDate.
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-638: Service Inventory Management API</li>
 *   <li>TMF-640: Service Activation Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IServiceUpdate extends IWarrantyBase {

  /**
   * Is it a customer facing or resource facing service.
   */
  String getCategory();

  /**
   * Date when the service ends.
   */
  OffsetDateTime getEndDate();

  /**
   * A list of feature associated with this service.
   */
  List<? extends IFeature> getFeatures();

  /**
   * If TRUE, this Service has already been started.
   */
  Boolean getHasStarted();

  /**
   * If FALSE and hasStarted is FALSE, this particular Service has NOT been
   * enabled for use - if FALSE and hasStarted is TRUE then the service has
   * failed.
   */
  Boolean getIsServiceEnabled();

  /**
   * If TRUE, this Service can be changed without affecting any other services.
   */
  Boolean getIsStateful();

  /**
   * A list of places (Place [*]). Used to define a place useful for the service
   * (for example a geographical place where the service is installed).
   */
  List<? extends IRelatedPlaceRefOrValue> getPlaces();

  /**
   * A list of related entity in relationship with this service.
   */
  List<? extends IRelatedEntityRefOrValue> getRelatedEntities();

  /**
   * A list of related party references (RelatedParty [*]). A related party
   * defines party or party role linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * A list of characteristics that characterize this service
   * (ServiceCharacteristic [*]).
   */
  List<? extends ICharacteristic> getServiceCharacteristics();

  /**
   * A list of service order items related to this service.
   */
  List<? extends IRelatedServiceOrderItem> getServiceOrderItems();

  /**
   * A list of service relationships (ServiceRelationship [*]). Describes links
   * with other service(s) in the inventory (useful for describing relies-on,
   * relies-from between CFS for example).
   */
  List<? extends IServiceRelationship> getServiceRelationships();

  /**
   * Service specification reference: ServiceSpecification(s) required to realize
   * a ProductSpecification.
   */
  IServiceSpecificationRef getServiceSpecification();

  /**
   * Business type of the service.
   */
  String getServiceType();

  /**
   * Date when the service starts.
   */
  OffsetDateTime getStartDate();

  /**
   * This attribute is an enumerated integer that indicates how the Service is
   * started, such as: 0: Unknown; 1: Automatically by the managed environment; 2:
   * Automatically by the owning device; 3: Manually by the Provider of the
   * Service; 4: Manually by a Customer of the Provider; 5: Any of the above.
   */
  String getStartMode();

  /**
   * A list of supporting resources (SupportingResource [*]).Note: only Service of
   * type RFS can be associated with Resources.
   */
  List<? extends IResourceRef> getSupportingResources();

  /**
   * A list of supporting services (SupportingService [*]). A collection of
   * services that support this service (bundling, link CFS to RFS).
   */
  List<? extends IServiceRefOrValue> getSupportingServices();
}
