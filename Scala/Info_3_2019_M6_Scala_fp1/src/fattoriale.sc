object fattoriale {

  def fattNTR(n: Int): Int =
    if (n == 0) 1 else n * fattNTR(n - 1)         //> fattNTR: (n: Int)Int

  def fattTR(n: Int): Int = {
    def loop(n: Int, acc: Int): Int =
      if (n == 0) acc else loop(n - 1, acc * n)
    loop(n, 1)
  }                                               //> fattTR: (n: Int)Int

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  fattNTR(10)                                     //> res0: Int = 3628800
	fattTR(10)                                //> res1: Int = 3628800
}