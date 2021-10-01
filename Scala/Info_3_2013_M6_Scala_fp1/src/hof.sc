object hof {
  // somam dei valori interi da a a b
  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0
    else a + sumInts(a + 1, b)
  }                                               //> sumInts: (a: Int, b: Int)Int
  sumInts(2, 3)                                   //> res0: Int = 5

  // somma dei quadrati degli interi tra a e b

  def square(x: Int) = x * x                      //> square: (x: Int)Int

  def sumQuare(a: Int, b: Int): Int = {
    if (a > b) 0
    else square(a) + sumQuare(a + 1, b)
  }                                               //> sumQuare: (a: Int, b: Int)Int
  sumQuare(2, 3)                                  //> res1: Int = 13

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n - 1);
  }                                               //> factorial: (n: Int)Int
  // somma fattoriali
  def sumFactorial(a: Int, b: Int): Int = {
    if (a > b) 0
    else factorial(a) + sumFactorial(a + 1, b)
  }                                               //> sumFactorial: (a: Int, b: Int)Int

  // Utilizzando HOF
  def sumHOF(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sumHOF(f, a + 1, b)
  }                                               //> sumHOF: (f: Int => Int, a: Int, b: Int)Int

  sumFactorial(4, 5)                              //> res2: Int = 144
  sumHOF(factorial, 4, 5)                         //> res3: Int = 144

  sumHOF(square, 3, 4)                            //> res4: Int = 25

  def id(x: Int): Int = x                         //> id: (x: Int)Int
  sumHOF(id, 3, 4)                                //> res5: Int = 7
  // identico con funzioni anonime
  sumHOF(x => x, 3, 4)                            //> res6: Int = 7

  // funzione che restitusce il numero di elementi tra a e b
  // usando sumHOF

  sumHOF(x => 1, 11, 20)                          //> res7: Int = 10

  // funzione che resituisc il numero di elementi pari tra a e b

  def pari(x: Int): Int =
    if (x % 2 == 0) 1
    else 0                                        //> pari: (x: Int)Int

  sumHOF(pari, 11, 20)                            //> res8: Int = 5

  // cURRYING

  def sumInts2(a: Int, b: Int) = sumHOF(x => x, a, b)
                                                  //> sumInts2: (a: Int, b: Int)Int

}