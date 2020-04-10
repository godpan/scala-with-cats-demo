package show

import printable.Cat
import cats.syntax.show._
import ShowInstances._

object UseCase {

  def catShow(cat: Cat): String = {
    cat.show
  }

}
