package variance

import json.JsonAst.Json

object Contravariance {

  def format[A](value: A, writer: JsonWriter[A]): Json = writer.write(value)

  def main(args: Array[String]): Unit = {
    val shape: Shape   = ???
    val circle: Circle = ???

    val shapeWriter: JsonWriter[Shape]   = ???
    val circleWriter: JsonWriter[Circle] = ???

//    format(shape, circleWriter)

  }

}
