// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p4p.proto

package io.grpc.examples.p4p.p4p.sim;

/**
 * Protobuf type {@code p4p.p4p.sim.Idstr}
 */
public final class Idstr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:p4p.p4p.sim.Idstr)
    IdstrOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Idstr.newBuilder() to construct.
  private Idstr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Idstr() {
    idstr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Idstr();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Idstr(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            idstr_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.p4p.p4p.sim.P4PProto.internal_static_p4p_p4p_sim_Idstr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.p4p.p4p.sim.P4PProto.internal_static_p4p_p4p_sim_Idstr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.p4p.p4p.sim.Idstr.class, io.grpc.examples.p4p.p4p.sim.Idstr.Builder.class);
  }

  public static final int IDSTR_FIELD_NUMBER = 3;
  private volatile java.lang.Object idstr_;
  /**
   * <code>string idstr = 3;</code>
   * @return The idstr.
   */
  @java.lang.Override
  public java.lang.String getIdstr() {
    java.lang.Object ref = idstr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idstr_ = s;
      return s;
    }
  }
  /**
   * <code>string idstr = 3;</code>
   * @return The bytes for idstr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdstrBytes() {
    java.lang.Object ref = idstr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idstr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdstrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, idstr_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdstrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, idstr_);
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
    if (!(obj instanceof io.grpc.examples.p4p.p4p.sim.Idstr)) {
      return super.equals(obj);
    }
    io.grpc.examples.p4p.p4p.sim.Idstr other = (io.grpc.examples.p4p.p4p.sim.Idstr) obj;

    if (!getIdstr()
        .equals(other.getIdstr())) return false;
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
    hash = (37 * hash) + IDSTR_FIELD_NUMBER;
    hash = (53 * hash) + getIdstr().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.p4p.p4p.sim.Idstr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.p4p.p4p.sim.Idstr parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.examples.p4p.p4p.sim.Idstr prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code p4p.p4p.sim.Idstr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:p4p.p4p.sim.Idstr)
      io.grpc.examples.p4p.p4p.sim.IdstrOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.p4p.p4p.sim.P4PProto.internal_static_p4p_p4p_sim_Idstr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.p4p.p4p.sim.P4PProto.internal_static_p4p_p4p_sim_Idstr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.p4p.p4p.sim.Idstr.class, io.grpc.examples.p4p.p4p.sim.Idstr.Builder.class);
    }

    // Construct using io.grpc.examples.p4p.p4p.sim.Idstr.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      idstr_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.p4p.p4p.sim.P4PProto.internal_static_p4p_p4p_sim_Idstr_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.p4p.p4p.sim.Idstr getDefaultInstanceForType() {
      return io.grpc.examples.p4p.p4p.sim.Idstr.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.p4p.p4p.sim.Idstr build() {
      io.grpc.examples.p4p.p4p.sim.Idstr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.p4p.p4p.sim.Idstr buildPartial() {
      io.grpc.examples.p4p.p4p.sim.Idstr result = new io.grpc.examples.p4p.p4p.sim.Idstr(this);
      result.idstr_ = idstr_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.p4p.p4p.sim.Idstr) {
        return mergeFrom((io.grpc.examples.p4p.p4p.sim.Idstr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.p4p.p4p.sim.Idstr other) {
      if (other == io.grpc.examples.p4p.p4p.sim.Idstr.getDefaultInstance()) return this;
      if (!other.getIdstr().isEmpty()) {
        idstr_ = other.idstr_;
        onChanged();
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
      io.grpc.examples.p4p.p4p.sim.Idstr parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.p4p.p4p.sim.Idstr) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object idstr_ = "";
    /**
     * <code>string idstr = 3;</code>
     * @return The idstr.
     */
    public java.lang.String getIdstr() {
      java.lang.Object ref = idstr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idstr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string idstr = 3;</code>
     * @return The bytes for idstr.
     */
    public com.google.protobuf.ByteString
        getIdstrBytes() {
      java.lang.Object ref = idstr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idstr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string idstr = 3;</code>
     * @param value The idstr to set.
     * @return This builder for chaining.
     */
    public Builder setIdstr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      idstr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string idstr = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdstr() {
      
      idstr_ = getDefaultInstance().getIdstr();
      onChanged();
      return this;
    }
    /**
     * <code>string idstr = 3;</code>
     * @param value The bytes for idstr to set.
     * @return This builder for chaining.
     */
    public Builder setIdstrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      idstr_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:p4p.p4p.sim.Idstr)
  }

  // @@protoc_insertion_point(class_scope:p4p.p4p.sim.Idstr)
  private static final io.grpc.examples.p4p.p4p.sim.Idstr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.p4p.p4p.sim.Idstr();
  }

  public static io.grpc.examples.p4p.p4p.sim.Idstr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Idstr>
      PARSER = new com.google.protobuf.AbstractParser<Idstr>() {
    @java.lang.Override
    public Idstr parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Idstr(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Idstr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Idstr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.p4p.p4p.sim.Idstr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
