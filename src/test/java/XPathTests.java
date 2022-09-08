import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XPathTests {

    WebDriver wd;

    @Test
    public void XPathTests() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();//open full sreen
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app");

        //open login form
        WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
        loginTab.click();

        //fill email

        WebElement inputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("423090@gmail.com");
        WebElement inputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
inputPassword.click();
inputPassword.clear();
inputPassword.sendKeys("Yy12345$");
        // submit login
        WebElement loginButton = wd.findElement(By.xpath("//*[text()=' Login']"));
        loginButton.click();



    }
}
