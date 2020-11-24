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

package com.google.api.services.memcache.v1beta2.model;

/**
 * Defines policies to service maintenance events.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Memorystore for Memcached API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MaintenancePolicy extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT
   * if the length is greater than 512.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Resource labels to represent user provided metadata. Each label is a key-value pair,
   * where both the key and the value are arbitrary strings provided by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. MaintenancePolicy name using the form:
   * `projects/{project_id}/locations/{location_id}/maintenancePolicies/{maintenance_policy_id}`
   * where {project_id} refers to a GCP consumer project ID, {location_id} refers to a GCP
   * region/zone, {maintenance_policy_id} must be 1-63 characters long and match the regular
   * expression `[a-z0-9]([-a-z0-9]*[a-z0-9])?`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The state of the policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Maintenance policy applicable to instance update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UpdatePolicy updatePolicy;

  /**
   * Output only. The time when the resource was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The time when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public MaintenancePolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT
   * if the length is greater than 512.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT
   * if the length is greater than 512.
   * @param description description or {@code null} for none
   */
  public MaintenancePolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Resource labels to represent user provided metadata. Each label is a key-value pair,
   * where both the key and the value are arbitrary strings provided by the user.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels to represent user provided metadata. Each label is a key-value pair,
   * where both the key and the value are arbitrary strings provided by the user.
   * @param labels labels or {@code null} for none
   */
  public MaintenancePolicy setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. MaintenancePolicy name using the form:
   * `projects/{project_id}/locations/{location_id}/maintenancePolicies/{maintenance_policy_id}`
   * where {project_id} refers to a GCP consumer project ID, {location_id} refers to a GCP
   * region/zone, {maintenance_policy_id} must be 1-63 characters long and match the regular
   * expression `[a-z0-9]([-a-z0-9]*[a-z0-9])?`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. MaintenancePolicy name using the form:
   * `projects/{project_id}/locations/{location_id}/maintenancePolicies/{maintenance_policy_id}`
   * where {project_id} refers to a GCP consumer project ID, {location_id} refers to a GCP
   * region/zone, {maintenance_policy_id} must be 1-63 characters long and match the regular
   * expression `[a-z0-9]([-a-z0-9]*[a-z0-9])?`.
   * @param name name or {@code null} for none
   */
  public MaintenancePolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The state of the policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Optional. The state of the policy.
   * @param state state or {@code null} for none
   */
  public MaintenancePolicy setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Maintenance policy applicable to instance update.
   * @return value or {@code null} for none
   */
  public UpdatePolicy getUpdatePolicy() {
    return updatePolicy;
  }

  /**
   * Maintenance policy applicable to instance update.
   * @param updatePolicy updatePolicy or {@code null} for none
   */
  public MaintenancePolicy setUpdatePolicy(UpdatePolicy updatePolicy) {
    this.updatePolicy = updatePolicy;
    return this;
  }

  /**
   * Output only. The time when the resource was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the resource was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public MaintenancePolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public MaintenancePolicy set(String fieldName, Object value) {
    return (MaintenancePolicy) super.set(fieldName, value);
  }

  @Override
  public MaintenancePolicy clone() {
    return (MaintenancePolicy) super.clone();
  }

}
