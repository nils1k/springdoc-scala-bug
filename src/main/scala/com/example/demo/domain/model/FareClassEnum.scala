package com.example.demo.domain.model

import com.fasterxml.jackson.annotation.{JsonCreator, JsonValue}
import com.example.demo.domain.model.types.Enum

import scala.annotation.meta.getter

sealed trait FareClassEnum extends FareClassEnum.Value {
  @(JsonValue@getter) val value: String
}

object FareClassEnum extends Enum[FareClassEnum] {

  final val values = "FIRST_CLASS, SECOND_CLASS, THIRD_CLASS, ECONOMY_CLASS"

  @JsonCreator
  def apply(s: String): FareClassEnum = s match {
    case "FIRST_CLASS" => FIRST_CLASS
    case "SECOND_CLASS" => SECOND_CLASS
    case "THIRD_CLASS" => THIRD_CLASS
    case "ECONOMY_CLASS" => ECONOMY_CLASS
  }
}

case object FIRST_CLASS extends FareClassEnum {
  val value = "FIRST_CLASS"
}

case object SECOND_CLASS extends FareClassEnum {
  val value = "SECOND_CLASS"
}

case object THIRD_CLASS extends FareClassEnum {
  val value = "THIRD_CLASS"
}

case object ECONOMY_CLASS extends FareClassEnum {
  val value = "ECONOMY_CLASS"
}
