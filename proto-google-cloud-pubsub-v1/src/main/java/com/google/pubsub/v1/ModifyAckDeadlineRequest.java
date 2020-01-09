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

/**
 *
 *
 * <pre>
 * Request for the ModifyAckDeadline method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.ModifyAckDeadlineRequest}
 */
public final class ModifyAckDeadlineRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.ModifyAckDeadlineRequest)
    ModifyAckDeadlineRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ModifyAckDeadlineRequest.newBuilder() to construct.
  private ModifyAckDeadlineRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ModifyAckDeadlineRequest() {
    subscription_ = "";
    ackIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ModifyAckDeadlineRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ModifyAckDeadlineRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              subscription_ = s;
              break;
            }
          case 24:
            {
              ackDeadlineSeconds_ = input.readInt32();
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                ackIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              ackIds_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        ackIds_ = ackIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ModifyAckDeadlineRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ModifyAckDeadlineRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.ModifyAckDeadlineRequest.class,
            com.google.pubsub.v1.ModifyAckDeadlineRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object subscription_;
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
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
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
  public com.google.protobuf.ByteString getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACK_IDS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList ackIds_;
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
  public com.google.protobuf.ProtocolStringList getAckIdsList() {
    return ackIds_;
  }
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
  public int getAckIdsCount() {
    return ackIds_.size();
  }
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
  public java.lang.String getAckIds(int index) {
    return ackIds_.get(index);
  }
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
  public com.google.protobuf.ByteString getAckIdsBytes(int index) {
    return ackIds_.getByteString(index);
  }

  public static final int ACK_DEADLINE_SECONDS_FIELD_NUMBER = 3;
  private int ackDeadlineSeconds_;
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
  public int getAckDeadlineSeconds() {
    return ackDeadlineSeconds_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getSubscriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscription_);
    }
    if (ackDeadlineSeconds_ != 0) {
      output.writeInt32(3, ackDeadlineSeconds_);
    }
    for (int i = 0; i < ackIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, ackIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubscriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscription_);
    }
    if (ackDeadlineSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, ackDeadlineSeconds_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ackIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(ackIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAckIdsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.pubsub.v1.ModifyAckDeadlineRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.ModifyAckDeadlineRequest other =
        (com.google.pubsub.v1.ModifyAckDeadlineRequest) obj;

    if (!getSubscription().equals(other.getSubscription())) return false;
    if (!getAckIdsList().equals(other.getAckIdsList())) return false;
    if (getAckDeadlineSeconds() != other.getAckDeadlineSeconds()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    if (getAckIdsCount() > 0) {
      hash = (37 * hash) + ACK_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAckIdsList().hashCode();
    }
    hash = (37 * hash) + ACK_DEADLINE_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getAckDeadlineSeconds();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.pubsub.v1.ModifyAckDeadlineRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for the ModifyAckDeadline method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.ModifyAckDeadlineRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.ModifyAckDeadlineRequest)
      com.google.pubsub.v1.ModifyAckDeadlineRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ModifyAckDeadlineRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ModifyAckDeadlineRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.ModifyAckDeadlineRequest.class,
              com.google.pubsub.v1.ModifyAckDeadlineRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.ModifyAckDeadlineRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      subscription_ = "";

      ackIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      ackDeadlineSeconds_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ModifyAckDeadlineRequest_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ModifyAckDeadlineRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.ModifyAckDeadlineRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.ModifyAckDeadlineRequest build() {
      com.google.pubsub.v1.ModifyAckDeadlineRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ModifyAckDeadlineRequest buildPartial() {
      com.google.pubsub.v1.ModifyAckDeadlineRequest result =
          new com.google.pubsub.v1.ModifyAckDeadlineRequest(this);
      int from_bitField0_ = bitField0_;
      result.subscription_ = subscription_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ackIds_ = ackIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ackIds_ = ackIds_;
      result.ackDeadlineSeconds_ = ackDeadlineSeconds_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.ModifyAckDeadlineRequest) {
        return mergeFrom((com.google.pubsub.v1.ModifyAckDeadlineRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.ModifyAckDeadlineRequest other) {
      if (other == com.google.pubsub.v1.ModifyAckDeadlineRequest.getDefaultInstance()) return this;
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        onChanged();
      }
      if (!other.ackIds_.isEmpty()) {
        if (ackIds_.isEmpty()) {
          ackIds_ = other.ackIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAckIdsIsMutable();
          ackIds_.addAll(other.ackIds_);
        }
        onChanged();
      }
      if (other.getAckDeadlineSeconds() != 0) {
        setAckDeadlineSeconds(other.getAckDeadlineSeconds());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.pubsub.v1.ModifyAckDeadlineRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.ModifyAckDeadlineRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object subscription_ = "";
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
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
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
    public com.google.protobuf.ByteString getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
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
     * @param value The subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      subscription_ = value;
      onChanged();
      return this;
    }
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
     * @return This builder for chaining.
     */
    public Builder clearSubscription() {

      subscription_ = getDefaultInstance().getSubscription();
      onChanged();
      return this;
    }
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
     * @param value The bytes for subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      subscription_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList ackIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureAckIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ackIds_ = new com.google.protobuf.LazyStringArrayList(ackIds_);
        bitField0_ |= 0x00000001;
      }
    }
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
    public com.google.protobuf.ProtocolStringList getAckIdsList() {
      return ackIds_.getUnmodifiableView();
    }
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
    public int getAckIdsCount() {
      return ackIds_.size();
    }
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
    public java.lang.String getAckIds(int index) {
      return ackIds_.get(index);
    }
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
    public com.google.protobuf.ByteString getAckIdsBytes(int index) {
      return ackIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4;</code>
     *
     * @param index The index to set the value at.
     * @param value The ackIds to set.
     * @return This builder for chaining.
     */
    public Builder setAckIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAckIdsIsMutable();
      ackIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4;</code>
     *
     * @param value The ackIds to add.
     * @return This builder for chaining.
     */
    public Builder addAckIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAckIdsIsMutable();
      ackIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4;</code>
     *
     * @param values The ackIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAckIds(java.lang.Iterable<java.lang.String> values) {
      ensureAckIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ackIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAckIds() {
      ackIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4;</code>
     *
     * @param value The bytes of the ackIds to add.
     * @return This builder for chaining.
     */
    public Builder addAckIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAckIdsIsMutable();
      ackIds_.add(value);
      onChanged();
      return this;
    }

    private int ackDeadlineSeconds_;
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
    public int getAckDeadlineSeconds() {
      return ackDeadlineSeconds_;
    }
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
     * @param value The ackDeadlineSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setAckDeadlineSeconds(int value) {

      ackDeadlineSeconds_ = value;
      onChanged();
      return this;
    }
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
     * @return This builder for chaining.
     */
    public Builder clearAckDeadlineSeconds() {

      ackDeadlineSeconds_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.ModifyAckDeadlineRequest)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.ModifyAckDeadlineRequest)
  private static final com.google.pubsub.v1.ModifyAckDeadlineRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.ModifyAckDeadlineRequest();
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifyAckDeadlineRequest> PARSER =
      new com.google.protobuf.AbstractParser<ModifyAckDeadlineRequest>() {
        @java.lang.Override
        public ModifyAckDeadlineRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ModifyAckDeadlineRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ModifyAckDeadlineRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyAckDeadlineRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.ModifyAckDeadlineRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
