object es2 {
  def abs(x:Int): Int = if (x >0) x else -x
  	//if (x >0 ) return x;
  	//else return -x;
  	  
  def m: Int = 0;
  
  println("Welcome to the Scala worksheet")
  
  abs(3)
  abs(-3)
  abs(3+4+5+6+9)
  abs(abs(5))
  
  abs(m)
  
  def fatt(x:Int) : Int = fatt(x-1) +1
  
  def loop : Int = loop
  
  loops
  
}