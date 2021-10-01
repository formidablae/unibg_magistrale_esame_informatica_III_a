object esercizio_TE {

  //1. funzione max che dato du enumeri restituisce il maggiore
  def max(a: Int, b: Int): Int = {
    if (a > b) return a;
    else return b;
  }                                               //> max: (a: Int, b: Int)Int

  max(3, 4)                                       //> res0: Int = 4
  max(5, 2)                                       //> res1: Int = 5

  // 2. scrivi una funzione che dati tre numeri restuisce il max
  def max3(a: Int, b: Int, c: Int): Int =
    // NON e' tanto bello if (a>b && ...
    max(max(a, b), c)                             //> max3: (a: Int, b: Int, c: Int)Int

  max3(7, 8, 9)                                   //> res2: Int = 9

  // 3. scrivi una funzione HOF che prende una funzione f
  // (da due interi ad interi), e  tre interi a, b, c e restutiusce
  // l'applicazione di f in questo modo: f(f(a,b),c)

  def f3(f: (Int, Int) => Int, a: Int, b: Int, c: Int): Int =
    f(f(a, b), c)                                 //> f3: (f: (Int, Int) => Int, a: Int, b: Int, c: Int)Int

  // 4.prova a definire max3 come applicazione particolare di f3

  def max3_2(a: Int, b: Int, c: Int) =
    f3(max, a, b, c)                              //> max3_2: (a: Int, b: Int, c: Int)Int

  // 5.prova a definire il minimo allo stesso modo, applica il currying (se riesci)
  // e prova ad applicarlo a qualche argomento
  // usa funzioni anonime se riesci

	// SENZA CURRYING
  // A. senza funzione anonima
  def min(a: Int, b: Int): Int = if (a < b) a else b
                                                  //> min: (a: Int, b: Int)Int
  def min3_1(a: Int, b: Int, c: Int): Int =
    f3(min, a, b, c)                              //> min3_1: (a: Int, b: Int, c: Int)Int


  // B. funziona anonima
  def min3(a: Int, b: Int, c: Int): Int =
    f3((x, y) => if (x < y) x else y, a, b, c)    //> min3: (a: Int, b: Int, c: Int)Int

  // USO IL CURRYING

  //  def  f3_c(f: (Int, Int) => Int): ((a: Int, b: Int, c: Int) => Int) = {
  //     f(f(a,b),c)
  //  }

  def f3_c(f: (Int, Int) => Int)(a: Int, b: Int, c: Int): Int = {
    f(f(a, b), c)
  }                                               //> f3_c: (f: (Int, Int) => Int)(a: Int, b: Int, c: Int)Int

  def min_c1(a: Int, b: Int, c: Int): Int =
    f3_c(min)(a, b, c)                            //> min_c1: (a: Int, b: Int, c: Int)Int

  def min_c2: (Int,Int,Int) => Int = f3_c(min)    //> min_c2: => (Int, Int, Int) => Int


  def min_c: (Int, Int, Int) => Int = f3_c((x, y) => if (x < y) x else y)
                                                  //> min_c: => (Int, Int, Int) => Int



}