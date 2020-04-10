package show

import org.scalatest.{FlatSpec, Matchers}
import printable.Cat

class UseCaseSpec extends FlatSpec with Matchers {

  val cat             = Cat("godpan", 25, "red")
  val catFormatString = s"godpan is a 25 year-old red cat."

  "catShow" should "catShow(v) equals catFormatString" in {
    UseCase.catShow(cat) should be(catFormatString)
  }

}
