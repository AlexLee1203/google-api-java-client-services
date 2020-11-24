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
 * Store resource.
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
public final class PosStore extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#posStore`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Required. The street address of the store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storeAddress;

  /**
   * Required. A store identifier that is unique for the given merchant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storeCode;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#posStore`"
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#posStore`"
   * @param kind kind or {@code null} for none
   */
  public PosStore setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Required. The street address of the store.
   * @return value or {@code null} for none
   */
  public java.lang.String getStoreAddress() {
    return storeAddress;
  }

  /**
   * Required. The street address of the store.
   * @param storeAddress storeAddress or {@code null} for none
   */
  public PosStore setStoreAddress(java.lang.String storeAddress) {
    this.storeAddress = storeAddress;
    return this;
  }

  /**
   * Required. A store identifier that is unique for the given merchant.
   * @return value or {@code null} for none
   */
  public java.lang.String getStoreCode() {
    return storeCode;
  }

  /**
   * Required. A store identifier that is unique for the given merchant.
   * @param storeCode storeCode or {@code null} for none
   */
  public PosStore setStoreCode(java.lang.String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  @Override
  public PosStore set(String fieldName, Object value) {
    return (PosStore) super.set(fieldName, value);
  }

  @Override
  public PosStore clone() {
    return (PosStore) super.clone();
  }

}
