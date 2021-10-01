package prova_20_1_15

object prova {

  def contaPari(nums: List[Int]): Int = {
    var count = 0
    for (n <- nums) {
      if (n % 2 == 0) count = count + 1;
    }
    count
  }
  def contaPari2(nums: List[Int]): Int = {
    var counter = 0;
    def countPar(x: Int) = {
      if (x % 2 == 0) counter = counter + 1;
    }
    nums.foreach(countPar)
    counter
  }

  def contaParR(nums: List[Int]): Int = {
    if (nums.isEmpty) 0
    else if (nums.head % 2 == 0) 1 + contaParR(nums.tail)
    else contaParR(nums.tail)
  }

  ///
  def counterF(count: Int, n: Int): Int = {
    if (n % 2 == 0) count + 1
    else count
  }
  
  //
  def pari = (x: Int) => (x % 2 == 0)

  
  def main(args: Array[String]) {
    val nums = List(1, 2, 3, 4, 5)
    print(contaPari(nums))
    print(contaPari2(nums))
    print(contaParR(nums))
    print(nums.foldLeft(0)(counterF))
    print(nums.filter(pari).length)
    
  }

}