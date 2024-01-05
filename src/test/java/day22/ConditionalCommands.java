package day22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.nopcommerce.com/register");
			driver.manage().window().maximize();
			
			/*  isDisplayed() True/False WebElement is displayed
			 * ,isEnabled() 
			 * ,isSelected() radio button,check box and drop downs
			 *  they always return boolean true /false*/
		
			//For Logo Element
		//  isDisplayed()  isEnabled()
			//WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
			//System.out.println("display status of logo:"+logo.isDisplayed());
			
			//boolean status=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
			//System.out.println(status);
			
			//WebElement  searchbox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
			//System.out.println("Display status:"+searchbox.isDisplayed());
			//System.out.println("Display status:"+searchbox.isEnabled());
			
			//isSelected
			
			WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
			WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
			
			//Before selection
			System.out.println("Before selection");
			System.out.println(male_rd.isSelected());
			System.out.println(female_rd.isSelected());
			
			//After selection of male radio button
			System.out.println("After selection of male radio button");
			male_rd.click();
			System.out.println(male_rd.isSelected());//True
			System.out.println(female_rd.isSelected());//False
			
			//After Selection of female radio button
			System.out.println("After selection of female radio button");

			female_rd.click();
			System.out.println(male_rd.isSelected());//True
			System.out.println(female_rd.isSelected());//False
			
	}

}
