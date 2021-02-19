package mavendemo123.Demo123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\sagar\\Desktop\\JARSsELENIUM\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/Downloads/tasks/index.html");
		
		WebElement email=driver.findElement(By.id("inputEmail"));
		if(email.isDisplayed())
		{
			System.out.println("Email field is present... ");
			email.sendKeys("sagarikamisra55@gmail.com");
		}
		
		
		WebElement pswd=driver.findElement(By.xpath("//input[@id='inputPassword']"));
		if(pswd.isDisplayed())
		{
			System.out.println("Password field is present... ");
			pswd.sendKeys("sagarika");
		}
		
		WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		if(loginBtn.isDisplayed())
		{
			System.out.println("Login button is present... ");
			loginBtn.click();
			
		}


	}

}
