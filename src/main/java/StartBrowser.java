import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://yandex.ru/games/");
        driver.close();
    }

}
