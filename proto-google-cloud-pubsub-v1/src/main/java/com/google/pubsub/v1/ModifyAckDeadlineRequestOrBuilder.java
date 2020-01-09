/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface ModifyAckDeadlineRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ModifyAckDeadlineRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the subscription.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   *
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   *
   *
   * <pre>
   * The name of the subscription.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   *
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString getSubscriptionBytes();

  /**
   *
   *
   * <pre>
   * List of acknowledgment IDs.
   * </pre>
   *
   * <code>repeated string ack_ids = 4;</code>
   *
   * @return A list containing the ackIds.
   */
  java.util.List<java.lang.String> getAckIdsList();
  /**
   *
   *
   * <pre>
   * List of acknowledgment IDs.
   * </pre>
   *
   * <code>repeated string ack_ids = 4;</code>
   *
   * @return The count of ackIds.
   */
  int getAckIdsCount();
  /**
   *
   *
   * <pre>
   * List of acknowledgment IDs.
   * </pre>
   *
   * <code>repeated string ack_ids = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The ackIds at the given index.
   */
  java.lang.String getAckIds(int index);
  /**
   *
   *
   * <pre>
   * List of acknowledgment IDs.
   * </pre>
   *
   * <code>repeated string ack_ids = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ackIds at the given index.
   */
  com.google.protobuf.ByteString getAckIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * The new ack deadline with respect to the time this request was sent to
   * the Pub/Sub system. For example, if the value is 10, the new
   * ack deadline will expire 10 seconds after the `ModifyAckDeadline` call
   * was made. Specifying zero might immediately make the message available for
   * delivery to another subscriber client. This typically results in an
   * increase in the rate of message redeliveries (that is, duplicates).
   * The minimum deadline you can specify is 0 seconds.
   * The maximum deadline you can specify is 600 seconds (10 minutes).
   * </pre>
   *
   * <code>int32 ack_deadline_seconds = 3;</code>
   *
   * @return The ackDeadlineSeconds.
   */
  int getAckDeadlineSeconds();
}
