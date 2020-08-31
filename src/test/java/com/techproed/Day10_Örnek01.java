package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_Örnek01 {
    static WebDriver driver;
    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Before
    public void beforeMethod(){
        driver.get("http://www.bestbuy.com/");
 }

    @After
    public void afterMethod(){
    // driver.quit();
    }
    @Test
    public void testTitle () {
        String titleBB = driver.getTitle();
        boolean bestVarMi = titleBB.contains("Best");
        Assert.assertTrue(bestVarMi);
    }
    @Test
    public void testLogo() {
        WebElement logo = driver.findElement(By.className("logo"));
        boolean gorunuyorMu  = logo.isDisplayed();
        Assert.assertTrue(gorunuyorMu); // true false
    }
    @Test
    public void testLink () {

        /*
        <img src="https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/mexico.svg" alt="Mexico">
         */
        WebElement linkMexico = driver.findElement(By.partialLinkText("Mexico"));
        boolean linkVarMi = linkMexico.isDisplayed();
        Assert.assertTrue(linkVarMi);
    }
}
