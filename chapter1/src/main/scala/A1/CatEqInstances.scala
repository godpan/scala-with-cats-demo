package A1

import cats.Eq
import cats.instances.int._
import cats.syntax.eq._

object CatEqInstances {
  implicit val catEq: Eq[Cat] = Eq.instance[Cat] {
    (catA,catB) =>
      catA.age === catB.age && catA.age === catB.age && catA.age === catB.age
  }
}
