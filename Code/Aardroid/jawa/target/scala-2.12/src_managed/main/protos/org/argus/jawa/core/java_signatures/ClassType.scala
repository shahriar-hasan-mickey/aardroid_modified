// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.argus.jawa.core.java_signatures

@SerialVersionUID(0L)
final case class ClassType(
    `package`: scala.Option[org.argus.jawa.core.java_signatures.JavaPackage] = None,
    name: _root_.scala.Predef.String = "",
    unknown: _root_.scala.Boolean = false
    ) extends scalapb.GeneratedMessage with scalapb.Message[ClassType] with scalapb.lenses.Updatable[ClassType] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (`package`.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(`package`.get.serializedSize) + `package`.get.serializedSize }
      if (name != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, name) }
      if (unknown != false) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, unknown) }
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
      `package`.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = unknown
        if (__v != false) {
          _output__.writeBool(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.argus.jawa.core.java_signatures.ClassType = {
      var __package = this.`package`
      var __name = this.name
      var __unknown = this.unknown
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __package = Option(_root_.scalapb.LiteParser.readMessage(_input__, __package.getOrElse(org.argus.jawa.core.java_signatures.JavaPackage.defaultInstance)))
          case 18 =>
            __name = _input__.readString()
          case 24 =>
            __unknown = _input__.readBool()
          case tag => _input__.skipField(tag)
        }
      }
      org.argus.jawa.core.java_signatures.ClassType(
          `package` = __package,
          name = __name,
          unknown = __unknown
      )
    }
    def getPackage: org.argus.jawa.core.java_signatures.JavaPackage = `package`.getOrElse(org.argus.jawa.core.java_signatures.JavaPackage.defaultInstance)
    def clearPackage: ClassType = copy(`package` = None)
    def withPackage(__v: org.argus.jawa.core.java_signatures.JavaPackage): ClassType = copy(`package` = Option(__v))
    def withName(__v: _root_.scala.Predef.String): ClassType = copy(name = __v)
    def withUnknown(__v: _root_.scala.Boolean): ClassType = copy(unknown = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `package`.orNull
        case 2 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = unknown
          if (__t != false) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => `package`.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PString(name)
        case 3 => _root_.scalapb.descriptors.PBoolean(unknown)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.argus.jawa.core.java_signatures.ClassType
}

object ClassType extends scalapb.GeneratedMessageCompanion[org.argus.jawa.core.java_signatures.ClassType] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.argus.jawa.core.java_signatures.ClassType] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.argus.jawa.core.java_signatures.ClassType = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.argus.jawa.core.java_signatures.ClassType(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[org.argus.jawa.core.java_signatures.JavaPackage]],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), false).asInstanceOf[_root_.scala.Boolean]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.argus.jawa.core.java_signatures.ClassType] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.argus.jawa.core.java_signatures.ClassType(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[org.argus.jawa.core.java_signatures.JavaPackage]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Boolean]).getOrElse(false)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = JavaSignaturesProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = JavaSignaturesProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = org.argus.jawa.core.java_signatures.JavaPackage
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.argus.jawa.core.java_signatures.ClassType(
  )
  implicit class ClassTypeLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.argus.jawa.core.java_signatures.ClassType]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.argus.jawa.core.java_signatures.ClassType](_l) {
    def `package`: _root_.scalapb.lenses.Lens[UpperPB, org.argus.jawa.core.java_signatures.JavaPackage] = field(_.getPackage)((c_, f_) => c_.copy(`package` = Option(f_)))
    def optionalPackage: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[org.argus.jawa.core.java_signatures.JavaPackage]] = field(_.`package`)((c_, f_) => c_.copy(`package` = f_))
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def unknown: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.unknown)((c_, f_) => c_.copy(unknown = f_))
  }
  final val PACKAGE_FIELD_NUMBER = 1
  final val NAME_FIELD_NUMBER = 2
  final val UNKNOWN_FIELD_NUMBER = 3
}