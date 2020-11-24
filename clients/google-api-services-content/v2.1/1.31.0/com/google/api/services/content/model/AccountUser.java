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
 * Model definition for AccountUser.
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
public final class AccountUser extends com.google.api.client.json.GenericJson {

  /**
   * Whether user is an admin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean admin;

  /**
   * User's email address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emailAddress;

  /**
   * Whether user is an order manager.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean orderManager;

  /**
   * Whether user can access payment statements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean paymentsAnalyst;

  /**
   * Whether user can manage payment settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean paymentsManager;

  /**
   * Whether user is an admin.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdmin() {
    return admin;
  }

  /**
   * Whether user is an admin.
   * @param admin admin or {@code null} for none
   */
  public AccountUser setAdmin(java.lang.Boolean admin) {
    this.admin = admin;
    return this;
  }

  /**
   * User's email address.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailAddress() {
    return emailAddress;
  }

  /**
   * User's email address.
   * @param emailAddress emailAddress or {@code null} for none
   */
  public AccountUser setEmailAddress(java.lang.String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Whether user is an order manager.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOrderManager() {
    return orderManager;
  }

  /**
   * Whether user is an order manager.
   * @param orderManager orderManager or {@code null} for none
   */
  public AccountUser setOrderManager(java.lang.Boolean orderManager) {
    this.orderManager = orderManager;
    return this;
  }

  /**
   * Whether user can access payment statements.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPaymentsAnalyst() {
    return paymentsAnalyst;
  }

  /**
   * Whether user can access payment statements.
   * @param paymentsAnalyst paymentsAnalyst or {@code null} for none
   */
  public AccountUser setPaymentsAnalyst(java.lang.Boolean paymentsAnalyst) {
    this.paymentsAnalyst = paymentsAnalyst;
    return this;
  }

  /**
   * Whether user can manage payment settings.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPaymentsManager() {
    return paymentsManager;
  }

  /**
   * Whether user can manage payment settings.
   * @param paymentsManager paymentsManager or {@code null} for none
   */
  public AccountUser setPaymentsManager(java.lang.Boolean paymentsManager) {
    this.paymentsManager = paymentsManager;
    return this;
  }

  @Override
  public AccountUser set(String fieldName, Object value) {
    return (AccountUser) super.set(fieldName, value);
  }

  @Override
  public AccountUser clone() {
    return (AccountUser) super.clone();
  }

}
