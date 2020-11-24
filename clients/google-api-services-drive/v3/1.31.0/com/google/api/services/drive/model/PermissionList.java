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

package com.google.api.services.drive.model;

/**
 * A list of permissions for a file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PermissionList extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#permissionList".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The page token for the next page of permissions. This field will be absent if the end of the
   * permissions list has been reached. If the token is rejected for any reason, it should be
   * discarded, and pagination should be restarted from the first page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of permissions. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Permission> permissions;

  static {
    // hack to force ProGuard to consider Permission used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Permission.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#permissionList".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#permissionList".
   * @param kind kind or {@code null} for none
   */
  public PermissionList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The page token for the next page of permissions. This field will be absent if the end of the
   * permissions list has been reached. If the token is rejected for any reason, it should be
   * discarded, and pagination should be restarted from the first page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The page token for the next page of permissions. This field will be absent if the end of the
   * permissions list has been reached. If the token is rejected for any reason, it should be
   * discarded, and pagination should be restarted from the first page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public PermissionList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of permissions. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * @return value or {@code null} for none
   */
  public java.util.List<Permission> getPermissions() {
    return permissions;
  }

  /**
   * The list of permissions. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * @param permissions permissions or {@code null} for none
   */
  public PermissionList setPermissions(java.util.List<Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  @Override
  public PermissionList set(String fieldName, Object value) {
    return (PermissionList) super.set(fieldName, value);
  }

  @Override
  public PermissionList clone() {
    return (PermissionList) super.clone();
  }

}
