package A1

import org.scalatest.{FlatSpec, Matchers}

class A1UseCaseSpec extends FlatSpec with Matchers {

  val cat             = Cat("godpan", 25, "red")
  val catA             = Cat("catA", 20, "red")
  val catB             = Cat("catB", 20, "red")
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

  "printCatShow" should "printByLibrary(v) equals Unit" in {
    UseCase.printCatShow(cat) should be({})
  }

  "compareCatEq" should "compareCatEq(catA, catB) equals true" in {
    UseCase.compareCatEq(catA,catB) should be(true)
  }


}
