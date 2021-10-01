package randoop;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test1");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f((-1), (-1));
    int var15 = var0.f(8, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test2");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f(1, 0);
    int var27 = var0.f(100, 10);
    int var30 = var0.f((-1), 10);
    int var33 = var0.f(8, 8);
    int var36 = var0.f(1, 1);
    int var39 = var0.f(0, 10);
    int var42 = var0.f(100, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test3");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f((-1), 10);
    int var24 = var0.f(10, 10);
    int var27 = var0.f((-1), (-1));
    int var30 = var0.f(100, 1);
    int var33 = var0.f(100, 1);
    int var36 = var0.f(10, 10);
    int var39 = var0.f(8, 100);
    int var42 = var0.f(0, 100);
    int var45 = var0.f(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 8);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test4");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 100);
    int var18 = var0.f((-1), 1);
    int var21 = var0.f(100, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test5");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f((-1), 10);
    int var24 = var0.f(10, 10);
    int var27 = var0.f((-1), (-1));
    int var30 = var0.f(100, (-1));
    int var33 = var0.f(10, 10);
    int var36 = var0.f(8, 10);
    int var39 = var0.f(8, 10);
    int var42 = var0.f(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test6");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(1, 8);
    int var21 = var0.f(8, 0);
    int var24 = var0.f(0, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test7");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(10, 1);
    int var24 = var0.f(10, (-1));
    int var27 = var0.f(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test8");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 100);
    int var18 = var0.f((-1), 1);
    int var21 = var0.f(8, 1);
    int var24 = var0.f((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test9");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(1, 8);
    int var18 = var0.f(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test10");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 0);
    int var15 = var0.f(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test11");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(8, 100);
    int var24 = var0.f(10, 1);
    int var27 = var0.f(100, 10);
    int var30 = var0.f(8, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test12");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(8, 10);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(1, 1);
    int var21 = var0.f(10, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test13");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(1, 8);
    int var21 = var0.f(8, 0);
    int var24 = var0.f(0, 10);
    int var27 = var0.f(0, 1);
    int var30 = var0.f(10, 0);
    int var33 = var0.f(8, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 8);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test14");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f((-1), 100);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test15");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 100);
    int var30 = var0.f(1, 10);
    int var33 = var0.f((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test16");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f(8, 8);
    int var24 = var0.f(0, 10);
    int var27 = var0.f(1, (-1));
    int var30 = var0.f(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test17");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test18");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(1, (-1));
    int var12 = var0.f(8, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test19");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(0, (-1));
    int var18 = var0.f((-1), 0);
    int var21 = var0.f(1, (-1));
    int var24 = var0.f(10, 100);
    int var27 = var0.f(1, 0);
    int var30 = var0.f(0, 0);
    int var33 = var0.f(0, 8);
    int var36 = var0.f((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test20");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 1);
    int var21 = var0.f(10, 8);
    int var24 = var0.f(8, 10);
    int var27 = var0.f(100, 0);
    int var30 = var0.f(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test21");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(100, (-1));
    int var21 = var0.f(0, 100);
    int var24 = var0.f(0, 10);
    int var27 = var0.f(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test22");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test23");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test24");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f(1, 1);
    int var15 = var0.f(8, 1);
    int var18 = var0.f(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test25");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f((-1), 100);
    int var24 = var0.f(8, 1);
    int var27 = var0.f(100, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test26");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 8);
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test27");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(10, 0);
    int var24 = var0.f(10, 100);
    int var27 = var0.f(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test28");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(100, 1);
    int var27 = var0.f(10, 8);
    int var30 = var0.f(1, 10);
    int var33 = var0.f((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test29");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(1, 10);
    int var21 = var0.f((-1), 100);
    int var24 = var0.f(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test30");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(1, 10);
    int var15 = var0.f((-1), 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test31");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(10, 100);
    int var27 = var0.f(10, 10);
    int var30 = var0.f(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test32");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(0, (-1));
    int var21 = var0.f((-1), 10);
    int var24 = var0.f(8, 100);
    int var27 = var0.f(1, 8);
    int var30 = var0.f(0, 0);
    int var33 = var0.f(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 8);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test33");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(1, 1);
    int var24 = var0.f(0, 8);
    int var27 = var0.f(10, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test34");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(1, 8);
    int var21 = var0.f(8, 0);
    int var24 = var0.f(0, 10);
    int var27 = var0.f((-1), 0);
    int var30 = var0.f(10, (-1));
    int var33 = var0.f((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 8);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test35");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(10, 100);
    int var21 = var0.f(100, 0);
    int var24 = var0.f(8, 8);
    int var27 = var0.f(100, 0);
    int var30 = var0.f(8, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test36");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(100, 10);
    int var15 = var0.f(1, 1);
    int var18 = var0.f(0, 8);
    int var21 = var0.f(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test37");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(10, 10);
    int var21 = var0.f((-1), 100);
    int var24 = var0.f(8, 100);
    int var27 = var0.f((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test38");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f(1, 0);
    int var27 = var0.f(100, 10);
    int var30 = var0.f((-1), 10);
    int var33 = var0.f(8, 8);
    int var36 = var0.f(1, 0);
    int var39 = var0.f((-1), 100);
    int var42 = var0.f(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test39");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f((-1), (-1));
    int var9 = var0.f(8, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test40");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 1);
    int var21 = var0.f((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test41");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 1);
    int var21 = var0.f(10, 8);
    int var24 = var0.f(8, 1);
    int var27 = var0.f(8, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test42");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(0, (-1));
    int var24 = var0.f(100, 1);
    int var27 = var0.f(10, 0);
    int var30 = var0.f(0, 1);
    int var33 = var0.f((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test43");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test44");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f((-1), 1);
    int var15 = var0.f(8, 100);
    int var18 = var0.f(0, 100);
    int var21 = var0.f(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test45");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(100, 8);
    int var21 = var0.f(0, 100);
    int var24 = var0.f(100, 8);
    int var27 = var0.f(10, 0);
    int var30 = var0.f(100, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test46");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 1);
    int var21 = var0.f(10, 8);
    int var24 = var0.f(100, 10);
    int var27 = var0.f(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test47");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(100, 1);
    int var21 = var0.f(8, 8);
    int var24 = var0.f(8, 1);
    int var27 = var0.f(10, 100);
    int var30 = var0.f(100, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test48");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(100, 1);
    int var21 = var0.f(8, 8);
    int var24 = var0.f(8, 1);
    int var27 = var0.f(10, 100);
    int var30 = var0.f(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test49");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test50");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 1);
    int var21 = var0.f(0, 8);
    int var24 = var0.f(100, 1);
    int var27 = var0.f(8, 1);
    int var30 = var0.f(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test51");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f((-1), 8);
    int var12 = var0.f(8, 10);
    int var15 = var0.f(1, 8);
    int var18 = var0.f(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

}
