package com.github.kklisura.cdtp.protocol.types.runtime;

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

/** Mirror object referencing original JavaScript object. */
public class RemoteObject {

  private Type type;

  @Optional private Subtype subtype;

  @Optional private String className;

  @Optional private Object value;

  @Optional private UnserializableValue unserializableValue;

  @Optional private String description;

  @Optional private String objectId;

  @Experimental @Optional private ObjectPreview preview;

  @Experimental @Optional private CustomPreview customPreview;

  /** Object type. */
  public Type getType() {
    return type;
  }

  /** Object type. */
  public void setType(Type type) {
    this.type = type;
  }

  /** Object subtype hint. Specified for <code>object</code> type values only. */
  public Subtype getSubtype() {
    return subtype;
  }

  /** Object subtype hint. Specified for <code>object</code> type values only. */
  public void setSubtype(Subtype subtype) {
    this.subtype = subtype;
  }

  /** Object class (constructor) name. Specified for <code>object</code> type values only. */
  public String getClassName() {
    return className;
  }

  /** Object class (constructor) name. Specified for <code>object</code> type values only. */
  public void setClassName(String className) {
    this.className = className;
  }

  /** Remote object value in case of primitive values or JSON values (if it was requested). */
  public Object getValue() {
    return value;
  }

  /** Remote object value in case of primitive values or JSON values (if it was requested). */
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * Primitive value which can not be JSON-stringified does not have <code>value</code>, but gets
   * this property.
   */
  public UnserializableValue getUnserializableValue() {
    return unserializableValue;
  }

  /**
   * Primitive value which can not be JSON-stringified does not have <code>value</code>, but gets
   * this property.
   */
  public void setUnserializableValue(UnserializableValue unserializableValue) {
    this.unserializableValue = unserializableValue;
  }

  /** String representation of the object. */
  public String getDescription() {
    return description;
  }

  /** String representation of the object. */
  public void setDescription(String description) {
    this.description = description;
  }

  /** Unique object identifier (for non-primitive values). */
  public String getObjectId() {
    return objectId;
  }

  /** Unique object identifier (for non-primitive values). */
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  /**
   * Preview containing abbreviated property values. Specified for <code>object</code> type values
   * only.
   */
  public ObjectPreview getPreview() {
    return preview;
  }

  /**
   * Preview containing abbreviated property values. Specified for <code>object</code> type values
   * only.
   */
  public void setPreview(ObjectPreview preview) {
    this.preview = preview;
  }

  public CustomPreview getCustomPreview() {
    return customPreview;
  }

  public void setCustomPreview(CustomPreview customPreview) {
    this.customPreview = customPreview;
  }
}
