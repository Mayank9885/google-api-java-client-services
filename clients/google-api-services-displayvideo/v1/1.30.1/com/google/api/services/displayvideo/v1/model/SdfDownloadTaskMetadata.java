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

package com.google.api.services.displayvideo.v1.model;

/**
 * Type for the metadata returned by [SdfDownloadTaskService.CreateSdfDownloadTask].
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SdfDownloadTaskMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time when the operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The time when execution was completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The SDF version used to execute this download task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * The time when the operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time when the operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public SdfDownloadTaskMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time when execution was completed.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time when execution was completed.
   * @param endTime endTime or {@code null} for none
   */
  public SdfDownloadTaskMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The SDF version used to execute this download task.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The SDF version used to execute this download task.
   * @param version version or {@code null} for none
   */
  public SdfDownloadTaskMetadata setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public SdfDownloadTaskMetadata set(String fieldName, Object value) {
    return (SdfDownloadTaskMetadata) super.set(fieldName, value);
  }

  @Override
  public SdfDownloadTaskMetadata clone() {
    return (SdfDownloadTaskMetadata) super.clone();
  }

}