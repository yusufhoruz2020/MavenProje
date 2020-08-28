package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_IlkDers {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.amazon.com");

        // amazon.com da arama kutusunu tikladik ve arama kutusuna "samsung headphones" yazdirdik
        // Keys.ENTER arama kutusuna yazdiktan sonra tikladi
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("samsung headphones"+ Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(result.getText());


        WebElement firstResult = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        System.out.println(firstResult.getText());

        List<WebElement> listem = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        listem.get(4);

        for (WebElement w : listem) {
            System.out.println(w.getText());
        }



    }
}
