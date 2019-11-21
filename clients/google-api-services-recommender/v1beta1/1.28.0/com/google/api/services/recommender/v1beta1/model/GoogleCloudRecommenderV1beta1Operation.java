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

package com.google.api.services.recommender.v1beta1.model;

/**
 * Contains an operation for a resource loosely based on the JSON-PATCH format with support for:
 *
 * * Custom filters for describing partial array patch. * Extended path values for describing nested
 * arrays. * Custom fields for describing the resource for which the operation is being   described.
 * * Allows extension to custom operations not natively supported by RFC6902. See
 * https://tools.ietf.org/html/rfc6902 for details on the original RFC.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommender API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommenderV1beta1Operation extends com.google.api.client.json.GenericJson {

  /**
   * Type of this operation. Contains one of 'and', 'remove', 'replace', 'move', 'copy', 'test' and
   * 'custom' operations. This field is case-insensitive and always populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * Path to the target field being operated on. If the operation is at the resource level, then
   * path should be "/". This field is always populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Set of filters to apply if `path` refers to array elements or nested array elements in order to
   * narrow down to a single unique element that is being tested/modified. This is intended to be an
   * exact match per filter. To perform advanced matching, use path_value_matchers.
   *
   * * Example: {   "/versions/name" : "it-123"   "/versions/targetSize/percent": 20   } * Example:
   * {   "/bindings/role": "roles/admin"   "/bindings/condition" : null   } * Example: {
   * "/bindings/role": "roles/admin"   "/bindings/members" : ["x@google.com", "y@google.com"]   }
   * When both path_filters and path_value_matchers are set, an implicit AND must be performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> pathFilters;

  /**
   * Similar to path_filters, this contains set of filters to apply if `path` field referes to array
   * elements. This is meant to support value matching beyond exact match. To perform exact match,
   * use path_filters. When both path_filters and path_value_matchers are set, an implicit AND must
   * be performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudRecommenderV1beta1ValueMatcher> pathValueMatchers;

  /**
   * Contains the fully qualified resource name. This field is always populated. ex:
   * //cloudresourcemanager.googleapis.com/projects/foo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resource;

  /**
   * Type of GCP resource being modified/tested. This field is always populated. Example:
   * cloudresourcemanager.googleapis.com/Project, compute.googleapis.com/Instance
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceType;

  /**
   * Can be set with action 'copy' or 'move' to indicate the source field within resource or
   * source_resource, ignored if provided for other operation types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourcePath;

  /**
   * Can be set with action 'copy' to copy resource configuration across different resources of the
   * same type. Example: A resource clone can be done via action = 'copy', path = "/", from = "/",
   * source_resource =  and resource_name = . This field is empty for all other values of `action`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceResource;

  /**
   * Value for the `path` field. Will be set for actions:'add'/'replace'. Maybe set for action:
   * 'test'. Either this or `value_matcher` will be set for 'test' operation. An exact match must be
   * performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object value;

  /**
   * Can be set for action 'test' for advanced matching for the value of 'path' field. Either this
   * or `value` will be set for 'test' operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecommenderV1beta1ValueMatcher valueMatcher;

  /**
   * Type of this operation. Contains one of 'and', 'remove', 'replace', 'move', 'copy', 'test' and
   * 'custom' operations. This field is case-insensitive and always populated.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Type of this operation. Contains one of 'and', 'remove', 'replace', 'move', 'copy', 'test' and
   * 'custom' operations. This field is case-insensitive and always populated.
   * @param action action or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Operation setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * Path to the target field being operated on. If the operation is at the resource level, then
   * path should be "/". This field is always populated.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Path to the target field being operated on. If the operation is at the resource level, then
   * path should be "/". This field is always populated.
   * @param path path or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Operation setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Set of filters to apply if `path` refers to array elements or nested array elements in order to
   * narrow down to a single unique element that is being tested/modified. This is intended to be an
   * exact match per filter. To perform advanced matching, use path_value_matchers.
   *
   * * Example: {   "/versions/name" : "it-123"   "/versions/targetSize/percent": 20   } * Example:
   * {   "/bindings/role": "roles/admin"   "/bindings/condition" : null   } * Example: {
   * "/bindings/role": "roles/admin"   "/bindings/members" : ["x@google.com", "y@google.com"]   }
   * When both path_filters and path_value_matchers are set, an implicit AND must be performed.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPathFilters() {
    return pathFilters;
  }

  /**
   * Set of filters to apply if `path` refers to array elements or nested array elements in order to
   * narrow down to a single unique element that is being tested/modified. This is intended to be an
   * exact match per filter. To perform advanced matching, use path_value_matchers.
   *
   * * Example: {   "/versions/name" : "it-123"   "/versions/targetSize/percent": 20   } * Example:
   * {   "/bindings/role": "roles/admin"   "/bindings/condition" : null   } * Example: {
   * "/bindings/role": "roles/admin"   "/bindings/members" : ["x@google.com", "y@google.com"]   }
   * When both path_filters and path_value_matchers are set, an implicit AND must be performed.
   * @param pathFilters pathFilters or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Operation setPathFilters(java.util.Map<String, java.lang.Object> pathFilters) {
    this.pathFilters = pathFilters;
    return this;
  }

  /**
   * Similar to path_filters, this contains set of filters to apply if `path` field referes to array
   * elements. This is meant to support value matching beyond exact match. To perform exact match,
   * use path_filters. When both path_filters and path_value_matchers are set, an implicit AND must
   * be performed.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudRecommenderV1beta1ValueMatcher> getPathValueMatchers() {
    return pathValueMatchers;
  }

  /**
   * Similar to path_filters, this contains set of filters to apply if `path` field referes to array
   * elements. This is meant to support value matching beyond exact match. To perform exact match,
   * use path_filters. When both path_filters and path_value_matchers are set, an implicit AND must
   * be performed.
   * @param pathValueMatchers pathValueMatchers or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Operation setPathValueMatchers(java.util.Map<String, GoogleCloudRecommenderV1beta1ValueMatcher> pathValueMatchers) {
    this.pathValueMatchers = pathValueMatchers;
    return this;
  }

  /**
   * Contains the fully qualified resource name. This field is always populated. ex:
   * //cloudresourcemanager.googleapis.com/projects/foo.
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * Contains the fully qualified resource name. This field is always populated. ex:
   * //cloudresourcemanager.googleapis.com/projects/foo.
   * @param resource resource or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Operation setResource(java.lang.String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Type of GCP resource being modified/tested. This field is always populated. Example:
   * cloudresourcemanager.googleapis.com/Project, compute.googleapis.com/Instance
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * Type of GCP resource being modified/tested. This field is always populated. Example:
   * cloudresourcemanager.googleapis.com/Project, compute.googleapis.com/Instance
   * @param resourceType resourceType or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Operation setResourceType(java.lang.String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Can be set with action 'copy' or 'move' to indicate the source field within resource or
   * source_resource, ignored if provided for other operation types.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourcePath() {
    return sourcePath;
  }

  /**
   * Can be set with action 'copy' or 'move' to indicate the source field within resource or
   * source_resource, ignored if provided for other operation types.
   * @param sourcePath sourcePath or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Operation setSourcePath(java.lang.String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  /**
   * Can be set with action 'copy' to copy resource configuration across different resources of the
   * same type. Example: A resource clone can be done via action = 'copy', path = "/", from = "/",
   * source_resource =  and resource_name = . This field is empty for all other values of `action`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceResource() {
    return sourceResource;
  }

  /**
   * Can be set with action 'copy' to copy resource configuration across different resources of the
   * same type. Example: A resource clone can be done via action = 'copy', path = "/", from = "/",
   * source_resource =  and resource_name = . This field is empty for all other values of `action`.
   * @param sourceResource sourceResource or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Operation setSourceResource(java.lang.String sourceResource) {
    this.sourceResource = sourceResource;
    return this;
  }

  /**
   * Value for the `path` field. Will be set for actions:'add'/'replace'. Maybe set for action:
   * 'test'. Either this or `value_matcher` will be set for 'test' operation. An exact match must be
   * performed.
   * @return value or {@code null} for none
   */
  public java.lang.Object getValue() {
    return value;
  }

  /**
   * Value for the `path` field. Will be set for actions:'add'/'replace'. Maybe set for action:
   * 'test'. Either this or `value_matcher` will be set for 'test' operation. An exact match must be
   * performed.
   * @param value value or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Operation setValue(java.lang.Object value) {
    this.value = value;
    return this;
  }

  /**
   * Can be set for action 'test' for advanced matching for the value of 'path' field. Either this
   * or `value` will be set for 'test' operation.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1ValueMatcher getValueMatcher() {
    return valueMatcher;
  }

  /**
   * Can be set for action 'test' for advanced matching for the value of 'path' field. Either this
   * or `value` will be set for 'test' operation.
   * @param valueMatcher valueMatcher or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Operation setValueMatcher(GoogleCloudRecommenderV1beta1ValueMatcher valueMatcher) {
    this.valueMatcher = valueMatcher;
    return this;
  }

  @Override
  public GoogleCloudRecommenderV1beta1Operation set(String fieldName, Object value) {
    return (GoogleCloudRecommenderV1beta1Operation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommenderV1beta1Operation clone() {
    return (GoogleCloudRecommenderV1beta1Operation) super.clone();
  }

}
