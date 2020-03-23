package json

//import JsonWriterInstances._
import JsonSyntax._

object UseCase {

  def testJsonObject(person: Person) = {
    Json.toJson(person)
  }

  def testImplicit(person: Person) = {
    val json = implicitly[JsonWriter[Person]]
    json.write(person)
  }

  def testSyntax(person: Person) = {
    person.toJson
  }

  def testOption(person: Option[Person]) = {
    person.toJson
  }

}
