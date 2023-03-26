package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C03_WebelementLocators {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Bir class oluşturun : AmazonSearchTest
        //Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Search(ara) “city bike”
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
      List<WebElement>sonucYazısı=   driver.findElements(By.className("sg-col-inner"));
        System.out.println("sonucYazısı.get(0).getText() = " + sonucYazısı.get(0).getText());
        //Sadece sonuc sayısını yazdıralım
        String soonucSayisi=sonucYazısı.get(0).getText().split(" ")[2];
        System.out.println("soonucSayisi = " + soonucSayisi);
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkSonuc= driver.findElements(By.className("s-image"));
        ilkSonuc.get(0).click();


    }
}
