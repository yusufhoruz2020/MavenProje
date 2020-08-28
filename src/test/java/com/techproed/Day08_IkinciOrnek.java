package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_IkinciOrnek {
    // neden burada tanımladık ?
    // çünkü, diğer merhodlardan da, yani tüm merhodlardan bu nesneye erişmek istiyoruz.
    // çünkü, findElement gibi methodları ister istemez test'lerin içerisnde kullanağız.
    static WebDriver driver;
    @BeforeClass // class çalışmaya başlayınca çalışacak
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass // class çalışmayı bitirince çalışacak
    public static void tearDown(){
        driver.quit();
    }
    @Before // her test methodundan önce çalışacak
    public void testtenOnce(){
        driver.get("http://google.com");
    }
    @After // her test methodundan sonra çalışacak
    public void testtenSonra(){
        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());
    }
    @Test
    public void test1(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("elma");
        aramaKutusu.submit();
    }
    @Test
    public void test2(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("samsung kulaklık");
        aramaKutusu.submit();
    }
    @Test
    public void test3(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("çalışma sandalyesi");
        aramaKutusu.submit();
    }
}