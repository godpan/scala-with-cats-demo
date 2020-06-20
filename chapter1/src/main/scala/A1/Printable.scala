package A1

trait Printable[A] {
  def format(a: A): String
}

object Printable {
  def format[A](a: A)(implicit printable: Printable[A]) = {
    printable.format(a)
  }

  def print[A](a: A)(implicit printable: Printable[A]) = {
    println(format(a))
  }
}
