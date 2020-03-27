package design.pattern.singleton.test;

import org.junit.Assert;
import org.junit.Test;

import design.pattern.singleton.Singleton;

public class SingletonTest {
	
	@Test
	public void testGetInstance() {
		
		Singleton singleton1 = null;
		singleton1 = Singleton.getInstance();
		Assert.assertNotNull(singleton1);
		System.out.println(singleton1.toString());
		
		Singleton singleton2 = null;
		singleton2 = Singleton.getInstance();
		Assert.assertNotNull(singleton2);
		
		System.out.println(singleton2.toString());
		
		
		Assert.assertEquals(1,Singleton.getCount());
	}

}
