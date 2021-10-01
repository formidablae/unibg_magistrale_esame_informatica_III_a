object recursion {

// restituisce la somma tra a e b
	def sum(a: Int, b: Int):Int =
		if (a>b) 0 else a + sum(a+1,b)    //> sum: (a: Int, b: Int)Int

// tail recursion
	def sumTR1(a:Int, b: Int, somma: Int) : Int =
		if (a>b) somma else sumTR1(a+1,b,somma+a)
                                                  //> sumTR1: (a: Int, b: Int, somma: Int)Int
		
// tail recursion con segnatura OK
	def sumTR(a:Int, b: Int) : Int ={
		def loop(a:Int, b: Int, somma: Int) : Int =
			if (a>b) somma else loop(a+1,b,somma+a)
		loop(a,b,0);
	}                                         //> sumTR: (a: Int, b: Int)Int
	def sumTR2(a:Int, b: Int) : Int ={
		def loop(a:Int, somma: Int) : Int =
			if (a>b) somma else loop(a+1,somma+a)
		loop(a,0);
	}                                         //> sumTR2: (a: Int, b: Int)Int
			
			
	sumTR2(3,4)                               //> res0: Int = 7
			
			sumTR2(5,4)               //> res1: Int = 0




}