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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * A channel grouping defines a set of rules that can be used to categorize events in a path report.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChannelGrouping extends com.google.api.client.json.GenericJson {

  /**
   * The name to apply to an event that does not match any of the rules in the channel grouping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fallbackName;

  /**
   * Channel Grouping name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Rules within Channel Grouping. There is a limit of 100 rules that can be set per channel
   * grouping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Rule> rules;

  /**
   * The name to apply to an event that does not match any of the rules in the channel grouping.
   * @return value or {@code null} for none
   */
  public java.lang.String getFallbackName() {
    return fallbackName;
  }

  /**
   * The name to apply to an event that does not match any of the rules in the channel grouping.
   * @param fallbackName fallbackName or {@code null} for none
   */
  public ChannelGrouping setFallbackName(java.lang.String fallbackName) {
    this.fallbackName = fallbackName;
    return this;
  }

  /**
   * Channel Grouping name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Channel Grouping name.
   * @param name name or {@code null} for none
   */
  public ChannelGrouping setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Rules within Channel Grouping. There is a limit of 100 rules that can be set per channel
   * grouping.
   * @return value or {@code null} for none
   */
  public java.util.List<Rule> getRules() {
    return rules;
  }

  /**
   * Rules within Channel Grouping. There is a limit of 100 rules that can be set per channel
   * grouping.
   * @param rules rules or {@code null} for none
   */
  public ChannelGrouping setRules(java.util.List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  @Override
  public ChannelGrouping set(String fieldName, Object value) {
    return (ChannelGrouping) super.set(fieldName, value);
  }

  @Override
  public ChannelGrouping clone() {
    return (ChannelGrouping) super.clone();
  }

}
