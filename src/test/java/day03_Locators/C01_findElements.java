package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_findElements {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Amazon sayfasında kaç tane link olduğunu konsolda yazdıralım?
        driver.get("https:/amazon.com");
        List<WebElement> linklerListesi  =driver.findElements(By.tagName("a"));
        System.out.println("linklerin Sayısı = " + linklerListesi.size());

        for (WebElement w:linklerListesi){
            System.out.println(w.getText());
        }
    }
}
