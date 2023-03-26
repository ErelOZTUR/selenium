package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();
        // "https://teknosa.com/" adresine gidiniz
        driver.get("https:/teknosa.com");
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        String title=driver.getTitle();
        if (title.contains("Teknoloji")){
            System.out.println("Title Testi PASSED");
        }else
            System.out.println("Title Testi FAILED");
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        String actualURL=driver.getCurrentUrl();
        if (actualURL.contains("teknosa")){
            System.out.println("URL Testi PASSED");
        }else
            System.out.println("URL Testi FAILED");
        // "https://medunna.com/" adresine gidiniz
        driver.navigate().to("https://medunna.com/");
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        String titlee=driver.getTitle();
        if (titlee.contains("Teknoloji")){
            System.out.println("Title Testi PASSED");
        }else
            System.out.println("Title Testi FAILED");
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        String actualURLL=driver.getCurrentUrl();
        if (actualURLL.contains("teknosa")){
            System.out.println("URL Testi PASSED");
        }else
            System.out.println("URL Testi FAILED");
        // teknosa adresine geri donunuz
        driver.navigate().back();
        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        // pencereyi kapat
        driver.close();
       // String URLmedunna = isContainsmedunna ? "Medunna URL 'medunna' iceriyor" : "Medunna URL 'medunna' icermiyor";
    }
}
