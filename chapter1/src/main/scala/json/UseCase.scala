package json

import JsonWriterInstances._

object UseCase {

  def testJsonObject(person: Person): Unit = {
    Json.toJson(person)
  }

}
