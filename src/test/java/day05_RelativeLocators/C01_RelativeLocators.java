package day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {
    public static void main(String[] args) {
        /*
 RELATIVE LOCATOR
    Bir Web sayfasinda benzer özelliklere sahip webelementlerin olduğu durumlarda kullanılabilir.
    1) above --> Belirtilen elementin ustunde olan elementi secer.
    2) below --> Belirtilen elementin altinda olan elementi secer.
    3) to_left_of --> Belirtilen elementin solunda olan elementi secer.
    4) to_right_of --> Belirtilen elementin saginda olan elementi secer.
    5) near --> Belirtilen elementin yaninda olan elementi secer.
 */
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //city bike aratalım
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);

        //Hybrid Bikes bölümüne tıklayalım
        WebElement hybridBike=driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement roadBikes=driver.findElement(with(By.tagName("a")).below(hybridBike));
        roadBikes.click();
        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım
    }
}
