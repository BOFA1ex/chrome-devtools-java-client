package com.github.kklisura.cdtp.protocol.types.console;

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

import com.github.kklisura.cdtp.protocol.support.annotations.Optional;

/** Console message. */
public class ConsoleMessage {

  private Source source;

  private Level level;

  private String text;

  @Optional private String url;

  @Optional private Integer line;

  @Optional private Integer column;

  /** Message source. */
  public Source getSource() {
    return source;
  }

  /** Message source. */
  public void setSource(Source source) {
    this.source = source;
  }

  /** Message severity. */
  public Level getLevel() {
    return level;
  }

  /** Message severity. */
  public void setLevel(Level level) {
    this.level = level;
  }

  /** Message text. */
  public String getText() {
    return text;
  }

  /** Message text. */
  public void setText(String text) {
    this.text = text;
  }

  /** URL of the message origin. */
  public String getUrl() {
    return url;
  }

  /** URL of the message origin. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Line number in the resource that generated this message (1-based). */
  public Integer getLine() {
    return line;
  }

  /** Line number in the resource that generated this message (1-based). */
  public void setLine(Integer line) {
    this.line = line;
  }

  /** Column number in the resource that generated this message (1-based). */
  public Integer getColumn() {
    return column;
  }

  /** Column number in the resource that generated this message (1-based). */
  public void setColumn(Integer column) {
    this.column = column;
  }
}
