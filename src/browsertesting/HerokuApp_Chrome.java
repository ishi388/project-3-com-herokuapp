package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HerokuApp_Chrome {
    public static void main(String[] args) {

        String baseUrl = "https://the-internet.herokuapp.com/login";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        // Open the Url in browser
        driver.get(baseUrl);
        //Maximize the window
        driver.manage().window().maximize();
        // Giving implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Give the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get the current Url
        System.out.println("Current Url: " + driver.getCurrentUrl());
        // Get the page source
        System.out.println("Page Source: " + driver.getPageSource());

        //Find username field element
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        //Find password field element
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");

        driver.close();

    }
}
