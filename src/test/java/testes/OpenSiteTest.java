package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenSiteTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.w3schools.com/");
		assertTrue("Titulo da pagina difere do esperado", driver.getTitle().contentEquals("W3Schools Online Web Tutorials"));
		driver.findElement(By.id("search2")).sendKeys("HTML Tutorial");
		driver.findElement(By.id("learntocode_searchicon")).click();
		Thread.sleep(10000);
		
	}

}
