package json

import json.JsonAst._

object JsonWriterInstances {
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
