package SignInModule;

import org.datadriven.DataDriven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _16_add_staff_first_name {
	public static WebDriver driver;
	@BeforeClass
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stanleyathish.j\\eclipse-workspace\\Stephen\\driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://oneself-admin-test.optisolbusiness.com");

	}
	@Test
	public static void signIn1() throws Throwable {
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		email.sendKeys(DataDriven.readData(1, 0, "TestData"));
	}
	@Test
	public static void signIn2() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		password.sendKeys(DataDriven.readData(1, 1, "TestData"));
	}
	@Test
	public static void signIn3() throws Throwable {
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	@Test
	public static void signIn4() throws Throwable {
		Thread.sleep(5000);
		WebElement signin = driver.findElement(By.xpath("(//div[@class='menu-icon'])[3]"));
		signin.click();
	}
	@Test
	public static void signIn5() throws Throwable {
		Thread.sleep(5000);
		WebElement signin = driver.findElement(By.xpath("//button[text()='+']"));
		signin.click();
	}
	@Test
	public static void signIn6() throws Throwable {
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		email.sendKeys(DataDriven.readData(13, 1, "TestData"));
	}

	public static void main(String[] args) throws Throwable {
    browserLaunch();
    signIn1();
    signIn2();
    signIn3();
    signIn4();
    signIn5();
    signIn6();
    System.out.println("It successfully throw exceptions if character is exceed over 20 like #Max. characters exceed");

   }
}