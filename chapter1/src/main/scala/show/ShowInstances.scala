package show

import cats.Show
import printable.Cat
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._

object ShowInstances {

//  implicit val showCat: Show[Cat] = (cat: Cat) => {
//    s"${cat.name.show} is a ${cat.age.show} year-old ${cat.color.show} cat."
//  }

  implicit val showCat = new Show[Cat] {
    def show(cat: Cat): String =
      s"${cat.name.show} is a ${cat.age.show} year-old ${cat.color.show} cat."
  }

}
