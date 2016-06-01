package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Homework2: Regist account on guru99 
 * @pic: Trang
 * Created_Date: 30/5/2016
 */
public class registerAccount {
	public static void registAcc(String fname, String lname, String email, String pass, String confirmPass){
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://live.guru99.com/index.php/customer/account/create/";
		driver.get(baseUrl);
		driver.findElement(By.id("firstname")).sendKeys(fname);
		driver.findElement(By.id("lastname")).sendKeys(lname);
		driver.findElement(By.id("email_address")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("confirmation")).sendKeys(confirmPass);
		driver.findElement(By.xpath("//*[@id='form-validate']//*[@title='Register']")).click();		
	}	
	public static void main (String[] args){
		//Regist thanh cong
		registAcc("Hoang", "Trang", "septest903@gmail.com", "123456", "123456");
		//Regist that bai
		registAcc("Hoang", "Trang", "septest903@gmail.com", "123456", "123456");
	}
}