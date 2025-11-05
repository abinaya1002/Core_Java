package com.tnsif.daytwentyfive.basictestcase;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassBTest {
	@Test
	@Tag("development")
	void testCaseA(TestInfo testInfo) { //run in all environments
	}
}