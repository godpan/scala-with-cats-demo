package A1

import PrintableInstances._
import PrintableSyntax._

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

}
