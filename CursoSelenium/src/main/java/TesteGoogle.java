import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
		//Instância do WebDriber especializada para um determinado browser
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("http://www.google.com");
		
		//Comparação, relatando se o teste passou ou não.
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit(); //Fechando navegador após a execução do teste
	}

}
