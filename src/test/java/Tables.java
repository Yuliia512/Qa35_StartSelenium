import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tables {

    WebDriver wd;

    @Test
    public void wschoolTables(){
        wd=new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        //print rows in table

        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Count of rows" + listRows.size());
        Assert.assertEquals(listRows.size(),7);

        //print last rows
WebElement lastRow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println(lastRow.getText());
        //p count of columns
List <WebElement> listColumns = wd.findElements(By.cssSelector("#customers th"));
Assert.assertEquals(listColumns.size(),3);
        //p Canada

WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        System.out.println(canada.getText());
Assert.assertEquals(canada.getText(),"Canada");

        wd.quit();
    }
}