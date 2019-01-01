import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	
	public static WebDriver driver;	
	@BeforeSuite
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	@Test
	public void doLogin() throws InterruptedException{
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("satyaentc@gmail.com");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Kakul@123");
	}
	@AfterSuite
	public void teardown(){
		
		driver.quit();		
	
	}

}
