package java_project.Maven_project;
import org.junit.*;
public class Annotations {
	@After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }
	
	@Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runOnceBeforeTestMethod");
    }
	@AfterClass
    public static void runOnceAfterClassTestMethod() {
        System.out.println("@AfterClass - runOnceAfterClassTestMethod");
    }
	@BeforeClass
    public static void runOnceBeforeClassTestMethod() {
        System.out.println("@BeforeClass - runOnceBeforeClassTestMethod");
    }
@Ignore
public void Ignore() {
	System.out.println("@Ignore-Ignoring statement");

}

    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }
    @Test(timeout=500)
    public void test_withtimeout() {
        System.out.println("@Test_withtimeout -test_withtimeout");
    }



}

