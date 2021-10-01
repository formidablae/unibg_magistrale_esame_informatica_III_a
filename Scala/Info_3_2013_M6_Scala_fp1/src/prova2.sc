object prova2 {

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n - 1);
  }                                               //> factorial: (n: Int)Int
  factorial(10)                                   //> res0: Int = 3628800

  def fattTR2(n: Int, acc: Int): Int = {
    if (n == 0) acc
    else fattTR2(n - 1, n * acc)

  }                                               //> fattTR2: (n: Int, acc: Int)Int

  def factorialTR(n: Int): Int = {
    // loop accumula in acc n
    def loop(acc: Int, n: Int): Int = {
      if (n == 0) acc
      else loop(n * acc, n - 1)
    }
    loop(1, n)
  }                                               //> factorialTR: (n: Int)Int

  // somma dei valori da 0 a n // rikcorsvia non tail
  def sum1(n: Int): Int = {
    if (n == 0) 0
    else n + sum1(n - 1)
  }                                               //> sum1: (n: Int)Int

  def sumTR(n: Int) = {
    def sumTR(n: Int, acc: => Int): Int = {
      if (n == 0) acc
      else sumTR(n - 1, acc + n)
    }
    sumTR(n, 0)
  }                                               //> sumTR: (n: Int)Int

  sum1(4)                                         //> res1: Int = 10
  sumTR(100)                                      //> res2: Int = 5050
}