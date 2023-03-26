import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.get("https://techproeducation.com");//get() methodu ile adresini belittiğimiz sayfaya gideriz
        System.out.println("Sayfa Başlığı = "+driver.getTitle()); // içinde bulunduğumuz sayfanın başlığını verir
        System.out.println("Sayfa Url'i = "+driver.getCurrentUrl()); //içinde bulunduğumuz sayfanın url'i verir
        //System.out.println(driver.getPageSource());//içinde bulunduğumuz sayfanın html kodlarını verir
    }
}
