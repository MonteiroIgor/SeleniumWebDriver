package pages;

import config.BasePage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PageCampoTreinamento extends BasePage {

    public PageCampoTreinamento(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "elementosForm:nome")
    public WebElement field_name;

    @FindBy(id = "elementosForm:sobrenome")
    public WebElement field_lastName;

    @FindBy(id = "elementosForm:sexo:0")
    public WebElement radio_genderMale;

    @FindBy(id = "elementosForm:sexo:1")
    public WebElement radio_genderFemale;

    @FindBy(id = "elementosForm:comidaFavorita:0")
    public WebElement checkBox_Meat;

    @FindBy(id = "elementosForm:comidaFavorita:1")
    public WebElement checkBox_Chicken;

    @FindBy(id = "elementosForm:comidaFavorita:2")
    public WebElement checkBox_Pizza;

    @FindBy(id = "elementosForm:comidaFavorita:3")
    public WebElement checkBox_Vegetarian;

    @FindBy(id = "elementosForm:escolaridade")
    public WebElement options_Scholarity;

    @FindBy(id = "elementosForm:esportes")
    public WebElement options_Sports;

    @FindBy(id = "elementosForm:sugestoes")
    public WebElement textArea_Sugestions;

    @FindBy(id = "buttonSimple")
    public WebElement button_CliqueMe;

    @FindBy(id = "buttonPopUpEasy")
    public WebElement button_AbrirPopup;

    @FindBy(id = "buttonPopUpHard")
    public WebElement button_AbrirPopup_DoMal;

    @FindBy(id = "buttonDelay")
    public WebElement button_RespostaDemorada;

    @FindBy(linkText = "Voltar")
    public WebElement link_Voltar;

    @FindBy(id = "resultado")
    public WebElement text_Voltou;

    @FindBy(id = "alert")
    public WebElement button_Alert;

    @FindBy(id = "confirm")
    public WebElement button_Confirm;




    boolean encontrou = false;


    public PageCampoTreinamento fillFieldNameAndAssertField(String name){
        field_name.sendKeys(name);
        Assert.assertEquals(name, field_name.getAttribute("value"));
        return this;
    }

    public PageCampoTreinamento fillFieldLastNameAndAssertField(String lastName){
        field_lastName.sendKeys(lastName);
        Assert.assertEquals(lastName, field_lastName.getAttribute("value"));

        return this;
    }

    public PageCampoTreinamento clickRadioButtonSexAndAssertClick(String gender){

        if (gender.equalsIgnoreCase("Masculino")) {
            radio_genderMale.click();
            Assert.assertTrue(radio_genderMale.isSelected());
            esperarTempoFixado(2000);
        } else if (gender.equalsIgnoreCase("Feminino")) {
            radio_genderFemale.click();
            Assert.assertTrue(radio_genderFemale.isSelected());
            esperarTempoFixado(2000);
        }

        return this;
    }

    public PageCampoTreinamento clickCheckBoxAndAssertClickEat(String eat){

        if(eat.equalsIgnoreCase("Carne")){
            checkBox_Meat.click();
            Assert.assertTrue(checkBox_Meat.isSelected());
            esperarTempoFixado(2000);
        }else if(eat.equalsIgnoreCase("Frango")){
            checkBox_Chicken.click();
            Assert.assertTrue(checkBox_Chicken.isSelected());
            esperarTempoFixado(2000);
        }else if(eat.equalsIgnoreCase("Pizza")){
            checkBox_Pizza.click();
            Assert.assertTrue(checkBox_Pizza.isSelected());
            esperarTempoFixado(2000);
        }else if(eat.equalsIgnoreCase("Vegetariano")){
            checkBox_Vegetarian.click();
            Assert.assertTrue(checkBox_Vegetarian.isSelected());
            esperarTempoFixado(2000);
        }

        return this;
    }

    public PageCampoTreinamento clickComboBoxAndAssertClickScholarity(String scholarity){

        Select combo = new Select(options_Scholarity);
        List<WebElement> options = combo.getOptions();

        if(scholarity.equalsIgnoreCase("Primeiro Grau Incompleto")){
            combo.selectByIndex(0);
            esperarTempoFixado(2000);

            for(WebElement option: options) {
                if(option.getText().equals("Primeiro Grau Incompleto")) {
                    encontrou = true;
                    break;
                }
            }


        }else if(scholarity.equalsIgnoreCase("Primeiro Grau Completo")){
            combo.selectByIndex(1);
            esperarTempoFixado(2000);

            for(WebElement option: options) {
                if(option.getText().equals("Primeiro Grau Completo")) {
                    encontrou = true;
                    break;
                }
            }

        }else if(scholarity.equalsIgnoreCase("Segundo Grau Incompleto")){
            combo.selectByIndex(2);
            esperarTempoFixado(2000);

            for(WebElement option: options) {
                if(option.getText().equals("Segundo Grau Incompleto")) {
                    encontrou = true;
                    break;
                }
            }

        }else if(scholarity.equalsIgnoreCase("Segundo Grau Completo")){
            combo.selectByIndex(3);
            esperarTempoFixado(2000);

            for(WebElement option: options) {
                if(option.getText().equals("Segundo Grau Completo")) {
                    encontrou = true;
                    break;
                }
            }

        }else if(scholarity.equalsIgnoreCase("Superior")){
            combo.selectByIndex(4);
            esperarTempoFixado(2000);

            for(WebElement option: options) {
                if(option.getText().equals("Superior")) {
                    encontrou = true;
                    break;
                }
            }

        }else if(scholarity.equalsIgnoreCase("Especializacao")){
            combo.selectByIndex(5);
            esperarTempoFixado(2000);

            for(WebElement option: options) {
                if(option.getText().equals("Especializacao")) {
                    encontrou = true;
                    break;
                }
            }

        }else if(scholarity.equalsIgnoreCase("Mestrado")){
            combo.selectByIndex(6);
            esperarTempoFixado(2000);

            for(WebElement option: options) {
                if(option.getText().equals("Mestrado")) {
                    encontrou = true;
                    break;
                }
            }

        }else if(scholarity.equalsIgnoreCase("Doutorado")){
            combo.selectByIndex(7);
            esperarTempoFixado(2000);

            for(WebElement option: options) {
                if(option.getText().equals("Doutorado")) {
                    encontrou = true;
                    break;
                }
            }

        }

        return this;
    }

    public PageCampoTreinamento clickComboMultipleValues(String option1, String option2){

        Select combo = new Select(options_Sports);


        combo.selectByVisibleText(option1);
        combo.selectByVisibleText(option2);

        List<WebElement> allSelectOptions = combo.getAllSelectedOptions();
        Assert.assertEquals(2,allSelectOptions.size());

        for(WebElement option: allSelectOptions) {

            for(int i = 1; i <= 2; i++){
                System.out.println("option"+i);
                if(option.getText().equals("option"+i)) {
                }
                encontrou = true;
            }
            break;
        }
        return this;
    }

    public PageCampoTreinamento insertTextOnTextAreaAndAssert(){
        preencherCampo(textArea_Sugestions, "Testando Área");
        esperarTempoFixado(2000);
        Assert.assertEquals("Testando Área", textArea_Sugestions.getAttribute("value"));

        return this;
    }

    public PageCampoTreinamento clickAndAssertButtonCliqueMe(){
        click(button_CliqueMe);
        Assert.assertEquals("Obrigado!",button_CliqueMe.getAttribute("value"));

        return this;
    }

    public PageCampoTreinamento clickAndAssertLinkVoltar(){
        click(link_Voltar);
        Assert.assertEquals("Voltou!", text_Voltou.getText());

        return this;
    }

    public PageCampoTreinamento clickButtonAndAssertAlert(){
        click(button_Alert);
        Alert alert = driver.switchTo().alert();
        String texto = alert.getText();
        Assert.assertEquals("Alert Simples", texto);
        alert.accept();

        field_name.sendKeys(texto);

        return this;
    }

    public PageCampoTreinamento clickButtonConfirmAndAcceptAlert(){
        click(button_Confirm);
        Alert alert = driver.switchTo().alert();
        String texto = alert.getText();
        esperarTempoFixado(5000);
        alert.accept();
        Assert.assertEquals("Confirmado", texto);

        field_name.sendKeys(texto);

        return this;
    }

    public PageCampoTreinamento clickButtonConfirmAndDismissAlert(){
        click(button_Confirm);
        Alert alert = driver.switchTo().alert();
        String texto = alert.getText();
        Assert.assertEquals("Negado", texto);
        alert.dismiss();

        field_name.sendKeys(texto);

        return this;
    }
}
