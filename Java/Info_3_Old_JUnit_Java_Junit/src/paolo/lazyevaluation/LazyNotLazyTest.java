package paolo.lazyevaluation;

import static org.junit.Assert.*;

import org.junit.Test;

public class LazyNotLazyTest {

	//la condizione "a > b && b > c" e' coperta tutta perche', poiche' "a > b" e' true,
	//viene valutato anche b > c.
	@Test
	public void lazyMethodTest1() {
		assertTrue(LazyNotLazy.lazyMethod(3, 2, 1));
	}

	//la condizione "a > b && b > c" e' coperta tutta perche', poiche' "a > b" e' true,
	//viene valutato anche "b > c".
	@Test
	public void lazyMethodTest2() {
		assertFalse(LazyNotLazy.lazyMethod(3, 2, 4));
	}

	//la condizione "a > b && b > c" non e' coperta tutta perche', poiche' "a > b" e' false,
	//"b > c" non viene valutato.
	@Test
	public void lazyMethodTest3() {
		assertFalse(LazyNotLazy.lazyMethod(1, 2, 3));
	}

	@Test
	public void notLazyMethodTest1() {
		assertTrue(LazyNotLazy.notLazyMethod(3, 2, 1));
	}

	@Test
	public void notLazyMethodTest2() {
		assertFalse(LazyNotLazy.notLazyMethod(3, 2, 4));
	}

	@Test
	public void notLazyMethodTest3() {
		assertFalse(LazyNotLazy.notLazyMethod(1, 2, 3));
	}
}
