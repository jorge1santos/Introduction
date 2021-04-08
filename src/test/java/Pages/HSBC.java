package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Utilerias2;

public class HSBC {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://uss-r:peri-peri%20salted%20chips@dco-mx-ao-uat.hsbc.com.hk/elegibilidad?feautures=!GEOLOCATION_OFF");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Utilerias2.getInstance(driver).sleepseconds(5);
		Utilerias2.getInstance(driver).hacerScroll();
		driver.findElement(By.cssSelector("#consent-checkbox")).click();
		driver.findElement(
				By.cssSelector("#root > div > div > main > div.UI-style--page > div > div > div > form > nav > button"))
				.click();
		Utilerias2.getInstance(driver).sleepseconds(3);
		//
		WebElement firstname = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#firstName-field")));
		firstname.click();
		firstname.sendKeys("Jorge");
		Utilerias2.getInstance(driver).sleepseconds(3);
		//driver.close();
	}

}
