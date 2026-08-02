package practical;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StudentDataDrivenTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();

        options.setBinary("/usr/bin/chromium");

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void openStudentManagementSystem() {

        driver.get("http://127.0.0.1:8000/index.html");

        assertEquals("Student Management System", driver.getTitle());

        WebElement heading = driver.findElement(By.tagName("h1"));

        assertEquals("Student Management System", heading.getText());

        System.out.println("✓ Browser launched successfully.");
        System.out.println("✓ Student Management System opened successfully.");
    }

    @After
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}