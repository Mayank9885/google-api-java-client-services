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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Deprecated. Final response of importing Annotations in partial or total failure case. This
 * structure is included in the error details. It is only included when the operation finishes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportAnnotationsErrorDetails extends com.google.api.client.json.GenericJson {

  /**
   * The annotation_store that the annotations were imported to. The name is in the format `projects
   * /{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_
   * id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationStore;

  /**
   * The number of annotations that had errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long errorCount;

  /**
   * The number of annotations that have been imported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long successCount;

  /**
   * The annotation_store that the annotations were imported to. The name is in the format `projects
   * /{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_
   * id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationStore() {
    return annotationStore;
  }

  /**
   * The annotation_store that the annotations were imported to. The name is in the format `projects
   * /{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_
   * id}`.
   * @param annotationStore annotationStore or {@code null} for none
   */
  public ImportAnnotationsErrorDetails setAnnotationStore(java.lang.String annotationStore) {
    this.annotationStore = annotationStore;
    return this;
  }

  /**
   * The number of annotations that had errors.
   * @return value or {@code null} for none
   */
  public java.lang.Long getErrorCount() {
    return errorCount;
  }

  /**
   * The number of annotations that had errors.
   * @param errorCount errorCount or {@code null} for none
   */
  public ImportAnnotationsErrorDetails setErrorCount(java.lang.Long errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * The number of annotations that have been imported.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSuccessCount() {
    return successCount;
  }

  /**
   * The number of annotations that have been imported.
   * @param successCount successCount or {@code null} for none
   */
  public ImportAnnotationsErrorDetails setSuccessCount(java.lang.Long successCount) {
    this.successCount = successCount;
    return this;
  }

  @Override
  public ImportAnnotationsErrorDetails set(String fieldName, Object value) {
    return (ImportAnnotationsErrorDetails) super.set(fieldName, value);
  }

  @Override
  public ImportAnnotationsErrorDetails clone() {
    return (ImportAnnotationsErrorDetails) super.clone();
  }

}
