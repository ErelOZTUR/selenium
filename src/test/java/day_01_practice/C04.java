package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // Kaynak Kodlarini konsola yazdiriniz
        System.out.println(driver.getPageSource());
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        String resources=driver.getPageSource();
        if (resources.contains("Gateway")){
            System.out.println("Resources Testi PASSED");

        }else
            System.out.println("Resources Testi FAILED");
        // sayfayi kapatiniz
        driver.close();
    }
}
