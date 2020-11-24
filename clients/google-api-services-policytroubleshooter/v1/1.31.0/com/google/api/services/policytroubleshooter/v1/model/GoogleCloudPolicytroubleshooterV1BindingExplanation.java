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

package com.google.api.services.policytroubleshooter.v1.model;

/**
 * Details about how a binding in a policy affects a member's ability to use a permission.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Policy Troubleshooter API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPolicytroubleshooterV1BindingExplanation extends com.google.api.client.json.GenericJson {

  /**
   * Required. Indicates whether _this binding_ provides the specified permission to the specified
   * member for the specified resource. This field does _not_ indicate whether the member actually
   * has the permission for the resource. There might be another binding that overrides this
   * binding. To determine whether the member actually has the permission, use the `access` field in
   * the TroubleshootIamPolicyResponse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String access;

  /**
   * A condition expression that prevents access unless the expression evaluates to `true`. To learn
   * about IAM Conditions, see http://cloud.google.com/iam/help/conditions/overview.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeExpr condition;

  /**
   * Indicates whether each member in the binding includes the member specified in the request,
   * either directly or indirectly. Each key identifies a member in the binding, and each value
   * indicates whether the member in the binding includes the member in the request. For example,
   * suppose that a binding includes the following members: * `user:alice@example.com` * `group
   * :product-eng@example.com` You want to troubleshoot access for `user:bob@example.com`. This user
   * is a member of the group `group:product-eng@example.com`. For the first member in the binding,
   * the key is `user:alice@example.com`, and the `membership` field in the value is set to
   * `MEMBERSHIP_NOT_INCLUDED`. For the second member in the binding, the key is `group:product-
   * eng@example.com`, and the `membership` field in the value is set to `MEMBERSHIP_INCLUDED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership> memberships;

  /**
   * The relevance of this binding to the overall determination for the entire policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relevance;

  /**
   * The role that this binding grants. For example, `roles/compute.serviceAgent`. For a complete
   * list of predefined IAM roles, as well as the permissions in each role, see
   * https://cloud.google.com/iam/help/roles/reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * Indicates whether the role granted by this binding contains the specified permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rolePermission;

  /**
   * The relevance of the permission's existence, or nonexistence, in the role to the overall
   * determination for the entire policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rolePermissionRelevance;

  /**
   * Required. Indicates whether _this binding_ provides the specified permission to the specified
   * member for the specified resource. This field does _not_ indicate whether the member actually
   * has the permission for the resource. There might be another binding that overrides this
   * binding. To determine whether the member actually has the permission, use the `access` field in
   * the TroubleshootIamPolicyResponse.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccess() {
    return access;
  }

  /**
   * Required. Indicates whether _this binding_ provides the specified permission to the specified
   * member for the specified resource. This field does _not_ indicate whether the member actually
   * has the permission for the resource. There might be another binding that overrides this
   * binding. To determine whether the member actually has the permission, use the `access` field in
   * the TroubleshootIamPolicyResponse.
   * @param access access or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1BindingExplanation setAccess(java.lang.String access) {
    this.access = access;
    return this;
  }

  /**
   * A condition expression that prevents access unless the expression evaluates to `true`. To learn
   * about IAM Conditions, see http://cloud.google.com/iam/help/conditions/overview.
   * @return value or {@code null} for none
   */
  public GoogleTypeExpr getCondition() {
    return condition;
  }

  /**
   * A condition expression that prevents access unless the expression evaluates to `true`. To learn
   * about IAM Conditions, see http://cloud.google.com/iam/help/conditions/overview.
   * @param condition condition or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1BindingExplanation setCondition(GoogleTypeExpr condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Indicates whether each member in the binding includes the member specified in the request,
   * either directly or indirectly. Each key identifies a member in the binding, and each value
   * indicates whether the member in the binding includes the member in the request. For example,
   * suppose that a binding includes the following members: * `user:alice@example.com` * `group
   * :product-eng@example.com` You want to troubleshoot access for `user:bob@example.com`. This user
   * is a member of the group `group:product-eng@example.com`. For the first member in the binding,
   * the key is `user:alice@example.com`, and the `membership` field in the value is set to
   * `MEMBERSHIP_NOT_INCLUDED`. For the second member in the binding, the key is `group:product-
   * eng@example.com`, and the `membership` field in the value is set to `MEMBERSHIP_INCLUDED`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership> getMemberships() {
    return memberships;
  }

  /**
   * Indicates whether each member in the binding includes the member specified in the request,
   * either directly or indirectly. Each key identifies a member in the binding, and each value
   * indicates whether the member in the binding includes the member in the request. For example,
   * suppose that a binding includes the following members: * `user:alice@example.com` * `group
   * :product-eng@example.com` You want to troubleshoot access for `user:bob@example.com`. This user
   * is a member of the group `group:product-eng@example.com`. For the first member in the binding,
   * the key is `user:alice@example.com`, and the `membership` field in the value is set to
   * `MEMBERSHIP_NOT_INCLUDED`. For the second member in the binding, the key is `group:product-
   * eng@example.com`, and the `membership` field in the value is set to `MEMBERSHIP_INCLUDED`.
   * @param memberships memberships or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1BindingExplanation setMemberships(java.util.Map<String, GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership> memberships) {
    this.memberships = memberships;
    return this;
  }

  /**
   * The relevance of this binding to the overall determination for the entire policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelevance() {
    return relevance;
  }

  /**
   * The relevance of this binding to the overall determination for the entire policy.
   * @param relevance relevance or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1BindingExplanation setRelevance(java.lang.String relevance) {
    this.relevance = relevance;
    return this;
  }

  /**
   * The role that this binding grants. For example, `roles/compute.serviceAgent`. For a complete
   * list of predefined IAM roles, as well as the permissions in each role, see
   * https://cloud.google.com/iam/help/roles/reference.
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * The role that this binding grants. For example, `roles/compute.serviceAgent`. For a complete
   * list of predefined IAM roles, as well as the permissions in each role, see
   * https://cloud.google.com/iam/help/roles/reference.
   * @param role role or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1BindingExplanation setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  /**
   * Indicates whether the role granted by this binding contains the specified permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getRolePermission() {
    return rolePermission;
  }

  /**
   * Indicates whether the role granted by this binding contains the specified permission.
   * @param rolePermission rolePermission or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1BindingExplanation setRolePermission(java.lang.String rolePermission) {
    this.rolePermission = rolePermission;
    return this;
  }

  /**
   * The relevance of the permission's existence, or nonexistence, in the role to the overall
   * determination for the entire policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getRolePermissionRelevance() {
    return rolePermissionRelevance;
  }

  /**
   * The relevance of the permission's existence, or nonexistence, in the role to the overall
   * determination for the entire policy.
   * @param rolePermissionRelevance rolePermissionRelevance or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1BindingExplanation setRolePermissionRelevance(java.lang.String rolePermissionRelevance) {
    this.rolePermissionRelevance = rolePermissionRelevance;
    return this;
  }

  @Override
  public GoogleCloudPolicytroubleshooterV1BindingExplanation set(String fieldName, Object value) {
    return (GoogleCloudPolicytroubleshooterV1BindingExplanation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPolicytroubleshooterV1BindingExplanation clone() {
    return (GoogleCloudPolicytroubleshooterV1BindingExplanation) super.clone();
  }

}
