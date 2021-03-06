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

package com.google.api.services.datalabeling.v1beta1.model;

/**
 * Annotation spec set with the setting of allowing multi labels or not.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If allow_multi_label is true, contributors are able to choose multiple labels from
   * one annotation spec set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowMultiLabel;

  /**
   * Required. Annotation spec set resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationSpecSet;

  /**
   * Optional. If allow_multi_label is true, contributors are able to choose multiple labels from
   * one annotation spec set.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowMultiLabel() {
    return allowMultiLabel;
  }

  /**
   * Optional. If allow_multi_label is true, contributors are able to choose multiple labels from
   * one annotation spec set.
   * @param allowMultiLabel allowMultiLabel or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig setAllowMultiLabel(java.lang.Boolean allowMultiLabel) {
    this.allowMultiLabel = allowMultiLabel;
    return this;
  }

  /**
   * Required. Annotation spec set resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationSpecSet() {
    return annotationSpecSet;
  }

  /**
   * Required. Annotation spec set resource name.
   * @param annotationSpecSet annotationSpecSet or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig setAnnotationSpecSet(java.lang.String annotationSpecSet) {
    this.annotationSpecSet = annotationSpecSet;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig clone() {
    return (GoogleCloudDatalabelingV1beta1AnnotationSpecSetConfig) super.clone();
  }

}
