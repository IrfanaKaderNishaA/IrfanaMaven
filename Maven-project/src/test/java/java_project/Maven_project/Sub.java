package java_project.Maven_project;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class Sub {
	public static int Checkcal(int a,int b) {
		int subtraction=a-b;
		return subtraction;
		
		
	}
	@Test
	public void testjn() {
		assertEquals(6,Sub.Checkcal(9,3),0);
	}

}

