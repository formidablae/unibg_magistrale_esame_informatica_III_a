package introduzione

class Person {}

class Student extends Person {}

class Anatra { def talk = "Qua" }

class Cane { def talk = "Bau" }

object ered {

  def parla(any: { def talk: String }) = println(any.talk)

  def main(args: Array[String]): Unit = {

    parla(new Anatra)

    parla(new Cane)

  }

}