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

package com.google.api.services.classroom.model;

/**
 * YouTube video item.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class YouTubeVideo extends com.google.api.client.json.GenericJson {

  /**
   * URL that can be used to view the YouTube video. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alternateLink;

  /**
   * YouTube API resource ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * URL of a thumbnail image of the YouTube video. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailUrl;

  /**
   * Title of the YouTube video. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * URL that can be used to view the YouTube video. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternateLink() {
    return alternateLink;
  }

  /**
   * URL that can be used to view the YouTube video. Read-only.
   * @param alternateLink alternateLink or {@code null} for none
   */
  public YouTubeVideo setAlternateLink(java.lang.String alternateLink) {
    this.alternateLink = alternateLink;
    return this;
  }

  /**
   * YouTube API resource ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * YouTube API resource ID.
   * @param id id or {@code null} for none
   */
  public YouTubeVideo setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * URL of a thumbnail image of the YouTube video. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailUrl() {
    return thumbnailUrl;
  }

  /**
   * URL of a thumbnail image of the YouTube video. Read-only.
   * @param thumbnailUrl thumbnailUrl or {@code null} for none
   */
  public YouTubeVideo setThumbnailUrl(java.lang.String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  /**
   * Title of the YouTube video. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of the YouTube video. Read-only.
   * @param title title or {@code null} for none
   */
  public YouTubeVideo setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public YouTubeVideo set(String fieldName, Object value) {
    return (YouTubeVideo) super.set(fieldName, value);
  }

  @Override
  public YouTubeVideo clone() {
    return (YouTubeVideo) super.clone();
  }

}
