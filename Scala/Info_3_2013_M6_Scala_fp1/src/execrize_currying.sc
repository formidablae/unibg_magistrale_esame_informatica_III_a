object execrize_currying {

  def product0(a: Int, b: Int): Int = {
    if (a > b) 1
    else a * product0(a + 1, b)
  }                                               //> product0: (a: Int, b: Int)Int

	product0(3,4)                             //> res0: Int = 12

  def product(f: Int =>Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int

	product(x=>x)(3,4)                        //> res1: Int = 12

	def fact(n:Int) = product(x=>x)(1,n)      //> fact: (n: Int)Int
	
	fact(10)                                  //> res2: Int = 3628800
	

  def gen(f:Int => Int)(a:Int, b: Int)(c: (Int, Int) => Int, neu: Int) : Int ={
	  	
  	if (a>b)	neu
  	else c(f(a),gen(f)(a+1,b)(c,neu))
  
  }




  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}