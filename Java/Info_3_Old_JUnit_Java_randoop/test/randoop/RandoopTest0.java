package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, (-1));
    
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

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(10, 0);
    int var21 = var0.f(0, 100);
    
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

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(100, 0);
    
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

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(10, (-1));
    
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
    assertTrue(var21 == 8);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


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
    int var33 = var0.f((-1), 0);
    
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
    assertTrue(var33 == 8);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(100, 0);
    int var12 = var0.f(0, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f((-1), 100);
    int var12 = var0.f((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f((-1), 0);
    
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

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), (-1));
    
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

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(8, 100);
    int var24 = var0.f(1, 100);
    
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

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f(1, 0);
    int var27 = var0.f(8, 0);
    
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
    assertTrue(var27 == 8);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(8, 10);
    int var21 = var0.f((-1), (-1));
    
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

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(10, 8);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(1, 0);
    int var15 = var0.f(100, 0);
    
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

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f((-1), 10);
    
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

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 0);
    int var24 = var0.f(1, 10);
    
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

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, 10);
    int var24 = var0.f(100, 8);
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
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(8, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(1, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(8, (-1));
    int var27 = var0.f(100, 0);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(0, 8);
    
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

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


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
    int var30 = var0.f(10, 1);
    
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

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(10, 0);
    int var15 = var0.f(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(0, 0);
    
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

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(8, 10);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(0, (-1));
    
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

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, 10);
    int var24 = var0.f(100, 8);
    int var27 = var0.f(0, 8);
    
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
    assertTrue(var27 == 1);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 0);
    int var15 = var0.f(10, 0);
    
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

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f((-1), 10);
    int var24 = var0.f(0, 10);
    
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

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(10, 100);
    int var21 = var0.f((-1), (-1));
    
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

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 0);
    int var15 = var0.f(10, 1);
    
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

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(1, 10);
    int var21 = var0.f((-1), 0);
    
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

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f((-1), 8);
    int var24 = var0.f(100, 100);
    
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

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 10);
    int var30 = var0.f(8, 0);
    int var33 = var0.f(100, 0);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 8);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(10, 0);
    int var39 = var0.f(8, 0);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 8);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(10, 0);
    int var12 = var0.f(10, 1);
    int var15 = var0.f((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f((-1), 10);
    int var24 = var0.f(8, 100);
    int var27 = var0.f(1, 100);
    
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
    assertTrue(var27 == 1);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(100, 10);
    int var15 = var0.f(8, 10);
    
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

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 0);
    int var15 = var0.f(8, 0);
    int var18 = var0.f(8, 0);
    
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
    assertTrue(var18 == 8);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(10, 10);
    int var27 = var0.f(8, 8);
    
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
    assertTrue(var27 == 1);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 10);
    int var30 = var0.f(10, 10);
    
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

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(10, 100);
    int var15 = var0.f(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(0, 0);
    int var27 = var0.f(10, (-1));
    
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
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(8, 0);
    
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

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 10);
    int var30 = var0.f(1, 0);
    
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
    assertTrue(var30 == 8);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f((-1), 1);
    int var15 = var0.f(8, 100);
    int var18 = var0.f((-1), 10);
    
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

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(0, (-1));
    int var18 = var0.f((-1), 0);
    int var21 = var0.f(100, (-1));
    
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

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f((-1), 8);
    int var15 = var0.f(8, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(0, 0);
    int var15 = var0.f((-1), (-1));
    int var18 = var0.f(10, 1);
    int var21 = var0.f(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
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

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 10);
    int var21 = var0.f(1, 1);
    
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

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(100, 1);
    int var21 = var0.f(8, 8);
    int var24 = var0.f(0, 100);
    
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

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(1, 10);
    int var21 = var0.f(1, 0);
    
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
    assertTrue(var21 == 8);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(0, 10);
    
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

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 10);
    int var12 = var0.f(10, 100);
    int var15 = var0.f(0, 0);
    int var18 = var0.f(0, 100);
    int var21 = var0.f(8, 8);
    
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

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, 100);
    int var15 = var0.f((-1), 1);
    int var18 = var0.f(100, (-1));
    
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

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(10, 10);
    int var27 = var0.f(0, 0);
    int var30 = var0.f(10, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(10, 1);
    int var24 = var0.f(10, (-1));
    int var27 = var0.f(1, 8);
    
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

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(1, 8);
    
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

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(100, 1);
    int var21 = var0.f(1, 1);
    int var24 = var0.f(1, 10);
    
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

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(8, 1);
    
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

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 100);
    int var21 = var0.f((-1), 0);
    int var24 = var0.f((-1), 10);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 0);
    
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
    assertTrue(var24 == 8);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(10, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f((-1), (-1));
    
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
    assertTrue(var18 == 8);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(0, (-1));
    int var18 = var0.f((-1), 0);
    int var21 = var0.f(1, (-1));
    int var24 = var0.f(100, 1);
    
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

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f((-1), 0);
    int var12 = var0.f(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f((-1), 100);
    int var24 = var0.f(8, 1);
    int var27 = var0.f(1, 0);
    
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

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(1, (-1));
    
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
    assertTrue(var36 == 8);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(8, 1);
    int var27 = var0.f((-1), 0);
    int var30 = var0.f(8, (-1));
    
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

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(10, 0);
    
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

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(10, 8);
    int var9 = var0.f(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 10);
    int var30 = var0.f(100, 10);
    
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

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f((-1), 1);
    int var15 = var0.f(100, 10);
    
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

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(100, 100);
    int var12 = var0.f(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(0, (-1));
    int var18 = var0.f((-1), 0);
    int var21 = var0.f(10, 0);
    int var24 = var0.f(10, 100);
    
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

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 0);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(100, 10);
    
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

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 1);
    int var21 = var0.f(100, 10);
    
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

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 8);
    int var6 = var0.f(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 10);
    int var12 = var0.f(10, 100);
    int var15 = var0.f(100, 8);
    int var18 = var0.f((-1), 10);
    
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

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f((-1), 8);
    int var18 = var0.f(0, 10);
    
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

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


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
    int var33 = var0.f((-1), 1);
    int var36 = var0.f(0, 100);
    
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

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f((-1), 8);
    int var15 = var0.f(8, 1);
    int var18 = var0.f((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(0, 0);
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(100, 100);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(10, 8);
    int var15 = var0.f(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(100, 10);
    int var15 = var0.f(1, 1);
    int var18 = var0.f(10, 0);
    
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
    assertTrue(var18 == 8);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, (-1));
    int var9 = var0.f(10, 100);
    int var12 = var0.f((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(8, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(1, 1);
    int var24 = var0.f(100, 1);
    int var27 = var0.f(10, 10);
    
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
    assertTrue(var27 == 1);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 10);
    int var30 = var0.f(8, 0);
    int var33 = var0.f(8, 1);
    int var36 = var0.f(8, 8);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f((-1), 10);
    int var21 = var0.f(1, (-1));
    
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
    assertTrue(var21 == 8);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(0, 0);
    int var15 = var0.f((-1), (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
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

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(10, 0);
    int var39 = var0.f(0, 0);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 8);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 10);
    int var12 = var0.f(0, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 100);
    int var18 = var0.f(1, 8);
    
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

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 10);
    int var30 = var0.f(8, 0);
    int var33 = var0.f(10, 0);
    int var36 = var0.f((-1), (-1));
    int var39 = var0.f(8, 8);
    int var42 = var0.f(100, 8);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


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
    int var33 = var0.f((-1), 1);
    int var36 = var0.f(10, 8);
    int var39 = var0.f(10, 10);
    
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

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(10, 0);
    int var21 = var0.f((-1), 8);
    
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

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 100);
    int var21 = var0.f(0, (-1));
    int var24 = var0.f(0, (-1));
    int var27 = var0.f(100, 8);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(8, 1);
    int var27 = var0.f((-1), 1);
    
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

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f((-1), 100);
    int var12 = var0.f(100, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(8, (-1));
    int var30 = var0.f(1, 1);
    
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
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f((-1), 100);
    int var24 = var0.f(8, 1);
    int var27 = var0.f(10, 10);
    
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

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(0, 0);
    int var21 = var0.f(10, 8);
    int var24 = var0.f(10, 100);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


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
    int var33 = var0.f((-1), 10);
    int var36 = var0.f(8, 10);
    
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

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f((-1), 1);
    int var27 = var0.f((-1), 100);
    int var30 = var0.f(8, 10);
    int var33 = var0.f((-1), 8);
    int var36 = var0.f((-1), (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 8);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(10, 1);
    int var24 = var0.f(10, 10);
    int var27 = var0.f(0, 8);
    
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

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 10);
    int var21 = var0.f(100, 8);
    int var24 = var0.f(100, 10);
    
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

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(10, 10);
    int var21 = var0.f(1, 0);
    int var24 = var0.f((-1), 100);
    
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

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(1, 1);
    int var15 = var0.f(8, 0);
    
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

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(100, 1);
    int var27 = var0.f(8, 0);
    
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
    assertTrue(var27 == 8);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f(0, (-1));
    
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

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(100, 8);
    int var24 = var0.f(0, 100);
    int var27 = var0.f(10, 8);
    int var30 = var0.f(10, 10);
    
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
    assertTrue(var30 == 1);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(1, 10);
    int var21 = var0.f(1, 100);
    
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

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


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
    int var33 = var0.f((-1), 1);
    int var36 = var0.f(10, 8);
    int var39 = var0.f(8, 100);
    
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

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 100);
    int var18 = var0.f((-1), 1);
    int var21 = var0.f(100, 0);
    int var24 = var0.f(0, 8);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 10);
    int var30 = var0.f(8, 0);
    int var33 = var0.f(10, 0);
    int var36 = var0.f((-1), (-1));
    int var39 = var0.f(8, 8);
    int var42 = var0.f(0, 100);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 8);
    int var18 = var0.f(0, 0);
    
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

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 1);
    int var21 = var0.f(1, 0);
    
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
    assertTrue(var21 == 8);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f((-1), 8);
    int var18 = var0.f(10, 0);
    
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

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f((-1), 1);
    int var27 = var0.f((-1), 100);
    int var30 = var0.f(0, 100);
    
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

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(10, 10);
    int var21 = var0.f(8, (-1));
    
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

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f((-1), 10);
    
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

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(1, (-1));
    
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

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(1, 10);
    int var21 = var0.f(100, 1);
    
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

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(1, 10);
    int var21 = var0.f(8, 10);
    
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

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(10, 1);
    int var21 = var0.f(8, 100);
    int var24 = var0.f(10, 10);
    
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

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 8);
    int var12 = var0.f((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, 10);
    int var24 = var0.f(10, (-1));
    
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
    assertTrue(var24 == 8);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


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
    int var33 = var0.f(8, 0);
    
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
    assertTrue(var33 == 8);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(100, (-1));
    int var21 = var0.f(0, 100);
    int var24 = var0.f(0, 10);
    int var27 = var0.f(1, 100);
    int var30 = var0.f(0, 10);
    
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
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(10, 0);
    int var21 = var0.f(1, 1);
    int var24 = var0.f(8, 8);
    int var27 = var0.f(8, 8);
    
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

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f((-1), 0);
    
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
    assertTrue(var21 == 8);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(0, 100);
    
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

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f((-1), 8);
    int var12 = var0.f(8, 10);
    int var15 = var0.f(1, 8);
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), 1);
    
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

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


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
    int var36 = var0.f(100, 100);
    
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

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f(0, 1);
    int var27 = var0.f(1, 100);
    int var30 = var0.f(10, (-1));
    
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
    assertTrue(var30 == 8);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f((-1), 10);
    int var24 = var0.f(1, 100);
    int var27 = var0.f(1, 0);
    
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

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(10, 1);
    int var24 = var0.f(10, 10);
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

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(1, 10);
    int var21 = var0.f(8, (-1));
    
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

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


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
    int var36 = var0.f(8, 0);
    int var39 = var0.f(100, 0);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 8);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, 100);
    
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

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(10, 0);
    int var21 = var0.f(1, 1);
    int var24 = var0.f(10, 10);
    
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

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f((-1), 8);
    int var24 = var0.f(8, 8);
    int var27 = var0.f(8, 8);
    
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
    assertTrue(var27 == 1);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, 1);
    int var9 = var0.f(100, 100);
    int var12 = var0.f(100, (-1));
    int var15 = var0.f((-1), (-1));
    
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

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(10, 8);
    int var9 = var0.f(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(10, 8);
    int var15 = var0.f((-1), 0);
    int var18 = var0.f(1, (-1));
    
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
    assertTrue(var18 == 8);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f((-1), 0);
    int var12 = var0.f(100, 1);
    int var15 = var0.f(100, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


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
    int var30 = var0.f(1, (-1));
    
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

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(1, 10);
    
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

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(100, (-1));
    int var21 = var0.f(0, 100);
    int var24 = var0.f(0, 10);
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
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 8);
    int var18 = var0.f((-1), 8);
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

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f((-1), 8);
    int var24 = var0.f(8, 8);
    int var27 = var0.f((-1), 1);
    
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
    assertTrue(var27 == 1);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(10, 0);
    int var39 = var0.f(1, 8);
    int var42 = var0.f((-1), (-1));
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 8);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f((-1), 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 10);
    int var12 = var0.f(10, 100);
    int var15 = var0.f(100, 8);
    int var18 = var0.f(0, (-1));
    
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

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f((-1), 0);
    int var39 = var0.f((-1), 100);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, 10);
    
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

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f((-1), 8);
    int var24 = var0.f(8, 8);
    int var27 = var0.f(1, 100);
    int var30 = var0.f(100, 1);
    
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
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f((-1), 1);
    int var27 = var0.f((-1), 100);
    int var30 = var0.f((-1), (-1));
    
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
    assertTrue(var30 == 8);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, 100);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(8, (-1));
    int var21 = var0.f(8, 100);
    int var24 = var0.f((-1), 100);
    int var27 = var0.f(1, (-1));
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f((-1), 1);
    int var15 = var0.f(8, 100);
    int var18 = var0.f(0, 100);
    int var21 = var0.f(1, 8);
    
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

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(10, 0);
    int var15 = var0.f(0, 1);
    int var18 = var0.f((-1), 1);
    int var21 = var0.f(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(10, 0);
    int var21 = var0.f(1, 1);
    int var24 = var0.f(8, (-1));
    
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

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(8, (-1));
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(1, 0);
    int var21 = var0.f(100, 8);
    int var24 = var0.f((-1), (-1));
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f((-1), 1);
    int var27 = var0.f((-1), 100);
    int var30 = var0.f(8, 10);
    int var33 = var0.f((-1), 8);
    int var36 = var0.f(100, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(8, 1);
    int var27 = var0.f(0, 10);
    int var30 = var0.f((-1), 8);
    
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

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 8);
    int var6 = var0.f((-1), 0);
    int var9 = var0.f(1, 1);
    int var12 = var0.f(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f((-1), (-1));
    
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

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, (-1));
    int var21 = var0.f((-1), (-1));
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(10, 10);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(8, 0);
    int var27 = var0.f(100, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(1, 10);
    int var21 = var0.f(10, 100);
    int var24 = var0.f(100, 1);
    
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

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


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
    int var36 = var0.f(8, 0);
    int var39 = var0.f(100, 10);
    int var42 = var0.f(10, 0);
    int var45 = var0.f(100, 0);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 8);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, 100);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(8, (-1));
    int var21 = var0.f(8, 100);
    int var24 = var0.f((-1), 100);
    int var27 = var0.f((-1), 8);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(1, 8);
    int var15 = var0.f(0, 0);
    
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

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(100, 8);
    int var21 = var0.f(100, (-1));
    
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

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(1, 100);
    int var21 = var0.f(0, 10);
    int var24 = var0.f(1, 100);
    int var27 = var0.f(8, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(8, 10);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(0, (-1));
    
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
    assertTrue(var18 == 8);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(1, 8);
    int var21 = var0.f((-1), 0);
    
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

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(0, (-1));
    
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
    assertTrue(var18 == 8);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f((-1), 10);
    int var24 = var0.f(8, 100);
    int var27 = var0.f(1, 8);
    
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
    assertTrue(var27 == 1);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(1, 0);
    int var21 = var0.f(100, 8);
    int var24 = var0.f(1, 0);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(10, 10);
    int var27 = var0.f(0, 0);
    int var30 = var0.f(0, 8);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(1, (-1));
    
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
    assertTrue(var24 == 8);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


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
    int var36 = var0.f(8, 8);
    
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

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f(0, 1);
    int var15 = var0.f(8, 0);
    int var18 = var0.f(0, (-1));
    int var21 = var0.f(8, 10);
    
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

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f((-1), 100);
    int var18 = var0.f(0, 100);
    
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

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(10, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f((-1), 8);
    
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

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


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
    int var30 = var0.f(0, 100);
    
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

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(0, 0);
    int var12 = var0.f(0, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


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
    int var36 = var0.f(10, (-1));
    int var39 = var0.f(1, (-1));
    
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
    assertTrue(var39 == 8);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(0, 0);
    int var15 = var0.f(0, 1);
    
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

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


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
    int var30 = var0.f((-1), (-1));
    int var33 = var0.f((-1), 8);
    
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

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 8);
    int var9 = var0.f(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


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
    int var33 = var0.f(1, 10);
    int var36 = var0.f(100, 100);
    
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

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(100, 10);
    
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

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, 10);
    int var21 = var0.f(8, 8);
    
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

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


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
    int var36 = var0.f(100, 100);
    int var39 = var0.f(100, 100);
    
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

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(8, 10);
    int var21 = var0.f(0, 100);
    
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

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(0, 0);
    int var15 = var0.f((-1), (-1));
    int var18 = var0.f(10, 1);
    int var21 = var0.f(0, 10);
    int var24 = var0.f(1, 8);
    int var27 = var0.f(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
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
    assertTrue(var27 == 8);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(10, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, 1);
    int var18 = var0.f(1, 1);
    
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

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 100);
    int var18 = var0.f(8, 8);
    int var21 = var0.f(8, 1);
    
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

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(0, 0);
    int var21 = var0.f(0, 0);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(10, 100);
    int var15 = var0.f(8, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(10, 100);
    int var21 = var0.f(1, (-1));
    
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

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 8);
    int var12 = var0.f(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(100, 8);
    
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

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(8, 8);
    int var12 = var0.f(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f((-1), 0);
    
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

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(100, 1);
    int var21 = var0.f(8, 8);
    int var24 = var0.f(100, 1);
    
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

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(0, (-1));
    int var24 = var0.f(100, 1);
    int var27 = var0.f(1, 0);
    int var30 = var0.f(1, 8);
    
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

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 100);
    int var18 = var0.f(8, 100);
    
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

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(0, 0);
    int var15 = var0.f((-1), (-1));
    int var18 = var0.f(10, 1);
    int var21 = var0.f(0, 10);
    int var24 = var0.f(1, 8);
    int var27 = var0.f(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
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

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(10, 1);
    int var24 = var0.f(0, 100);
    
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

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 100);
    int var21 = var0.f(0, (-1));
    int var24 = var0.f(0, (-1));
    int var27 = var0.f(100, 1);
    int var30 = var0.f(10, 1);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(1, 10);
    int var15 = var0.f(10, 100);
    int var18 = var0.f(10, 8);
    
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

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(8, 10);
    int var18 = var0.f((-1), 8);
    int var21 = var0.f(10, 10);
    
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

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, 100);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(8, (-1));
    int var21 = var0.f(1, 0);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, 10);
    int var21 = var0.f(10, 8);
    int var24 = var0.f(8, 1);
    
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

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f(0, (-1));
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

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 10);
    int var12 = var0.f(10, 100);
    int var15 = var0.f(100, 8);
    int var18 = var0.f(100, 100);
    int var21 = var0.f(10, 1);
    
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

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(10, 100);
    int var30 = var0.f(8, 8);
    
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

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 8);
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(1, 1);
    
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

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 8);
    int var18 = var0.f((-1), 8);
    int var21 = var0.f(100, 1);
    
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

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(100, 8);
    int var24 = var0.f(0, 100);
    int var27 = var0.f(10, 8);
    int var30 = var0.f(100, 10);
    int var33 = var0.f(0, 100);
    
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
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(8, 1);
    int var27 = var0.f((-1), 0);
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, 1);
    int var9 = var0.f(10, 10);
    int var12 = var0.f(8, 100);
    int var15 = var0.f(0, (-1));
    
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

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(10, 1);
    int var24 = var0.f(10, (-1));
    int var27 = var0.f((-1), 0);
    int var30 = var0.f(0, 8);
    
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
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f((-1), 100);
    int var27 = var0.f((-1), 0);
    int var30 = var0.f(10, 1);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f((-1), 100);
    int var27 = var0.f(100, 8);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(1, 1);
    int var24 = var0.f((-1), (-1));
    
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

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(10, 10);
    int var27 = var0.f(100, 100);
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

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(1, 10);
    int var15 = var0.f(10, 100);
    int var18 = var0.f(0, 8);
    
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

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(10, (-1));
    int var24 = var0.f(1, 1);
    int var27 = var0.f((-1), 1);
    
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

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 10);
    int var21 = var0.f(1, 100);
    int var24 = var0.f(8, (-1));
    
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
    assertTrue(var24 == 8);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f(0, 1);
    int var15 = var0.f(8, 0);
    int var18 = var0.f(0, (-1));
    int var21 = var0.f(10, 1);
    
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

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(0, (-1));
    int var24 = var0.f(1, 100);
    
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

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f((-1), 8);
    int var12 = var0.f(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 8);
    int var9 = var0.f((-1), 8);
    int var12 = var0.f(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(10, 1);
    int var21 = var0.f((-1), 10);
    
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

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(10, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f((-1), 0);
    
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

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 10);
    int var21 = var0.f(1, 100);
    int var24 = var0.f(100, 10);
    
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

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(100, 100);
    
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

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(1, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f(0, 0);
    
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
    assertTrue(var21 == 8);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(8, (-1));
    int var27 = var0.f(8, 8);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(100, 8);
    int var21 = var0.f(10, 10);
    
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

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


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
    int var33 = var0.f((-1), (-1));
    
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

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 0);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(1, 8);
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
    assertTrue(var15 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, 100);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(8, (-1));
    int var21 = var0.f(8, 100);
    int var24 = var0.f((-1), 100);
    int var27 = var0.f(10, 100);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(8, (-1));
    int var27 = var0.f(8, 100);
    int var30 = var0.f(10, 8);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(1, 0);
    
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

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(100, 1);
    int var27 = var0.f(0, 8);
    int var30 = var0.f(8, (-1));
    
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
    assertTrue(var30 == 8);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 8);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(0, 8);
    int var12 = var0.f((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(1, 8);
    int var39 = var0.f(100, 10);
    int var42 = var0.f(8, 8);
    int var45 = var0.f(8, (-1));
    int var48 = var0.f(8, 8);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f((-1), 8);
    int var24 = var0.f(0, 10);
    
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

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(1, 10);
    int var21 = var0.f(1, 10);
    
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

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(10, 0);
    int var12 = var0.f(8, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(100, 100);
    int var21 = var0.f(8, 0);
    
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

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, (-1));
    int var15 = var0.f(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, 100);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(0, (-1));
    int var21 = var0.f(100, 1);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 0);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(1, 8);
    int var21 = var0.f(8, 0);
    
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
    assertTrue(var21 == 8);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(0, 0);
    int var21 = var0.f(0, 8);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 1);
    int var21 = var0.f(10, 8);
    int var24 = var0.f(10, 0);
    
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
    assertTrue(var24 == 8);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f((-1), 0);
    int var12 = var0.f(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 8);
    int var18 = var0.f((-1), 8);
    int var21 = var0.f((-1), 0);
    int var24 = var0.f(100, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(10, 8);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(10, 100);
    int var30 = var0.f(8, 10);
    int var33 = var0.f(100, 10);
    
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

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(8, 8);
    int var24 = var0.f(8, (-1));
    
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

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(100, 1);
    
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

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(100, 8);
    int var24 = var0.f(100, 8);
    
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

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(1, 8);
    int var21 = var0.f(100, 100);
    int var24 = var0.f((-1), 100);
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
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(10, 8);
    int var9 = var0.f(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(0, 1);
    int var30 = var0.f(1, 10);
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
    assertTrue(var33 == 8);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(8, 10);
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

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, 100);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(8, (-1));
    int var21 = var0.f(8, 100);
    int var24 = var0.f(100, 1);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


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
    int var33 = var0.f(0, 8);
    
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

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f((-1), 8);
    int var15 = var0.f(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 1);
    int var21 = var0.f(100, (-1));
    int var24 = var0.f((-1), 8);
    int var27 = var0.f(100, 8);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f(8, 8);
    int var24 = var0.f(0, 1);
    int var27 = var0.f(8, 0);
    
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

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 100);
    int var21 = var0.f((-1), 0);
    int var24 = var0.f((-1), 1);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(8, 10);
    int var21 = var0.f(10, 10);
    int var24 = var0.f(100, 10);
    
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

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(10, 0);
    int var18 = var0.f(10, 10);
    
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

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f(0, 0);
    
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

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f((-1), 100);
    int var24 = var0.f(8, 1);
    int var27 = var0.f(1, 100);
    int var30 = var0.f(1, (-1));
    int var33 = var0.f(10, 100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 8);
    int var18 = var0.f((-1), 8);
    int var21 = var0.f((-1), 0);
    int var24 = var0.f(100, 8);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, (-1));
    int var15 = var0.f((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, (-1));
    int var21 = var0.f((-1), 0);
    int var24 = var0.f(10, 1);
    int var27 = var0.f(1, 0);
    
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

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(100, 8);
    int var21 = var0.f(0, 100);
    int var24 = var0.f(0, (-1));
    
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

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f((-1), 1);
    int var15 = var0.f(0, 0);
    
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

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f((-1), 1);
    int var15 = var0.f(8, 100);
    int var18 = var0.f(0, 100);
    int var21 = var0.f(100, 1);
    
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

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(10, 0);
    int var39 = var0.f(1, 8);
    int var42 = var0.f(8, (-1));
    int var45 = var0.f(1, 0);
    int var48 = var0.f(0, 10);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(10, 1);
    int var24 = var0.f(10, 1);
    int var27 = var0.f(8, (-1));
    
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
    assertTrue(var27 == 8);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, (-1));
    int var9 = var0.f(10, 100);
    int var12 = var0.f(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 1);
    int var6 = var0.f(8, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(100, 0);
    
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

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


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
    int var36 = var0.f(0, 8);
    int var39 = var0.f(1, 100);
    
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

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(10, 100);
    int var21 = var0.f(100, 0);
    int var24 = var0.f(8, 8);
    int var27 = var0.f(8, 0);
    int var30 = var0.f(100, 0);
    
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
    assertTrue(var30 == 8);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 10);
    int var12 = var0.f(10, 100);
    int var15 = var0.f(100, 8);
    int var18 = var0.f(10, 0);
    
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

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f((-1), 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(100, 8);
    int var21 = var0.f(0, 100);
    int var24 = var0.f(0, 1);
    
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

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(8, 8);
    int var12 = var0.f(100, 0);
    int var15 = var0.f(1, 1);
    
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

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(8, 1);
    int var27 = var0.f(0, 10);
    int var30 = var0.f((-1), 100);
    int var33 = var0.f(8, 8);
    
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

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


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
    int var30 = var0.f(0, 1);
    
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

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(8, 1);
    int var27 = var0.f(0, 10);
    int var30 = var0.f(8, 1);
    int var33 = var0.f(0, 10);
    
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

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, 1);
    int var9 = var0.f(100, 100);
    int var12 = var0.f(100, (-1));
    int var15 = var0.f(8, 1);
    int var18 = var0.f(8, 1);
    int var21 = var0.f(1, 100);
    
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

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 10);
    int var12 = var0.f((-1), 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 0);
    int var24 = var0.f(10, 0);
    
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
    assertTrue(var24 == 8);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(8, (-1));
    
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

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(10, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, 1);
    int var18 = var0.f(0, 0);
    
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
    assertTrue(var18 == 8);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(10, 0);
    int var39 = var0.f(1, 8);
    int var42 = var0.f(8, (-1));
    int var45 = var0.f(1, 1);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(10, 0);
    int var39 = var0.f(1, 8);
    int var42 = var0.f(1, (-1));
    int var45 = var0.f((-1), 8);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(0, (-1));
    int var21 = var0.f(100, (-1));
    
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
    assertTrue(var21 == 8);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


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
    int var30 = var0.f(100, (-1));
    
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

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(100, 8);
    int var24 = var0.f(1, 100);
    int var27 = var0.f((-1), 0);
    
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
    assertTrue(var27 == 8);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(100, 10);
    int var15 = var0.f((-1), 10);
    
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

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


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
    int var33 = var0.f(10, 0);
    
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
    assertTrue(var33 == 8);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f((-1), 100);
    int var30 = var0.f(0, (-1));
    
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
    assertTrue(var30 == 8);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 100);
    int var21 = var0.f(100, 0);
    int var24 = var0.f(10, 1);
    int var27 = var0.f(100, 10);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(8, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 10);
    int var12 = var0.f(10, 100);
    int var15 = var0.f(100, 8);
    int var18 = var0.f(100, 100);
    int var21 = var0.f((-1), 0);
    
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
    assertTrue(var21 == 8);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(10, 1);
    int var21 = var0.f(0, 0);
    int var24 = var0.f(0, (-1));
    
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
    assertTrue(var24 == 8);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


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
    int var42 = var0.f(10, 8);
    
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

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    
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

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(8, (-1));
    
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

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 8);
    int var18 = var0.f((-1), 8);
    int var21 = var0.f(1, 100);
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

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(100, 1);
    int var27 = var0.f((-1), 1);
    
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

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(10, 1);
    int var24 = var0.f(10, 1);
    int var27 = var0.f((-1), 0);
    
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
    assertTrue(var27 == 8);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(0, 1);
    int var30 = var0.f(1, (-1));
    
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
    assertTrue(var30 == 8);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f(8, 10);
    
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

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(8, 100);
    int var24 = var0.f(10, 1);
    int var27 = var0.f(10, 0);
    int var30 = var0.f(1, 100);
    int var33 = var0.f((-1), 1);
    
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
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(100, (-1));
    int var21 = var0.f(0, 100);
    int var24 = var0.f(0, 10);
    int var27 = var0.f(1, 100);
    int var30 = var0.f((-1), 0);
    int var33 = var0.f(100, 1);
    
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
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, 10);
    int var21 = var0.f(0, 8);
    int var24 = var0.f(8, 8);
    
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

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(0, (-1));
    int var18 = var0.f((-1), 0);
    int var21 = var0.f(1, (-1));
    int var24 = var0.f(100, 0);
    int var27 = var0.f(100, 0);
    
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
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f((-1), 100);
    int var24 = var0.f(100, (-1));
    int var27 = var0.f((-1), 0);
    int var30 = var0.f(1, 0);
    
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
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(100, 10);
    int var15 = var0.f(1, 1);
    int var18 = var0.f(100, (-1));
    
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
    assertTrue(var18 == 8);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(1, 8);
    int var21 = var0.f(100, 100);
    int var24 = var0.f(8, 1);
    int var27 = var0.f(10, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


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
    int var30 = var0.f(0, 8);
    
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

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 0);
    int var24 = var0.f(0, 8);
    int var27 = var0.f(100, (-1));
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
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(1, 0);
    int var21 = var0.f((-1), 8);
    int var24 = var0.f(1, 0);
    int var27 = var0.f(8, 100);
    int var30 = var0.f(100, 100);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(100, 0);
    int var21 = var0.f(10, 8);
    int var24 = var0.f((-1), 0);
    
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

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(8, 10);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(0, 8);
    
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

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


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
    int var36 = var0.f(100, 10);
    
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

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 8);
    int var18 = var0.f((-1), 8);
    int var21 = var0.f((-1), 0);
    int var24 = var0.f(1, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(10, 0);
    int var30 = var0.f(100, 10);
    
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
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(1, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f(10, 0);
    int var24 = var0.f(10, (-1));
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(10, 0);
    int var21 = var0.f(1, 100);
    int var24 = var0.f(10, 100);
    int var27 = var0.f(0, 10);
    int var30 = var0.f(10, 0);
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

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(8, 100);
    int var18 = var0.f(100, 8);
    
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

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(10, 10);
    int var27 = var0.f(100, 100);
    int var30 = var0.f(0, 1);
    int var33 = var0.f(1, 100);
    
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
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f((-1), 100);
    int var30 = var0.f(100, (-1));
    
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
    assertTrue(var30 == 8);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 0);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(1, 8);
    int var21 = var0.f(10, 10);
    
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

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, 0);
    
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
    assertTrue(var18 == 8);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f((-1), 1);
    
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

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(10, 0);
    int var12 = var0.f((-1), 8);
    int var15 = var0.f(100, 100);
    
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

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(10, 1);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(100, 10);
    
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

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(10, 8);
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(8, 0);
    
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
    assertTrue(var24 == 8);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


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
    int var33 = var0.f((-1), 10);
    int var36 = var0.f(0, 0);
    
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
    assertTrue(var36 == 8);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(10, 100);
    int var15 = var0.f(100, 0);
    int var18 = var0.f(8, 1);
    int var21 = var0.f(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
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

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(0, 0);
    int var15 = var0.f((-1), (-1));
    int var18 = var0.f(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
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

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test367");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(8, (-1));
    int var30 = var0.f(10, (-1));
    int var33 = var0.f(100, 0);
    
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
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 8);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(100, 10);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(1, 100);
    int var18 = var0.f(100, 10);
    
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

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 10);
    int var30 = var0.f(8, 0);
    int var33 = var0.f(10, 0);
    int var36 = var0.f(10, 100);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(10, 8);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(1, 0);
    int var15 = var0.f((-1), (-1));
    
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

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, 0);
    int var9 = var0.f(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(8, 10);
    int var18 = var0.f(8, (-1));
    int var21 = var0.f(8, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(1, 100);
    int var21 = var0.f(10, 8);
    int var24 = var0.f(100, 1);
    
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

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f(0, 1);
    int var15 = var0.f(8, 0);
    int var18 = var0.f(0, 1);
    int var21 = var0.f(0, 8);
    
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

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, 1);
    int var21 = var0.f(1, (-1));
    
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
    assertTrue(var21 == 8);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(8, 10);
    int var18 = var0.f(1, (-1));
    
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

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(8, 0);
    int var27 = var0.f(100, 100);
    int var30 = var0.f(10, 8);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f((-1), 8);
    
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

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(0, 0);
    int var18 = var0.f(0, 8);
    int var21 = var0.f(0, 100);
    
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

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


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
    int var39 = var0.f(1, 0);
    
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
    assertTrue(var39 == 8);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f((-1), (-1));
    int var15 = var0.f(1, 8);
    
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

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f((-1), 10);
    int var24 = var0.f(8, 100);
    int var27 = var0.f(0, 10);
    int var30 = var0.f(100, (-1));
    
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
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(10, 8);
    int var15 = var0.f(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f((-1), 8);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(10, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
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

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


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
    int var30 = var0.f(10, 10);
    int var33 = var0.f(100, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f(8, 8);
    int var24 = var0.f(0, 10);
    int var27 = var0.f((-1), (-1));
    int var30 = var0.f(10, 10);
    
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

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(10, 0);
    int var39 = var0.f(1, 8);
    int var42 = var0.f(8, (-1));
    int var45 = var0.f(1, 0);
    int var48 = var0.f(10, 8);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 0);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(0, 10);
    int var21 = var0.f(8, 100);
    int var24 = var0.f((-1), 1);
    int var27 = var0.f(0, 10);
    
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

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f(8, 8);
    int var15 = var0.f(8, 10);
    
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

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(100, 10);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(1, 100);
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

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(8, (-1));
    int var30 = var0.f(10, 100);
    int var33 = var0.f(1, 1);
    
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
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


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
    int var30 = var0.f(8, 8);
    int var33 = var0.f(10, 8);
    
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
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(10, 100);
    int var21 = var0.f(100, 0);
    int var24 = var0.f(8, 100);
    int var27 = var0.f(0, 8);
    int var30 = var0.f(10, 1);
    
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

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, 8);
    
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

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 0);
    int var24 = var0.f(0, 8);
    int var27 = var0.f(1, 1);
    
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

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(10, 100);
    int var27 = var0.f(10, 8);
    int var30 = var0.f(8, 0);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(10, 0);
    int var12 = var0.f(10, 1);
    int var15 = var0.f(1, 8);
    int var18 = var0.f(8, (-1));
    int var21 = var0.f(8, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
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

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 0);
    int var15 = var0.f(8, 0);
    int var18 = var0.f(0, 1);
    int var21 = var0.f(1, 10);
    
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

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 8);
    
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

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(100, 100);
    
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

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(0, (-1));
    int var21 = var0.f((-1), 10);
    int var24 = var0.f((-1), 100);
    
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

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


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

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 100);
    int var21 = var0.f(100, 0);
    int var24 = var0.f((-1), 100);
    int var27 = var0.f(0, 10);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


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
    int var30 = var0.f(100, 0);
    
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

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(8, 100);
    int var18 = var0.f(8, 1);
    
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

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 8);
    int var9 = var0.f((-1), 8);
    int var12 = var0.f(8, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f((-1), 8);
    int var12 = var0.f(8, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(100, 1);
    int var27 = var0.f(0, 8);
    int var30 = var0.f((-1), 0);
    int var33 = var0.f(0, (-1));
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 8);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(100, 1);
    int var27 = var0.f(1, 0);
    int var30 = var0.f(100, 10);
    
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
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f((-1), 0);
    int var12 = var0.f(0, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(100, 0);
    int var12 = var0.f(8, 1);
    int var15 = var0.f((-1), 8);
    int var18 = var0.f(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 8);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(0, 0);
    int var15 = var0.f((-1), (-1));
    int var18 = var0.f(10, 1);
    int var21 = var0.f(0, 10);
    int var24 = var0.f(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
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

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f((-1), 8);
    int var12 = var0.f(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(10, 1);
    int var24 = var0.f(10, 1);
    int var27 = var0.f(100, 1);
    int var30 = var0.f(0, 10);
    
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
    assertTrue(var30 == 1);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(8, 100);
    int var24 = var0.f(10, 10);
    int var27 = var0.f(100, 8);
    int var30 = var0.f(8, 10);
    
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
    assertTrue(var30 == 1);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f(0, 1);
    int var15 = var0.f(8, 0);
    int var18 = var0.f(0, 1);
    int var21 = var0.f(10, 0);
    
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
    assertTrue(var21 == 8);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f((-1), 100);
    int var24 = var0.f(100, 8);
    
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

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


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
    int var36 = var0.f(0, 100);
    int var39 = var0.f((-1), 8);
    int var42 = var0.f(100, (-1));
    int var45 = var0.f(0, 10);
    
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
    assertTrue(var42 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


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
    int var36 = var0.f(100, 1);
    
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

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(0, 0);
    int var15 = var0.f((-1), (-1));
    int var18 = var0.f((-1), 100);
    int var21 = var0.f(0, 10);
    int var24 = var0.f(100, (-1));
    int var27 = var0.f(0, (-1));
    int var30 = var0.f(1, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
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
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


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
    int var30 = var0.f(8, 100);
    
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
    assertTrue(var30 == 1);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f((-1), 100);
    int var24 = var0.f(100, (-1));
    int var27 = var0.f(100, 8);
    int var30 = var0.f(10, 10);
    
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
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f((-1), 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, 1);
    
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

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f(8, 8);
    int var24 = var0.f(0, 10);
    int var27 = var0.f(100, (-1));
    
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

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, 1);
    int var9 = var0.f(100, 100);
    int var12 = var0.f(8, 8);
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

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


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
    int var33 = var0.f((-1), 10);
    int var36 = var0.f(10, (-1));
    int var39 = var0.f(10, 8);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 10);
    int var12 = var0.f(10, 100);
    int var15 = var0.f(100, 8);
    int var18 = var0.f(100, 100);
    int var21 = var0.f(0, (-1));
    
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
    assertTrue(var21 == 8);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(10, 0);
    int var21 = var0.f(1, 100);
    int var24 = var0.f(10, 100);
    int var27 = var0.f(0, 10);
    int var30 = var0.f(10, 0);
    int var33 = var0.f(8, 8);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(10, 10);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(0, 10);
    int var27 = var0.f((-1), 0);
    
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

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(0, 1);
    int var24 = var0.f((-1), 1);
    int var27 = var0.f((-1), 100);
    int var30 = var0.f(1, 8);
    int var33 = var0.f(100, (-1));
    
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
    assertTrue(var33 == 8);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, 1);
    int var9 = var0.f(10, 10);
    int var12 = var0.f(8, 100);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, (-1));
    int var21 = var0.f(0, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 1);
    int var21 = var0.f(10, 8);
    int var24 = var0.f(8, 10);
    int var27 = var0.f(0, 1);
    
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

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 10);
    int var30 = var0.f(8, 0);
    int var33 = var0.f(8, 1);
    int var36 = var0.f((-1), 0);
    int var39 = var0.f(10, 1);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 100);
    int var21 = var0.f(8, 1);
    int var24 = var0.f(1, 1);
    int var27 = var0.f(8, 100);
    
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
    assertTrue(var27 == 1);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(10, 8);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(1, 0);
    int var15 = var0.f(0, 1);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(0, (-1));
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test436");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 100);
    int var21 = var0.f((-1), 10);
    int var24 = var0.f(8, 10);
    
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

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test437");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f((-1), 100);
    int var27 = var0.f(10, 100);
    int var30 = var0.f((-1), 0);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test438");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(1, 0);
    int var21 = var0.f((-1), 8);
    int var24 = var0.f(1, 0);
    int var27 = var0.f(8, 100);
    int var30 = var0.f(1, 1);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test439");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(8, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 8);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test440");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(100, 1);
    int var27 = var0.f(0, 8);
    int var30 = var0.f((-1), 0);
    int var33 = var0.f((-1), 8);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test441");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f(1, (-1));
    int var15 = var0.f((-1), 8);
    int var18 = var0.f(0, 100);
    int var21 = var0.f(0, 8);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test442");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 8);
    int var6 = var0.f((-1), 0);
    int var9 = var0.f((-1), (-1));
    int var12 = var0.f(8, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test443");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(1, 8);
    int var21 = var0.f(0, 0);
    int var24 = var0.f(0, 0);
    
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

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test444");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f(100, 10);
    int var15 = var0.f(8, 100);
    int var18 = var0.f(1, 0);
    
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

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test445");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(100, 1);
    int var21 = var0.f(8, 8);
    int var24 = var0.f(8, 100);
    int var27 = var0.f((-1), 1);
    
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

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test446");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f((-1), 8);
    int var15 = var0.f(8, 1);
    int var18 = var0.f(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test447");


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
    int var30 = var0.f((-1), (-1));
    int var33 = var0.f(10, 0);
    int var36 = var0.f((-1), (-1));
    int var39 = var0.f(8, 1);
    
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
    assertTrue(var33 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test448");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f((-1), 8);
    int var12 = var0.f((-1), 0);
    int var15 = var0.f(0, 0);
    
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

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test449");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 8);
    int var6 = var0.f((-1), 0);
    int var9 = var0.f(1, 1);
    int var12 = var0.f((-1), 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test450");


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
    int var30 = var0.f(10, 100);
    int var33 = var0.f(10, 8);
    
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

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test451");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(1, 1);
    int var24 = var0.f(100, 1);
    int var27 = var0.f(100, 10);
    
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
    assertTrue(var27 == 1);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test452");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(0, 0);
    int var21 = var0.f(10, 8);
    int var24 = var0.f(0, 8);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test453");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(8, 10);
    int var21 = var0.f(10, 10);
    int var24 = var0.f((-1), 8);
    int var27 = var0.f(100, 8);
    int var30 = var0.f(0, 10);
    
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
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test454");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 100);
    int var21 = var0.f(8, 1);
    int var24 = var0.f(1, 1);
    int var27 = var0.f(10, 100);
    int var30 = var0.f(10, 10);
    
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
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test455");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, 100);
    int var15 = var0.f(1, (-1));
    int var18 = var0.f(1, 8);
    int var21 = var0.f(10, 1);
    
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

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test456");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f(10, 0);
    int var15 = var0.f(0, 1);
    int var18 = var0.f(1, 8);
    int var21 = var0.f(8, 8);
    int var24 = var0.f(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test457");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(10, 10);
    int var27 = var0.f(1, (-1));
    int var30 = var0.f(0, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test458");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 10);
    int var12 = var0.f(10, 100);
    int var15 = var0.f(8, (-1));
    
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

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test459");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(0, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), (-1));
    int var24 = var0.f(100, 10);
    int var27 = var0.f(1, 10);
    int var30 = var0.f(8, 0);
    int var33 = var0.f(8, 1);
    int var36 = var0.f(8, 0);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 8);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test460");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(1, 8);
    int var21 = var0.f(0, 0);
    int var24 = var0.f(0, 10);
    int var27 = var0.f(8, 1);
    
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

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test461");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(10, 100);
    int var27 = var0.f(10, 8);
    int var30 = var0.f((-1), (-1));
    int var33 = var0.f(0, 10);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test462");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 100);
    int var21 = var0.f(0, (-1));
    int var24 = var0.f(0, (-1));
    int var27 = var0.f(100, 1);
    int var30 = var0.f((-1), 10);
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test463");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f((-1), 1);
    int var15 = var0.f(8, 100);
    int var18 = var0.f(0, 0);
    int var21 = var0.f(1, 8);
    
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

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test464");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, 1);
    int var9 = var0.f(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test465");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(10, 0);
    int var21 = var0.f(1, 100);
    int var24 = var0.f(10, 100);
    int var27 = var0.f(0, 10);
    int var30 = var0.f(0, (-1));
    int var33 = var0.f(100, 100);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test466");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(10, 8);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(1, 0);
    int var15 = var0.f(0, 1);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(8, 1);
    
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
    assertTrue(var18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test467");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(10, 1);
    int var12 = var0.f(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test468");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f(100, (-1));
    int var24 = var0.f(8, 1);
    int var27 = var0.f(0, 10);
    int var30 = var0.f(1, 8);
    int var33 = var0.f(0, 100);
    
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

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test469");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(0, (-1));
    int var24 = var0.f(100, 1);
    int var27 = var0.f(1, 0);
    int var30 = var0.f(0, 0);
    int var33 = var0.f((-1), 100);
    int var36 = var0.f(100, 8);
    
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

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test470");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(100, 8);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(1, (-1));
    int var15 = var0.f(0, 1);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(100, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 8);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test471");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(8, 0);
    int var6 = var0.f((-1), 0);
    int var9 = var0.f(1, 8);
    int var12 = var0.f(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test472");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(100, (-1));
    int var18 = var0.f(100, 100);
    int var21 = var0.f(8, 1);
    int var24 = var0.f(1, 1);
    int var27 = var0.f(10, 100);
    int var30 = var0.f(1, 10);
    
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
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test473");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(0, (-1));
    int var18 = var0.f((-1), 0);
    int var21 = var0.f((-1), 0);
    
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

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test474");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(10, 0);
    int var39 = var0.f(1, 8);
    int var42 = var0.f(8, (-1));
    int var45 = var0.f(8, 100);
    
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
    assertTrue(var36 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test475");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, (-1));
    int var9 = var0.f(0, (-1));
    int var12 = var0.f((-1), 8);
    int var15 = var0.f((-1), 1);
    int var18 = var0.f(1, 100);
    int var21 = var0.f(8, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
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

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test476");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(1, 100);
    int var21 = var0.f(100, 100);
    int var24 = var0.f(8, 1);
    
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

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test477");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f((-1), 1);
    int var24 = var0.f(100, 1);
    int var27 = var0.f(0, 8);
    int var30 = var0.f((-1), 0);
    int var33 = var0.f(100, 8);
    
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
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test478");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f(8, (-1));
    int var18 = var0.f(8, 1);
    
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

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test479");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, 1);
    int var9 = var0.f(10, 10);
    int var12 = var0.f(8, 100);
    int var15 = var0.f(10, 100);
    int var18 = var0.f((-1), 10);
    
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

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test480");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(0, 0);
    int var15 = var0.f((-1), (-1));
    int var18 = var0.f(10, 1);
    int var21 = var0.f(0, 10);
    int var24 = var0.f(1, 8);
    int var27 = var0.f(0, 10);
    int var30 = var0.f((-1), 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
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

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test481");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(10, 8);
    int var15 = var0.f((-1), (-1));
    
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

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test482");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(8, 1);
    int var9 = var0.f((-1), 0);
    int var12 = var0.f(10, 100);
    int var15 = var0.f(0, 8);
    
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

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test483");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(8, 0);
    int var18 = var0.f(1, (-1));
    int var21 = var0.f(100, 1);
    int var24 = var0.f((-1), 10);
    int var27 = var0.f(10, 100);
    int var30 = var0.f(8, 10);
    int var33 = var0.f(100, 0);
    
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
    assertTrue(var33 == 8);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test484");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(0, 1);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(0, 8);
    int var18 = var0.f(10, 8);
    int var21 = var0.f(1, 0);
    int var24 = var0.f(8, (-1));
    int var27 = var0.f(8, 100);
    int var30 = var0.f(0, (-1));
    
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
    assertTrue(var21 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test485");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(0, 100);
    int var9 = var0.f(1, 100);
    int var12 = var0.f(1, 10);
    int var15 = var0.f((-1), 0);
    int var18 = var0.f(8, 1);
    
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

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test486");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(100, 10);
    int var18 = var0.f(100, 10);
    int var21 = var0.f((-1), 100);
    int var24 = var0.f(100, (-1));
    int var27 = var0.f((-1), 0);
    int var30 = var0.f(10, 0);
    int var33 = var0.f(1, (-1));
    
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
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 8);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test487");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(0, 1);
    int var9 = var0.f(10, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f((-1), 100);
    
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

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test488");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(10, (-1));
    int var21 = var0.f(8, 8);
    int var24 = var0.f(8, 8);
    int var27 = var0.f(0, 0);
    
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
    assertTrue(var27 == 8);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test489");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(10, 10);
    int var18 = var0.f(100, 0);
    int var21 = var0.f(100, 10);
    int var24 = var0.f(0, (-1));
    int var27 = var0.f(100, 100);
    
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
    assertTrue(var24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test490");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(0, (-1));
    int var18 = var0.f((-1), 0);
    int var21 = var0.f(10, 0);
    int var24 = var0.f(0, 100);
    int var27 = var0.f(100, (-1));
    int var30 = var0.f(8, (-1));
    
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

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test491");


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
    int var33 = var0.f(100, 100);
    int var36 = var0.f(1, 8);
    int var39 = var0.f(100, 10);
    int var42 = var0.f((-1), 0);
    
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
    assertTrue(var42 == 8);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test492");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 0);
    int var12 = var0.f((-1), 10);
    int var15 = var0.f(1, 0);
    int var18 = var0.f(10, 100);
    int var21 = var0.f(100, 0);
    int var24 = var0.f(8, 8);
    int var27 = var0.f(8, 0);
    int var30 = var0.f(10, 10);
    
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

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test493");


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
    int var36 = var0.f(100, 100);
    int var39 = var0.f((-1), 100);
    int var42 = var0.f(100, 100);
    
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

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test494");


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
    int var42 = var0.f(10, (-1));
    
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
    assertTrue(var42 == 8);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test495");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(8, 0);
    int var12 = var0.f(100, 100);
    int var15 = var0.f(10, (-1));
    int var18 = var0.f(8, 8);
    int var21 = var0.f((-1), 100);
    
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

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test496");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f(0, (-1));
    int var15 = var0.f(0, (-1));
    int var18 = var0.f((-1), 0);
    int var21 = var0.f(10, 0);
    int var24 = var0.f(0, 100);
    int var27 = var0.f(8, 10);
    
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

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test497");


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
    int var33 = var0.f((-1), 1);
    int var36 = var0.f(10, 8);
    int var39 = var0.f(100, 0);
    
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
    assertTrue(var39 == 8);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test498");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(1, 10);
    int var9 = var0.f(100, 8);
    int var12 = var0.f((-1), 100);
    int var15 = var0.f(10, 0);
    int var18 = var0.f(0, (-1));
    int var21 = var0.f((-1), 10);
    int var24 = var0.f(100, 1);
    int var27 = var0.f((-1), 100);
    
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

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test499");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(100, 1);
    int var6 = var0.f(10, 8);
    int var9 = var0.f(10, 100);
    int var12 = var0.f(1, 0);
    int var15 = var0.f(8, 100);
    int var18 = var0.f(0, 8);
    
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

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test500");


    randoop.Prova var0 = new randoop.Prova();
    int var3 = var0.f(10, 0);
    int var6 = var0.f(1, 1);
    int var9 = var0.f(100, (-1));
    int var12 = var0.f(10, 8);
    int var15 = var0.f(100, 10);
    int var18 = var0.f(8, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
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

  }

}
