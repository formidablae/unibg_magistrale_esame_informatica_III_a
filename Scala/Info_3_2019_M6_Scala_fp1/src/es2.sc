object es2 {
  def abs(x: Int): Int = if (x > 0) x else -x     //> abs: (x: Int)Int
  //if (x >0 ) return x;
  //else return -x;

  def m: Int = 0;                                 //> m: => Int

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  abs(3)                                          //> res0: Int = 3
  abs(-3)                                         //> res1: Int = 3
  abs(3 + 4 + 5 + 6 + 9)                          //> res2: Int = 27
  abs(abs(5))                                     //> res3: Int = 5

  abs(m)                                          //> res4: Int = 0

  def fatt(x: Int): Int = fatt(x - 1) + 1         //> fatt: (x: Int)Int

  def loop: Int = loop                            //> loop: => Int/

  loopd

}