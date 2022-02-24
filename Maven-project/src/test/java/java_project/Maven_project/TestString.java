package java_project.Maven_project;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class TestString {

	public static boolean checkString(String m)
	{
		String str="Irfana Kader Nisha";
		if(str.contains(m))
		{
			return true;
		}
		return false;

	}@Test
	public void testCheckStr() {
		assertEquals(true,checkString("Irfana Kader Nisha"));
	}

}
