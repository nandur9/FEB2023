

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Model {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // declaration and instantiation of objects/variables 
		    System.setProperty("/home/nandur9gmail/eclipse-workspace/Wheel","C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
		//Launch website driver.get("https://www.selenium.dev/"); 
		try 
		{
		
		 // Click on the search text box and send value driver.findElement(By.name("q")).sendKeys("selenium");
		 // Click on the search button driver.findElement(By.name("btnK")).click(); 
		Thread.sleep(1000);
		  
		System.out.println("Tile of page "+driver.getTitle()); 
		String actualTitle=driver.getTitle(); 
		String expectedTitle="Selenium"; 
		if(actualTitle.equals(expectedTitle)) { 
		System.out.println("Verification successful correct url is opened ");
		 } else
		 {
		 System.out.print("Verification failed incorret url");
		 }
		 }
		 catch(Exception ex) 
		{
		 System.out.println("error"+ex); } finally { driver.close(); 
		}
		 } 
		


	}


