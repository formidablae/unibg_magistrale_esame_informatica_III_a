object usingwhile {

  def fattNR(n: Int): Int = {
    var res = 1;
    var i = 1;
    while (i <= n) {
      res = res * i;
      i = i + 1;
    }
    return res;
  }                                               //> fattNR: (n: Int)Int

}