package com.example.demo.domain.model

import com.fasterxml.jackson.annotation.{JsonCreator, JsonValue}
import com.example.demo.domain.model.types.Enum

import scala.annotation.meta.getter

sealed trait UserTypeEnum extends UserTypeEnum.Value {
  @(JsonValue @getter) val value: String
}

object UserTypeEnum extends Enum[UserTypeEnum] {

  final val values = "ANYONE, ADULT, CHILD, INFANT, ANIMAL, SENIOR"

  @JsonCreator
  def apply(s: String): UserTypeEnum = {
    s match {
      case "ANYONE" => ANYONE
      case "ADULT" => ADULT
      case "CHILD" => CHILD
      case "INFANT" => INFANT
      case "ANIMAL" => ANIMAL
      case "SENIOR" => SENIOR
    }
  }
}

case object ANYONE extends UserTypeEnum {
  val value = "ANYONE"
}

case object ADULT extends UserTypeEnum {
  val value = "ADULT"
}

case object CHILD extends UserTypeEnum {
  val value = "CHILD"
}

case object INFANT extends UserTypeEnum {
  val value = "INFANT"
}

case object ANIMAL extends UserTypeEnum {
  val value = "ANIMAL"
}

case object SENIOR extends UserTypeEnum {
  val value = "SENIOR"
}
