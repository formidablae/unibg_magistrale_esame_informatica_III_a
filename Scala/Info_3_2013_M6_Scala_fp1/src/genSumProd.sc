object genSumProd {

  // usando il currying
  def prodottoC(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * prodottoC(f)(a + 1, b)
  }                                               //> prodottoC: (f: Int => Int)(a: Int, b: Int)Int

  // Utilizzando HOF
  def sumHOF(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sumHOF(f)(a + 1, b)
  }                                               //> sumHOF: (f: Int => Int)(a: Int, b: Int)Int

  def mapRed(neutro: Int, op: (Int, Int) => Int)(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) neutro
    else op(f(a), mapRed(neutro, op)(f)(a + 1, b))
  }                                               //> mapRed: (neutro: Int, op: (Int, Int) => Int)(f: Int => Int)(a: Int, b: Int)I
                                                  //| nt
  def prod(x: Int, y: Int) : Int = x *y           //> prod: (x: Int, y: Int)Int
  
	def prod2(f: Int => Int): (Int, Int) => Int =
	 mapRed(1,prod)(f)                        //> prod2: (f: Int => Int)(Int, Int) => Int

	def sum2(f: Int => Int): (Int, Int) => Int =
	 mapRed(0,((x : Int, y : Int) => x +y))(f)//> sum2: (f: Int => Int)(Int, Int) => Int


prod2( x=> x)(4,5)                                //> res0: Int = 20



}