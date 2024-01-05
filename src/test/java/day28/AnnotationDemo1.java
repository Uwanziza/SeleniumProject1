package day28;
import org.testng.annotations.*;
public class AnnotationDemo1 {
	
    @BeforeClass
	void login() {
		System.out.println("Login,,,,");
	}
   @Test(priority=1)
	void search () {
	   System.out.println("search,,,,");
	}
	@Test(priority=2)
	void advancedSearch ( ) {
		System.out.println("AdvancedSearch,,,,");
	}
	@AfterClass
	void logout() {
		System.out.println("Logout,,,,");  
	}
	
}
