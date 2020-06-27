package A1

import cats.Show
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._ // for show

object CatShowInstances {

  implicit val catShow: Show[Cat]= Show[Cat] { cat =>
    s"${cat.name.show} is a ${cat.age.show} year-old ${cat.color.show} cat." }


}
