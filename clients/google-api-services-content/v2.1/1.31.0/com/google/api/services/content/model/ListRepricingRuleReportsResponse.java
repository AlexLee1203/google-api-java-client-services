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
 * Response message for the ListRepricingRuleReports method.
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
public final class ListRepricingRuleReportsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token for retrieving the next page. Its absence means there is no subsequent page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Daily reports for the given Repricing rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RepricingRuleReport> repricingRuleReports;

  /**
   * A token for retrieving the next page. Its absence means there is no subsequent page.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token for retrieving the next page. Its absence means there is no subsequent page.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListRepricingRuleReportsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Daily reports for the given Repricing rule.
   * @return value or {@code null} for none
   */
  public java.util.List<RepricingRuleReport> getRepricingRuleReports() {
    return repricingRuleReports;
  }

  /**
   * Daily reports for the given Repricing rule.
   * @param repricingRuleReports repricingRuleReports or {@code null} for none
   */
  public ListRepricingRuleReportsResponse setRepricingRuleReports(java.util.List<RepricingRuleReport> repricingRuleReports) {
    this.repricingRuleReports = repricingRuleReports;
    return this;
  }

  @Override
  public ListRepricingRuleReportsResponse set(String fieldName, Object value) {
    return (ListRepricingRuleReportsResponse) super.set(fieldName, value);
  }

  @Override
  public ListRepricingRuleReportsResponse clone() {
    return (ListRepricingRuleReportsResponse) super.clone();
  }

}
