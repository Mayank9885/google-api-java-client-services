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

package com.google.api.services.run.v1alpha1.model;

/**
 * SecurityContext holds security configuration that will be applied to a container. Some fields are
 * present in both SecurityContext and PodSecurityContext. When both are set, the values in
 * SecurityContext take precedence.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityContext extends com.google.api.client.json.GenericJson {

  /**
   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent
   * process. This bool directly controls if the no_new_privs flag will be set on the container
   * process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2)
   * has CAP_SYS_ADMIN +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowPrivilegeEscalation;

  /**
   * The capabilities to add/drop when running containers. Defaults to the default set of
   * capabilities granted by the container runtime. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Capabilities capabilities;

  /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent
   * to root on the host. Defaults to false. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean privileged;

  /**
   * Whether this container has a read-only root filesystem. Default is false. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean readOnlyRootFilesystem;

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also
   * be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer runAsGroup;

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate
   * the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the
   * container if it does. If unset or false, no such validation will be performed. May also be set
   * in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean runAsNonRoot;

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image
   * metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext
   * and PodSecurityContext, the value specified in SecurityContext takes precedence. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer runAsUser;

  /**
   * The SELinux context to be applied to the container. If unspecified, the container runtime will
   * allocate a random SELinux context for each container. May also be set in PodSecurityContext. If
   * set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext
   * takes precedence. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SELinuxOptions seLinuxOptions;

  /**
   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent
   * process. This bool directly controls if the no_new_privs flag will be set on the container
   * process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2)
   * has CAP_SYS_ADMIN +optional
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }

  /**
   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent
   * process. This bool directly controls if the no_new_privs flag will be set on the container
   * process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2)
   * has CAP_SYS_ADMIN +optional
   * @param allowPrivilegeEscalation allowPrivilegeEscalation or {@code null} for none
   */
  public SecurityContext setAllowPrivilegeEscalation(java.lang.Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

  /**
   * The capabilities to add/drop when running containers. Defaults to the default set of
   * capabilities granted by the container runtime. +optional
   * @return value or {@code null} for none
   */
  public Capabilities getCapabilities() {
    return capabilities;
  }

  /**
   * The capabilities to add/drop when running containers. Defaults to the default set of
   * capabilities granted by the container runtime. +optional
   * @param capabilities capabilities or {@code null} for none
   */
  public SecurityContext setCapabilities(Capabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent
   * to root on the host. Defaults to false. +optional
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrivileged() {
    return privileged;
  }

  /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent
   * to root on the host. Defaults to false. +optional
   * @param privileged privileged or {@code null} for none
   */
  public SecurityContext setPrivileged(java.lang.Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Whether this container has a read-only root filesystem. Default is false. +optional
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }

  /**
   * Whether this container has a read-only root filesystem. Default is false. +optional
   * @param readOnlyRootFilesystem readOnlyRootFilesystem or {@code null} for none
   */
  public SecurityContext setReadOnlyRootFilesystem(java.lang.Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also
   * be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence. +optional
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRunAsGroup() {
    return runAsGroup;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also
   * be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence. +optional
   * @param runAsGroup runAsGroup or {@code null} for none
   */
  public SecurityContext setRunAsGroup(java.lang.Integer runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate
   * the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the
   * container if it does. If unset or false, no such validation will be performed. May also be set
   * in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence. +optional
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRunAsNonRoot() {
    return runAsNonRoot;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate
   * the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the
   * container if it does. If unset or false, no such validation will be performed. May also be set
   * in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence. +optional
   * @param runAsNonRoot runAsNonRoot or {@code null} for none
   */
  public SecurityContext setRunAsNonRoot(java.lang.Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image
   * metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext
   * and PodSecurityContext, the value specified in SecurityContext takes precedence. +optional
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRunAsUser() {
    return runAsUser;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image
   * metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext
   * and PodSecurityContext, the value specified in SecurityContext takes precedence. +optional
   * @param runAsUser runAsUser or {@code null} for none
   */
  public SecurityContext setRunAsUser(java.lang.Integer runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * The SELinux context to be applied to the container. If unspecified, the container runtime will
   * allocate a random SELinux context for each container. May also be set in PodSecurityContext. If
   * set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext
   * takes precedence. +optional
   * @return value or {@code null} for none
   */
  public SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  /**
   * The SELinux context to be applied to the container. If unspecified, the container runtime will
   * allocate a random SELinux context for each container. May also be set in PodSecurityContext. If
   * set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext
   * takes precedence. +optional
   * @param seLinuxOptions seLinuxOptions or {@code null} for none
   */
  public SecurityContext setSeLinuxOptions(SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

  @Override
  public SecurityContext set(String fieldName, Object value) {
    return (SecurityContext) super.set(fieldName, value);
  }

  @Override
  public SecurityContext clone() {
    return (SecurityContext) super.clone();
  }

}
