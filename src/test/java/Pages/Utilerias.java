package Pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class Utilerias extends HSBC{
	
	public void sleepseconds(int seconds) {
		
		try {
			Thread.sleep(seconds*1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//public class Utilerias {
	public String[] Random() {
	String[] usuarios = { "jorge.santos@gmail.com", "angel.medina@vantis.mx", };
	int usuariosNumero = usuarios.length;
	int index = (int) (Math.random() * usuariosNumero);
	
	String[] contrasena = { "guadalajara1", "angelito123", };
	String[] usuarioPass = {usuarios[index],contrasena[index]};
	return usuarioPass;
		
	}

}
