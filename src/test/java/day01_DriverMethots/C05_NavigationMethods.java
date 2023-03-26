package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C05_NavigationMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https:/youtube.com");
        Thread.sleep(3000);
        driver.navigate().to("https:/amazon.com");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
        Thread.sleep(3000);
        driver.quit();
    }
}
