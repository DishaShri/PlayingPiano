import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaySaveYourTears {
    public static void main(String[] args) {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://virtualpiano.net/");
        driver.quit();
    }
}
