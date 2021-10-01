package collections

object uso3 {

  def main(args: Array[String]): Unit = {

    var l = List(1, 2, 4)
    // imperativo
    var sum = 0;
    for (n <- l) {
      sum += n
    }
    // funzionale
    var acc = 0
    def accumulatore(x: Int) { acc += x }

    l.foreach(accumulatore)

    println(acc)

    println(sum)

    val o = l.foldLeft(0)((x, y) => x + y)

    println(o)

    val nomi = List("a", "b", "C")

    println(nomi.foldLeft("")((x: String, y: String) => x + y))

    // calcolo del massimo mediante fold
    var numeri = List(5, 100, 3000, 60)
    def max(x: Int, y: Int) = (if (x > y) x else y)
    println(numeri.foldLeft(0)(max))
    // lunghezza della stringa più lunga
    def strpl(x: Int, s: String) = if (s.length() > x) s.length() else x

    println(List("ciao", "tttttt").foldLeft(0)(strpl))

    var nn = List("a", "b", "c")
    // voglio stampare "a,b,c"
    nn.foreach((x: String) => print(x + ","))
    println()

    println(nn.foldLeft("")((x: String, y: String) => x + "," + y))
    println(nn.foldLeft("")((x, y) => x + "," + y))
    println(nn.reduceLeft((x, y) => x + "," + y))

    println(List(3, 4, 5, 6).reduceLeft((x: Int, y: Int) => max(x, y)))
    
    println(l.reduceLeft((x, y) => if (x>y) x else y ))

  }

}