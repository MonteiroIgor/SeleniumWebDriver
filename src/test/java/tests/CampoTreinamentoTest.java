package tests;

import config.BaseTest;
import org.junit.Test;
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
	public void interactingAndAssertaComboSportOption(){
		new PageCampoTreinamento(driver).
				clickComboMultipleValues("Futebol","Corrida");
	}

	@Test
	public void insertAndAssertTextArea(){
		new PageCampoTreinamento(driver).
				insertTextOnTextAreaAndAssert();

	}

	@Test
	public void clickAndAssertButtonCliqueMe(){
		new PageCampoTreinamento(driver).
			clickAndAssertButtonCliqueMe();
	}

	@Test
	public void clickAndAssertLinkVoltar(){
		new PageCampoTreinamento(driver).
				clickAndAssertLinkVoltar();
	}

	@Test
	public void clickButtonAlertAndAssertAlerta(){
		new PageCampoTreinamento(driver).
				clickButtonAndAssertAlert();
	}

	@Test
	public void clickButtonConfirmAndAcceptAlert(){
		new PageCampoTreinamento(driver).
				clickButtonConfirmAndAcceptAlert();
	}

	@Test
	public void clickButtonConfirmAndDismissAlert(){
		new PageCampoTreinamento(driver).
				clickButtonConfirmAndDismissAlert();
	}

}
