package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C03_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        //System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        //amazon sayfasına gidelim
        driver.get("https://amazon.com");
        Thread.sleep(3000); // Java kodlarını bekletmek için kullanırız
        //Sonra techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com"); //get() methodu ile aynı şekilde çalışır
        //techpro sayfa başlığını konsola yazdıralım
        System.out.println("Sayfa başlığı: "+driver.getTitle());
        //tekrar amazon sayfasına geri dönelim
        driver.navigate().back();//ilk sayfaya döner
        Thread.sleep(3000);
        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Sayfa Baslığı: "+driver.getTitle());
        //tekrar techproeducation sayfasına geri gidelim
        driver.navigate().forward();
        //son olarak sayfayı yenileyelim ve sayfayo kapatalım
        driver.navigate().refresh();
        driver.close();
        //NOT: sayfalar arası geçişler hızlı olacağından 3 saniye geçişler için bekletelim
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
