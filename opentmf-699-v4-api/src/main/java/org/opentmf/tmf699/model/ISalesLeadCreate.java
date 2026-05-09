package org.opentmf.tmf699.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.opentmf.common.model.ICategoryRef;
import org.opentmf.common.model.IChannelRef;
import org.opentmf.common.model.IContactMedium;
import org.opentmf.common.model.IExtensible;
import org.opentmf.common.model.IMarketSegmentRef;
import org.opentmf.common.model.IMarketingCampaignRef;
import org.opentmf.common.model.IMoney;
import org.opentmf.common.model.INote;
import org.opentmf.common.model.IProductOfferingRef;
import org.opentmf.common.model.IProductRef;
import org.opentmf.common.model.IProductSpecificationRef;
import org.opentmf.common.model.IRelatedParty;
import org.opentmf.common.model.ISalesOpportunityRef;
import org.opentmf.common.model.ITimePeriod;

/**
 * A Sales Lead is the identification of a person or organization that has an
 * interest in the goods and/or services provided in the prospect of them
 * becoming Customers with one or more Subscriptions.
 * <br/>Skipped properties: id,href,status,creationDate,statusChangeDate.
 *
 * <p><br/>
 * <strong>Required:</strong> name<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-699: Sales Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ISalesLeadCreate extends IExtensible {

  /**
   * The category for grouping recommendations.
   */
  ICategoryRef getCategory();

  /**
   * The channel to which the resource reference to. e.g. channel for selling
   * product offerings, channel for opening a trouble ticket etc..
   */
  IChannelRef getChannel();

  /**
   * Unique description of the salesLead.
   */
  String getDescription();

  /**
   * A base / value business entity used to represent money.
   */
  IMoney getEstimatedRevenue();

  /**
   * provides references to the corresponding market segment as target of product
   * offerings. A market segment is grouping of Parties, GeographicAreas,
   * SalesChannels, and so forth.
   */
  IMarketSegmentRef getMarketSegment();

  /**
   * MarketingCampaign reference. Marketing campaign represents the
   * carrier-initiated marketing activity which aims at the better recognition
   * about its brand and offerings by the market.
   */
  IMarketingCampaignRef getMarketingCampaign();

  /**
   * Name of the salesLead.
   */
  String getName();

  /**
   * List of: Extra information about a given entity.
   */
  List<? extends INote> getNotes();

  /**
   * Urgency of working this salesLead
   * <br/><p>Recommended values: low, medium, high.
   */
  String getPriority();

  IProductRef getProduct();

  /**
   * ProductOffering reference. A product offering represents entities that are
   * orderable from the provider of the catalog, this resource includes pricing
   * information.
   */
  IProductOfferingRef getProductOffering();

  /**
   * Product specification reference: A ProductSpecification is a detailed
   * description of a tangible or intangible object made available externally in
   * the form of a ProductOffering to customers or other parties playing a party
   * role.
   */
  IProductSpecificationRef getProductSpecification();

  /**
   * List of: Indicates the contact medium that could be used to contact the
   * party.
   */
  List<? extends IContactMedium> getProspectContacts();

  /**
   * Identifies the potential of a salesLead for becoming a sale. Usual ratings
   * for qualified leads are: hot, warm, cold.
   */
  String getRating();

  /**
   * Date when the prospect information was received (for example, from a trade
   * show).
   */
  OffsetDateTime getReferredDate();

  /**
   * List of: Related Party reference. A related party defines party or party role
   * linked to a specific entity.
   */
  List<? extends IRelatedParty> getRelatedParties();

  /**
   * Sales Opportunity is an 'opportunity' to generate revenue from a Sales
   * Account or Sales Lead. Opportunities are the pending deals that need to be
   * tracked and on which Sales Team plans and executes Sales Activities (Events
   * and Tasks).
   */
  ISalesOpportunityRef getSalesOpportunity();

  /**
   * Reason why the status has changed.
   */
  String getStatusChangeReason();

  /**
   * Indicates the nature of the salesLead.
   */
  String getType();

  /**
   * A period of time, either as a deadline (endDateTime only) a startDateTime
   * only, or both.
   */
  ITimePeriod getValidFor();
}
