package introduzione

object passbyName2 {
  
  def cbv(x: Int){
    println( x + x)
  }
  
  def cbn(x: => Int){
    println( x+x)
  }
 
  def m = {println("m") 
    3
   }
  
  def main(args: Array[String]): Unit = {
    cbv(m)
    println("*****")
    cbn(m)
  }
  

}