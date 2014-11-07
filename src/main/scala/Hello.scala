//Repos
object Hello {
  def add(lhs: Int, rhs: Int): Int = lhs + rhs

  def main(args: Array[String]): Unit = {
    val two = add(1, 1)

    println("1 plus 1 makes " + two)
  }
}
