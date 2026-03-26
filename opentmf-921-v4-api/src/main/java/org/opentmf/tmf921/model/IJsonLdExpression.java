package org.opentmf.tmf921.model;


/**
 * JsonLdExpression is the ontology-encoded form of the Intent as specified by
 * JSON-LD expression language.
 *
 * <p><br/>
 * <strong>Required:</strong> @type, expressionLanguage, expressionValue<br/>
 * </p>
 *
 * <p><br/>
 * <strong>Referring TMF artifacts:</strong>
 * <ul>
 *   <li>TMF-921: Intent Management API</li>
 * </ul>
 * </p>
 *
 * @author Gökhan Demir
 */
public interface IJsonLdExpression extends IExpression {

  /**
   * JsonLdExpression is the ontology-encoded form of the Intent as defined in
   * https://www.w3.org/TR/json-ld/. This should be validated against
   * https://raw.githubusercontent.com/json-ld/json-ld.org/main/schemas/jsonld-schema.json.
   */
  String getExpressionValue();
}
