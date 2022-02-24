package java_project.Maven_project;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class Add {
	public static int Checkcal(int a,int b) {
		int addition=a+b;
		return addition;
		
		
	}
	@Test
	public void testjn() {
		assertEquals(6,Add.Checkcal(3,3),0);
	}

}

