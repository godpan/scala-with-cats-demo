package A1

import PrintableInstances._
import PrintableSyntax._
import cats.Show
//import CatShowInstances._
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
    import CatShowInstances._
    val showI = implicitly[Show[Cat]]
//    println(cat.show)
  }

}
