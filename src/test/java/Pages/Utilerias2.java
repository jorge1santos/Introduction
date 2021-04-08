package Pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.Pages;

public class Utilerias2 extends Pages {
	private static Utilerias2 utilerias2;
	private WebDriver webDriver;

	private Utilerias2(WebDriver driver) {
		webDriver = driver;
	}

	public void sleepseconds(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void hacerScroll() {

		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollBy(0,1000)");

	}

	public static Utilerias2 getInstance(WebDriver driver) {
		if (utilerias2 == null) {
			utilerias2 = new Utilerias2(driver);

		}
		return utilerias2;
	}

}
