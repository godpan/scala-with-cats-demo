package adding

object IntAdd {

  def add(items: List[Int]): Int = items.foldLeft(0)(_ + _)

}

object IntMonoidAdd {
  import cats.Monoid
  import cats.instances.int._ // for Monoid
  import cats.syntax.semigroup._ // for |+|

  def add(items: List[Int]): Int = items.foldLeft(Monoid[Int].empty)(_ |+| _)

}

object MonoidAdd {
  import cats.Monoid
  import cats.syntax.semigroup._ // for |+|

  def addA[A](items: List[A])(implicit monoid: Monoid[A]): A = items.foldLeft(monoid.empty)(_ |+| _)

  def addB[A: Monoid](items: List[A]): A = items.foldLeft(Monoid[A].empty)(_ |+| _)
}

object AddTest {

  def main(args: Array[String]): Unit = {

    import cats.instances.int._ // for Monoid
    MonoidAdd.addA(List(1, 2, 3))
    // res9: Int = 6
    import cats.instances.option._ // for Monoid

    MonoidAdd.addA(List(Some(1), None, Some(2), None, Some(3)))
    // res10: Option[Int] = Some(6)

    import OrderAddInstance._

    val orderA = Order(2.0,5.0)
    val orderB = Order(3.0,10.0)
    println(MonoidAdd.addB(List(orderA,orderB)))

  }
}

case class Order(totalCost: Double, quantity: Double)

object OrderAddInstance {
  import cats.Monoid

  implicit val monoid: Monoid[Order] = new Monoid[Order] {
    def combine(o1: Order, o2: Order) =
      Order(
        o1.totalCost + o2.totalCost, o1.quantity + o2.quantity
      )
    def empty = Order(0, 0)
  }

}
