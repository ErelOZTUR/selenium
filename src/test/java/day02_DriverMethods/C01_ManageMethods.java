package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver","src/resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        System.out.println("Sayfa Konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları: "+driver.manage().window().getSize());
        driver.manage().window().maximize();//acilan browser'i maximize yapar.
        driver.get("https://techproeducation.com");
        System.out.println("Sayfa Konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları: "+driver.manage().window().getSize());
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Sayfa Konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları: "+driver.manage().window().getSize());

    }
}
