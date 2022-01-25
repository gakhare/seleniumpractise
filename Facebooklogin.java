package seleniumday1.practice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",".\\Executable\\chromedriver.exe");
		 
		WebDriver driver1=new ChromeDriver ();
		
		driver1.manage().window().maximize();
		
	     driver1.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS); 

		driver1.get ("https://www.facebook.com/");
			
			
		driver1.findElement(By.id("email")).clear();
		
		driver1.findElement(By.id("email")).sendKeys("ganesh");
		driver1.findElement(By.name("pass")).sendKeys("akhare");
		
		driver1.findElement(By.name("login")).click();

		
			
			
		
		
		
	}

}