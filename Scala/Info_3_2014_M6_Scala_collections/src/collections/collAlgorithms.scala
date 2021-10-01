package collections

object collAlgorithms {

  def main(args: Array[String]) {

    val nums = List(1, 2, 3, 4, 5)

    var sum = 0
    for (n <- nums) {
      sum += n
    }
    println(sum)

    var ss = 0;
    def sinc(x: Int) = {
      ss += x;
    }
    nums.foreach(sinc)

    println(ss)

    val names = List("Daniel", "Chris", "Joseph")
    names.foreach { name =>
      println(name)
    }

    names.foreach(println)

    def myf(x: Int, y: Int) = x+y 
    
    val sum3 = nums.foldLeft(0)(myf)
    
    println(sum3)
    
    val sum4 = nums.foldLeft(0)(
        (total, n) =>
      total + n)
    
    
    

  }

}