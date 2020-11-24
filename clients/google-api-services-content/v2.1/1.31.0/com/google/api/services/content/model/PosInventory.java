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
 * The absolute quantity of an item available at the given store.
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
public final class PosInventory extends com.google.api.client.json.GenericJson {

  /**
   * Required. The two-letter ISO 639-1 language code for the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentLanguage;

  /**
   * Global Trade Item Number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gtin;

  /**
   * Required. A unique identifier for the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemId;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#posInventory`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Required. The current price of the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price price;

  /**
   * Required. The available quantity of the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long quantity;

  /**
   * Required. The identifier of the merchant's store. Either a `storeCode` inserted via the API or
   * the code of the store in Google My Business.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storeCode;

  /**
   * Required. The CLDR territory code for the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetCountry;

  /**
   * Required. The inventory timestamp, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timestamp;

  /**
   * Required. The two-letter ISO 639-1 language code for the item.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentLanguage() {
    return contentLanguage;
  }

  /**
   * Required. The two-letter ISO 639-1 language code for the item.
   * @param contentLanguage contentLanguage or {@code null} for none
   */
  public PosInventory setContentLanguage(java.lang.String contentLanguage) {
    this.contentLanguage = contentLanguage;
    return this;
  }

  /**
   * Global Trade Item Number.
   * @return value or {@code null} for none
   */
  public java.lang.String getGtin() {
    return gtin;
  }

  /**
   * Global Trade Item Number.
   * @param gtin gtin or {@code null} for none
   */
  public PosInventory setGtin(java.lang.String gtin) {
    this.gtin = gtin;
    return this;
  }

  /**
   * Required. A unique identifier for the item.
   * @return value or {@code null} for none
   */
  public java.lang.String getItemId() {
    return itemId;
  }

  /**
   * Required. A unique identifier for the item.
   * @param itemId itemId or {@code null} for none
   */
  public PosInventory setItemId(java.lang.String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#posInventory`"
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#posInventory`"
   * @param kind kind or {@code null} for none
   */
  public PosInventory setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Required. The current price of the item.
   * @return value or {@code null} for none
   */
  public Price getPrice() {
    return price;
  }

  /**
   * Required. The current price of the item.
   * @param price price or {@code null} for none
   */
  public PosInventory setPrice(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Required. The available quantity of the item.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantity() {
    return quantity;
  }

  /**
   * Required. The available quantity of the item.
   * @param quantity quantity or {@code null} for none
   */
  public PosInventory setQuantity(java.lang.Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Required. The identifier of the merchant's store. Either a `storeCode` inserted via the API or
   * the code of the store in Google My Business.
   * @return value or {@code null} for none
   */
  public java.lang.String getStoreCode() {
    return storeCode;
  }

  /**
   * Required. The identifier of the merchant's store. Either a `storeCode` inserted via the API or
   * the code of the store in Google My Business.
   * @param storeCode storeCode or {@code null} for none
   */
  public PosInventory setStoreCode(java.lang.String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  /**
   * Required. The CLDR territory code for the item.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetCountry() {
    return targetCountry;
  }

  /**
   * Required. The CLDR territory code for the item.
   * @param targetCountry targetCountry or {@code null} for none
   */
  public PosInventory setTargetCountry(java.lang.String targetCountry) {
    this.targetCountry = targetCountry;
    return this;
  }

  /**
   * Required. The inventory timestamp, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimestamp() {
    return timestamp;
  }

  /**
   * Required. The inventory timestamp, in ISO 8601 format.
   * @param timestamp timestamp or {@code null} for none
   */
  public PosInventory setTimestamp(java.lang.String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @Override
  public PosInventory set(String fieldName, Object value) {
    return (PosInventory) super.set(fieldName, value);
  }

  @Override
  public PosInventory clone() {
    return (PosInventory) super.clone();
  }

}
