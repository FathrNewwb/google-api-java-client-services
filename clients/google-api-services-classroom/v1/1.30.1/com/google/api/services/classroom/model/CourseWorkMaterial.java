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
 * Course work material created by a teacher for students of the course
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CourseWorkMaterial extends com.google.api.client.json.GenericJson {

  /**
   * Absolute link to this course work material in the Classroom web UI. This is only populated if
   * `state` is `PUBLISHED`. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alternateLink;

  /**
   * Assignee mode of the course work material. If unspecified, the default value is `ALL_STUDENTS`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assigneeMode;

  /**
   * Identifier of the course. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String courseId;

  /**
   * Timestamp when this course work material was created. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String creationTime;

  /**
   * Identifier for the user that created the course work material. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creatorUserId;

  /**
   * Optional description of this course work material. The text must be a valid UTF-8 string
   * containing no more than 30,000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Classroom-assigned identifier of this course work material, unique per course. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifiers of students with access to the course work material. This field is set only if
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then
   * only students specified in this field can see the course work material.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndividualStudentsOptions individualStudentsOptions;

  /**
   * Additional materials. A course work material must have no more than 20 material items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Material> materials;

  /**
   * Optional timestamp when this course work material is scheduled to be published.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduledTime;

  /**
   * Status of this course work material. If unspecified, the default state is `DRAFT`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Title of this course work material. The title must be a valid UTF-8 string containing between 1
   * and 3000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Identifier for the topic that this course work material is associated with. Must match an
   * existing topic in the course.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topicId;

  /**
   * Timestamp of the most recent change to this course work material. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Absolute link to this course work material in the Classroom web UI. This is only populated if
   * `state` is `PUBLISHED`. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternateLink() {
    return alternateLink;
  }

  /**
   * Absolute link to this course work material in the Classroom web UI. This is only populated if
   * `state` is `PUBLISHED`. Read-only.
   * @param alternateLink alternateLink or {@code null} for none
   */
  public CourseWorkMaterial setAlternateLink(java.lang.String alternateLink) {
    this.alternateLink = alternateLink;
    return this;
  }

  /**
   * Assignee mode of the course work material. If unspecified, the default value is `ALL_STUDENTS`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssigneeMode() {
    return assigneeMode;
  }

  /**
   * Assignee mode of the course work material. If unspecified, the default value is `ALL_STUDENTS`.
   * @param assigneeMode assigneeMode or {@code null} for none
   */
  public CourseWorkMaterial setAssigneeMode(java.lang.String assigneeMode) {
    this.assigneeMode = assigneeMode;
    return this;
  }

  /**
   * Identifier of the course. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getCourseId() {
    return courseId;
  }

  /**
   * Identifier of the course. Read-only.
   * @param courseId courseId or {@code null} for none
   */
  public CourseWorkMaterial setCourseId(java.lang.String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Timestamp when this course work material was created. Read-only.
   * @return value or {@code null} for none
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Timestamp when this course work material was created. Read-only.
   * @param creationTime creationTime or {@code null} for none
   */
  public CourseWorkMaterial setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Identifier for the user that created the course work material. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreatorUserId() {
    return creatorUserId;
  }

  /**
   * Identifier for the user that created the course work material. Read-only.
   * @param creatorUserId creatorUserId or {@code null} for none
   */
  public CourseWorkMaterial setCreatorUserId(java.lang.String creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  /**
   * Optional description of this course work material. The text must be a valid UTF-8 string
   * containing no more than 30,000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional description of this course work material. The text must be a valid UTF-8 string
   * containing no more than 30,000 characters.
   * @param description description or {@code null} for none
   */
  public CourseWorkMaterial setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Classroom-assigned identifier of this course work material, unique per course. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Classroom-assigned identifier of this course work material, unique per course. Read-only.
   * @param id id or {@code null} for none
   */
  public CourseWorkMaterial setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifiers of students with access to the course work material. This field is set only if
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then
   * only students specified in this field can see the course work material.
   * @return value or {@code null} for none
   */
  public IndividualStudentsOptions getIndividualStudentsOptions() {
    return individualStudentsOptions;
  }

  /**
   * Identifiers of students with access to the course work material. This field is set only if
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then
   * only students specified in this field can see the course work material.
   * @param individualStudentsOptions individualStudentsOptions or {@code null} for none
   */
  public CourseWorkMaterial setIndividualStudentsOptions(IndividualStudentsOptions individualStudentsOptions) {
    this.individualStudentsOptions = individualStudentsOptions;
    return this;
  }

  /**
   * Additional materials. A course work material must have no more than 20 material items.
   * @return value or {@code null} for none
   */
  public java.util.List<Material> getMaterials() {
    return materials;
  }

  /**
   * Additional materials. A course work material must have no more than 20 material items.
   * @param materials materials or {@code null} for none
   */
  public CourseWorkMaterial setMaterials(java.util.List<Material> materials) {
    this.materials = materials;
    return this;
  }

  /**
   * Optional timestamp when this course work material is scheduled to be published.
   * @return value or {@code null} for none
   */
  public String getScheduledTime() {
    return scheduledTime;
  }

  /**
   * Optional timestamp when this course work material is scheduled to be published.
   * @param scheduledTime scheduledTime or {@code null} for none
   */
  public CourseWorkMaterial setScheduledTime(String scheduledTime) {
    this.scheduledTime = scheduledTime;
    return this;
  }

  /**
   * Status of this course work material. If unspecified, the default state is `DRAFT`.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Status of this course work material. If unspecified, the default state is `DRAFT`.
   * @param state state or {@code null} for none
   */
  public CourseWorkMaterial setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Title of this course work material. The title must be a valid UTF-8 string containing between 1
   * and 3000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of this course work material. The title must be a valid UTF-8 string containing between 1
   * and 3000 characters.
   * @param title title or {@code null} for none
   */
  public CourseWorkMaterial setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Identifier for the topic that this course work material is associated with. Must match an
   * existing topic in the course.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopicId() {
    return topicId;
  }

  /**
   * Identifier for the topic that this course work material is associated with. Must match an
   * existing topic in the course.
   * @param topicId topicId or {@code null} for none
   */
  public CourseWorkMaterial setTopicId(java.lang.String topicId) {
    this.topicId = topicId;
    return this;
  }

  /**
   * Timestamp of the most recent change to this course work material. Read-only.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Timestamp of the most recent change to this course work material. Read-only.
   * @param updateTime updateTime or {@code null} for none
   */
  public CourseWorkMaterial setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public CourseWorkMaterial set(String fieldName, Object value) {
    return (CourseWorkMaterial) super.set(fieldName, value);
  }

  @Override
  public CourseWorkMaterial clone() {
    return (CourseWorkMaterial) super.clone();
  }

}
