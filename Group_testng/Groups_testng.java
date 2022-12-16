package groups;

import org.testng.annotations.Test;

public class Groups_testng {

	@Test(groups={"sanity"})
	void group1() {
		System.out.println("Hello!!...i am sanity testing");
	}
	
	@Test(groups={"sanity"})
	void group2() {
		System.out.println("Hello!!...i am sanity testing");
	}
	
	@Test(groups={"smoke"})
	void group3() {
		System.out.println("Hello!!...i am smoke testing");
	}
	
	@Test(groups={"regression"})
	void group4() {
		System.out.println("Hello!!...i am regression testing");
	}
	
	@Test(groups={"sanity, regression"})
	void group5() {
		System.out.println("Hello!!...i am regression and sanity testing");
	}
	
	@Test(groups={"sanity, smoke"})
	void group6() {
		System.out.println("Hello!!...i am smoke and sanity testing");
	}
	
	
}
