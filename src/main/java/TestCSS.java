import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCSS {

    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();

        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }
    //HW9--------------------------------------
    @Test
    public void test(){
        // print amount of table rows
        List<WebElement> elements = wd.findElements(By.xpath("//*[@id='customers']//tr"));
        System.out.println("test 1: " + elements.size());

        // print amount of table columns
        List<WebElement> elementsC = wd.findElements(By.xpath("//*[@id='customers']//tr//th"));
        System.out.println("test 2: " + elementsC.size());

        // find locator for the row3
        String text = wd.findElement(By.xpath("//*[@id='customers']//tr[3]")).getText();
        Assert.assertTrue(text.contains("Sweden"));

        // find locator for the last column
        String text1 = wd.findElement(By.xpath("//*[@id='customers']//tr/th[last()]")).getText();
        Assert.assertTrue(text1.contains("Country"));



    }

    @AfterMethod
    public void postcondition() {
//        wd.close();
//    wd.quit();
//    quit - > close all



    }
}
