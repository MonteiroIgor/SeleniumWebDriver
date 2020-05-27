package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void preencherCampo(WebElement element, String text){
        element.sendKeys(text);

    }

    public void click(WebElement element){
        element.click();
    }


    public void esperarTempoFixado(int time){
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }
}
