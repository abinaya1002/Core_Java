package com.tnsif.daytwentyfive.basictestcase;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled
class DisabledClassDemo {
	@Test
	void test1() {
		System.out.println("test 1");
	}

	@Disabled
	@Test
	void test2() {
		System.out.println("test 2");
	}

	@Test
	void test3() {
		System.out.println("test 3");
	}
}