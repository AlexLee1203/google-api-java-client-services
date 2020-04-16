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

package com.google.api.services.cloudasset.v1p4beta1.model;

/**
 * A request message for AssetService.ExportIamPolicyAnalysis.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExportIamPolicyAnalysisRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The request query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IamPolicyAnalysisQuery analysisQuery;

  /**
   * Optional. The request options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Options options;

  /**
   * Required. Output configuration indicating where the results will be output to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IamPolicyAnalysisOutputConfig outputConfig;

  /**
   * Required. The request query.
   * @return value or {@code null} for none
   */
  public IamPolicyAnalysisQuery getAnalysisQuery() {
    return analysisQuery;
  }

  /**
   * Required. The request query.
   * @param analysisQuery analysisQuery or {@code null} for none
   */
  public ExportIamPolicyAnalysisRequest setAnalysisQuery(IamPolicyAnalysisQuery analysisQuery) {
    this.analysisQuery = analysisQuery;
    return this;
  }

  /**
   * Optional. The request options.
   * @return value or {@code null} for none
   */
  public Options getOptions() {
    return options;
  }

  /**
   * Optional. The request options.
   * @param options options or {@code null} for none
   */
  public ExportIamPolicyAnalysisRequest setOptions(Options options) {
    this.options = options;
    return this;
  }

  /**
   * Required. Output configuration indicating where the results will be output to.
   * @return value or {@code null} for none
   */
  public IamPolicyAnalysisOutputConfig getOutputConfig() {
    return outputConfig;
  }

  /**
   * Required. Output configuration indicating where the results will be output to.
   * @param outputConfig outputConfig or {@code null} for none
   */
  public ExportIamPolicyAnalysisRequest setOutputConfig(IamPolicyAnalysisOutputConfig outputConfig) {
    this.outputConfig = outputConfig;
    return this;
  }

  @Override
  public ExportIamPolicyAnalysisRequest set(String fieldName, Object value) {
    return (ExportIamPolicyAnalysisRequest) super.set(fieldName, value);
  }

  @Override
  public ExportIamPolicyAnalysisRequest clone() {
    return (ExportIamPolicyAnalysisRequest) super.clone();
  }

}
