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

package com.google.api.services.jobs.v3p1beta1.model;

/**
 * The report event request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateClientEventRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Events issued when end user interacts with customer's application that uses Cloud
   * Talent Solution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClientEvent clientEvent;

  /**
   * Required. Events issued when end user interacts with customer's application that uses Cloud
   * Talent Solution.
   * @return value or {@code null} for none
   */
  public ClientEvent getClientEvent() {
    return clientEvent;
  }

  /**
   * Required. Events issued when end user interacts with customer's application that uses Cloud
   * Talent Solution.
   * @param clientEvent clientEvent or {@code null} for none
   */
  public CreateClientEventRequest setClientEvent(ClientEvent clientEvent) {
    this.clientEvent = clientEvent;
    return this;
  }

  @Override
  public CreateClientEventRequest set(String fieldName, Object value) {
    return (CreateClientEventRequest) super.set(fieldName, value);
  }

  @Override
  public CreateClientEventRequest clone() {
    return (CreateClientEventRequest) super.clone();
  }

}
