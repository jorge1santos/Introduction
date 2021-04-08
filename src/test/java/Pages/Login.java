package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Login {

	public static WebDriver driver;

	@Before
	public static void main(String[] args) {
		try {

			System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://previvales.mx/");
			driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Consulta tu saldo')]")).click();

			
			Utilerias utils = new Utilerias();
			String[] usuarioPass = utils.Random();
			driver.findElement(By.id("email-login")).sendKeys(usuarioPass[0]);
			driver.findElement(By.xpath("//input[@id='email-pass']")).sendKeys(usuarioPass[1]);
			
			
		
//			String[] usuarios = { "jorge.santos@gmail.com", "angel.medina@vantis.mx", };
//			int usuariosNumero = usuarios.length;
//			int index = (int) (Math.random() * usuariosNumero);
//			driver.findElement(By.id("email-login")).sendKeys(usuarios[index]);
//			String[] contrasena = { "guadalajara1", "angelito123", };
//			driver.findElement(By.xpath("//input[@id='email-pass']")).sendKeys(contrasena[index]);
			driver.quit();

			//String usuario = llenar_formulario(usuarios);

		} catch (Exception ex) {
			System.out.print(ex.toString());
		}
	}

	public static String llenar_formulario(String[] usuarios) {
		try {

			int usuariosNumero = usuarios.length;
			int index = (int) (Math.random() * usuariosNumero);
			return usuarios[index];
		} catch (Exception ex) {
			System.out.print(ex.toString());
		}
		return null;

	}
}
