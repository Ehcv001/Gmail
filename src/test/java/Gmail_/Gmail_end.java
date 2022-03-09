package Gmail_;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_end {

	private ChromeDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@Test
	public void testGooglePage() {

		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();

		searchbox.sendKeys("Gmail");

		searchbox.submit();

		assertEquals("Gmail", driver.getTitle());
	}

	@After

	public void select() throws InterruptedException {

		driver.findElement(By.xpath("//div[@class=\"yuRUbf\"]//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();

		driver.findElement(By.xpath("//div [@class=\"header__aside__buttons\"] //a[position()=3]")).click();

		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Andrea");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Sanabria Hernandez ");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("andresanabria89");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/input"))
				.sendKeys("Andrea123*");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"))
				.sendKeys("Andrea123*");

		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"initialView\"]/div[2]/div[1]/div[1]"));

		driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("3125515408");

		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"))
				.click();

	}

}
