package com.example.demo.domain.model

import io.swagger.v3.oas.annotations.media.{ArraySchema, Schema}

import scala.annotation.meta.field
import scala.beans.BeanProperty

@Schema(description = "A user")
case class User(
  @BeanProperty
  @(Schema@field)(
    description = "UserType.",
    example = "CHILD",
    implementation = classOf[String],
    allowableValues = Array("ANYONE", "ADULT", "CHILD", "INFANT", "ANIMAL", "SENIOR"),
    requiredMode = Schema.RequiredMode.NOT_REQUIRED
  )
  userType: Option[UserTypeEnum],

  @BeanProperty
  @(ArraySchema@field)(
    arraySchema = new Schema(
      description = "FareClasses",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED
    ),
    schema = new Schema(
      allowableValues = Array("FIRST_CLASS", "SECOND_CLASS", "THIRD_CLASS", "ECONOMY_CLASS"),
      implementation = classOf[String]
    )
  )
  fareClasses: Set[FareClassEnum],
)
