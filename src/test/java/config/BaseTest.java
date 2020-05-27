package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public WebDriver driver;
    protected BasePage basePage;

    @Before
    public void before(){

        System.setProperty("webdriver.chrome.driver", "/home/qa/projetos/CursoSelenium/src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("file:///"+System.getProperty("user.dir") + "/src/test/resources/componentes.html");
        driver.manage().window().maximize();

        basePage = new BasePage(driver);
    }


    @After
    public void after(){
        driver.quit();
    }


    public void aguardarTempoFixo(int time_out){
        try {
            Thread.sleep(time_out);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
