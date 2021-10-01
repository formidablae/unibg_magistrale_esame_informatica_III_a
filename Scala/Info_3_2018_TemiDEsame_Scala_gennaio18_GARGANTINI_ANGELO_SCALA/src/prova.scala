import scala.collection.mutable.ListBuffer

object prova {

  def pari(n: Int) = n % 2 == 0

  def dispari(n: Int) = !pari(n)

  def countPar(n: Int) = if (pari(n)) 1 else 0

  def contaP(p: Int => Boolean): (List[Int]) => Int = {
    def inner(l: List[Int]): Int = l.filter(p).size
    inner
  }

  def contaPariFor(l: List[Int]) = {
    var res: Int = 0
    for (n <- l if pari(n))
      res += 1
    res
  }

  def contaPariRec(l: List[Int]): Int = {
    if (l.isEmpty)
      0
    else
      countPar(l.head) + contaPariRec(l.tail)
  }

  def contaPariFold(l: List[Int]) = l.foldLeft(0)((x, y) => x + countPar(y))

  def contaPariFilter(l: List[Int]) = l.filter(pari).size

  // funzione con nome
  def contaPari2(l: List[Int]): Int = contaP(pari)(l)
  // funzione anonima
  def contaPari2a(l: List[Int]): Int = contaP(x =>(x%2== 0))(l)
  
  def main(args: Array[String]) {
    val l = List(0, 1, 3, 4, 8, 52, 87, 9, 254, 5, 6)
    println(contaPariFor(l))
    println(contaPariRec(l))
    println(contaPariFold(l))
    println(contaPariFilter(l))
    println(contaP(pari)(l))
    println(contaP(dispari)(l))
  }
}