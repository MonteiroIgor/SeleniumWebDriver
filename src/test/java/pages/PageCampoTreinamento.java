package pages;

import config.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.IOException;

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

    @FindBy(id = "elementosForm:sugestoes")
    public WebElement field_textArea_Suggestions;


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

    public PageCampoTreinamento clickComboBoxAndAssertClickScholarity(){

        return this;
    }
}
