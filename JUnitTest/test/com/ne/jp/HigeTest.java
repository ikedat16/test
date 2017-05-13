package com.ne.jp;

import java.util.stream.IntStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class HigeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("====================== " + testName.getMethodName());
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Rule
//	public TestRule testName = d -> System.out.println(d.getMethodName());
	@Rule
	public TestName testName = new TestName();

//	@Test
//	public void testCount1() {
//		assertThat(new Hige().count(1, 2), is(3));
//	}
//	@Test
//	public void testCount2() {
//		assertThat(new Hige().count(3, 11), is(14));
//	}
	@Test
	public void testCollect() {
		long start = 0;
		start = System.currentTimeMillis();
		IntStream.rangeClosed(1, 10000).forEach(String::valueOf);
//		IntStream.range(1, 100).parallel().mapToObj(i -> i+1).forEachOrdered(System.out::println);
//		String ret = IntStream.range(1, 10000).mapToObj(i -> String.valueOf(i)).reduce("0", (i, s) -> i+","+s, (i2, s2) -> i2+"@@"+s2);	
//		System.out.println(System.currentTimeMillis() - start);

		start = System.currentTimeMillis();
		IntStream.rangeClosed(1, 100000).forEach(String::valueOf);
		System.out.println(System.currentTimeMillis() - start);

		start = System.currentTimeMillis();
		IntStream.rangeClosed(1, 100000).parallel().forEach(String::valueOf);
		System.out.println(System.currentTimeMillis() - start);
	}
//	@Test
//	public void testCollect2() {
//		long start = System.currentTimeMillis();
//		IntStream.rangeClosed(1, 10000).parallel().forEach(String::valueOf);
//		System.out.println(System.currentTimeMillis() - start);
//	}
}
