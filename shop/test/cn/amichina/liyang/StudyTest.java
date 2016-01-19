package cn.amichina.liyang;

import java.util.UUID;

import org.junit.Test;

public class StudyTest {

	@Test
	public void test01() {
		System.out.println(UUID.randomUUID().toString().replace("-", ""));
		System.out.println(UUID.randomUUID().variant());
		System.out.println(UUID.randomUUID().version());
	}

}
