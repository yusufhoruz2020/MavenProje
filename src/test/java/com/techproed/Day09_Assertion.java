package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Assertion {


    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1() {
        driver.get("http://google.com");
        // Test Case : Google.com'un başlığı "Google Arama Sayfası" olsun.
        String title = driver.getTitle();
        // Google'ın title'ı "Google Arama Sayfası"na eşit mi, değil mi ?
        Assert.assertEquals("Google Arama Sayfası", title);
        //Assert.assertEquals(5,5);
        //Assert.assertEquals(true,false);
        //Assert.assertEquals("Yazı","Google");
    }

    @Test
    public void test2() {
        driver.get("http://amazon.com");
        // Amazon.com'un başlığı Amazon kelimesini içeriyor olsun.
        String title = driver.getTitle();
        boolean iceriyorMu = title.contains("Amazon"); // "true" ya da "false"
        // boolean veri tipinde bir değer giriyoruz.
        Assert.assertTrue(iceriyorMu); //bunun true oldugunu dogrula
    }

    @Test
    public void test3(){
        driver.get("http://facebook.com");
        String title = driver.getTitle();

        //Facebook.com' un title' i Youtube kelimesi icermesin
        boolean iceriyorMu = title.contains("Youtube");
        Assert.assertFalse(iceriyorMu); // false oldugunu dogrula.
    }

    @Test
    public void test4(){
        driver.get("http://google.com");
        // Test Case : Google.com'un başlığı "Google Arama Sayfası" olsun.
        String title = driver.getTitle();
        System.out.println("Merhabalar");
        // Google'ın title'ı "Google Arama Sayfası"na eşit mi, değil mi ?
        Assert.assertEquals("Google Arama Sayfası", title);
        //Assert.assertEquals(5,5);
        //Assert.assertEquals(true,false);
        //Assert.assertEquals("Yazı","Google");
        // eger test basarisizsa testin kalan kismi calismaz
        System.out.println("Test dogrulama islemi bitti");

    }
    @Test
    public void test5(){
        driver.get("http://google.com");
        // Test Case : Google.com'un başlığı "Google Arama Sayfası" olsun.
        String title = driver.getTitle();
        System.out.println("Merhabalar");
        // Google'ın title'ı "Google Arama Sayfası"na eşit mi, değil mi ?
        Assert.assertEquals("Google Arama Sayfası", title);
        //Assert.assertEquals(5,5);
        //Assert.assertEquals(true,false);
        //Assert.assertEquals("Yazı","Google");
        // eger test basariliysa testin kalan kismi calisir
        System.out.println("Test dogrulama islemi bitti");

    }



    @AfterClass
    public static void tearDown() {
        //driver.quit();
    }
}
