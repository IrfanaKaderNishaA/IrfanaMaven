package java_project.Maven_project;
import static org.junit.Assert.assertEquals;
import org.junit.*;


public class FindMin {
	public static int CheckMin(int arr[]) {
		int min=11;
		for(int num:arr) {
			if(min>num)
				min=num;
		}
		System.out.println(min);
	return min;
		
	}
	@Test
	public void Findmin() {
		assertEquals(2,FindMin.CheckMin(new int[]{2,3,5,7,11}));
	}


}
