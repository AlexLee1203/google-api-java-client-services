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
 * Model definition for OrderPickupDetails.
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
public final class OrderPickupDetails extends com.google.api.client.json.GenericJson {

  /**
   * Address of the pickup location where the shipment should be sent. Note that `recipientName` in
   * the address is the name of the business at the pickup location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderAddress address;

  /**
   * Collectors authorized to pick up shipment from the pickup location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderPickupDetailsCollector> collectors;

  /**
   * ID of the pickup location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * The pickup type of this order. Acceptable values are: - "`merchantStore`" -
   * "`merchantStoreCurbside`" - "`merchantStoreLocker`" - "`thirdPartyPickupPoint`" -
   * "`thirdPartyLocker`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pickupType;

  /**
   * Address of the pickup location where the shipment should be sent. Note that `recipientName` in
   * the address is the name of the business at the pickup location.
   * @return value or {@code null} for none
   */
  public OrderAddress getAddress() {
    return address;
  }

  /**
   * Address of the pickup location where the shipment should be sent. Note that `recipientName` in
   * the address is the name of the business at the pickup location.
   * @param address address or {@code null} for none
   */
  public OrderPickupDetails setAddress(OrderAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Collectors authorized to pick up shipment from the pickup location.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderPickupDetailsCollector> getCollectors() {
    return collectors;
  }

  /**
   * Collectors authorized to pick up shipment from the pickup location.
   * @param collectors collectors or {@code null} for none
   */
  public OrderPickupDetails setCollectors(java.util.List<OrderPickupDetailsCollector> collectors) {
    this.collectors = collectors;
    return this;
  }

  /**
   * ID of the pickup location.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * ID of the pickup location.
   * @param locationId locationId or {@code null} for none
   */
  public OrderPickupDetails setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * The pickup type of this order. Acceptable values are: - "`merchantStore`" -
   * "`merchantStoreCurbside`" - "`merchantStoreLocker`" - "`thirdPartyPickupPoint`" -
   * "`thirdPartyLocker`"
   * @return value or {@code null} for none
   */
  public java.lang.String getPickupType() {
    return pickupType;
  }

  /**
   * The pickup type of this order. Acceptable values are: - "`merchantStore`" -
   * "`merchantStoreCurbside`" - "`merchantStoreLocker`" - "`thirdPartyPickupPoint`" -
   * "`thirdPartyLocker`"
   * @param pickupType pickupType or {@code null} for none
   */
  public OrderPickupDetails setPickupType(java.lang.String pickupType) {
    this.pickupType = pickupType;
    return this;
  }

  @Override
  public OrderPickupDetails set(String fieldName, Object value) {
    return (OrderPickupDetails) super.set(fieldName, value);
  }

  @Override
  public OrderPickupDetails clone() {
    return (OrderPickupDetails) super.clone();
  }

}
