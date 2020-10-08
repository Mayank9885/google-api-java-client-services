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
 * Model definition for TestOrderPaymentMethod.
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
public final class TestOrderPaymentMethod extends com.google.api.client.json.GenericJson {

  /**
   * The card expiration month (January = 1, February = 2 etc.).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer expirationMonth;

  /**
   * The card expiration year (4-digit, e.g. 2015).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer expirationYear;

  /**
   * The last four digits of the card number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastFourDigits;

  /**
   * The billing address.
   *
   * Acceptable values are:   - "`dwight`"  - "`jim`"  - "`pam`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String predefinedBillingAddress;

  /**
   * The type of instrument. Note that real orders might have different values than the four values
   * accepted by `createTestOrder`.
   *
   * Acceptable values are:   - "`AMEX`"  - "`DISCOVER`"  - "`MASTERCARD`"  - "`VISA`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The card expiration month (January = 1, February = 2 etc.).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getExpirationMonth() {
    return expirationMonth;
  }

  /**
   * The card expiration month (January = 1, February = 2 etc.).
   * @param expirationMonth expirationMonth or {@code null} for none
   */
  public TestOrderPaymentMethod setExpirationMonth(java.lang.Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

  /**
   * The card expiration year (4-digit, e.g. 2015).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getExpirationYear() {
    return expirationYear;
  }

  /**
   * The card expiration year (4-digit, e.g. 2015).
   * @param expirationYear expirationYear or {@code null} for none
   */
  public TestOrderPaymentMethod setExpirationYear(java.lang.Integer expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

  /**
   * The last four digits of the card number.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastFourDigits() {
    return lastFourDigits;
  }

  /**
   * The last four digits of the card number.
   * @param lastFourDigits lastFourDigits or {@code null} for none
   */
  public TestOrderPaymentMethod setLastFourDigits(java.lang.String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
    return this;
  }

  /**
   * The billing address.
   *
   * Acceptable values are:   - "`dwight`"  - "`jim`"  - "`pam`"
   * @return value or {@code null} for none
   */
  public java.lang.String getPredefinedBillingAddress() {
    return predefinedBillingAddress;
  }

  /**
   * The billing address.
   *
   * Acceptable values are:   - "`dwight`"  - "`jim`"  - "`pam`"
   * @param predefinedBillingAddress predefinedBillingAddress or {@code null} for none
   */
  public TestOrderPaymentMethod setPredefinedBillingAddress(java.lang.String predefinedBillingAddress) {
    this.predefinedBillingAddress = predefinedBillingAddress;
    return this;
  }

  /**
   * The type of instrument. Note that real orders might have different values than the four values
   * accepted by `createTestOrder`.
   *
   * Acceptable values are:   - "`AMEX`"  - "`DISCOVER`"  - "`MASTERCARD`"  - "`VISA`"
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of instrument. Note that real orders might have different values than the four values
   * accepted by `createTestOrder`.
   *
   * Acceptable values are:   - "`AMEX`"  - "`DISCOVER`"  - "`MASTERCARD`"  - "`VISA`"
   * @param type type or {@code null} for none
   */
  public TestOrderPaymentMethod setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public TestOrderPaymentMethod set(String fieldName, Object value) {
    return (TestOrderPaymentMethod) super.set(fieldName, value);
  }

  @Override
  public TestOrderPaymentMethod clone() {
    return (TestOrderPaymentMethod) super.clone();
  }

}
