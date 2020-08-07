package monoid

class SetUnionMonoid[A] extends Monoid[Set[A]] {
  override def empty: Set[A] = Set.empty[A]

  override def combine(x: Set[A], y: Set[A]): Set[A] = x union y
}

class SetIntersectionSemigroup[A] extends Semigroup[Set[A]] {
  override def combine(x: Set[A], y: Set[A]): Set[A] = x intersect y
}

class SymDiffMonoid[A] extends Monoid[Set[A]] {
  override def empty: Set[A] = Set.empty[A]

  override def combine(x: Set[A], y: Set[A]): Set[A] = (x diff y) union (y diff x)
}


object SetUnionMonoidTest {
  def main(args: Array[String]): Unit = {
    implicit val setUnionMonoid = new SetUnionMonoid[Int]

    val setA = Set(1, 2, 3)
    val setB = Set(2, 4, 5)
    val setC = Set(3, 4, 8)

    println(Monoid.identityLaw(setA))

    println(Monoid.associativeLaw(setA, setB, setC))
  }
}