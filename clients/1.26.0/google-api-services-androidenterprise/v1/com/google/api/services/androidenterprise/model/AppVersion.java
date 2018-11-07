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

package com.google.api.services.androidenterprise.model;

/**
 * This represents a single version of the app.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppVersion extends com.google.api.client.json.GenericJson {

  /**
   * True if this version is a production APK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isProduction;

  /**
   * Deprecated, use trackId instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String track;

  /**
   * Track ids that the app version is published in. Replaces the track field (deprecated), but
   * doesn't include the production track (see isProduction instead).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> trackId;

  /**
   * Unique increasing identifier for the app version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer versionCode;

  /**
   * The string used in the Play store by the app developer to identify the version. The string is
   * not necessarily unique or localized (for example, the string could be "1.4").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionString;

  /**
   * True if this version is a production APK.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsProduction() {
    return isProduction;
  }

  /**
   * True if this version is a production APK.
   * @param isProduction isProduction or {@code null} for none
   */
  public AppVersion setIsProduction(java.lang.Boolean isProduction) {
    this.isProduction = isProduction;
    return this;
  }

  /**
   * Deprecated, use trackId instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrack() {
    return track;
  }

  /**
   * Deprecated, use trackId instead.
   * @param track track or {@code null} for none
   */
  public AppVersion setTrack(java.lang.String track) {
    this.track = track;
    return this;
  }

  /**
   * Track ids that the app version is published in. Replaces the track field (deprecated), but
   * doesn't include the production track (see isProduction instead).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTrackId() {
    return trackId;
  }

  /**
   * Track ids that the app version is published in. Replaces the track field (deprecated), but
   * doesn't include the production track (see isProduction instead).
   * @param trackId trackId or {@code null} for none
   */
  public AppVersion setTrackId(java.util.List<java.lang.String> trackId) {
    this.trackId = trackId;
    return this;
  }

  /**
   * Unique increasing identifier for the app version.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersionCode() {
    return versionCode;
  }

  /**
   * Unique increasing identifier for the app version.
   * @param versionCode versionCode or {@code null} for none
   */
  public AppVersion setVersionCode(java.lang.Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

  /**
   * The string used in the Play store by the app developer to identify the version. The string is
   * not necessarily unique or localized (for example, the string could be "1.4").
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionString() {
    return versionString;
  }

  /**
   * The string used in the Play store by the app developer to identify the version. The string is
   * not necessarily unique or localized (for example, the string could be "1.4").
   * @param versionString versionString or {@code null} for none
   */
  public AppVersion setVersionString(java.lang.String versionString) {
    this.versionString = versionString;
    return this;
  }

  @Override
  public AppVersion set(String fieldName, Object value) {
    return (AppVersion) super.set(fieldName, value);
  }

  @Override
  public AppVersion clone() {
    return (AppVersion) super.clone();
  }

}
