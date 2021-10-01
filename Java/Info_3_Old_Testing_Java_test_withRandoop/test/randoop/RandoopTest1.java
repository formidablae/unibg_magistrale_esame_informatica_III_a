package randoop;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test1");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, (-1));
    int var21 = var0.foo(0, 100);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(100, 0);
    int var30 = var0.foo((-1), 100);
    int var33 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test2");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(100, 0);
    int var24 = var0.foo(200, 200);
    int var27 = var0.foo(100, 0);
    int var30 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test3");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(100, 200);
    int var21 = var0.foo(0, 100);
    int var24 = var0.foo(100, 200);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test4");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test5");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(100, 200);
    int var21 = var0.foo(0, 100);
    int var24 = var0.foo(100, 200);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test6");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 0);
    int var27 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test7");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(10, 1);
    int var21 = var0.foo(0, 0);
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(100, (-1));
    int var30 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test8");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(200, 0);
    int var30 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test9");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(10, 0);
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(100, 0);
    int var30 = var0.foo(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test10");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(200, 200);
    int var36 = var0.foo(1, 1);
    int var39 = var0.foo(0, 10);
    int var42 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test11");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(0, 0);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test12");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(10, 0);
    int var12 = var0.foo(10, 1);
    int var15 = var0.foo(1, 200);
    int var18 = var0.foo(1, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test13");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(1, 0);
    int var33 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test14");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo((-1), 100);
    int var24 = var0.foo(100, (-1));
    int var27 = var0.foo(100, 200);
    int var30 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test15");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo(1, (-1));
    int var30 = var0.foo((-1), 100);
    int var33 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test16");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(1, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test17");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo((-1), 100);
    int var12 = var0.foo(1, 1);
    int var15 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test18");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 10);
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test19");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test20");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 200);
    int var6 = var0.foo((-1), 0);
    int var9 = var0.foo((-1), (-1));
    int var12 = var0.foo(200, (-1));
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test21");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(200, 200);
    int var33 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test22");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(1, (-1));
    int var30 = var0.foo(0, 1);
    int var33 = var0.foo(10, 1);
    int var36 = var0.foo((-1), 1);
    int var39 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test23");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test24");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(10, 0);
    int var39 = var0.foo(1, 200);
    int var42 = var0.foo(200, (-1));
    int var45 = var0.foo(1, 0);
    int var48 = var0.foo(0, 0);
    int var51 = var0.foo(1, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 200);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test25");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), 100);
    int var24 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test26");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(10, 0);
    int var15 = var0.foo(0, 1);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(0, 0);
    int var27 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test27");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test28");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(100, 200);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test29");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(10, (-1));
    int var15 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test30");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(100, 1);
    int var30 = var0.foo((-1), 1);
    int var33 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test31");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(10, 0);
    int var39 = var0.foo(0, 0);
    int var42 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test32");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(0, 10);
    int var24 = var0.foo(1, 100);
    int var27 = var0.foo(200, 10);
    int var30 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test33");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, 1);
    int var9 = var0.foo(100, 100);
    int var12 = var0.foo(100, (-1));
    int var15 = var0.foo(200, 1);
    int var18 = var0.foo(200, 1);
    int var21 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test34");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo((-1), 100);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(1, 100);
    int var30 = var0.foo(1, (-1));
    int var33 = var0.foo(10, 100);
    int var36 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test35");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(10, 1);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo(0, 1);
    int var30 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test36");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo((-1), 10);
    int var36 = var0.foo(10, (-1));
    int var39 = var0.foo(10, 200);
    int var42 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test37");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo((-1), 0);
    int var21 = var0.foo(1, (-1));
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo((-1), (-1));
    int var33 = var0.foo(10, 0);
    int var36 = var0.foo((-1), (-1));
    int var39 = var0.foo(200, 1);
    int var42 = var0.foo(10, 200);
    int var45 = var0.foo(200, 10);
    int var48 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test38");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(0, 0);
    int var21 = var0.foo(0, 200);
    int var24 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test39");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 100);
    int var21 = var0.foo(100, 0);
    int var24 = var0.foo((-1), 100);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test40");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(0, 0);
    int var27 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test41");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(0, 0);
    int var15 = var0.foo(0, 1);
    int var18 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test42");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(0, 0);
    int var33 = var0.foo((-1), 100);
    int var36 = var0.foo(100, 200);
    int var39 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test43");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo((-1), 1);
    int var15 = var0.foo(200, 100);
    int var18 = var0.foo(0, 100);
    int var21 = var0.foo(1, 200);
    int var24 = var0.foo(1, 1);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test44");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo((-1), 1);
    int var15 = var0.foo(200, 100);
    int var18 = var0.foo(0, 100);
    int var21 = var0.foo(100, 0);
    int var24 = var0.foo(200, (-1));
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test45");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test46");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo((-1), 100);
    int var12 = var0.foo(1, 1);
    int var15 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test47");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(200, 100);
    int var18 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test48");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(0, 0);
    int var21 = var0.foo(10, 200);
    int var24 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test49");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo((-1), 200);
    int var15 = var0.foo((-1), 1);
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test50");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test51");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(200, 100);
    int var24 = var0.foo(10, 1);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test52");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, (-1));
    int var27 = var0.foo(0, 1);
    int var30 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test53");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(0, 100);
    int var21 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test54");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(1, 100);
    int var12 = var0.foo(1, 10);
    int var15 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test55");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(1, 200);
    int var15 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test56");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test57");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 10);
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo(0, 100);
    int var21 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test58");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(1, 1);
    int var24 = var0.foo(0, 200);
    int var27 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test59");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(100, 10);
    int var15 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test60");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(0, 0);
    int var27 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test61");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(200, 100);
    int var27 = var0.foo((-1), 1);
    int var30 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test62");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo(10, 10);
    int var36 = var0.foo(200, 0);
    int var39 = var0.foo(100, 10);
    int var42 = var0.foo(10, 0);
    int var45 = var0.foo(100, 100);
    int var48 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test63");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(0, 0);
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 100);
    int var27 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test64");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo(100, 100);
    int var30 = var0.foo(0, 1);
    int var33 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test65");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(1, 100);
    int var12 = var0.foo(200, 10);
    int var15 = var0.foo(1, (-1));
    int var18 = var0.foo(1, 1);
    int var21 = var0.foo(10, 200);
    int var24 = var0.foo(200, 200);
    int var27 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test66");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(10, 0);
    int var24 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test67");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(100, 10);
    int var15 = var0.foo(1, 1);
    int var18 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test68");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(10, 1);
    int var24 = var0.foo(10, 1);
    int var27 = var0.foo(200, (-1));
    int var30 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test69");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(200, (-1));
    int var27 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test70");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo(1, 10);
    int var24 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test71");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, 100);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test72");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(10, 10);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo((-1), 100);
    int var27 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test73");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(200, 0);
    int var33 = var0.foo(100, 0);
    int var36 = var0.foo(100, (-1));
    int var39 = var0.foo(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test74");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(10, 100);
    int var18 = var0.foo((-1), 1);
    int var21 = var0.foo(200, 1);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test75");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo(10, 10);
    int var36 = var0.foo(200, 10);
    int var39 = var0.foo(1, 0);
    int var42 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test76");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test77");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(1, 100);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(10, 100);
    int var33 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test78");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(10, 200);
    int var12 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test79");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, (-1));
    int var21 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test80");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(100, 10);
    int var33 = var0.foo((-1), 200);
    int var36 = var0.foo(1, (-1));
    int var39 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test81");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(200, 10);
    int var21 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test82");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(1, 100);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(100, 200);
    int var33 = var0.foo(200, 0);
    int var36 = var0.foo((-1), 200);
    int var39 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test83");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(200, 100);
    int var27 = var0.foo(1, 100);
    int var30 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test84");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 200);
    int var18 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test85");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test86");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo((-1), 200);
    int var30 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test87");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test88");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo(100, (-1));
    int var12 = var0.foo(1, 100);
    int var15 = var0.foo(1, (-1));
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test89");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo((-1), 0);
    int var24 = var0.foo(10, 1);
    int var27 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test90");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test91");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(10, 0);
    int var39 = var0.foo(1, 200);
    int var42 = var0.foo((-1), (-1));
    int var45 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test92");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(200, 0);
    int var33 = var0.foo(10, 0);
    int var36 = var0.foo(10, 100);
    int var39 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test93");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo((-1), 100);
    int var24 = var0.foo(100, (-1));
    int var27 = var0.foo(100, 200);
    int var30 = var0.foo(1, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test94");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(10, 0);
    int var39 = var0.foo(1, 200);
    int var42 = var0.foo(200, (-1));
    int var45 = var0.foo(1, 1);
    int var48 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test95");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(100, 0);
    int var24 = var0.foo(200, 200);
    int var27 = var0.foo(100, 0);
    int var30 = var0.foo((-1), 100);
    int var33 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test96");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test97");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(10, 1);
    int var24 = var0.foo(10, 1);
    int var27 = var0.foo((-1), 0);
    int var30 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test98");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo(10, 0);
    int var30 = var0.foo(100, 10);
    int var33 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test99");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(200, 1);
    int var15 = var0.foo((-1), 200);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test100");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(0, 100);
    int var27 = var0.foo(10, 0);
    int var30 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test101");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test102");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(100, 0);
    int var24 = var0.foo(200, 100);
    int var27 = var0.foo(0, 200);
    int var30 = var0.foo(10, 1);
    int var33 = var0.foo(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test103");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo(200, 0);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(0, 1);
    int var30 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test104");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo(200, 0);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo((-1), 0);
    int var30 = var0.foo(200, 1);
    int var33 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test105");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo(200, (-1));
    int var30 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test106");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(100, 10);
    int var33 = var0.foo((-1), 200);
    int var36 = var0.foo(1, (-1));
    int var39 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test107");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test108");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo(200, 200);
    int var15 = var0.foo(200, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test109");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo(0, 1);
    int var30 = var0.foo((-1), (-1));
    int var33 = var0.foo(0, 200);
    int var36 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test110");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(10, 100);
    int var18 = var0.foo((-1), 1);
    int var21 = var0.foo(200, 1);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo(1, 200);
    int var30 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test111");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(1, 100);
    int var12 = var0.foo(0, 1);
    int var15 = var0.foo(1, (-1));
    int var18 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test112");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo((-1), (-1));
    int var33 = var0.foo((-1), 200);
    int var36 = var0.foo(10, (-1));
    int var39 = var0.foo(10, 200);
    int var42 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test113");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo(0, 1);
    int var30 = var0.foo((-1), (-1));
    int var33 = var0.foo(0, 200);
    int var36 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test114");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(10, 200);
    int var18 = var0.foo((-1), 200);
    int var21 = var0.foo((-1), 0);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test115");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(10, (-1));
    int var27 = var0.foo((-1), 1);
    int var30 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test116");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(1, (-1));
    int var39 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test117");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(10, 0);
    int var24 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test118");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo((-1), 10);
    int var21 = var0.foo(1, (-1));
    int var24 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test119");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo(100, (-1));
    int var12 = var0.foo(1, 100);
    int var15 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test120");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(0, 100);
    int var27 = var0.foo(10, 200);
    int var30 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test121");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test122");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(200, 200);
    int var36 = var0.foo(200, 10);
    int var39 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test123");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo(200, 200);
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test124");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(200, 10);
    int var21 = var0.foo(10, 10);
    int var24 = var0.foo((-1), 200);
    int var27 = var0.foo(10, 100);
    int var30 = var0.foo(1, (-1));
    int var33 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test125");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo((-1), 0);
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test126");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo((-1), 200);
    int var27 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test127");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(100, 200);
    int var30 = var0.foo(10, 1);
    int var33 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test128");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(0, 200);
    int var30 = var0.foo((-1), 0);
    int var33 = var0.foo((-1), 10);
    int var36 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test129");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo((-1), 10);
    int var36 = var0.foo(0, 0);
    int var39 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test130");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(10, 200);
    int var18 = var0.foo((-1), 200);
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test131");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo((-1), 1);
    int var30 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test132");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(200, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test133");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(200, 100);
    int var15 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test134");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(1, 0);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo((-1), (-1));
    int var27 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test135");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, (-1));
    int var27 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test136");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo(200, 1);
    int var33 = var0.foo((-1), 0);
    int var36 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test137");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(0, 100);
    int var27 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test138");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(0, 200);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(200, 1);
    int var30 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test139");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test140");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo(100, (-1));
    int var12 = var0.foo(1, 100);
    int var15 = var0.foo(1, (-1));
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test141");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(200, 0);
    int var27 = var0.foo(100, 100);
    int var30 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test142");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo(200, 0);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo((-1), 0);
    int var30 = var0.foo(10, (-1));
    int var33 = var0.foo((-1), (-1));
    int var36 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test143");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, (-1));
    int var21 = var0.foo(0, 100);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(100, 0);
    int var30 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test144");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo(200, 200);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test145");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test146");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo((-1), 0);
    int var21 = var0.foo(10, 0);
    int var24 = var0.foo(0, 100);
    int var27 = var0.foo(200, 10);
    int var30 = var0.foo((-1), 100);
    int var33 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test147");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(0, 100);
    int var27 = var0.foo(10, 200);
    int var30 = var0.foo(10, 10);
    int var33 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test148");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo(10, 10);
    int var36 = var0.foo(200, 0);
    int var39 = var0.foo(100, 0);
    int var42 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test149");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(10, 200);
    int var18 = var0.foo((-1), 200);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test150");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 10);
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test151");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(10, 0);
    int var30 = var0.foo(0, 1);
    int var33 = var0.foo(10, 0);
    int var36 = var0.foo(200, (-1));
    int var39 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test152");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(10, 200);
    int var30 = var0.foo((-1), (-1));
    int var33 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test153");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test154");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test155");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo(200, 0);
    int var15 = var0.foo(1, 10);
    int var18 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test156");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test157");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(0, 0);
    int var33 = var0.foo((-1), 100);
    int var36 = var0.foo(100, 200);
    int var39 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test158");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(10, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo((-1), (-1));
    int var21 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test159");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo(0, 0);
    int var30 = var0.foo(0, 200);
    int var33 = var0.foo(10, 1);
    int var36 = var0.foo(200, 100);
    int var39 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test160");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test161");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(200, 0);
    int var21 = var0.foo(1, 10);
    int var24 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test162");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(200, (-1));
    int var27 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test163");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 200);
    int var6 = var0.foo(200, 200);
    int var9 = var0.foo(1, 10);
    int var12 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test164");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test165");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(1, 200);
    int var18 = var0.foo(200, 0);
    int var21 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test166");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test167");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo(0, 0);
    int var30 = var0.foo(0, 200);
    int var33 = var0.foo(10, 1);
    int var36 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test168");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(1, 100);
    int var12 = var0.foo(1, 10);
    int var15 = var0.foo((-1), 0);
    int var18 = var0.foo(200, 1);
    int var21 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test169");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(10, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 1);
    int var18 = var0.foo(0, 0);
    int var21 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test170");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(100, 100);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(200, 1);
    int var30 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test171");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo((-1), 200);
    int var15 = var0.foo((-1), 1);
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(1, 10);
    int var24 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test172");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo((-1), 0);
    int var39 = var0.foo((-1), 100);
    int var42 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test173");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo((-1), 200);
    int var18 = var0.foo(10, 0);
    int var21 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test174");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(200, 0);
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test175");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(1, 0);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test176");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo((-1), 0);
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo((-1), (-1));
    int var21 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test177");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(200, 10);
    int var21 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test178");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test179");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(1, 1);
    int var24 = var0.foo((-1), (-1));
    int var27 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test180");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(10, 100);
    int var33 = var0.foo(1, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test181");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(1, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(10, 0);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo(10, 200);
    int var30 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test182");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(10, 200);
    int var30 = var0.foo(1, 10);
    int var33 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test183");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo((-1), 200);
    int var27 = var0.foo(100, 200);
    int var30 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test184");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(200, 200);
    int var36 = var0.foo(100, 100);
    int var39 = var0.foo(100, 1);
    int var42 = var0.foo((-1), 100);
    int var45 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test185");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(200, (-1));
    int var27 = var0.foo(200, 100);
    int var30 = var0.foo(0, (-1));
    int var33 = var0.foo((-1), 100);
    int var36 = var0.foo(10, 0);
    int var39 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test186");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo(200, 0);
    int var15 = var0.foo(0, 10);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test187");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 200);
    int var6 = var0.foo(10, 100);
    int var9 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test188");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(200, 100);
    int var24 = var0.foo(10, 1);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo(200, (-1));
    int var33 = var0.foo((-1), 100);
    int var36 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test189");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, (-1));
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo((-1), 1);
    int var15 = var0.foo(1, 10);
    int var18 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test190");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(100, 100);
    int var21 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test191");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo(1, 10);
    int var24 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test192");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo((-1), 200);
    int var18 = var0.foo(0, 100);
    int var21 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test193");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, (-1));
    int var21 = var0.foo(0, 100);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(100, 0);
    int var30 = var0.foo(200, 10);
    int var33 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test194");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(0, 10);
    int var24 = var0.foo(1, 100);
    int var27 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test195");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo((-1), 100);
    int var24 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test196");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test197");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 200);
    int var18 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test198");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 1);
    int var36 = var0.foo(10, 10);
    int var39 = var0.foo(200, 100);
    int var42 = var0.foo(10, 200);
    int var45 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test199");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(10, 0);
    int var21 = var0.foo(1, 100);
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo(10, 0);
    int var33 = var0.foo(200, 200);
    int var36 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test200");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo(200, 0);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(0, 1);
    int var30 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test201");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(10, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 1);
    int var18 = var0.foo(1, 1);
    int var21 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test202");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(1, 100);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test203");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo((-1), 100);
    int var27 = var0.foo((-1), 0);
    int var30 = var0.foo(10, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test204");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 10);
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(200, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(200, 1);
    int var24 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test205");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 200);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(0, 200);
    int var12 = var0.foo((-1), (-1));
    int var15 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test206");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo(10, 10);
    int var36 = var0.foo(0, 200);
    int var39 = var0.foo(1, 100);
    int var42 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test207");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test208");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test209");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, 1);
    int var9 = var0.foo(100, 100);
    int var12 = var0.foo(200, 200);
    int var15 = var0.foo(200, 1);
    int var18 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test210");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo((-1), 200);
    int var27 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test211");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo((-1), 200);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo(0, 0);
    int var33 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test212");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(10, 1);
    int var9 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test213");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test214");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test215");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo(200, 0);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(0, 1);
    int var30 = var0.foo(10, 0);
    int var33 = var0.foo(200, (-1));
    int var36 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test216");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(200, (-1));
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test217");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(1, 100);
    int var12 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test218");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo(200, 10);
    int var15 = var0.foo(1, 200);
    int var18 = var0.foo(10, 10);
    int var21 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test219");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(10, 10);
    int var33 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test220");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, (-1));
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo((-1), 1);
    int var15 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test221");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(100, 200);
    int var21 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test222");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(10, 100);
    int var30 = var0.foo(100, 200);
    int var33 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test223");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo((-1), 0);
    int var18 = var0.foo(200, (-1));
    int var21 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test224");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(100, 100);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(200, 1);
    int var30 = var0.foo(200, 0);
    int var33 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test225");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo(0, 1);
    int var27 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test226");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(0, 10);
    int var24 = var0.foo(1, 100);
    int var27 = var0.foo(200, 10);
    int var30 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test227");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo((-1), 1);
    int var27 = var0.foo((-1), 100);
    int var30 = var0.foo((-1), (-1));
    int var33 = var0.foo(200, 200);
    int var36 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test228");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo((-1), 200);
    int var27 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test229");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test230");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo(100, (-1));
    int var12 = var0.foo(1, 100);
    int var15 = var0.foo(1, (-1));
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test231");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(10, 1);
    int var21 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test232");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(1, (-1));
    int var39 = var0.foo(1, 200);
    int var42 = var0.foo(200, 100);
    int var45 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test233");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(100, 200);
    int var27 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test234");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(200, 10);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test235");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo(100, 10);
    int var15 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test236");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(200, 10);
    int var18 = var0.foo(200, (-1));
    int var21 = var0.foo(200, 1);
    int var24 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test237");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test238");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(0, 0);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test239");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo(10, 10);
    int var24 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test240");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(0, 100);
    int var27 = var0.foo(10, 200);
    int var30 = var0.foo(10, 10);
    int var33 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test241");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, 100);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test242");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(10, 200);
    int var9 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test243");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test244");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo(200, 200);
    int var15 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test245");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo(100, (-1));
    int var12 = var0.foo(1, 100);
    int var15 = var0.foo(1, (-1));
    int var18 = var0.foo(200, (-1));
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(10, 0);
    int var27 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test246");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(0, 10);
    int var24 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test247");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test248");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo(10, 100);
    int var24 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test249");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(10, 200);
    int var30 = var0.foo(1, 10);
    int var33 = var0.foo((-1), 10);
    int var36 = var0.foo((-1), 100);
    int var39 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test250");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(10, 1);
    int var21 = var0.foo(0, 0);
    int var24 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test251");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo((-1), 100);
    int var27 = var0.foo(10, 100);
    int var30 = var0.foo((-1), 0);
    int var33 = var0.foo(0, 1);
    int var36 = var0.foo(100, 100);
    int var39 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test252");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(200, 100);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(1, 1);
    int var30 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test253");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo((-1), 200);
    int var18 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test254");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 0);
    int var27 = var0.foo(0, 200);
    int var30 = var0.foo(10, 0);
    int var33 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test255");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test256");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 100);
    int var21 = var0.foo(200, 1);
    int var24 = var0.foo(1, 1);
    int var27 = var0.foo(10, 100);
    int var30 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test257");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo((-1), 1);
    int var27 = var0.foo((-1), 100);
    int var30 = var0.foo(1, 200);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(0, 200);
    int var39 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test258");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(10, 200);
    int var9 = var0.foo(1, (-1));
    int var12 = var0.foo(1, 200);
    int var15 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test259");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test260");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(1, 1);
    int var24 = var0.foo(0, 200);
    int var27 = var0.foo((-1), 200);
    int var30 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test261");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(10, 10);
    int var21 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test262");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(10, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 1);
    int var18 = var0.foo(0, 0);
    int var21 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test263");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, 1);
    int var9 = var0.foo(100, 100);
    int var12 = var0.foo(200, 200);
    int var15 = var0.foo(200, 1);
    int var18 = var0.foo((-1), 0);
    int var21 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test264");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo((-1), 1);
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test265");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test266");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test267");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(10, 200);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(1, 0);
    int var15 = var0.foo(100, 0);
    int var18 = var0.foo(200, 100);
    int var21 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test268");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, (-1));
    int var21 = var0.foo(0, 100);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(1, 100);
    int var30 = var0.foo(0, 10);
    int var33 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test269");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(200, 100);
    int var27 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test270");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 200);
    int var12 = var0.foo(0, 0);
    int var15 = var0.foo(1, (-1));
    int var18 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test271");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo((-1), 100);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test272");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(0, 200);
    int var30 = var0.foo((-1), 200);
    int var33 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test273");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(1, 200);
    int var15 = var0.foo((-1), 1);
    int var18 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test274");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo((-1), 0);
    int var24 = var0.foo(1, (-1));
    int var27 = var0.foo(10, 100);
    int var30 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test275");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(200, 0);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test276");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo(200, 0);
    int var15 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test277");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 10);
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(200, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test278");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test279");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 100);
    int var24 = var0.foo(1, 1);
    int var27 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test280");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(10, 1);
    int var24 = var0.foo(10, (-1));
    int var27 = var0.foo(1, 200);
    int var30 = var0.foo(1, 10);
    int var33 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test281");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo((-1), 0);
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo((-1), (-1));
    int var21 = var0.foo(200, 100);
    int var24 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test282");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(200, 200);
    int var36 = var0.foo(1, 0);
    int var39 = var0.foo((-1), 100);
    int var42 = var0.foo(10, 10);
    int var45 = var0.foo(100, (-1));
    int var48 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test283");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(200, 100);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test284");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(10, (-1));
    int var27 = var0.foo((-1), 1);
    int var30 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test285");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(200, (-1));
    int var27 = var0.foo(200, 200);
    int var30 = var0.foo(200, (-1));
    int var33 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test286");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(10, 1);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo(100, 0);
    int var30 = var0.foo(0, (-1));
    int var33 = var0.foo(1, 1);
    int var36 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test287");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(10, 200);
    int var30 = var0.foo(1, 10);
    int var33 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test288");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(0, 10);
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test289");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(1, 0);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test290");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(200, 10);
    int var21 = var0.foo(10, 10);
    int var24 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test291");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, (-1));
    int var27 = var0.foo(0, 100);
    int var30 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test292");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(200, 10);
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test293");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(1, 200);
    int var39 = var0.foo(200, 100);
    int var42 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test294");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(10, 0);
    int var12 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test295");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 100);
    int var21 = var0.foo((-1), 200);
    int var24 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test296");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test297");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 200);
    int var6 = var0.foo((-1), 0);
    int var9 = var0.foo(1, 1);
    int var12 = var0.foo(0, 10);
    int var15 = var0.foo(1, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test298");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo((-1), 200);
    int var15 = var0.foo(200, 1);
    int var18 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test299");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo((-1), 10);
    int var36 = var0.foo(200, 10);
    int var39 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test300");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(100, (-1));
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test301");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(100, 10);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(1, 100);
    int var18 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test302");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(1, 0);
    int var33 = var0.foo(0, (-1));
    int var36 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test303");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 10);
    int var12 = var0.foo(0, 200);
    int var15 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test304");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 10);
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(100, 200);
    int var18 = var0.foo(1, 0);
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test305");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(200, 0);
    int var33 = var0.foo(200, 1);
    int var36 = var0.foo(100, 0);
    int var39 = var0.foo(100, 0);
    int var42 = var0.foo((-1), 0);
    int var45 = var0.foo(100, 200);
    int var48 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test306");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 10);
    int var21 = var0.foo(1, 200);
    int var24 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test307");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo((-1), 1);
    int var27 = var0.foo((-1), 100);
    int var30 = var0.foo(1, 200);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(0, 200);
    int var39 = var0.foo(200, 0);
    int var42 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test308");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 100);
    int var21 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test309");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(200, 0);
    int var33 = var0.foo(10, 0);
    int var36 = var0.foo((-1), 200);
    int var39 = var0.foo(100, 10);
    int var42 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test310");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(1, 200);
    int var39 = var0.foo(100, 10);
    int var42 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test311");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo(200, 1);
    int var33 = var0.foo((-1), 0);
    int var36 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test312");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(0, 1);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test313");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(100, 200);
    int var27 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test314");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, (-1));
    int var27 = var0.foo(10, 200);
    int var30 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test315");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo(1, 1);
    int var15 = var0.foo(200, 1);
    int var18 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test316");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo((-1), 200);
    int var24 = var0.foo(200, 200);
    int var27 = var0.foo(1, 100);
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test317");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 200);
    int var33 = var0.foo(10, (-1));
    int var36 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test318");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 200);
    int var6 = var0.foo((-1), 0);
    int var9 = var0.foo((-1), (-1));
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test319");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test320");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo((-1), 0);
    int var21 = var0.foo(1, (-1));
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo((-1), (-1));
    int var33 = var0.foo(10, 0);
    int var36 = var0.foo(200, 100);
    int var39 = var0.foo(1, (-1));
    int var42 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test321");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(1, 100);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(10, 100);
    int var33 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test322");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(1, 0);
    int var21 = var0.foo((-1), 200);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(200, 100);
    int var30 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test323");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo((-1), 0);
    int var21 = var0.foo(1, (-1));
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo((-1), (-1));
    int var33 = var0.foo(10, 0);
    int var36 = var0.foo((-1), (-1));
    int var39 = var0.foo(200, 1);
    int var42 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test324");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 10);
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(100, 200);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test325");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(10, (-1));
    int var30 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test326");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(10, 0);
    int var39 = var0.foo(1, 200);
    int var42 = var0.foo(200, (-1));
    int var45 = var0.foo(1, 0);
    int var48 = var0.foo(0, 0);
    int var51 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 200);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test327");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo(200, 0);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo((-1), 0);
    int var30 = var0.foo(200, 200);
    int var33 = var0.foo(10, 200);
    int var36 = var0.foo(200, 10);
    int var39 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test328");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test329");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo((-1), 100);
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(0, 1);
    int var30 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test330");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(100, 10);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(1, 100);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test331");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo((-1), 200);
    int var27 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test332");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo((-1), 1);
    int var21 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test333");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo(10, 10);
    int var36 = var0.foo(200, 10);
    int var39 = var0.foo(1, 0);
    int var42 = var0.foo(100, 1);
    int var45 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test334");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test335");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(10, 200);
    int var24 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test336");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(100, (-1));
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test337");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo(0, 1);
    int var27 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test338");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(1, 200);
    int var33 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test339");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo(200, 0);
    int var15 = var0.foo(0, 10);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test340");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo(100, 100);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test341");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(1, 200);
    int var39 = var0.foo(100, 10);
    int var42 = var0.foo(200, 200);
    int var45 = var0.foo(200, (-1));
    int var48 = var0.foo(10, 0);
    int var51 = var0.foo(1, (-1));
    int var54 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 200);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test342");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(10, 0);
    int var39 = var0.foo(1, 200);
    int var42 = var0.foo(200, (-1));
    int var45 = var0.foo(200, 100);
    int var48 = var0.foo(100, 0);
    int var51 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 200);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test343");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, 1);
    int var9 = var0.foo(10, 10);
    int var12 = var0.foo(200, 100);
    int var15 = var0.foo(10, 100);
    int var18 = var0.foo((-1), 10);
    int var21 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test344");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(100, 0);
    int var24 = var0.foo(200, 100);
    int var27 = var0.foo(0, 200);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test345");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo((-1), 1);
    int var15 = var0.foo(200, 100);
    int var18 = var0.foo((-1), 10);
    int var21 = var0.foo(100, 0);
    int var24 = var0.foo((-1), 100);
    int var27 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test346");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test347");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test348");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(0, 0);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(10, 1);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(0, 0);
    int var27 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test349");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(10, (-1));
    int var24 = var0.foo(200, (-1));
    int var27 = var0.foo(100, 0);
    int var30 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test350");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test351");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo((-1), 200);
    int var24 = var0.foo(200, 200);
    int var27 = var0.foo(1, 100);
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(1, (-1));
    int var36 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test352");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(200, 100);
    int var24 = var0.foo(10, 1);
    int var27 = var0.foo(10, 0);
    int var30 = var0.foo(1, 100);
    int var33 = var0.foo(200, 10);
    int var36 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test353");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 100);
    int var30 = var0.foo(10, 1);
    int var33 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test354");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test355");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test356");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(200, 0);
    int var33 = var0.foo(200, 1);
    int var36 = var0.foo(100, 0);
    int var39 = var0.foo(100, 0);
    int var42 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test357");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo((-1), 10);
    int var36 = var0.foo(10, (-1));
    int var39 = var0.foo(100, 0);
    int var42 = var0.foo(0, 1);
    int var45 = var0.foo(1, 1);
    int var48 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test358");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, 1);
    int var9 = var0.foo(100, 100);
    int var12 = var0.foo(100, (-1));
    int var15 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test359");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test360");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo((-1), 0);
    int var39 = var0.foo(1, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test361");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(10, 1);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(1, (-1));
    int var18 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test362");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo((-1), 0);
    int var24 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test363");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo((-1), 0);
    int var21 = var0.foo((-1), 0);
    int var24 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test364");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(100, 200);
    int var27 = var0.foo(0, 200);
    int var30 = var0.foo(1, (-1));
    int var33 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test365");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(200, 0);
    int var6 = var0.foo((-1), 0);
    int var9 = var0.foo(1, 200);
    int var12 = var0.foo(100, 10);
    int var15 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test366");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(0, 0);
    int var30 = var0.foo(0, 1);
    int var33 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test367");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo((-1), 0);
    int var21 = var0.foo(10, 0);
    int var24 = var0.foo(0, 100);
    int var27 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test368");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, 1);
    int var9 = var0.foo(100, 100);
    int var12 = var0.foo(100, (-1));
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(1, 1);
    int var21 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test369");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, (-1));
    int var18 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test370");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(200, 1);
    int var15 = var0.foo((-1), 200);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(10, 10);
    int var24 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test371");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo((-1), 200);
    int var15 = var0.foo((-1), 1);
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(100, 0);
    int var24 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test372");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo(100, 100);
    int var30 = var0.foo(0, 1);
    int var33 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test373");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(1, (-1));
    int var30 = var0.foo((-1), 100);
    int var33 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test374");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(200, 0);
    int var33 = var0.foo(10, 0);
    int var36 = var0.foo((-1), 200);
    int var39 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test375");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(1, (-1));
    int var30 = var0.foo(10, 10);
    int var33 = var0.foo(100, 10);
    int var36 = var0.foo(0, 10);
    int var39 = var0.foo(100, 10);
    int var42 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test376");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo(200, 200);
    int var12 = var0.foo(100, 0);
    int var15 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test377");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test378");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo((-1), (-1));
    int var15 = var0.foo((-1), 200);
    int var18 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test379");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(100, 200);
    int var21 = var0.foo(0, 100);
    int var24 = var0.foo(100, 200);
    int var27 = var0.foo(10, 0);
    int var30 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test380");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(10, 100);
    int var30 = var0.foo(100, 200);
    int var33 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test381");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(0, 0);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test382");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(200, 0);
    int var33 = var0.foo(10, 0);
    int var36 = var0.foo((-1), (-1));
    int var39 = var0.foo(200, 200);
    int var42 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test383");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test384");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(10, 1);
    int var24 = var0.foo(10, (-1));
    int var27 = var0.foo(1, 200);
    int var30 = var0.foo(1, 10);
    int var33 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test385");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(10, 200);
    int var24 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test386");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo((-1), 200);
    int var15 = var0.foo((-1), 1);
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(1, 10);
    int var24 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test387");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo(10, 200);
    int var24 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test388");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(100, 0);
    int var24 = var0.foo(200, 100);
    int var27 = var0.foo(0, 200);
    int var30 = var0.foo(10, 1);
    int var33 = var0.foo(0, 0);
    int var36 = var0.foo(100, 1);
    int var39 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test389");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo((-1), 200);
    int var30 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test390");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo(200, 1);
    int var24 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test391");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo((-1), 200);
    int var15 = var0.foo(200, 100);
    int var18 = var0.foo(1, 1);
    int var21 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test392");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo(0, 0);
    int var30 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test393");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(0, 0);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(10, 1);
    int var21 = var0.foo(0, 10);
    int var24 = var0.foo(1, 200);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo(100, 10);
    int var33 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test394");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo((-1), 1);
    int var27 = var0.foo((-1), 100);
    int var30 = var0.foo(1, 200);
    int var33 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test395");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(200, 200);
    int var36 = var0.foo(10, (-1));
    int var39 = var0.foo(200, 10);
    int var42 = var0.foo(1, (-1));
    int var45 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test396");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(0, 0);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(10, 1);
    int var21 = var0.foo(0, 10);
    int var24 = var0.foo(1, 200);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo((-1), 200);
    int var33 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test397");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), 100);
    int var24 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test398");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(100, 200);
    int var21 = var0.foo(0, 100);
    int var24 = var0.foo(100, 200);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test399");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(200, 10);
    int var21 = var0.foo(10, 10);
    int var24 = var0.foo((-1), 200);
    int var27 = var0.foo(100, 200);
    int var30 = var0.foo(100, 0);
    int var33 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test400");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test401");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(10, 0);
    int var21 = var0.foo(1, 100);
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(10, 0);
    int var30 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test402");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(0, 0);
    int var27 = var0.foo(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test403");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo(200, 0);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo((-1), 0);
    int var30 = var0.foo(200, 200);
    int var33 = var0.foo(10, 200);
    int var36 = var0.foo(0, 0);
    int var39 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test404");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo(200, (-1));
    int var33 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test405");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo(0, 1);
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(0, 1);
    int var21 = var0.foo(0, 200);
    int var24 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test406");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test407");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(10, 200);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(1, 0);
    int var15 = var0.foo(0, 1);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(200, 1);
    int var24 = var0.foo((-1), 1);
    int var27 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test408");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo((-1), (-1));
    int var15 = var0.foo(1, 200);
    int var18 = var0.foo(1, 1);
    int var21 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test409");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(0, 0);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(10, 1);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(0, 100);
    int var30 = var0.foo((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test410");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(0, (-1));
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(200, 100);
    int var27 = var0.foo(1, 200);
    int var30 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test411");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(100, 200);
    int var27 = var0.foo(1, 1);
    int var30 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test412");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(1, 0);
    int var21 = var0.foo(10, 10);
    int var24 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test413");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(100, 200);
    int var30 = var0.foo(1, 0);
    int var33 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test414");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(10, 200);
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test415");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(10, 200);
    int var15 = var0.foo(10, 100);
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(10, 200);
    int var24 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test416");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(200, 0);
    int var33 = var0.foo(200, 1);
    int var36 = var0.foo((-1), 0);
    int var39 = var0.foo(10, 1);
    int var42 = var0.foo(200, 1);
    int var45 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test417");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo(10, 10);
    int var36 = var0.foo(200, 0);
    int var39 = var0.foo(1, 200);
    int var42 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test418");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo(10, 10);
    int var36 = var0.foo(200, 0);
    int var39 = var0.foo(100, 10);
    int var42 = var0.foo(10, 0);
    int var45 = var0.foo(0, 200);
    int var48 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test419");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, 1);
    int var9 = var0.foo(100, 100);
    int var12 = var0.foo(100, (-1));
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test420");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, (-1));
    int var33 = var0.foo(10, 200);
    int var36 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test421");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(100, 100);
    int var21 = var0.foo(200, 0);
    int var24 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test422");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo((-1), 1);
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo(10, 0);
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test423");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(1, (-1));
    int var30 = var0.foo(10, 10);
    int var33 = var0.foo(200, 0);
    int var36 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test424");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(100, 200);
    int var30 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test425");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, 1);
    int var9 = var0.foo(10, 10);
    int var12 = var0.foo(200, 100);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test426");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(0, 0);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(10, 1);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test427");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(200, (-1));
    int var27 = var0.foo(200, 200);
    int var30 = var0.foo(200, (-1));
    int var33 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test428");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(1, 100);
    int var12 = var0.foo(1, 10);
    int var15 = var0.foo(10, 100);
    int var18 = var0.foo(0, 200);
    int var21 = var0.foo(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test429");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(0, 0);
    int var15 = var0.foo((-1), (-1));
    int var18 = var0.foo(10, 1);
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test430");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo(100, (-1));
    int var12 = var0.foo(1, 100);
    int var15 = var0.foo(1, (-1));
    int var18 = var0.foo(200, (-1));
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(10, 0);
    int var27 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test431");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo((-1), 100);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(100, 10);
    int var24 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test432");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 10);
    int var30 = var0.foo(200, 10);
    int var33 = var0.foo(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test433");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test434");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(100, 0);
    int var24 = var0.foo(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test435");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo(0, 200);
    int var21 = var0.foo(10, 100);
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo((-1), 100);
    int var30 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test436");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, (-1));
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo(1, (-1));
    int var30 = var0.foo(0, 1);
    int var33 = var0.foo((-1), 1);
    int var36 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test437");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo((-1), 0);
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo((-1), (-1));
    int var21 = var0.foo(200, 100);
    int var24 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test438");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(100, 10);
    int var15 = var0.foo(1, 1);
    int var18 = var0.foo(0, 200);
    int var21 = var0.foo(1, 10);
    int var24 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test439");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 1);
    int var6 = var0.foo(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test440");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(10, 200);
    int var9 = var0.foo(10, 100);
    int var12 = var0.foo(1, 0);
    int var15 = var0.foo(0, 1);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test441");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo((-1), 100);
    int var27 = var0.foo((-1), 0);
    int var30 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test442");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(100, 0);
    int var18 = var0.foo(200, 1);
    int var21 = var0.foo(0, 0);
    int var24 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test443");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(200, 100);
    int var18 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test444");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(100, 100);
    int var24 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test445");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, (-1));
    int var21 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test446");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(0, 200);
    int var30 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test447");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test448");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(10, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(0, 10);
    int var36 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test449");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo((-1), 0);
    int var21 = var0.foo(1, (-1));
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo((-1), (-1));
    int var33 = var0.foo(10, 0);
    int var36 = var0.foo((-1), (-1));
    int var39 = var0.foo(200, 1);
    int var42 = var0.foo(10, 200);
    int var45 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test450");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test451");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo((-1), 1);
    int var15 = var0.foo(200, 100);
    int var18 = var0.foo(0, 100);
    int var21 = var0.foo(1, 200);
    int var24 = var0.foo(0, 0);
    int var27 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test452");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(10, 10);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test453");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(100, 0);
    int var18 = var0.foo(200, 1);
    int var21 = var0.foo(0, 10);
    int var24 = var0.foo((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test454");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(10, 0);
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test455");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(0, 200);
    int var30 = var0.foo(200, (-1));
    int var33 = var0.foo(1, (-1));
    int var36 = var0.foo(200, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test456");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(10, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(0, 10);
    int var36 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test457");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(1, (-1));
    int var12 = var0.foo(200, 200);
    int var15 = var0.foo(200, 10);
    int var18 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test458");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(0, (-1));
    int var24 = var0.foo(0, (-1));
    int var27 = var0.foo(100, 200);
    int var30 = var0.foo(1, 0);
    int var33 = var0.foo(0, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test459");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(200, 0);
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(0, 1);
    int var21 = var0.foo(1, 10);
    int var24 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test460");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(10, 0);
    int var39 = var0.foo(1, 200);
    int var42 = var0.foo(200, (-1));
    int var45 = var0.foo(1, 0);
    int var48 = var0.foo(0, 0);
    int var51 = var0.foo(0, 200);
    int var54 = var0.foo(0, 200);
    int var57 = var0.foo(100, 10);
    int var60 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 200);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test461");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test462");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(1, (-1));
    int var15 = var0.foo((-1), 200);
    int var18 = var0.foo(0, 100);
    int var21 = var0.foo(0, 200);
    int var24 = var0.foo(200, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test463");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, (-1));
    int var18 = var0.foo(100, 1);
    int var21 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test464");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo((-1), 1);
    int var27 = var0.foo((-1), 100);
    int var30 = var0.foo(1, 200);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(0, 200);
    int var39 = var0.foo(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test465");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(1, 200);
    int var39 = var0.foo(100, 10);
    int var42 = var0.foo(200, 200);
    int var45 = var0.foo(200, (-1));
    int var48 = var0.foo(200, 200);
    int var51 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 200);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test466");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo((-1), 1);
    int var27 = var0.foo((-1), 100);
    int var30 = var0.foo(200, 10);
    int var33 = var0.foo((-1), 200);
    int var36 = var0.foo(100, 1);
    int var39 = var0.foo(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test467");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(200, 200);
    int var36 = var0.foo(100, 100);
    int var39 = var0.foo((-1), 100);
    int var42 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test468");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo((-1), 0);
    int var24 = var0.foo(1, (-1));
    int var27 = var0.foo(10, 100);
    int var30 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test469");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo(100, 100);
    int var36 = var0.foo(10, 0);
    int var39 = var0.foo(1, 200);
    int var42 = var0.foo(200, (-1));
    int var45 = var0.foo(1, 0);
    int var48 = var0.foo(0, 10);
    int var51 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 200);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test470");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo(0, 200);
    int var30 = var0.foo((-1), 0);
    int var33 = var0.foo((-1), 200);
    int var36 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test471");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(1, 100);
    int var27 = var0.foo(100, (-1));
    int var30 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test472");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(200, 100);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test473");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo(200, 200);
    int var12 = var0.foo((-1), 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test474");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(200, 200);
    int var36 = var0.foo(100, 100);
    int var39 = var0.foo(100, 100);
    int var42 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test475");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo(200, 200);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test476");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo((-1), 0);
    int var21 = var0.foo(1, (-1));
    int var24 = var0.foo(10, 100);
    int var27 = var0.foo(1, 0);
    int var30 = var0.foo(0, 100);
    int var33 = var0.foo(1, (-1));
    int var36 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test477");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(0, 1);
    int var24 = var0.foo(1, 0);
    int var27 = var0.foo(100, 10);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(200, 200);
    int var36 = var0.foo(10, (-1));
    int var39 = var0.foo(200, 10);
    int var42 = var0.foo(200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 200);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test478");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(200, 100);
    int var27 = var0.foo(0, 10);
    int var30 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test479");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(10, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 1);
    int var27 = var0.foo((-1), 1);
    int var30 = var0.foo((-1), 10);
    int var33 = var0.foo(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test480");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo(1, 100);
    int var30 = var0.foo(1, (-1));
    int var33 = var0.foo((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test481");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(100, 200);
    int var9 = var0.foo((-1), 200);
    int var12 = var0.foo(200, 10);
    int var15 = var0.foo(1, 200);
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test482");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 10);
    int var12 = var0.foo(10, 100);
    int var15 = var0.foo(0, 0);
    int var18 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test483");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo((-1), 100);
    int var24 = var0.foo(100, (-1));
    int var27 = var0.foo((-1), 0);
    int var30 = var0.foo(1, 0);
    int var33 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test484");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(0, 100);
    int var9 = var0.foo(0, 0);
    int var12 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test485");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(200, (-1));
    int var9 = var0.foo(0, (-1));
    int var12 = var0.foo((-1), 200);
    int var15 = var0.foo((-1), 1);
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test486");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, (-1));
    int var21 = var0.foo((-1), 1);
    int var24 = var0.foo(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test487");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test488");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo((-1), (-1));
    int var24 = var0.foo(100, 10);
    int var27 = var0.foo((-1), 100);
    int var30 = var0.foo(0, (-1));
    int var33 = var0.foo(200, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test489");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, 100);
    int var21 = var0.foo(1, 200);
    int var24 = var0.foo(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test490");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo((-1), 0);
    int var21 = var0.foo(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test491");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(1, 0);
    int var21 = var0.foo(10, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test492");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(200, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test493");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo((-1), 100);
    int var21 = var0.foo(10, 1);
    int var24 = var0.foo(10, 1);
    int var27 = var0.foo((-1), 0);
    int var30 = var0.foo((-1), 200);
    int var33 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test494");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(10, 200);
    int var9 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test495");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(200, 0);
    int var18 = var0.foo(1, (-1));
    int var21 = var0.foo(100, 1);
    int var24 = var0.foo((-1), 10);
    int var27 = var0.foo(10, 100);
    int var30 = var0.foo(200, 10);
    int var33 = var0.foo(100, 0);
    int var36 = var0.foo(200, 1);
    int var39 = var0.foo(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test496");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo(1, 0);
    int var24 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test497");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo((-1), 10);
    int var18 = var0.foo(100, 0);
    int var21 = var0.foo(10, 0);
    int var24 = var0.foo(100, 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test498");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(100, 10);
    int var21 = var0.foo((-1), 100);
    int var24 = var0.foo(200, 1);
    int var27 = var0.foo(1, 100);
    int var30 = var0.foo(1, (-1));
    int var33 = var0.foo(10, 100);
    int var36 = var0.foo(1, 0);
    int var39 = var0.foo(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test499");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(10, 10);
    int var27 = var0.foo((-1), (-1));
    int var30 = var0.foo(100, 1);
    int var33 = var0.foo((-1), 0);
    int var36 = var0.foo(10, 1);
    int var39 = var0.foo(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 200);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test500");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, 200);
    int var21 = var0.foo(100, 200);
    int var24 = var0.foo(100, 200);
    int var27 = var0.foo(1, 1);
    int var30 = var0.foo(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 200);

  }

}
