package org.opentmf.tmf717.model;

import java.util.List;
import org.opentmf.common.model.ICustomer360ProductValueVO;
import org.opentmf.customer.model.ICustomer;

/**
 *
 * <p><br/>
 * <strong>Required:</strong> engagedParty<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-717: Customer360 Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface ICustomer360 extends ICustomer {

  /**
   * List of: An Appointment is an arrangement to do something or meet someone at
   * a particular time, at a place (for face to face appointment) or in a contact
   * medium (for phone appointment).
   */
  List<? extends ICustomer360AppointmentVO> getAppointments();

  /**
   * List of: The customer bill. Can be a regular recurring bill or an extra bill
   * on demand by the customer or the csp.
   */
  List<? extends ICustomer360CustomerBillVO> getCustomerBills();

  /**
   * ID of Referred Customer.
   */
  String getCustomerId();

  /**
   * Customer Reference.
   */
  String getCustomerRef();

  List<? extends ICustomer360PartyInteractionVO> getInteractionItems();

  /**
   * List of: A loyalty balance, containing a balance unit and value.
   */
  List<? extends ICustomer360LoyaltyBalanceVO> getLoyaltyBalances();

  /**
   * List of: A Product Order is a type of order which can be used to place an
   * order between a customer and a service provider or between a service provider
   * and a partner and vice versa.
   */
  List<? extends ICustomer360ProductOrderVO> getProductOrders();

  /**
   * List of: A product offering procured by a customer or other interested party
   * playing a party role. A product is realized as one or more service(s) and /
   * or resource(s).
   */
  List<? extends ICustomer360ProductValueVO> getProductValues();

  /**
   * List of: Promotion Resource is used to provide the additional discount,
   * voucher, bonus or gift to the customer who meets the pre-defined criteria.
   * Using promotion, the enterprise is able to attract the users and encourage
   * more consumption, especially continuous purchases.  Normally Promotion is not
   * regarded as one type of product or product offering. It is often applied when
   * the customer buys the product offerings with the price or amount surpassing
   * the certain limit.
   */
  List<? extends ICustomer360PromotionVO> getPromotions();

  /**
   * List of: Quote can be used to negotiate service and product acquisition or
   * modification between a customer and a service provider. Quote contain list of
   * quote items, a reference to customer (partyRole), a list of productOffering
   * and attached prices and conditions.
   */
  List<? extends ICustomer360QuoteVO> getQuotes();

  /**
   * List of: Recommendation API is used to recommend offering quickly based on
   * the history and real-time context of customer. It is a real-time and
   * personalized recommendation API. It is usually provided by e-commerce or BSS,
   * CRM system in omni-channel.
   */
  List<? extends ICustomer360RecommendationVO> getRecommendations();

  /**
   * List of: The problem information for Middle B which is abstracted in the
   * service layer from the issued event information by First B.
   */
  List<? extends ICustomer360ServiceProblemVO> getServiceProblems();

  /**
   * List of: A trouble ticket is a record of an issue that is created, tracked,
   * and managed by a trouble ticket management system.
   */
  List<? extends ICustomer360TroubleTicketVO> getTroubleTickets();
}
