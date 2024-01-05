package day17;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.NoSuchElementException;

public class OrangeHRMLoginTest {
	public static  void main (String []args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\cuwanziza\\Documents\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
	//ChromeDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//3 Provide username Admin
//		WebElement txtUsername=driver.findElement(By.name("username"));
//		txtUsername.sendKeys("Admin");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// Provide the password)
         
        driver.findElement(By.name("password")).sendKeys("admin1234");
        // click on the login button
         driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
         Thread.sleep(7000); 
         
         // Verify the tittle in dashboard page
         
        /*//Title Validation
         * String act_title= driver.getTitle();
        String exp_title="OrangeHRM";
        
        if (act_title.equals(exp_title)) {
        	System.out.println("Test passed");
        }else {
        	System.out.println("Failed");
        }*/
         String act_label="";
         try {
         act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
         }catch(NoSuchElementException e) {
        	 //act_label="";
         }
         String exp_label="Dashboard";
         if (act_label.equals(exp_label)) {
        	 System.out.println("Test passed");
         }else {
        	 System.out.println("test failed");
         }
       driver.quit();
		
	}

}
