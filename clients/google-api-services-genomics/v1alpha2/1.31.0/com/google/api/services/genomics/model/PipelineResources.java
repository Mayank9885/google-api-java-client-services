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

package com.google.api.services.genomics.model;

/**
 * The system resources for the pipeline run.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PipelineResources extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The number of accelerators of the specified type to attach. By specifying this
   * parameter, you will download and install the following third-party software onto your managed
   * Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long acceleratorCount;

  /**
   * Optional. The Compute Engine defined accelerator type. By specifying this parameter, you will
   * download and install the following third-party software onto your managed Compute Engine
   * instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit. Please see
   * https://cloud.google.com/compute/docs/gpus/ for a list of available accelerator types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acceleratorType;

  /**
   * The size of the boot disk. Defaults to 10 (GB).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer bootDiskSizeGb;

  /**
   * Disks to attach.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Disk> disks;

  static {
    // hack to force ProGuard to consider Disk used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Disk.class);
  }

  /**
   * The minimum number of cores to use. Defaults to 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minimumCpuCores;

  /**
   * The minimum amount of RAM to use. Defaults to 3.75 (GB)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minimumRamGb;

  /**
   * Whether to assign an external IP to the instance. This is an experimental feature that may go
   * away. Defaults to false. Corresponds to `--no_address` flag for [gcloud compute instances
   * create] (https://cloud.google.com/sdk/gcloud/reference/compute/instances/create). In order to
   * use this, must be true for both create time and run time. Cannot be true at run time if false
   * at create time. If you need to ssh into a private IP VM for debugging, you can ssh to a public
   * VM and then ssh into the private VM's Internal IP. If noAddress is set, this pipeline run may
   * only load docker images from Google Container Registry and not Docker Hub. Before using this,
   * you must [configure access to Google services from internal
   * IPs](https://cloud.google.com/compute/docs/configure-private-google-
   * access#configuring_access_to_google_services_from_internal_ips).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean noAddress;

  /**
   * Whether to use preemptible VMs. Defaults to `false`. In order to use this, must be true for
   * both create time and run time. Cannot be true at run time if false at create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preemptible;

  /**
   * List of Google Compute Engine availability zones to which resource creation will restricted. If
   * empty, any zone may be chosen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> zones;

  /**
   * Optional. The number of accelerators of the specified type to attach. By specifying this
   * parameter, you will download and install the following third-party software onto your managed
   * Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAcceleratorCount() {
    return acceleratorCount;
  }

  /**
   * Optional. The number of accelerators of the specified type to attach. By specifying this
   * parameter, you will download and install the following third-party software onto your managed
   * Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit.
   * @param acceleratorCount acceleratorCount or {@code null} for none
   */
  public PipelineResources setAcceleratorCount(java.lang.Long acceleratorCount) {
    this.acceleratorCount = acceleratorCount;
    return this;
  }

  /**
   * Optional. The Compute Engine defined accelerator type. By specifying this parameter, you will
   * download and install the following third-party software onto your managed Compute Engine
   * instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit. Please see
   * https://cloud.google.com/compute/docs/gpus/ for a list of available accelerator types.
   * @return value or {@code null} for none
   */
  public java.lang.String getAcceleratorType() {
    return acceleratorType;
  }

  /**
   * Optional. The Compute Engine defined accelerator type. By specifying this parameter, you will
   * download and install the following third-party software onto your managed Compute Engine
   * instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit. Please see
   * https://cloud.google.com/compute/docs/gpus/ for a list of available accelerator types.
   * @param acceleratorType acceleratorType or {@code null} for none
   */
  public PipelineResources setAcceleratorType(java.lang.String acceleratorType) {
    this.acceleratorType = acceleratorType;
    return this;
  }

  /**
   * The size of the boot disk. Defaults to 10 (GB).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBootDiskSizeGb() {
    return bootDiskSizeGb;
  }

  /**
   * The size of the boot disk. Defaults to 10 (GB).
   * @param bootDiskSizeGb bootDiskSizeGb or {@code null} for none
   */
  public PipelineResources setBootDiskSizeGb(java.lang.Integer bootDiskSizeGb) {
    this.bootDiskSizeGb = bootDiskSizeGb;
    return this;
  }

  /**
   * Disks to attach.
   * @return value or {@code null} for none
   */
  public java.util.List<Disk> getDisks() {
    return disks;
  }

  /**
   * Disks to attach.
   * @param disks disks or {@code null} for none
   */
  public PipelineResources setDisks(java.util.List<Disk> disks) {
    this.disks = disks;
    return this;
  }

  /**
   * The minimum number of cores to use. Defaults to 1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinimumCpuCores() {
    return minimumCpuCores;
  }

  /**
   * The minimum number of cores to use. Defaults to 1.
   * @param minimumCpuCores minimumCpuCores or {@code null} for none
   */
  public PipelineResources setMinimumCpuCores(java.lang.Integer minimumCpuCores) {
    this.minimumCpuCores = minimumCpuCores;
    return this;
  }

  /**
   * The minimum amount of RAM to use. Defaults to 3.75 (GB)
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinimumRamGb() {
    return minimumRamGb;
  }

  /**
   * The minimum amount of RAM to use. Defaults to 3.75 (GB)
   * @param minimumRamGb minimumRamGb or {@code null} for none
   */
  public PipelineResources setMinimumRamGb(java.lang.Double minimumRamGb) {
    this.minimumRamGb = minimumRamGb;
    return this;
  }

  /**
   * Whether to assign an external IP to the instance. This is an experimental feature that may go
   * away. Defaults to false. Corresponds to `--no_address` flag for [gcloud compute instances
   * create] (https://cloud.google.com/sdk/gcloud/reference/compute/instances/create). In order to
   * use this, must be true for both create time and run time. Cannot be true at run time if false
   * at create time. If you need to ssh into a private IP VM for debugging, you can ssh to a public
   * VM and then ssh into the private VM's Internal IP. If noAddress is set, this pipeline run may
   * only load docker images from Google Container Registry and not Docker Hub. Before using this,
   * you must [configure access to Google services from internal
   * IPs](https://cloud.google.com/compute/docs/configure-private-google-
   * access#configuring_access_to_google_services_from_internal_ips).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNoAddress() {
    return noAddress;
  }

  /**
   * Whether to assign an external IP to the instance. This is an experimental feature that may go
   * away. Defaults to false. Corresponds to `--no_address` flag for [gcloud compute instances
   * create] (https://cloud.google.com/sdk/gcloud/reference/compute/instances/create). In order to
   * use this, must be true for both create time and run time. Cannot be true at run time if false
   * at create time. If you need to ssh into a private IP VM for debugging, you can ssh to a public
   * VM and then ssh into the private VM's Internal IP. If noAddress is set, this pipeline run may
   * only load docker images from Google Container Registry and not Docker Hub. Before using this,
   * you must [configure access to Google services from internal
   * IPs](https://cloud.google.com/compute/docs/configure-private-google-
   * access#configuring_access_to_google_services_from_internal_ips).
   * @param noAddress noAddress or {@code null} for none
   */
  public PipelineResources setNoAddress(java.lang.Boolean noAddress) {
    this.noAddress = noAddress;
    return this;
  }

  /**
   * Whether to use preemptible VMs. Defaults to `false`. In order to use this, must be true for
   * both create time and run time. Cannot be true at run time if false at create time.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreemptible() {
    return preemptible;
  }

  /**
   * Whether to use preemptible VMs. Defaults to `false`. In order to use this, must be true for
   * both create time and run time. Cannot be true at run time if false at create time.
   * @param preemptible preemptible or {@code null} for none
   */
  public PipelineResources setPreemptible(java.lang.Boolean preemptible) {
    this.preemptible = preemptible;
    return this;
  }

  /**
   * List of Google Compute Engine availability zones to which resource creation will restricted. If
   * empty, any zone may be chosen.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getZones() {
    return zones;
  }

  /**
   * List of Google Compute Engine availability zones to which resource creation will restricted. If
   * empty, any zone may be chosen.
   * @param zones zones or {@code null} for none
   */
  public PipelineResources setZones(java.util.List<java.lang.String> zones) {
    this.zones = zones;
    return this;
  }

  @Override
  public PipelineResources set(String fieldName, Object value) {
    return (PipelineResources) super.set(fieldName, value);
  }

  @Override
  public PipelineResources clone() {
    return (PipelineResources) super.clone();
  }

}
