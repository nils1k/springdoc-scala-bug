package com.example.demo.domain.model.types

trait Enum[A] {
  trait Value { self: A => }
  val values: String
}