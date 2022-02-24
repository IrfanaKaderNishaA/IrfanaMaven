package java_project.Maven_project;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class Multiplication {
	public static int multiply(int a,int b) {
		int multiplication=a*b;
		return multiplication;
		}
	public static int add(int a,int b) {
		int addition=a+b;
		return addition;
		}
	public static int sub(int a,int b) {
		int subtract=a-b;
		return subtract;
		}
	public static int div(int a,int b) {
		int division=a/b;
		return division;
		}
	@Test
	public void testmul() {
		assertEquals(6,Multiplication.multiply(6,3),0);
		
	}
	@Test
	public void testadd() {
		assertEquals(6,Multiplication.add(3,3),0);
	
	}
	@Test
	public void testsub() {
		assertEquals(6,Multiplication.sub(9,3),0);
		
	}
	@Test
	public void testdiv() {
		assertEquals(6,Multiplication.div(30,5),0);
		
	}


}
