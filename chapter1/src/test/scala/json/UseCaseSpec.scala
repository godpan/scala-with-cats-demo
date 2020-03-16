package json

import json.JsonAst.{JsObject, JsString}
import org.scalactic._
import org.scalatest._

class UseCaseSpec extends FlatSpec with Matchers {

  val person = Person("Dave", "dave@example.com")
  val personJsonValue = JsObject(
    Map("name" -> JsString("Dave"), "email" -> JsString("dave@example.com"))
  )

  "testJsonObject" should "Json.toJson(v) equals v json value" in {
    UseCase.testJsonObject(person) should be(personJsonValue)
  }

}
