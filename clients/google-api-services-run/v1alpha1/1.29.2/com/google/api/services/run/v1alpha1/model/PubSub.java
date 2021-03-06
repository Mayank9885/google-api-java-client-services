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

package com.google.api.services.run.v1alpha1.model;

/**
 * Model definition for PubSub.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PubSub extends com.google.api.client.json.GenericJson {

  /**
   * The API version for this call such as "events.cloud.google.com/v1alpha1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * The kind of resource, in this case "PubSub".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metadata associated with this PubSub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ObjectMeta metadata;

  /**
   * Spec defines the desired state of the PubSub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PubSubSpec spec;

  /**
   * Status represents the current state of the PubSub. This data may be out of date. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PubSubStatus status;

  /**
   * The API version for this call such as "events.cloud.google.com/v1alpha1".
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * The API version for this call such as "events.cloud.google.com/v1alpha1".
   * @param apiVersion apiVersion or {@code null} for none
   */
  public PubSub setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * The kind of resource, in this case "PubSub".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource, in this case "PubSub".
   * @param kind kind or {@code null} for none
   */
  public PubSub setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metadata associated with this PubSub.
   * @return value or {@code null} for none
   */
  public ObjectMeta getMetadata() {
    return metadata;
  }

  /**
   * Metadata associated with this PubSub.
   * @param metadata metadata or {@code null} for none
   */
  public PubSub setMetadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Spec defines the desired state of the PubSub.
   * @return value or {@code null} for none
   */
  public PubSubSpec getSpec() {
    return spec;
  }

  /**
   * Spec defines the desired state of the PubSub.
   * @param spec spec or {@code null} for none
   */
  public PubSub setSpec(PubSubSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Status represents the current state of the PubSub. This data may be out of date. +optional
   * @return value or {@code null} for none
   */
  public PubSubStatus getStatus() {
    return status;
  }

  /**
   * Status represents the current state of the PubSub. This data may be out of date. +optional
   * @param status status or {@code null} for none
   */
  public PubSub setStatus(PubSubStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public PubSub set(String fieldName, Object value) {
    return (PubSub) super.set(fieldName, value);
  }

  @Override
  public PubSub clone() {
    return (PubSub) super.clone();
  }

}
