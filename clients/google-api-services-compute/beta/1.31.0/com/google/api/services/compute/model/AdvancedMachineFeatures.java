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

package com.google.api.services.compute.model;

/**
 * Specifies options for controlling advanced machine features. Options that would traditionally be
 * configured in a BIOS belong here. Features that require operating system support may have
 * corresponding entries in the GuestOsFeatures of an Image (e.g., whether or not the OS in the
 * Image supports nested virtualization being enabled or disabled).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdvancedMachineFeatures extends com.google.api.client.json.GenericJson {

  /**
   * Whether to enable nested virtualization or not (default is false).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableNestedVirtualization;

  /**
   * Whether to enable nested virtualization or not (default is false).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableNestedVirtualization() {
    return enableNestedVirtualization;
  }

  /**
   * Whether to enable nested virtualization or not (default is false).
   * @param enableNestedVirtualization enableNestedVirtualization or {@code null} for none
   */
  public AdvancedMachineFeatures setEnableNestedVirtualization(java.lang.Boolean enableNestedVirtualization) {
    this.enableNestedVirtualization = enableNestedVirtualization;
    return this;
  }

  @Override
  public AdvancedMachineFeatures set(String fieldName, Object value) {
    return (AdvancedMachineFeatures) super.set(fieldName, value);
  }

  @Override
  public AdvancedMachineFeatures clone() {
    return (AdvancedMachineFeatures) super.clone();
  }

}
