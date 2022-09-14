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
    wd.findElement(By.cssSelector("a[href='/home'"));
    wd.quit();

}

@Test
    public void homework(){
    wd=new ChromeDriver();
    wd.navigate().to("file:///C:/Users/User/Downloads/index%20(1).html");

    WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
    WebElement item2 = wd.findElement(By.cssSelector("a[href='#item2']"));
    WebElement item3 = wd.findElement(By.cssSelector("a[href='#item3']"));
    WebElement item4 = wd.findElement(By.cssSelector("a[href='#item4']"));
    WebElement name = wd.findElement(By.name("name"));
    WebElement surename = wd.findElement(By.name("surename"));
    WebElement ButtonSend =  wd.findElement(By.className("btn"));

    List<WebElement> list = wd.findElements(By.tagName("td"));
    WebElement element1 = list.get(9);

      wd.quit();

}
    @Test
    public void fromCssToxPath(){

        //wd.findElement(By.cssSelector("a[href]"));

        wd.findElement(By.xpath("//a[@href]"));

        //wd.findElement(By.cssSelector("[href ^='/ho']"));;

        wd.findElement(By.xpath("//starts-with(@href,'ho')"));

        //wd.findElement(By.cssSelector("div.focus"));

        wd.findElement(By.xpath("//div[contains(@class,'focus')]"));

        //wd.findElement(By.cssSelector("input[type='text']"));

        wd.findElement(By.xpath("//input[@type='text']"));

        //wd.findElement(By.cssSelector("div #host"));

        wd.findElement(By.xpath("//div//[@id='host]"));

        //wd.findElement(By.cssSelector("table#country tr:nt-child(3)) td:last-child"));

        wd.findElement(By.xpath("table[id='country']//tr[3]//td[last()]"));

        //wd.findElement(By.cssSelector("div#idName li:first-child"));

        wd.findElement(By.xpath("div[@id='idName']//li[1]"));

        //wd.findElement(By.cssSelector("div.sort>div:nth-child(2)"));

        wd.findElement(By.xpath("div[@class='sort']/div[2]"));


    }


    @Test
    public void fromXPathToCss(){

        //wd.findElement(By.xpath("//*[@id='host"));

        wd.findElement(By.cssSelector("#host"));

        //wd.findElement(By.xpath("//button[@class='submit']"));

        wd.findElement(By.cssSelector("button.submit"));

        //wd.findElement(By.xpath("//div/div/img[@src='paris.jpg']"));

        wd.findElement(By.cssSelector("div>div>img[src='paris.jpg']"));

        //wd.findElement(By.xpath("//div[@class='first' and @class='list']"));

        wd.findElement(By.cssSelector("div.first.list"));

        //wd.findElement(By.xpath("//div[contains(@class,'st']"));

        wd.findElement(By.cssSelector("div.st"));

        //wd.findElement(By.xpath("//div[@id=’idName’]//h1[last()]"));

        wd.findElement(By.cssSelector("div#idName h1:last-child"));

        wd.findElement(By.xpath("//table[@id]//tr[last()]"));

        wd.findElement(By.cssSelector("table#id tr:last-child"));

        wd.findElement(By.xpath("//a[starts-with(@id,'ret')]"));

        wd.findElement(By.cssSelector("a[#id ^='ret']"));

    }
}
