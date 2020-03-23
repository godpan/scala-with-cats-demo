package json

import json.JsonAst.{JsObject, JsString, Json}

trait JsonWriter[A] {
  def write(value: A): Json
}

object JsonWriter {
  implicit val stringWriter: JsonWriter[String] =
    (value: String) => JsString(value)
  implicit val personWriter: JsonWriter[Person] =
    (value: Person) =>
      JsObject(
        Map(
          "name"  -> JsString(value.name),
          "email" -> JsString(value.email)
        )
      )
}
