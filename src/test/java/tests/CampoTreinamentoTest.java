package tests;

import java.util.List;

import com.gargoylesoftware.htmlunit.Page;
import config.BasePage;
import config.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import pages.PageCampoTreinamento;

public class CampoTreinamentoTest extends BaseTest {


	@Test
	public void interactingTextFieldName() {
		new PageCampoTreinamento(driver).
				fillFieldNameAndAssertField("Nome");

	}

	@Test
	public void interactingTextFieldLastName() {
		new PageCampoTreinamento(driver).
			fillFieldLastNameAndAssertField("Sobrenome");
	}
	
	@Test
	public void interactingRadioButtonGenderMale() {
		new PageCampoTreinamento(driver).
				clickRadioButtonSexAndAssertClick("Masculino");
		
	}

	@Test
	public void interactingRadioButtonGenderFemale() {
		new PageCampoTreinamento(driver).
				clickRadioButtonSexAndAssertClick("Feminino");

	}
	
	@Test
	public void interactingCheckBoxMeat() {
		new PageCampoTreinamento(driver).
				clickCheckBoxAndAssertClickEat("Carne");
		
	}

	@Test
	public void interactingCheckBoxChicken() {
		new PageCampoTreinamento(driver).
				clickCheckBoxAndAssertClickEat("Frango");

	}

	@Test
	public void interactingCheckBoxPizza() {
		new PageCampoTreinamento(driver).
				clickCheckBoxAndAssertClickEat("Pizza");

	}

	@Test
	public void interactingCheckBoxVegetarian() {
		new PageCampoTreinamento(driver).
				clickCheckBoxAndAssertClickEat("Vegetarian");

	}

	@Test
	public void interactingComboBoxShcolarityOptionOne(){
		new PageCampoTreinamento(driver).
				clickComboBoxAndAssertClickScholarity("Primeiro Grau Incompleto");
	}

	@Test
	public void interactingComboBoxShcolarityOptionTwo(){
		new PageCampoTreinamento(driver).
				clickComboBoxAndAssertClickScholarity("Primeiro Grau Completo");
	}

	@Test
	public void interactingComboBoxShcolarityOptionThree(){
		new PageCampoTreinamento(driver).
				clickComboBoxAndAssertClickScholarity("Segundo Grau Incompleto");
	}

	@Test
	public void interactingComboBoxShcolarityOptionFour(){
		new PageCampoTreinamento(driver).
				clickComboBoxAndAssertClickScholarity("Segundo Grau Completo");
	}

	@Test
	public void interactingComboBoxShcolarityOptionFive(){
		new PageCampoTreinamento(driver).
				clickComboBoxAndAssertClickScholarity("Superior");
	}

	@Test
	public void interactingComboBoxShcolarityOptionSix(){
		new PageCampoTreinamento(driver).
				clickComboBoxAndAssertClickScholarity("Especialização");
	}

	@Test
	public void interactingComboBoxShcolarityOptionSeven(){
		new PageCampoTreinamento(driver).
				clickComboBoxAndAssertClickScholarity("Mestrado");
	}

	@Test
	public void interactingComboBoxShcolarityOptionEight(){
		new PageCampoTreinamento(driver).
				clickComboBoxAndAssertClickScholarity("Doutorado");
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
