package A1

import org.scalatest.{FlatSpec, Matchers}

class A1UseCaseSpec extends FlatSpec with Matchers {

  val cat = Cat("Garfield", 38, "ginger and black")
  val catFormatString = "Garfield is a 38 year-old ginger and black cat."

  "formatByLibrary" should "formatByLibrary(v) equals v formatString" in {
    UseCase.formatByLibrary(cat) should be(catFormatString)
  }


}
