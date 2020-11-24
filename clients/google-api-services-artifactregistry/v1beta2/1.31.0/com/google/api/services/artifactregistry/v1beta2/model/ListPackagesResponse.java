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

package com.google.api.services.artifactregistry.v1beta2.model;

/**
 * The response from listing packages.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListPackagesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The token to retrieve the next page of packages, or empty if there are no more packages to
   * return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The packages returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ArtifactRegistryPackage> packages;

  /**
   * The token to retrieve the next page of packages, or empty if there are no more packages to
   * return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token to retrieve the next page of packages, or empty if there are no more packages to
   * return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListPackagesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The packages returned.
   * @return value or {@code null} for none
   */
  public java.util.List<ArtifactRegistryPackage> getPackages() {
    return packages;
  }

  /**
   * The packages returned.
   * @param packages packages or {@code null} for none
   */
  public ListPackagesResponse setPackages(java.util.List<ArtifactRegistryPackage> packages) {
    this.packages = packages;
    return this;
  }

  @Override
  public ListPackagesResponse set(String fieldName, Object value) {
    return (ListPackagesResponse) super.set(fieldName, value);
  }

  @Override
  public ListPackagesResponse clone() {
    return (ListPackagesResponse) super.clone();
  }

}
