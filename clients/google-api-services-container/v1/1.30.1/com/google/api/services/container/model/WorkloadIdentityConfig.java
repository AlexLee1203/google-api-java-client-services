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

package com.google.api.services.container.model;

/**
 * Configuration for the use of Kubernetes Service Accounts in GCP IAM policies.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkloadIdentityConfig extends com.google.api.client.json.GenericJson {

  /**
   * The workload pool to attach all Kubernetes service accounts to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workloadPool;

  /**
   * The workload pool to attach all Kubernetes service accounts to.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkloadPool() {
    return workloadPool;
  }

  /**
   * The workload pool to attach all Kubernetes service accounts to.
   * @param workloadPool workloadPool or {@code null} for none
   */
  public WorkloadIdentityConfig setWorkloadPool(java.lang.String workloadPool) {
    this.workloadPool = workloadPool;
    return this;
  }

  @Override
  public WorkloadIdentityConfig set(String fieldName, Object value) {
    return (WorkloadIdentityConfig) super.set(fieldName, value);
  }

  @Override
  public WorkloadIdentityConfig clone() {
    return (WorkloadIdentityConfig) super.clone();
  }

}