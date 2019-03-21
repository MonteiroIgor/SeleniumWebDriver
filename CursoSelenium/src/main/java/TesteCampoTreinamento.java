import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteCampoTreinamento {
	
	@Test
	public void testeTextField() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///"+System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		//Informando para o Selenium qual elemento que eu quero interagir e inserindo informacão
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Teste de Escrita");
		//Verificar automaticamente se o texto foi escrito no campo
		Assert.assertEquals("Teste de Escrita", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		
		
		
		driver.quit();
	}
	
	@Test
	public void deveInteragirComTextArea() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///"+System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste");
		Assert.assertEquals("Teste", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value") );
		
		driver.quit();
		
	}
	
	@Test
	public void deveInteragirComRadioButton() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///"+System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		//Interagir com button e clicar
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		//Verificar se o click foi verdadeiro
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
		
		driver.quit();
		
	}
	
	@Test
	public void deveInteragirComCheckBox() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///"+System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		//Interagir com button e clicar
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		//Verificar se o click foi verdadeiro
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
		
		driver.quit();
		
	}
	
	@Test
	public void deveInteragirComCombo() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///"+System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		//Procurando e intereagindo com o elemento.
		//WebElement é o objeto padrão que o selenium retorna quando buscamos um elemento
		WebElement element =  driver.findElement(By.id("elementosForm:escolaridade"));
		//Criando um Select
		Select combo = 	new Select(element);
		//combo.selectByIndex(2);
		//combo.selectByValue("superior");
		combo.selectByVisibleText("Mestrado");
		
		//Verificar valor selecionado
		Assert.assertEquals("Mestrado", combo.getFirstSelectedOption().getText());
		
		driver.quit();
		
		}
	
	@Test
	public void deveVerificarValoresCombo() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///"+System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		//Procurando e intereagindo com o elemento.
		//WebElement é o objeto padrão que o selenium retorna quando buscamos um elemento
		WebElement element =  driver.findElement(By.id("elementosForm:escolaridade"));
		//Criando um Select
		Select combo = 	new Select(element);
		List<WebElement> options = combo.getOptions();
		Assert.assertEquals(8,options.size());
		
		boolean encontrou = false;
		for(WebElement option: options) {
			if(option.getText().equals("Mestrado")) {
					encontrou = true;
					break;
			}
		}
		Assert.assertTrue(encontrou);
		
		driver.quit();
		
	}
	
	@Test
	public void deveVerificarValoresComboMultiplo() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///"+System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		//Procurando e intereagindo com o elemento.
		//WebElement é o objeto padrão que o selenium retorna quando buscamos um elemento
		WebElement element =  driver.findElement(By.id("elementosForm:esportes"));
		//Criando um Select
		Select combo = 	new Select(element);
		combo.selectByVisibleText("Natacao");
		combo.selectByVisibleText("Corrida");
		combo.selectByVisibleText("O que eh esporte?");
		
		List<WebElement> allSelectOptions = combo.getAllSelectedOptions();
		Assert.assertEquals(3,allSelectOptions.size());
		
		driver.quit();
	}	
}
