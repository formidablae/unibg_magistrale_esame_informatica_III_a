object prova {
  def add(a: Int, b: Int) /*: Int*/ = {
    //
    a + 7
    a + 9
    a + b
  }                                               //> add: (a: Int, b: Int)Int

  var x = 7                                       //> x  : Int = 7

  println(add(x, 3))                              //> 10
  
  def loop: Int = loop                            //> loop: => Int


}