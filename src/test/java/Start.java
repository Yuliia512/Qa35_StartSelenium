import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {
WebDriver wd;

@Test
public void goToPhoneBook(){
//open browser
    wd=new ChromeDriver();
    //go to phonebook
//wd.get("https://contacts-app.tobbymarshall815.vercel.app");
wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app");//with history
    wd.navigate().back();
    wd.navigate().forward();
    wd.navigate().refresh();
//close browser
wd.close();
//wd.quit();
}

@Test
    public void loginTest(){
    wd=new ChromeDriver();
    wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
    // open loginPage :find loginTab + click
    //fill email  : find ElementEmail + type "email"
    //fill password :find ElementPassword + type "password"
    // login submit : find login button _ click
    // Assert (ex res=ac res)

    WebElement element = wd.findElement(By.tagName("h1"));
    element.click();

    List<WebElement> list = wd.findElements(By.tagName("h1"));
    WebElement element1 = list.get(1);

    wd.findElement(By.id("root"));
    wd.findElement(By.className("container"));

    wd.findElement(By.linkText("ABOUT"));
    wd.findElement(By.partialLinkText("AB"));
    //wd.findElement(By.name("name"));
    //wd.findElement(By.name("surname"));

    wd.findElement(By.cssSelector("h1"));
    wd.findElement(By.cssSelector("a"));

    wd.findElement(By.cssSelector("#root"));
    wd.findElement(By.cssSelector(".container"));
    wd.findElement(By.cssSelector("[href='/home']"));
    wd.findElement(By.cssSelector("[href]"));
    wd.findElement(By.cssSelector("[href ^='/ho']"));
    wd.findElement(By.cssSelector("[href *='om']"));
    wd.findElement(By.cssSelector("[href $='me']"));
    wd.findElement(By.cssSelector("div#root.container"));
    wd.findElement(By.cssSelector("a[href='/home']"));
    wd.quit();

}
}
