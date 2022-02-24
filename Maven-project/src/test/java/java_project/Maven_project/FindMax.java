package java_project.Maven_project;
import static org.junit.Assert.assertEquals;
import org.junit.*;


public class FindMax {
	public static int CheckMax(int arr[]) {
		int max=0;
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
	return max;
		
	}
	@Test
	public void Findmax() {
		assertEquals(11,FindMax.CheckMax(new int[] {2,3,5,7,11}));
	}


}
 