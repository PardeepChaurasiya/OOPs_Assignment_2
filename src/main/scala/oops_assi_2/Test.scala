package oops_assi_2

object Test {
  def main(args: Array[String]): Unit = {
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test", 25)
    personOne.check(personTwo)
    personTwo.check(personTwo)
  }
}
