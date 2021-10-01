package introduzione
object parName {

  def m(x: Int = 0, y: Int = 0) = println("x" + x + "y" + y)

  def main(args: Array[String]): Unit = {
    m(9, 9)
    m()
    m(y=90,x=8)
  }

}