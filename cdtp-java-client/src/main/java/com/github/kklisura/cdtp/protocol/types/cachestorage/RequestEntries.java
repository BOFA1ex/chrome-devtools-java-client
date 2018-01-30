package com.github.kklisura.cdtp.protocol.types.cachestorage;

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

import java.util.List;

public class RequestEntries {

  private List<DataEntry> cacheDataEntries;

  private Boolean hasMore;

  /** Array of object store data entries. */
  public List<DataEntry> getCacheDataEntries() {
    return cacheDataEntries;
  }

  /** Array of object store data entries. */
  public void setCacheDataEntries(List<DataEntry> cacheDataEntries) {
    this.cacheDataEntries = cacheDataEntries;
  }

  /** If true, there are more entries to fetch in the given range. */
  public Boolean getHasMore() {
    return hasMore;
  }

  /** If true, there are more entries to fetch in the given range. */
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }
}
