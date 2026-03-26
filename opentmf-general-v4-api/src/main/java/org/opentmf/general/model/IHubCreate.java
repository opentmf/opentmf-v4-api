package org.opentmf.general.model;

import java.net.URI;
import org.opentmf.common.model.IExtensible;

/**
 * A Hub is used to subscribe to an event notification
 * <br/>Skipped properties: id,href.
 *
 * <p><br/>
 * <strong>Required:</strong> callback<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-688: Event Management API</li>
 *   <li>TMF-915: AI Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IHubCreate extends IExtensible {

  /**
   * The URI that will be POSTed to when a notification is triggered.
   */
  URI getCallback();

  /**
   * This is a query string used to filter notifications in the context of the
   * notifier.
   */
  String getQuery();
}
