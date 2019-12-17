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

package com.google.api.services.iamcredentials.v1.model;

/**
 * Model definition for GenerateIdTokenRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the IAM Service Account Credentials API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenerateIdTokenRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The audience for the token, such as the API or account that this token grants access
   * to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audience;

  /**
   * The sequence of service accounts in a delegation chain. Each service account must be granted
   * the `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The
   * last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator`
   * role on the service account that is specified in the `name` field of the request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is
   * required; replacing it with a project ID is invalid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> delegates;

  /**
   * Include the service account email in the token. If set to `true`, the token will contain
   * `email` and `email_verified` claims.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeEmail;

  /**
   * Required. The audience for the token, such as the API or account that this token grants access
   * to.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudience() {
    return audience;
  }

  /**
   * Required. The audience for the token, such as the API or account that this token grants access
   * to.
   * @param audience audience or {@code null} for none
   */
  public GenerateIdTokenRequest setAudience(java.lang.String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * The sequence of service accounts in a delegation chain. Each service account must be granted
   * the `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The
   * last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator`
   * role on the service account that is specified in the `name` field of the request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is
   * required; replacing it with a project ID is invalid.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDelegates() {
    return delegates;
  }

  /**
   * The sequence of service accounts in a delegation chain. Each service account must be granted
   * the `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The
   * last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator`
   * role on the service account that is specified in the `name` field of the request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is
   * required; replacing it with a project ID is invalid.
   * @param delegates delegates or {@code null} for none
   */
  public GenerateIdTokenRequest setDelegates(java.util.List<java.lang.String> delegates) {
    this.delegates = delegates;
    return this;
  }

  /**
   * Include the service account email in the token. If set to `true`, the token will contain
   * `email` and `email_verified` claims.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeEmail() {
    return includeEmail;
  }

  /**
   * Include the service account email in the token. If set to `true`, the token will contain
   * `email` and `email_verified` claims.
   * @param includeEmail includeEmail or {@code null} for none
   */
  public GenerateIdTokenRequest setIncludeEmail(java.lang.Boolean includeEmail) {
    this.includeEmail = includeEmail;
    return this;
  }

  @Override
  public GenerateIdTokenRequest set(String fieldName, Object value) {
    return (GenerateIdTokenRequest) super.set(fieldName, value);
  }

  @Override
  public GenerateIdTokenRequest clone() {
    return (GenerateIdTokenRequest) super.clone();
  }

}
