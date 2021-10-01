object esercizioCurrying {

  // scrivi una funzione che calcola i prodotti dei numeri in un intervallo

  def prod1(a: Int, b: Int): Int = {
    if (a > b) 1
    else a * prod1(a + 1, b)
  }                                               //> prod1: (a: Int, b: Int)Int

  prod1(5, 6)                                     //> res0: Int = 30
  prod1(1, 4)                                     //> res1: Int = 24

  // il prodotto dell'applicazione di una funzione f
  // esempio: prodotto dei quadrati, dei cubi

  def prodQuadrati1(a: Int, b: Int): Int = {
    if (a > b) 1
    else (a * a) * prod1(a + 1, b)
  }                                               //> prodQuadrati1: (a: Int, b: Int)Int

	def prodotto(f:Int => Int, a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * prodotto(f, a + 1, b)
	}                                         //> prodotto: (f: Int => Int, a: Int, b: Int)Int
	// prodotto quadrati
	prodotto(x => x*x, 2,3)                   //> res2: Int = 36

	// usando il currying
	def prodottoC(f:Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * prodottoC(f)(a + 1, b)
	}                                         //> prodottoC: (f: Int => Int)(a: Int, b: Int)Int
	
	def prodQuadrati2 : (Int,Int) => Int = prodottoC(x => x*x)
                                                  //> prodQuadrati2: => (Int, Int) => Int

  def fatt3(n: Int): Int = prodottoC(x=>x)(1,n)   //> fatt3: (n: Int)Int

 fatt3(3)                                         //> res3: Int = 6

}