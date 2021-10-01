package introduzione

object passbyname {

  def f(x: Int, y: Int) = x +x                    //> f: (x: Int, y: Int)Int

  def f0(x: =>Int, y: =>Int) = x + x              //> f0: (x: => Int, y: => Int)Int

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	f(4,5)                                    //> res0: Int = 8
	f0(4,5)                                   //> res1: Int = 8
	
	f(6 +7,3)                                 //> res2: Int = 26
	f0(6 +7,3)                                //> res3: Int = 26
	
}