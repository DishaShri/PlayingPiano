import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import music_sheets.SaveYourTears;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlaySaveYourTears {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://virtualpiano.net/");
        driver.manage().window().maximize();

        Thread.sleep(15000);
        Actions action = new Actions(driver);
        try {
            SaveYourTears saveYourTears = new SaveYourTears();
            saveYourTears.getMusicSheet().forEach((key, value) -> {
                System.out.println(key + ": " + value);
                value.forEach((it) -> {
                    if (saveYourTears.getNotesWithMethodNames().containsKey(it)) {
                        action.moveToElement(driver.findElement(By.id(saveYourTears.getNotesWithMethodNames().get(it))))
                                .click().perform();
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage() + "\n" + e);
        }

        driver.quit();
    }
}
