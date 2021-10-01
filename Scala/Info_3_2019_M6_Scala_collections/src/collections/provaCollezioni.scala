package collections

object provaCollezioni {

  def main(args: Array[String]): Unit = {
    var l = List(1,2,4)
    
    println(l.head + l.tail.head)
    
    println(l.tail)
    
    println(l)
    
    l.foreach(println)
    
    
    def myf(x:Int ) = {
      println(" adesso stampo doppio " + x *2)
    }
    
    l.foreach(myf)
    
    l.foreach { x => println(" contengo " + x ) }
    
  }
  
}