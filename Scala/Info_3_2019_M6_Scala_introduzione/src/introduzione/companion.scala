package introduzione

class MyString(val jString: String) {
  private var extraData = ""
  override def toString = jString + extraData
}

object MyString {
  def apply(base: String, extras: String) = {
    val s = new MyString(base)
    s.extraData = extras
    s
  }
  def apply(base: String) = new MyString(base)

}

object companion {
  def main(args: Array[String]): Unit = {
    println(MyString("hello", " 	world"))
    println(MyString("hello"))

  }
}