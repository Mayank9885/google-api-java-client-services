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

package com.google.api.services.container.model;

/**
 * Configuration options for the NetworkPolicy feature. https://kubernetes.io/docs/concepts
 * /services-networking/networkpolicies/
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Whether network policy is enabled on the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * The selected network policy provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provider;

  /**
   * Whether network policy is enabled on the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether network policy is enabled on the cluster.
   * @param enabled enabled or {@code null} for none
   */
  public NetworkPolicy setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * The selected network policy provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvider() {
    return provider;
  }

  /**
   * The selected network policy provider.
   * @param provider provider or {@code null} for none
   */
  public NetworkPolicy setProvider(java.lang.String provider) {
    this.provider = provider;
    return this;
  }

  @Override
  public NetworkPolicy set(String fieldName, Object value) {
    return (NetworkPolicy) super.set(fieldName, value);
  }

  @Override
  public NetworkPolicy clone() {
    return (NetworkPolicy) super.clone();
  }

}
