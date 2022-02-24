package java_project.Maven_project;
import static org.junit.Assert.*;

import org.junit.Test;
public class AssertMethod {
	@Test
		public void TestAssert() {
		String s1="Irfana";
		String s2="Irfana";
		String s3="irfana";
		String s4=null;
		int a=1;
		int b=2;
		int[] arr1= {3,5,8};
		int[] arr2= {3,5,8};
		assertEquals(s1,s2);
		assertSame(s1,s2);
		assertNotSame(s1,s3);
		assertNotNull(s1);
		assertNull(s4);
		assertTrue(a<b);
		assertFalse(a>b);
		assertArrayEquals(arr1,arr2);
	}
		
	}