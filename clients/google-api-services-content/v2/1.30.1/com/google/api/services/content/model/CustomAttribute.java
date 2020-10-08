/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.content.model;

/**
 * Model definition for CustomAttribute.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomAttribute extends com.google.api.client.json.GenericJson {

  /**
   * The name of the attribute. Underscores will be replaced by spaces upon insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The type of the attribute.
   *
   * Acceptable values are:   - "`boolean`"  - "`datetimerange`"  - "`float`"  - "`group`"  -
   * "`int`"  - "`price`"  - "`text`"  - "`time`"  - "`url`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Free-form unit of the attribute. Unit can only be used for values of type int, float, or price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * The value of the attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The name of the attribute. Underscores will be replaced by spaces upon insertion.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the attribute. Underscores will be replaced by spaces upon insertion.
   * @param name name or {@code null} for none
   */
  public CustomAttribute setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The type of the attribute.
   *
   * Acceptable values are:   - "`boolean`"  - "`datetimerange`"  - "`float`"  - "`group`"  -
   * "`int`"  - "`price`"  - "`text`"  - "`time`"  - "`url`"
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the attribute.
   *
   * Acceptable values are:   - "`boolean`"  - "`datetimerange`"  - "`float`"  - "`group`"  -
   * "`int`"  - "`price`"  - "`text`"  - "`time`"  - "`url`"
   * @param type type or {@code null} for none
   */
  public CustomAttribute setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Free-form unit of the attribute. Unit can only be used for values of type int, float, or price.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * Free-form unit of the attribute. Unit can only be used for values of type int, float, or price.
   * @param unit unit or {@code null} for none
   */
  public CustomAttribute setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * The value of the attribute.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The value of the attribute.
   * @param value value or {@code null} for none
   */
  public CustomAttribute setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public CustomAttribute set(String fieldName, Object value) {
    return (CustomAttribute) super.set(fieldName, value);
  }

  @Override
  public CustomAttribute clone() {
    return (CustomAttribute) super.clone();
  }

}
