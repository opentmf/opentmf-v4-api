package org.opentmf.common.model;

import java.time.OffsetDateTime;

/**
 * Synthesized abstract parent for 4 model classes.
 *
 * <p><br/>
 * <strong>Direct descendants:</strong>
 * <ul>
 *   <li>DocumentUpdate (667)</li>
 *   <li>PartyPrivacyProfileSpecificationCreate (644)</li>
 *   <li>PartyPrivacyProfileSpecificationUpdate (644)</li>
 *   <li>ServiceTestSpecificationUpdate (653)</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IDocumentUpdateBase {

  /**
   * free-text description of the document.
   */
  String getDescription();

  /**
   * The date and time the document was last modified. A date and time formatted
   * in compliance with the ISO8601 standard must be used.
   */
  OffsetDateTime getLastUpdate();

  /**
   * A string used to give a name to the document.
   */
  String getName();

  /**
   * A particular form or variety of an artefact that is different from others or
   * from the original. The form represents differences in properties that
   * characterize an artefact, that are not enough to warrant creating a new
   * artefact.
   */
  String getVersion();
}
