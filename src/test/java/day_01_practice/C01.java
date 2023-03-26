package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();
        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https:/amazon.com");
        // "https://www.n11.com/" adresine gidiniz.
        driver.navigate().to("https:/n11.com");
        // amazon adresine geri donunuz
        driver.navigate().back();
        // n11 adresine ilerleyiniz
        driver.navigate().forward();
        // sayfayi yenileyiniz
        driver.navigate().refresh();
        // pencereyi kapat
        driver.close();
        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("Everything is OK");
    }
}
