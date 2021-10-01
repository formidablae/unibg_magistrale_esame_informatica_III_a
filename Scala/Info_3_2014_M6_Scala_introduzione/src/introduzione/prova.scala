package introduzione

class Persona(val name: String, private var eta0: Int) {
  
  def eta = {
    var h = 9
    this.eta0
  }
  
  def etavera : Option[Int] ={
    if (eta0 >0) return Some(eta0);
    else return None
  } 
  
}

object prova {
	def main(args: Array[String]): Unit = {

    val p = new Persona("a", 3);
    println(p.eta)
  }

}