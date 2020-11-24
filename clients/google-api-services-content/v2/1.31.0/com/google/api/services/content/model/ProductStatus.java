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
 * The status of a product, i.e., information about a product computed asynchronously.
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
public final class ProductStatus extends com.google.api.client.json.GenericJson {

  /**
   * Date on which the item has been created, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationDate;

  /**
   * DEPRECATED - never populated
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ProductStatusDataQualityIssue> dataQualityIssues;

  /**
   * The intended destinations for the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ProductStatusDestinationStatus> destinationStatuses;

  /**
   * Date on which the item expires in Google Shopping, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleExpirationDate;

  /**
   * A list of all issues associated with the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ProductStatusItemLevelIssue> itemLevelIssues;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#productStatus`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Date on which the item has been last updated, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastUpdateDate;

  /**
   * The link to the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String link;

  /**
   * Product data after applying all the join inputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Product product;

  /**
   * The ID of the product for which status is reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The title of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Date on which the item has been created, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationDate() {
    return creationDate;
  }

  /**
   * Date on which the item has been created, in ISO 8601 format.
   * @param creationDate creationDate or {@code null} for none
   */
  public ProductStatus setCreationDate(java.lang.String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * DEPRECATED - never populated
   * @return value or {@code null} for none
   */
  public java.util.List<ProductStatusDataQualityIssue> getDataQualityIssues() {
    return dataQualityIssues;
  }

  /**
   * DEPRECATED - never populated
   * @param dataQualityIssues dataQualityIssues or {@code null} for none
   */
  public ProductStatus setDataQualityIssues(java.util.List<ProductStatusDataQualityIssue> dataQualityIssues) {
    this.dataQualityIssues = dataQualityIssues;
    return this;
  }

  /**
   * The intended destinations for the product.
   * @return value or {@code null} for none
   */
  public java.util.List<ProductStatusDestinationStatus> getDestinationStatuses() {
    return destinationStatuses;
  }

  /**
   * The intended destinations for the product.
   * @param destinationStatuses destinationStatuses or {@code null} for none
   */
  public ProductStatus setDestinationStatuses(java.util.List<ProductStatusDestinationStatus> destinationStatuses) {
    this.destinationStatuses = destinationStatuses;
    return this;
  }

  /**
   * Date on which the item expires in Google Shopping, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleExpirationDate() {
    return googleExpirationDate;
  }

  /**
   * Date on which the item expires in Google Shopping, in ISO 8601 format.
   * @param googleExpirationDate googleExpirationDate or {@code null} for none
   */
  public ProductStatus setGoogleExpirationDate(java.lang.String googleExpirationDate) {
    this.googleExpirationDate = googleExpirationDate;
    return this;
  }

  /**
   * A list of all issues associated with the product.
   * @return value or {@code null} for none
   */
  public java.util.List<ProductStatusItemLevelIssue> getItemLevelIssues() {
    return itemLevelIssues;
  }

  /**
   * A list of all issues associated with the product.
   * @param itemLevelIssues itemLevelIssues or {@code null} for none
   */
  public ProductStatus setItemLevelIssues(java.util.List<ProductStatusItemLevelIssue> itemLevelIssues) {
    this.itemLevelIssues = itemLevelIssues;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#productStatus`"
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#productStatus`"
   * @param kind kind or {@code null} for none
   */
  public ProductStatus setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Date on which the item has been last updated, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastUpdateDate() {
    return lastUpdateDate;
  }

  /**
   * Date on which the item has been last updated, in ISO 8601 format.
   * @param lastUpdateDate lastUpdateDate or {@code null} for none
   */
  public ProductStatus setLastUpdateDate(java.lang.String lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

  /**
   * The link to the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getLink() {
    return link;
  }

  /**
   * The link to the product.
   * @param link link or {@code null} for none
   */
  public ProductStatus setLink(java.lang.String link) {
    this.link = link;
    return this;
  }

  /**
   * Product data after applying all the join inputs.
   * @return value or {@code null} for none
   */
  public Product getProduct() {
    return product;
  }

  /**
   * Product data after applying all the join inputs.
   * @param product product or {@code null} for none
   */
  public ProductStatus setProduct(Product product) {
    this.product = product;
    return this;
  }

  /**
   * The ID of the product for which status is reported.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product for which status is reported.
   * @param productId productId or {@code null} for none
   */
  public ProductStatus setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The title of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the product.
   * @param title title or {@code null} for none
   */
  public ProductStatus setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public ProductStatus set(String fieldName, Object value) {
    return (ProductStatus) super.set(fieldName, value);
  }

  @Override
  public ProductStatus clone() {
    return (ProductStatus) super.clone();
  }

}
