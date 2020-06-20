package A1

object PrintableInstances {
  implicit val stringPrintable: Printable[String] = (a: String) => a
  implicit val intPrintable: Printable[Int]       = (a: Int) => a.toString
  implicit val catPrintable: Printable[Cat] = (cat: Cat) => {
    s"${Printable.format(cat.name)} is a ${Printable.format(cat.age)} year-old ${Printable
      .format(cat.color)} cat."
  }
}
