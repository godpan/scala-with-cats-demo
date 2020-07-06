package A1

import PrintableInstances._
import PrintableSyntax._
import A1.CatShowInstances._
import A1.CatEqInstances._
import cats.syntax.show._
import cats.syntax.eq._

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

  def formatCatShow(cat: Cat): Unit = {
    cat.show
  }

  def printCatShow(cat: Cat): Unit = {
    println(cat.show)
  }

  def compareCatEq(catA: Cat, catB: Cat): Boolean = {
    catA === catB
  }

}
