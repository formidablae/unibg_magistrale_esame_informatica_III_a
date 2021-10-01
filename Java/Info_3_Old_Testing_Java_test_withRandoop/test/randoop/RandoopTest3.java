package randoop;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test1");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(1, 0);
    int var18 = var0.foo(10, 100);
    int var21 = var0.foo(100, 100);
    int var24 = var0.foo((-1), 1);
    int var27 = var0.foo(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test2");


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
    int var39 = var0.foo(0, 0);
    int var42 = var0.foo(200, (-1));
    int var45 = var0.foo((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test3");


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
    int var39 = var0.foo(10, (-1));
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

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test4");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(10, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo((-1), 0);
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

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test5");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 10);
    int var12 = var0.foo((-1), 200);
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

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test6");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo(0, (-1));
    int var15 = var0.foo(100, 10);
    int var18 = var0.foo(1, 200);
    int var21 = var0.foo(0, 0);
    int var24 = var0.foo(0, 10);
    int var27 = var0.foo(200, 1);
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

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test7");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(0, 1);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(0, 200);
    int var18 = var0.foo(10, 200);
    int var21 = var0.foo((-1), 10);
    int var24 = var0.foo(0, 10);
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

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test8");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 0);
    int var12 = var0.foo((-1), 10);
    int var15 = var0.foo(10, 0);
    int var18 = var0.foo(10, 1);
    int var21 = var0.foo(200, 100);
    int var24 = var0.foo(10, 10);
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

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test9");


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

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test10");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(100, 200);
    int var12 = var0.foo((-1), 100);
    int var15 = var0.foo(10, (-1));
    int var18 = var0.foo(1, 10);
    int var21 = var0.foo(0, 200);
    int var24 = var0.foo(0, 10);
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

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test11");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(1, 10);
    int var9 = var0.foo(200, 0);
    int var12 = var0.foo(100, 100);
    int var15 = var0.foo(0, (-1));
    int var18 = var0.foo(200, (-1));
    int var21 = var0.foo((-1), (-1));
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

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test12");


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
    int var30 = var0.foo(1, 200);
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

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test13");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 200);
    int var9 = var0.foo(0, 0);
    int var12 = var0.foo((-1), (-1));
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

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test14");


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
    int var45 = var0.foo(100, 10);
    int var48 = var0.foo(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test15");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(10, 0);
    int var6 = var0.foo(1, 1);
    int var9 = var0.foo(1, 100);
    int var12 = var0.foo(0, 1);
    int var15 = var0.foo(1, (-1));
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

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test16");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(0, 1);
    int var9 = var0.foo(10, 0);
    int var12 = var0.foo((-1), 200);
    int var15 = var0.foo(100, 100);
    int var18 = var0.foo(200, (-1));
    int var21 = var0.foo(200, 0);
    int var24 = var0.foo((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
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

    if (debug) System.out.printf("%nRandoopTest3.test17");


    info3.Prova var0 = new info3.Prova();
    int var3 = var0.foo(100, 1);
    int var6 = var0.foo(10, 200);
    int var9 = var0.foo(100, 10);
    int var12 = var0.foo(100, 1);
    int var15 = var0.foo(10, (-1));
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

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test18");


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
    int var39 = var0.foo(200, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 200);
    
    // Regression assertion (captures the current behavior of the code)
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

}
