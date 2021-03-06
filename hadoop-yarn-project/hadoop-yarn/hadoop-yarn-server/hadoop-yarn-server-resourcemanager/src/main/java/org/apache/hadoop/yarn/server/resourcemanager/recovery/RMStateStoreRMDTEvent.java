/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.yarn.server.resourcemanager.recovery;

import org.apache.hadoop.yarn.security.client.RMDelegationTokenIdentifier;

public class RMStateStoreRMDTEvent extends RMStateStoreEvent {
  private RMDelegationTokenIdentifier rmDTIdentifier;
  private Long renewDate;
  private int latestSequenceNumber;

  public RMStateStoreRMDTEvent(RMStateStoreEventType type) {
    super(type);
  }

  public RMStateStoreRMDTEvent(RMDelegationTokenIdentifier rmDTIdentifier,
      Long renewDate, int latestSequenceNumber, RMStateStoreEventType type) {
    this(type);
    this.rmDTIdentifier = rmDTIdentifier;
    this.renewDate = renewDate;
    this.latestSequenceNumber = latestSequenceNumber;
  }

  public RMDelegationTokenIdentifier getRmDTIdentifier() {
    return rmDTIdentifier;
  }

  public Long getRenewDate() {
    return renewDate;
  }

  public int getLatestSequenceNumber() {
    return latestSequenceNumber;
  }
}
