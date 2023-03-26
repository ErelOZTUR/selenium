import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01___Xpath {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basın
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        //Delete butonunu görünür olduğunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
       if (deleteButonu.isDisplayed()){   //Bir web elementin görünür olup olmadığını isDisplayed() methodu ile bakarız
           System.out.println("Test PASSED");
       }else
           System.out.println("Test FAILED");
        //Delete butonuna basın
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        deleteButonu.click();
        //"Add/Remove Elements" yazısının görünür olduğunu test edin

        WebElement addRemoveElementYazisi=driver.findElement(By.xpath("//h3"));
        if (addRemoveElementYazisi.isDisplayed()){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test FAILED");
        driver.close();
    }
}
