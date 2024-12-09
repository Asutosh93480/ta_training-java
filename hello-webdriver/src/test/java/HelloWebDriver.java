import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWebDriver {
    public static void main (String [] args) throws InterruptedException {
        WebDriver web = new ChromeDriver();
        web.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        web.quit();

        web = new EdgeDriver();
        web.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        web.quit();

        web = new FirefoxDriver();
        web.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        web.quit();
    }
}
