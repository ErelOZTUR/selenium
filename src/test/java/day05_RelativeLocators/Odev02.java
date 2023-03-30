package day05_RelativeLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Odev02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//“https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
//Username kutusuna “standard_user” yazdirin
        driver.findElement(By.xpath("//*[@class='input_error form_input']")).sendKeys("standard_user");
//Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
//Login tusuna basin
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        Thread.sleep(3000);
//Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        System.out.println(driver.findElement(By.xpath("//*[@class='inventory_item_name']")).getText());
        driver.findElement(By.xpath("//*[@class='inventory_item_name']")).click();
        Thread.sleep(3000);
//Add to Cart butonuna basin
        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
//Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();

//Sectiginiz urunun basarili olarak sepete eklendigini control edin
        String actual = driver.findElement(By.xpath("//*[@class='inventory_item_name']")).getText();
        String expected = "Sauce Labs Backpack";
        if (actual.equals(expected)) {
            System.out.println("Ürün Doğru");
        } else
            System.out.println("Ürün Yanlış");
//Sayfayi kapatin
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
