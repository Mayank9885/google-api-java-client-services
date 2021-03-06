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

package com.google.api.services.cloudasset.v1.model;

/**
 * A single piece of inventory on a VM.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Item extends com.google.api.client.json.GenericJson {

  /**
   * Software package available to be installed on the VM instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SoftwarePackage availablePackage;

  /**
   * When this inventory item was first detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Identifier for this item, unique across items for this VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Software package present on the VM instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SoftwarePackage installedPackage;

  /**
   * The origin of this inventory item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originType;

  /**
   * The specific type of inventory, correlating to its specific details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * When this inventory item was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Software package available to be installed on the VM instance.
   * @return value or {@code null} for none
   */
  public SoftwarePackage getAvailablePackage() {
    return availablePackage;
  }

  /**
   * Software package available to be installed on the VM instance.
   * @param availablePackage availablePackage or {@code null} for none
   */
  public Item setAvailablePackage(SoftwarePackage availablePackage) {
    this.availablePackage = availablePackage;
    return this;
  }

  /**
   * When this inventory item was first detected.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * When this inventory item was first detected.
   * @param createTime createTime or {@code null} for none
   */
  public Item setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Identifier for this item, unique across items for this VM.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Identifier for this item, unique across items for this VM.
   * @param id id or {@code null} for none
   */
  public Item setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Software package present on the VM instance.
   * @return value or {@code null} for none
   */
  public SoftwarePackage getInstalledPackage() {
    return installedPackage;
  }

  /**
   * Software package present on the VM instance.
   * @param installedPackage installedPackage or {@code null} for none
   */
  public Item setInstalledPackage(SoftwarePackage installedPackage) {
    this.installedPackage = installedPackage;
    return this;
  }

  /**
   * The origin of this inventory item.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginType() {
    return originType;
  }

  /**
   * The origin of this inventory item.
   * @param originType originType or {@code null} for none
   */
  public Item setOriginType(java.lang.String originType) {
    this.originType = originType;
    return this;
  }

  /**
   * The specific type of inventory, correlating to its specific details.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The specific type of inventory, correlating to its specific details.
   * @param type type or {@code null} for none
   */
  public Item setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * When this inventory item was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * When this inventory item was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public Item setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Item set(String fieldName, Object value) {
    return (Item) super.set(fieldName, value);
  }

  @Override
  public Item clone() {
    return (Item) super.clone();
  }

}
