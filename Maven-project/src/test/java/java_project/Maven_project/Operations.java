package java_project.Maven_project;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class Operations {
	public static int Checkmultiply(int a,int b) {
		int multiplication=a*b;
		return multiplication;
		}
	public static int Checkadd(int a,int b) {
		int addition=a+b;
		return addition;
		}
	public static int Checksub(int a,int b) {
		int subtract=a-b;
		return subtract;
		}
	public static int Checkdiv(int a,int b) {
		int division=a/b;
		return division;
		}
	@Test
	public void testfn() {
		assertEquals(6,Operations.Checkmultiply(6,3),0);
		assertEquals(6,Operations.Checkadd(3,3),0);
		assertEquals(6,Operations.Checksub(9,3),0);
		assertEquals(6,Operations.Checkdiv(30,5),0);
		
	}
	

}

