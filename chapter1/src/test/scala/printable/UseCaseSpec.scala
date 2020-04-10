package printable

import org.scalatest.{FlatSpec, Matchers}

class UseCaseSpec extends FlatSpec with Matchers {

  val cat             = Cat("godpan", 25, "red")
  val catFormatString = s"godpan is a 25 year-old red cat."

  "formatByLibrary" should "formatByLibrary(v) equals catFormatString" in {
    UseCase.formatByLibrary(cat) should be(catFormatString)
  }

  "printByLibrary" should "printByLibrary(v) equals Unit" in {
    UseCase.printByLibrary(cat) should be({})
  }

  "formatBySyntax" should "formatBySyntax(v) equals catFormatString" in {
    UseCase.formatBySyntax(cat) should be(catFormatString)
  }

  "formatByLibrary" should "formatByLibrary(v) equals Unit" in {
    UseCase.printBySyntax(cat) should be({})
  }
}
