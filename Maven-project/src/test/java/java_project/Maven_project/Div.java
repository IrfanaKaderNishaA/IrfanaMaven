package java_project.Maven_project;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class Div {
	public static int Checkcal(int a,int b) {
		int division=a/b;
		return division;
		
		
	}
	@Test
	public void testjn() {
		assertEquals(6,Div.Checkcal(30,5),0);
	}

}

