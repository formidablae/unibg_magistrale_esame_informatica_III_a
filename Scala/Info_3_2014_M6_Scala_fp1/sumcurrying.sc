object sumcurrying {

	def somma(a: Int, b: Int) = a +b          //> somma: (a: Int, b: Int)Int
	
	somma(4,5)                                //> res0: Int = 9
	
	def sommaC(a: Int): Int => Int ={
		def sa(x:Int) = a+x
		sa
	}                                         //> sommaC: (a: Int)Int => Int

	sommaC(4)                                 //> res1: Int => Int = <function1>
	
	sommaC(4)(5)                              //> res2: Int = 9
	
	def sommaC2(a:Int)(b:Int) : Int = a + b   //> sommaC2: (a: Int)(b: Int)Int
	
	sommaC2(4)(5)                             //> res3: Int = 9
	
	

}