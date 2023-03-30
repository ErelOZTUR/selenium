package day05_RelativeLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;

public class Odev01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1-C01_TekrarTesti isimli bir class
        //olusturun
        // 2- https://www.google.com/
        //adresine gidin
        driver.get("https://www.google.com/");
        // 3- cookies uyarisini
        //kabul ederek kapatin

        //4. Sayfa basliginin “Google” ifadesi icerdigini test
        //edin
        String baslik = driver.getTitle();
        System.out.println(baslik);
        if (baslik.equals("Google")) {
            System.out.println("İÇERİYOR");

        } else
            System.out.println("İÇERMİYOR");
        //5. Arama cubuguna “Nutella” yazip aratin
        WebElement arama = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        arama.sendKeys("Nutella", Keys.ENTER);
        //    WebElement aramaD=driver.findElement(By.xpath("//*[text()='Nutella® Türkiye: Homepage']"));
        // aramaD.click();
        //6. Bulunan sonuc sayisini yazdirin
        System.out.println("****");
        WebElement sonuc = driver.findElement(By.xpath("//*[@id='result-stats']"));
        System.out.println(sonuc.getText());
        //7. sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        System.out.println("********");
        Arrays.stream(sonuc.getText().split(" ")).limit(3).skip(1).forEach(System.out::println);
        System.out.println("****");
        String[] sON = sonuc.getText().split(" ");
        System.out.println(sON[1]);
        String a = sON[1];
        a = a.replace(".", "");
        System.out.println(a);
        int b = Integer.parseInt(a);

        System.out.println(b);
        if (b > 10000000) {
            System.out.println("OK");
        } else
            System.out.println("OK DEĞİL");
        //8. Sayfayi kapatin
        driver.close();
    }
}
