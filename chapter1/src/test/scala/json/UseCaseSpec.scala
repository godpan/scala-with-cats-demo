package json

import json.JsonAst.{JsNull, JsObject, JsString}
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

  "testImplicit" should "json.write(v) equals v json value" in {
    UseCase.testImplicit(person) should be(personJsonValue)
  }

  "testSyntax" should "v.toJson equals v json value" in {
    UseCase.testImplicit(person) should be(personJsonValue)
  }

  "testOption-Some" should "v.toJson equals v json value" in {
    UseCase.testOption(Some(person)) should be(personJsonValue)
  }

  "testOption-None" should "v.toJson equals JsNull" in {
    UseCase.testOption(None) should be(JsNull)
  }
}
