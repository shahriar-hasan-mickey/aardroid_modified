// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.argus.nativedroid.server.nativedroid_grpc

@SerialVersionUID(0L)
final case class LoadBinaryResponse(
    soDigest: _root_.scala.Predef.String = "",
    length: _root_.scala.Int = 0
    ) extends scalapb.GeneratedMessage with scalapb.Message[LoadBinaryResponse] with scalapb.lenses.Updatable[LoadBinaryResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (soDigest != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, soDigest) }
      if (length != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, length) }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = soDigest
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = length
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse = {
      var __soDigest = this.soDigest
      var __length = this.length
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __soDigest = _input__.readString()
          case 16 =>
            __length = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse(
          soDigest = __soDigest,
          length = __length
      )
    }
    def withSoDigest(__v: _root_.scala.Predef.String): LoadBinaryResponse = copy(soDigest = __v)
    def withLength(__v: _root_.scala.Int): LoadBinaryResponse = copy(length = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = soDigest
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = length
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(soDigest)
        case 2 => _root_.scalapb.descriptors.PInt(length)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse
}

object LoadBinaryResponse extends scalapb.GeneratedMessageCompanion[org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[_root_.scala.Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = NativedroidGrpcProto.javaDescriptor.getMessageTypes.get(10)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = NativedroidGrpcProto.scalaDescriptor.messages(10)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse(
  )
  implicit class LoadBinaryResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.argus.nativedroid.server.nativedroid_grpc.LoadBinaryResponse](_l) {
    def soDigest: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.soDigest)((c_, f_) => c_.copy(soDigest = f_))
    def length: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.length)((c_, f_) => c_.copy(length = f_))
  }
  final val SO_DIGEST_FIELD_NUMBER = 1
  final val LENGTH_FIELD_NUMBER = 2
}
