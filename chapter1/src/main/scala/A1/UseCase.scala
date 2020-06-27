package A1

import PrintableInstances._
import PrintableSyntax._
import cats.Show
import cats.syntax.show._

object UseCase {

  def formatByLibrary(cat: Cat): String = {
    Printable.format(cat)
  }

  def printByLibrary(cat: Cat): Unit = {
    Printable.print(cat)
  }

  def formatBySyntax(cat: Cat): String = {
    cat.format
  }

  def printBySyntax(cat: Cat): Unit = {
    cat.print
  }

  def catShow(cat: Cat): Unit = {
    import cats.instances.int._
    import cats.instances.string._
    implicit val catShow = Show[Cat] { cat =>
      s"${cat.name.show} is a ${cat.age.show} year-old ${cat.color.show} cat." }
    println(cat.show)
  }

}
