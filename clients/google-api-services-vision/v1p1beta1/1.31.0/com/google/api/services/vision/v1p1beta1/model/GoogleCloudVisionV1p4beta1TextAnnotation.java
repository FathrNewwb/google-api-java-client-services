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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * TextAnnotation contains a structured representation of OCR extracted text. The hierarchy of an
 * OCR extracted text structure is like this: TextAnnotation -> Page -> Block -> Paragraph -> Word
 * -> Symbol Each structural component, starting from Page, may further have their own properties.
 * Properties describe detected languages, breaks etc.. Please refer to the
 * TextAnnotation.TextProperty message definition below for more detail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p4beta1TextAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * List of pages detected by OCR.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p4beta1Page> pages;

  static {
    // hack to force ProGuard to consider GoogleCloudVisionV1p4beta1Page used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVisionV1p4beta1Page.class);
  }

  /**
   * UTF-8 text detected on the pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * List of pages detected by OCR.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p4beta1Page> getPages() {
    return pages;
  }

  /**
   * List of pages detected by OCR.
   * @param pages pages or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1TextAnnotation setPages(java.util.List<GoogleCloudVisionV1p4beta1Page> pages) {
    this.pages = pages;
    return this;
  }

  /**
   * UTF-8 text detected on the pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * UTF-8 text detected on the pages.
   * @param text text or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1TextAnnotation setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p4beta1TextAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p4beta1TextAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p4beta1TextAnnotation clone() {
    return (GoogleCloudVisionV1p4beta1TextAnnotation) super.clone();
  }

}
