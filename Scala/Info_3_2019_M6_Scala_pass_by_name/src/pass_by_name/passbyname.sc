//package pass_by_name

object passbyname {

  def something() = {
    println("calling something")
    1 // return value
  }                                               //> something: ()Int

  def callByValue(x: Int) = {
    println("x1=" + x)
    println("x2=" + x)
  }                                               //> callByValue: (x: Int)Unit

  def callByName(x: => Int) = {
    println("x1=" + x)
    println("x2=" + x)
  }                                               //> callByName: (x: => Int)Unit
  callByValue(something())                        //> calling something
                                                  //| x1=1
                                                  //| x2=1

  callByName(something())                         //> calling something
                                                  //| x1=1
                                                  //| calling something
                                                  //| x2=1

}