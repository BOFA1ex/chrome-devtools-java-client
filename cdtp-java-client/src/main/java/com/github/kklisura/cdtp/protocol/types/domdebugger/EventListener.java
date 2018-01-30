package com.github.kklisura.cdtp.protocol.types.domdebugger;

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

import com.github.kklisura.cdtp.protocol.support.annotations.Experimental;
import com.github.kklisura.cdtp.protocol.support.annotations.Optional;
import com.github.kklisura.cdtp.protocol.types.runtime.RemoteObject;

/** Object event listener. */
@Experimental
public class EventListener {

  private String type;

  private Boolean useCapture;

  private Boolean passive;

  private Boolean once;

  private String scriptId;

  private Integer lineNumber;

  private Integer columnNumber;

  @Optional private RemoteObject handler;

  @Optional private RemoteObject originalHandler;

  @Optional private Integer backendNodeId;

  /** <code>EventListener</code>'s type. */
  public String getType() {
    return type;
  }

  /** <code>EventListener</code>'s type. */
  public void setType(String type) {
    this.type = type;
  }

  /** <code>EventListener</code>'s useCapture. */
  public Boolean getUseCapture() {
    return useCapture;
  }

  /** <code>EventListener</code>'s useCapture. */
  public void setUseCapture(Boolean useCapture) {
    this.useCapture = useCapture;
  }

  /** <code>EventListener</code>'s passive flag. */
  public Boolean getPassive() {
    return passive;
  }

  /** <code>EventListener</code>'s passive flag. */
  public void setPassive(Boolean passive) {
    this.passive = passive;
  }

  /** <code>EventListener</code>'s once flag. */
  public Boolean getOnce() {
    return once;
  }

  /** <code>EventListener</code>'s once flag. */
  public void setOnce(Boolean once) {
    this.once = once;
  }

  /** Script id of the handler code. */
  public String getScriptId() {
    return scriptId;
  }

  /** Script id of the handler code. */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /** Line number in the script (0-based). */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /** Line number in the script (0-based). */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /** Column number in the script (0-based). */
  public Integer getColumnNumber() {
    return columnNumber;
  }

  /** Column number in the script (0-based). */
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  /** Event handler function value. */
  public RemoteObject getHandler() {
    return handler;
  }

  /** Event handler function value. */
  public void setHandler(RemoteObject handler) {
    this.handler = handler;
  }

  /** Event original handler function value. */
  public RemoteObject getOriginalHandler() {
    return originalHandler;
  }

  /** Event original handler function value. */
  public void setOriginalHandler(RemoteObject originalHandler) {
    this.originalHandler = originalHandler;
  }

  /** Node the listener is added to (if any). */
  public Integer getBackendNodeId() {
    return backendNodeId;
  }

  /** Node the listener is added to (if any). */
  public void setBackendNodeId(Integer backendNodeId) {
    this.backendNodeId = backendNodeId;
  }
}
