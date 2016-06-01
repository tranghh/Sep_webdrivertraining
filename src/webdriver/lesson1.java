package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Homework1: Verify element, click, type elements  on http://only-testing-blog.blogspot.in/2013/09/test.html
 * @pic: Trang
 * Created_Date: 30/5/2016
 */
public class lesson1 {
	public static void main (String[] args){
		//Khai bao bien
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://only-testing-blog.blogspot.in/2013/09/test.html";
		String beforeTitle = "";
		String afterTitle = "";
				
		//Access to test page
		driver.get(baseUrl);
		beforeTitle = driver.getTitle();
		
		//Thuc hien send key
		driver.findElement(By.id("fname")).sendKeys("Test1");
		//Thuc hien click
		driver.findElement(By.id("submitButton")).click();
		//Thuc hien select radio, checkbox
		driver.findElement(By.xpath("//*[@value='Bike']")).click();
		driver.findElement(By.xpath("//*[@value='male']")).click();
		driver.findElement(By.xpath("//*[@class='home-link']")).click();
		//Thuc hien back page
		driver.navigate().back();
		afterTitle = driver.getTitle();
		//Thuc hien verify title trc va sau khi chuyen page
		beforeTitle = afterTitle;
		System.out.println(beforeTitle);
		System.out.println(afterTitle);
		driver.close();	
	}
}