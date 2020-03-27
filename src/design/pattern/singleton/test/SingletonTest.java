package design.pattern.singleton.test;

import org.junit.Assert;
import org.junit.Test;

import design.pattern.singleton.Singleton;

public class SingletonTest {
	
	@Test
	public void test() {
		
		Singleton singleton1 = Singleton.getInstance();
		Assert.assertNotNull(singleton1);
		
		Singleton singleton2 = Singleton.getInstance();
		Assert.assertNotNull(singleton2);
		
		System.out.println(singleton1.toString());
		System.out.println(singleton2.toString());
		
		Assert.assertEquals(1,Singleton.getCount());
	}

}
