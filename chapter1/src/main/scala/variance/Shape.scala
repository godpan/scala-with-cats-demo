package variance

sealed trait Shape

case class Circle(radius: Double) extends Shape
