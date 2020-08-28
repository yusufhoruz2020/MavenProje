package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

// neden burada tanımladık ?
// çünkü, diğer merhodlardan da, yani tüm merhodlardan bu nesneye erişmek istiyoruz.
// çünkü, findElement gibi methodları ister istemez test'lerin içerisnde kullanağız.
public class Day08_IlkOrnek {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test1() {
        // "google.com" a gidecegim title a bakacagim, "google" kelimesi varsa testim basarili
        driver.get("http://google.com");


    try

    {
        Thread.sleep(1500);
    } catch(
    InterruptedException e)

    {
        e.printStackTrace();
    }

}
    @Test
    public void test2(){
        driver.get("http://amazon.com");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void tearDown (){
        driver.quit();

    }

    }
