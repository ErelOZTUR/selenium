package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C07 {
    public static void main(String[] args) throws InterruptedException {
        // https://www.amazon.com/ adresine gidin
        // arama motorunda nutella yazip aratınız
        // sayfada kac tane link oldugunu bulunuz
        // linkleri yazdiriniz
        // pencereyi kapatiniz
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
       WebElement arama= driver.findElement(By.id("twotabsearchtextbox"));
       arama.sendKeys("Nutella", Keys.ENTER);
        // sayfada kac tane link oldugunu bulunuz
List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println(linklerListesi.size());
        // linkleri yazdiriniz
        int sayac=1;

        for (WebElement each:linklerListesi) {
            System.out.println(sayac + ".link" + each.getText());
            sayac++;
        }
        driver.close();
    }
}
