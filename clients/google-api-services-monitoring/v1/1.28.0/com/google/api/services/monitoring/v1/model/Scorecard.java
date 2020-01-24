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

package com.google.api.services.monitoring.v1.model;

/**
 * A widget showing the latest value of a metric, and how this value relates to one or more
 * thresholds.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Scorecard extends com.google.api.client.json.GenericJson {

  /**
   * Will cause the scorecard to show a gauge chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GaugeView gaugeView;

  /**
   * Will cause the scorecard to show a spark chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SparkChartView sparkChartView;

  /**
   * The thresholds used to determine the state of the scorecard given the time series' current
   * value. For an actual value x, the scorecard is in a danger state if x is less than or equal to
   * a danger threshold that triggers below, or greater than or equal to a danger threshold that
   * triggers above. Similarly, if x is above/below a warning threshold that triggers above/below,
   * then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger
   * trumps warning.)As an example, consider a scorecard with the following four thresholds: {
   * value: 90,  category: 'DANGER',  trigger: 'ABOVE', }, {  value: 70,  category: 'WARNING',
   * trigger: 'ABOVE', }, {  value: 10,  category: 'DANGER',  trigger: 'BELOW', }, {  value: 20,
   * category: 'WARNING',  trigger: 'BELOW', }Then: values less than or equal to 10 would put the
   * scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING
   * state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but
   * less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Threshold> thresholds;

  /**
   * Fields for querying time series data from the Stackdriver metrics API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeSeriesQuery timeSeriesQuery;

  /**
   * Will cause the scorecard to show a gauge chart.
   * @return value or {@code null} for none
   */
  public GaugeView getGaugeView() {
    return gaugeView;
  }

  /**
   * Will cause the scorecard to show a gauge chart.
   * @param gaugeView gaugeView or {@code null} for none
   */
  public Scorecard setGaugeView(GaugeView gaugeView) {
    this.gaugeView = gaugeView;
    return this;
  }

  /**
   * Will cause the scorecard to show a spark chart.
   * @return value or {@code null} for none
   */
  public SparkChartView getSparkChartView() {
    return sparkChartView;
  }

  /**
   * Will cause the scorecard to show a spark chart.
   * @param sparkChartView sparkChartView or {@code null} for none
   */
  public Scorecard setSparkChartView(SparkChartView sparkChartView) {
    this.sparkChartView = sparkChartView;
    return this;
  }

  /**
   * The thresholds used to determine the state of the scorecard given the time series' current
   * value. For an actual value x, the scorecard is in a danger state if x is less than or equal to
   * a danger threshold that triggers below, or greater than or equal to a danger threshold that
   * triggers above. Similarly, if x is above/below a warning threshold that triggers above/below,
   * then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger
   * trumps warning.)As an example, consider a scorecard with the following four thresholds: {
   * value: 90,  category: 'DANGER',  trigger: 'ABOVE', }, {  value: 70,  category: 'WARNING',
   * trigger: 'ABOVE', }, {  value: 10,  category: 'DANGER',  trigger: 'BELOW', }, {  value: 20,
   * category: 'WARNING',  trigger: 'BELOW', }Then: values less than or equal to 10 would put the
   * scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING
   * state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but
   * less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
   * @return value or {@code null} for none
   */
  public java.util.List<Threshold> getThresholds() {
    return thresholds;
  }

  /**
   * The thresholds used to determine the state of the scorecard given the time series' current
   * value. For an actual value x, the scorecard is in a danger state if x is less than or equal to
   * a danger threshold that triggers below, or greater than or equal to a danger threshold that
   * triggers above. Similarly, if x is above/below a warning threshold that triggers above/below,
   * then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger
   * trumps warning.)As an example, consider a scorecard with the following four thresholds: {
   * value: 90,  category: 'DANGER',  trigger: 'ABOVE', }, {  value: 70,  category: 'WARNING',
   * trigger: 'ABOVE', }, {  value: 10,  category: 'DANGER',  trigger: 'BELOW', }, {  value: 20,
   * category: 'WARNING',  trigger: 'BELOW', }Then: values less than or equal to 10 would put the
   * scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING
   * state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but
   * less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
   * @param thresholds thresholds or {@code null} for none
   */
  public Scorecard setThresholds(java.util.List<Threshold> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  /**
   * Fields for querying time series data from the Stackdriver metrics API.
   * @return value or {@code null} for none
   */
  public TimeSeriesQuery getTimeSeriesQuery() {
    return timeSeriesQuery;
  }

  /**
   * Fields for querying time series data from the Stackdriver metrics API.
   * @param timeSeriesQuery timeSeriesQuery or {@code null} for none
   */
  public Scorecard setTimeSeriesQuery(TimeSeriesQuery timeSeriesQuery) {
    this.timeSeriesQuery = timeSeriesQuery;
    return this;
  }

  @Override
  public Scorecard set(String fieldName, Object value) {
    return (Scorecard) super.set(fieldName, value);
  }

  @Override
  public Scorecard clone() {
    return (Scorecard) super.clone();
  }

}