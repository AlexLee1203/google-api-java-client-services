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

package com.google.api.services.compute.model;

/**
 * Message containing information of one individual backend.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Backend extends com.google.api.client.json.GenericJson {

  /**
   * Specifies how to determine whether the backend of a load balancer can handle additional traffic
   * or is fully loaded. For usage guidelines, see  Connection balancing mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String balancingMode;

  /**
   * A multiplier applied to the backend's target capacity of its balancing mode. The default value
   * is 1, which means the group serves up to 100% of its configured capacity (depending on
   * balancingMode). A setting of 0 means the group is completely drained, offering 0% of its
   * available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting
   * larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one
   * backend attached to the backend service.
   *
   * Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float capacityScaler;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * This field designates whether this is a failover backend. More than one failover backend can be
   * configured for a given BackendService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean failover;

  /**
   * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. The type
   * of backend that a backend service supports depends on the backend service's
   * loadBalancingScheme.
   *
   *   - When the loadBalancingScheme for the backend service is EXTERNAL (except Network Load
   * Balancing),  INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED , the backend can be either an instance
   * group or a NEG. The backends on the backend service must be either all instance groups or all
   * NEGs. You cannot mix instance group and NEG backends on the same backend service.
   *
   * - When the loadBalancingScheme for the backend service is EXTERNAL for Network Load Balancing
   * or INTERNAL for Internal TCP/UDP Load Balancing, the backend must be an instance group. NEGs
   * are not supported.
   *
   * For regional services, the backend must be in the same region as the backend service.
   *
   * You must use the fully-qualified URL (starting with https://www.googleapis.com/) to specify the
   * instance group or NEG. Partial URLs are not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String group;

  /**
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see
   * Connection balancing mode and Utilization balancing mode. Not available if the backend's
   * balancingMode is RATE. Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxConnections;

  /**
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see
   * Connection balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is RATE. Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxConnectionsPerEndpoint;

  /**
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see
   * Connection balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is RATE. Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxConnectionsPerInstance;

  /**
   * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate
   * balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is CONNECTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxRate;

  /**
   * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate
   * balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is CONNECTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float maxRatePerEndpoint;

  /**
   * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate
   * balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is CONNECTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float maxRatePerInstance;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float maxUtilization;

  /**
   * Specifies how to determine whether the backend of a load balancer can handle additional traffic
   * or is fully loaded. For usage guidelines, see  Connection balancing mode.
   * @return value or {@code null} for none
   */
  public java.lang.String getBalancingMode() {
    return balancingMode;
  }

  /**
   * Specifies how to determine whether the backend of a load balancer can handle additional traffic
   * or is fully loaded. For usage guidelines, see  Connection balancing mode.
   * @param balancingMode balancingMode or {@code null} for none
   */
  public Backend setBalancingMode(java.lang.String balancingMode) {
    this.balancingMode = balancingMode;
    return this;
  }

  /**
   * A multiplier applied to the backend's target capacity of its balancing mode. The default value
   * is 1, which means the group serves up to 100% of its configured capacity (depending on
   * balancingMode). A setting of 0 means the group is completely drained, offering 0% of its
   * available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting
   * larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one
   * backend attached to the backend service.
   *
   * Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing
   * @return value or {@code null} for none
   */
  public java.lang.Float getCapacityScaler() {
    return capacityScaler;
  }

  /**
   * A multiplier applied to the backend's target capacity of its balancing mode. The default value
   * is 1, which means the group serves up to 100% of its configured capacity (depending on
   * balancingMode). A setting of 0 means the group is completely drained, offering 0% of its
   * available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting
   * larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one
   * backend attached to the backend service.
   *
   * Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing
   * @param capacityScaler capacityScaler or {@code null} for none
   */
  public Backend setCapacityScaler(java.lang.Float capacityScaler) {
    this.capacityScaler = capacityScaler;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public Backend setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * This field designates whether this is a failover backend. More than one failover backend can be
   * configured for a given BackendService.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFailover() {
    return failover;
  }

  /**
   * This field designates whether this is a failover backend. More than one failover backend can be
   * configured for a given BackendService.
   * @param failover failover or {@code null} for none
   */
  public Backend setFailover(java.lang.Boolean failover) {
    this.failover = failover;
    return this;
  }

  /**
   * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. The type
   * of backend that a backend service supports depends on the backend service's
   * loadBalancingScheme.
   *
   *   - When the loadBalancingScheme for the backend service is EXTERNAL (except Network Load
   * Balancing),  INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED , the backend can be either an instance
   * group or a NEG. The backends on the backend service must be either all instance groups or all
   * NEGs. You cannot mix instance group and NEG backends on the same backend service.
   *
   * - When the loadBalancingScheme for the backend service is EXTERNAL for Network Load Balancing
   * or INTERNAL for Internal TCP/UDP Load Balancing, the backend must be an instance group. NEGs
   * are not supported.
   *
   * For regional services, the backend must be in the same region as the backend service.
   *
   * You must use the fully-qualified URL (starting with https://www.googleapis.com/) to specify the
   * instance group or NEG. Partial URLs are not supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getGroup() {
    return group;
  }

  /**
   * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. The type
   * of backend that a backend service supports depends on the backend service's
   * loadBalancingScheme.
   *
   *   - When the loadBalancingScheme for the backend service is EXTERNAL (except Network Load
   * Balancing),  INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED , the backend can be either an instance
   * group or a NEG. The backends on the backend service must be either all instance groups or all
   * NEGs. You cannot mix instance group and NEG backends on the same backend service.
   *
   * - When the loadBalancingScheme for the backend service is EXTERNAL for Network Load Balancing
   * or INTERNAL for Internal TCP/UDP Load Balancing, the backend must be an instance group. NEGs
   * are not supported.
   *
   * For regional services, the backend must be in the same region as the backend service.
   *
   * You must use the fully-qualified URL (starting with https://www.googleapis.com/) to specify the
   * instance group or NEG. Partial URLs are not supported.
   * @param group group or {@code null} for none
   */
  public Backend setGroup(java.lang.String group) {
    this.group = group;
    return this;
  }

  /**
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see
   * Connection balancing mode and Utilization balancing mode. Not available if the backend's
   * balancingMode is RATE. Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxConnections() {
    return maxConnections;
  }

  /**
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see
   * Connection balancing mode and Utilization balancing mode. Not available if the backend's
   * balancingMode is RATE. Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing
   * @param maxConnections maxConnections or {@code null} for none
   */
  public Backend setMaxConnections(java.lang.Integer maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

  /**
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see
   * Connection balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is RATE. Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxConnectionsPerEndpoint() {
    return maxConnectionsPerEndpoint;
  }

  /**
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see
   * Connection balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is RATE. Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing.
   * @param maxConnectionsPerEndpoint maxConnectionsPerEndpoint or {@code null} for none
   */
  public Backend setMaxConnectionsPerEndpoint(java.lang.Integer maxConnectionsPerEndpoint) {
    this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
    return this;
  }

  /**
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see
   * Connection balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is RATE. Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxConnectionsPerInstance() {
    return maxConnectionsPerInstance;
  }

  /**
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see
   * Connection balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is RATE. Not supported by:
   *
   * - Internal TCP/UDP Load Balancing - Network Load Balancing.
   * @param maxConnectionsPerInstance maxConnectionsPerInstance or {@code null} for none
   */
  public Backend setMaxConnectionsPerInstance(java.lang.Integer maxConnectionsPerInstance) {
    this.maxConnectionsPerInstance = maxConnectionsPerInstance;
    return this;
  }

  /**
   * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate
   * balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is CONNECTION.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxRate() {
    return maxRate;
  }

  /**
   * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate
   * balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is CONNECTION.
   * @param maxRate maxRate or {@code null} for none
   */
  public Backend setMaxRate(java.lang.Integer maxRate) {
    this.maxRate = maxRate;
    return this;
  }

  /**
   * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate
   * balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is CONNECTION.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMaxRatePerEndpoint() {
    return maxRatePerEndpoint;
  }

  /**
   * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate
   * balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is CONNECTION.
   * @param maxRatePerEndpoint maxRatePerEndpoint or {@code null} for none
   */
  public Backend setMaxRatePerEndpoint(java.lang.Float maxRatePerEndpoint) {
    this.maxRatePerEndpoint = maxRatePerEndpoint;
    return this;
  }

  /**
   * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate
   * balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is CONNECTION.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMaxRatePerInstance() {
    return maxRatePerInstance;
  }

  /**
   * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate
   * balancing mode and Utilization balancing mode.
   *
   * Not available if the backend's balancingMode is CONNECTION.
   * @param maxRatePerInstance maxRatePerInstance or {@code null} for none
   */
  public Backend setMaxRatePerInstance(java.lang.Float maxRatePerInstance) {
    this.maxRatePerInstance = maxRatePerInstance;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getMaxUtilization() {
    return maxUtilization;
  }

  /**
   * @param maxUtilization maxUtilization or {@code null} for none
   */
  public Backend setMaxUtilization(java.lang.Float maxUtilization) {
    this.maxUtilization = maxUtilization;
    return this;
  }

  @Override
  public Backend set(String fieldName, Object value) {
    return (Backend) super.set(fieldName, value);
  }

  @Override
  public Backend clone() {
    return (Backend) super.clone();
  }

}
