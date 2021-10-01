package companion2

import scala.math._

class Circle(val radius: Double) {
  def area: Double = Circle.calculateArea(radius)
}

object Circle {
  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
}

object ProvaCircle {

  def main(args: Array[String]): Unit = {
    val circle1 = new Circle(5.8)
    println(circle1.area)
  }
}