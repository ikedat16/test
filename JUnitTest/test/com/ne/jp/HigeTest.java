package com.ne.jp;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HigeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCount1() {
		assertThat(new Hige().count(1, 2), is(3));
	}
	@Test
	public void testCount2() {
		assertThat(new Hige().count(3, 11), is(14));
	}

}
