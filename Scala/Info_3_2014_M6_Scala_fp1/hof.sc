object hof {

	def sumTR(op: Int => Int, a : Int, b: Int) : Int ={
		def loop(x: Int, acc: Int) : Int=
		if (x > b) acc else loop(x+1, acc + op(x))
		loop(a,0)
	}                                         //> sumTR: (op: Int => Int, a: Int, b: Int)Int
	
	/*def sumOp(op:Int => Int)(a: Int, b: Int) :  Int ={
			if (a>b) 0 else op(a) + sumOp(op)(a+1,b)
	}*/
	def sumOp(op:Int => Int): (Int, Int) =>Int ={
		def  f(a:Int, b: Int) =
			if (a>b) 0 else op(a) + sumOp(op)(a+1,b)
		f
	}                                         //> sumOp: (op: Int => Int)(Int, Int) => Int
	
	var s1 = sumOp(x => x)                    //> s1  : (Int, Int) => Int = <function2>
	
	s1(6,7)                                   //> res0: Int = 13
	
  // op è una funzione
	def sum(op: Int => Int, a : Int, b: Int) : Int =
	if (a>b) 0 else op(a) + sum(op, a+1,b)    //> sum: (op: Int => Int, a: Int, b: Int)Int

	def quad(x: Int) : Int = x * x            //> quad: (x: Int)Int
	
	def inde(X:Int) : Int = X                 //> inde: (X: Int)Int
	
	sum(quad,2,3)                             //> res1: Int = 13

  sum(inde,4,6)                                   //> res2: Int = 15
  
  sum((x:Int) => x, 4,6)                          //> res3: Int = 15
  
  sum(x => x, 4,6)                                //> res4: Int = 15
  
  sum(x => x *x*x, 4,6)                           //> res5: Int = 405
  
  
}