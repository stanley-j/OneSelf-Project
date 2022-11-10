package SignInModule;

import org.datadriven.DataDriven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_empty_username_invalid_password {

	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stanleyathish.j\\eclipse-workspace\\Stephen\\driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://oneself-admin-test.optisolbusiness.com");

	}

	public static void signIn1() throws Throwable {
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		email.sendKeys(DataDriven.readData(6, 0, "TestData"));
	}
	public static void signIn2() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		password.sendKeys(DataDriven.readData(7, 1, "TestData"));
	}
	public static void signIn3() throws Throwable {
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}

	public static void main(String[] args) throws Throwable {
    browserLaunch();
    signIn2();
    signIn3();
    System.out.println("Successfully throw an exception for empty username and invalid password like #Email is required");

	}
}