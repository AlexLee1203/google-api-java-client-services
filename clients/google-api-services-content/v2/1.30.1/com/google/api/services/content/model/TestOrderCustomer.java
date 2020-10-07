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
 * Model definition for TestOrderCustomer.
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
public final class TestOrderCustomer extends com.google.api.client.json.GenericJson {

  /**
   * Required. Email address of the customer. Acceptable values are: -
   * "`pog.dwight.schrute@gmail.com`" - "`pog.jim.halpert@gmail.com`" -
   * "`penpog.pam.beesly@gmail.comding`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * Deprecated. Please use marketingRightsInfo instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean explicitMarketingPreference;

  /**
   * Full name of the customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullName;

  /**
   * Customer's marketing preferences.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestOrderCustomerMarketingRightsInfo marketingRightsInfo;

  /**
   * Required. Email address of the customer. Acceptable values are: -
   * "`pog.dwight.schrute@gmail.com`" - "`pog.jim.halpert@gmail.com`" -
   * "`penpog.pam.beesly@gmail.comding`"
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Required. Email address of the customer. Acceptable values are: -
   * "`pog.dwight.schrute@gmail.com`" - "`pog.jim.halpert@gmail.com`" -
   * "`penpog.pam.beesly@gmail.comding`"
   * @param email email or {@code null} for none
   */
  public TestOrderCustomer setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * Deprecated. Please use marketingRightsInfo instead.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExplicitMarketingPreference() {
    return explicitMarketingPreference;
  }

  /**
   * Deprecated. Please use marketingRightsInfo instead.
   * @param explicitMarketingPreference explicitMarketingPreference or {@code null} for none
   */
  public TestOrderCustomer setExplicitMarketingPreference(java.lang.Boolean explicitMarketingPreference) {
    this.explicitMarketingPreference = explicitMarketingPreference;
    return this;
  }

  /**
   * Full name of the customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullName() {
    return fullName;
  }

  /**
   * Full name of the customer.
   * @param fullName fullName or {@code null} for none
   */
  public TestOrderCustomer setFullName(java.lang.String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Customer's marketing preferences.
   * @return value or {@code null} for none
   */
  public TestOrderCustomerMarketingRightsInfo getMarketingRightsInfo() {
    return marketingRightsInfo;
  }

  /**
   * Customer's marketing preferences.
   * @param marketingRightsInfo marketingRightsInfo or {@code null} for none
   */
  public TestOrderCustomer setMarketingRightsInfo(TestOrderCustomerMarketingRightsInfo marketingRightsInfo) {
    this.marketingRightsInfo = marketingRightsInfo;
    return this;
  }

  @Override
  public TestOrderCustomer set(String fieldName, Object value) {
    return (TestOrderCustomer) super.set(fieldName, value);
  }

  @Override
  public TestOrderCustomer clone() {
    return (TestOrderCustomer) super.clone();
  }

}
