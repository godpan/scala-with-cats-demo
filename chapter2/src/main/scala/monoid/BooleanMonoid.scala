package monoid


class BooleanOrMonoid extends Monoid[Boolean] {
  override def empty: Boolean = false

  override def combine(x: Boolean, y: Boolean): Boolean = x || y
}

class BooleanAndMonoid extends Monoid[Boolean] {
  override def empty: Boolean = true

  override def combine(x: Boolean, y: Boolean): Boolean = x && y
}

class BooleanEitherMonoid extends Monoid[Boolean] {
  override def empty: Boolean = false

  override def combine(x: Boolean, y: Boolean): Boolean =  (x && !y) || (!x && y)
}

class BooleanXnorMonoid extends Monoid[Boolean] {
  override def empty: Boolean = false

  override def combine(x: Boolean, y: Boolean): Boolean =  (!x || y) && (x || !y)
}

object BooleanMonoidTest {

  def main(args: Array[String]): Unit = {
    implicit val booleanAndMonoid = new BooleanAndMonoid

    println(Monoid.identityLaw(true))
    println(Monoid.identityLaw(false))

    val data = Seq((true, true, true), (true, true, false), (true, false, true), (true, false, false), (false, true, true), (false, true, false), (false, false, true), (false, false, false))

    println(data.map(d => Monoid.associativeLaw(d._1, d._2,d._3)).exists(_ == false) == false)
  }
}