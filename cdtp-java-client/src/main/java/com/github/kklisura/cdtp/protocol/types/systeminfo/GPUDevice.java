package com.github.kklisura.cdtp.protocol.types.systeminfo;

/*-
 * #%L
 * cdpt-java-client
 * %%
 * Copyright (C) 2018 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/** Describes a single graphics processor (GPU). */
public class GPUDevice {

  private Double vendorId;

  private Double deviceId;

  private String vendorString;

  private String deviceString;

  /** PCI ID of the GPU vendor, if available; 0 otherwise. */
  public Double getVendorId() {
    return vendorId;
  }

  /** PCI ID of the GPU vendor, if available; 0 otherwise. */
  public void setVendorId(Double vendorId) {
    this.vendorId = vendorId;
  }

  /** PCI ID of the GPU device, if available; 0 otherwise. */
  public Double getDeviceId() {
    return deviceId;
  }

  /** PCI ID of the GPU device, if available; 0 otherwise. */
  public void setDeviceId(Double deviceId) {
    this.deviceId = deviceId;
  }

  /** String description of the GPU vendor, if the PCI ID is not available. */
  public String getVendorString() {
    return vendorString;
  }

  /** String description of the GPU vendor, if the PCI ID is not available. */
  public void setVendorString(String vendorString) {
    this.vendorString = vendorString;
  }

  /** String description of the GPU device, if the PCI ID is not available. */
  public String getDeviceString() {
    return deviceString;
  }

  /** String description of the GPU device, if the PCI ID is not available. */
  public void setDeviceString(String deviceString) {
    this.deviceString = deviceString;
  }
}
