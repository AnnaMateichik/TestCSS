import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Leumi {

    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();

        wd.navigate().to("https://www.leumi.co.il/");
    }

    @Test
    public void test(){
        String text = wd.findElement(By.xpath("//*[@href='https://www.leumi.co.il']//span")).getText();
        System.out.println(text);
    }
}
