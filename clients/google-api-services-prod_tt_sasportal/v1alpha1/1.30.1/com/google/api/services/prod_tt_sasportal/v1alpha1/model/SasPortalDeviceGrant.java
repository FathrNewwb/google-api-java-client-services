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

package com.google.api.services.prod_tt_sasportal.v1alpha1.model;

/**
 * Device grant. It is an authorization provided by the Spectrum Access System to a device to
 * transmit using specified operating parameters after a successful heartbeat by the device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API (Testing). For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalDeviceGrant extends com.google.api.client.json.GenericJson {

  /**
   * Type of channel used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelType;

  /**
   * The expiration time of the grant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * The transmission frequency range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SasPortalFrequencyRange frequencyRange;

  /**
   * Maximum Equivalent Isotropically Radiated Power (EIRP) permitted by the grant. The maximum EIRP
   * is in units of dBm/MHz. The value of maxEirp represents the average (RMS) EIRP that would be
   * measured by the procedure defined in FCC part 96.41(e)(3).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxEirp;

  /**
   * The DPA move lists on which this grant appears.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SasPortalDpaMoveList> moveList;

  /**
   * State of the grant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Type of channel used.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelType() {
    return channelType;
  }

  /**
   * Type of channel used.
   * @param channelType channelType or {@code null} for none
   */
  public SasPortalDeviceGrant setChannelType(java.lang.String channelType) {
    this.channelType = channelType;
    return this;
  }

  /**
   * The expiration time of the grant.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * The expiration time of the grant.
   * @param expireTime expireTime or {@code null} for none
   */
  public SasPortalDeviceGrant setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * The transmission frequency range.
   * @return value or {@code null} for none
   */
  public SasPortalFrequencyRange getFrequencyRange() {
    return frequencyRange;
  }

  /**
   * The transmission frequency range.
   * @param frequencyRange frequencyRange or {@code null} for none
   */
  public SasPortalDeviceGrant setFrequencyRange(SasPortalFrequencyRange frequencyRange) {
    this.frequencyRange = frequencyRange;
    return this;
  }

  /**
   * Maximum Equivalent Isotropically Radiated Power (EIRP) permitted by the grant. The maximum EIRP
   * is in units of dBm/MHz. The value of maxEirp represents the average (RMS) EIRP that would be
   * measured by the procedure defined in FCC part 96.41(e)(3).
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxEirp() {
    return maxEirp;
  }

  /**
   * Maximum Equivalent Isotropically Radiated Power (EIRP) permitted by the grant. The maximum EIRP
   * is in units of dBm/MHz. The value of maxEirp represents the average (RMS) EIRP that would be
   * measured by the procedure defined in FCC part 96.41(e)(3).
   * @param maxEirp maxEirp or {@code null} for none
   */
  public SasPortalDeviceGrant setMaxEirp(java.lang.Double maxEirp) {
    this.maxEirp = maxEirp;
    return this;
  }

  /**
   * The DPA move lists on which this grant appears.
   * @return value or {@code null} for none
   */
  public java.util.List<SasPortalDpaMoveList> getMoveList() {
    return moveList;
  }

  /**
   * The DPA move lists on which this grant appears.
   * @param moveList moveList or {@code null} for none
   */
  public SasPortalDeviceGrant setMoveList(java.util.List<SasPortalDpaMoveList> moveList) {
    this.moveList = moveList;
    return this;
  }

  /**
   * State of the grant.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the grant.
   * @param state state or {@code null} for none
   */
  public SasPortalDeviceGrant setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public SasPortalDeviceGrant set(String fieldName, Object value) {
    return (SasPortalDeviceGrant) super.set(fieldName, value);
  }

  @Override
  public SasPortalDeviceGrant clone() {
    return (SasPortalDeviceGrant) super.clone();
  }

}
