package SignInModule;

import org.datadriven.DataDriven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _11_valid_username_forgot_password {
	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stanleyathish.j\\eclipse-workspace\\Stephen\\driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://oneself-admin-test.optisolbusiness.com");

	}
	public static void signIn1() throws Throwable {
		WebElement signin = driver.findElement(By.xpath("//a[@routerlink='/forgot-password']"));
		signin.click();
	}

	public static void signIn2() throws Throwable {
		WebElement signin = driver.findElement(By.xpath("//input[@type='email']"));
		signin.sendKeys(DataDriven.readData(9, 0, "TestData"));
	}
	
	public static void signIn3() throws Throwable {
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}

	public static void main(String[] args) throws Throwable {
    browserLaunch();
    signIn1();
    signIn2();
    signIn3();
    System.out.println("Successfully received an email while entering valid username in forgot password");

  }
}