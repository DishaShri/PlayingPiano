package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyboardKeys {
    private static WebElement element = null;

    public static WebElement key_p(WebDriver driver) {
        try {
            element = driver.findElement(By.id("key_57"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement key_s(WebDriver driver) {
        try {
            element = driver.findElement(By.id("key_60"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement key_a(WebDriver driver) {
        try {
            element = driver.findElement(By.id("key_59"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement key_d(WebDriver driver) {
        try {
            element = driver.findElement(By.id("key_62"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement key_0(WebDriver driver) {
        try {
            element = driver.findElement(By.id("key_55"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement key_f(WebDriver driver) {
        try {
            element = driver.findElement(By.id("key_64"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement key_g(WebDriver driver) {
        try {
            element = driver.findElement(By.id("key_65"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }
}
