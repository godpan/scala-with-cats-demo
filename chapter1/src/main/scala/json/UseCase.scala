package json

import JsonWriterInstances._

object UseCase {

  def testJsonObject(person: Person) = {
    Json.toJson(person)
  }

}
