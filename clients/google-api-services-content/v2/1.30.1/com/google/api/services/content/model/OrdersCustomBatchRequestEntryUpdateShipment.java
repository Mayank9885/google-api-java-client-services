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
 * Model definition for OrdersCustomBatchRequestEntryUpdateShipment.
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
public final class OrdersCustomBatchRequestEntryUpdateShipment extends com.google.api.client.json.GenericJson {

  /**
   * The carrier handling the shipment. Not updated if missing. See `shipments[].carrier` in the
   * Orders resource representation for a list of acceptable values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String carrier;

  /**
   * Date on which the shipment has been delivered, in ISO 8601 format. Optional and can be provided
   * only if `status` is `delivered`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deliveryDate;

  /**
   * The ID of the shipment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shipmentId;

  /**
   * New status for the shipment. Not updated if missing.
   *
   * Acceptable values are:   - "`delivered`"  - "`undeliverable`"  - "`readyForPickup`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The tracking ID for the shipment. Not updated if missing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackingId;

  /**
   * The carrier handling the shipment. Not updated if missing. See `shipments[].carrier` in the
   * Orders resource representation for a list of acceptable values.
   * @return value or {@code null} for none
   */
  public java.lang.String getCarrier() {
    return carrier;
  }

  /**
   * The carrier handling the shipment. Not updated if missing. See `shipments[].carrier` in the
   * Orders resource representation for a list of acceptable values.
   * @param carrier carrier or {@code null} for none
   */
  public OrdersCustomBatchRequestEntryUpdateShipment setCarrier(java.lang.String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Date on which the shipment has been delivered, in ISO 8601 format. Optional and can be provided
   * only if `status` is `delivered`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeliveryDate() {
    return deliveryDate;
  }

  /**
   * Date on which the shipment has been delivered, in ISO 8601 format. Optional and can be provided
   * only if `status` is `delivered`.
   * @param deliveryDate deliveryDate or {@code null} for none
   */
  public OrdersCustomBatchRequestEntryUpdateShipment setDeliveryDate(java.lang.String deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

  /**
   * The ID of the shipment.
   * @return value or {@code null} for none
   */
  public java.lang.String getShipmentId() {
    return shipmentId;
  }

  /**
   * The ID of the shipment.
   * @param shipmentId shipmentId or {@code null} for none
   */
  public OrdersCustomBatchRequestEntryUpdateShipment setShipmentId(java.lang.String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

  /**
   * New status for the shipment. Not updated if missing.
   *
   * Acceptable values are:   - "`delivered`"  - "`undeliverable`"  - "`readyForPickup`"
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * New status for the shipment. Not updated if missing.
   *
   * Acceptable values are:   - "`delivered`"  - "`undeliverable`"  - "`readyForPickup`"
   * @param status status or {@code null} for none
   */
  public OrdersCustomBatchRequestEntryUpdateShipment setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The tracking ID for the shipment. Not updated if missing.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackingId() {
    return trackingId;
  }

  /**
   * The tracking ID for the shipment. Not updated if missing.
   * @param trackingId trackingId or {@code null} for none
   */
  public OrdersCustomBatchRequestEntryUpdateShipment setTrackingId(java.lang.String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  @Override
  public OrdersCustomBatchRequestEntryUpdateShipment set(String fieldName, Object value) {
    return (OrdersCustomBatchRequestEntryUpdateShipment) super.set(fieldName, value);
  }

  @Override
  public OrdersCustomBatchRequestEntryUpdateShipment clone() {
    return (OrdersCustomBatchRequestEntryUpdateShipment) super.clone();
  }

}
