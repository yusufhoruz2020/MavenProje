package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_tekrar {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        // amazon.com a gittik
        driver.get("http://www.amazon.com");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='nav-input']"));
        aramaKutusu.sendKeys("laptop"+ Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("//span[@dir='auto']"));
        result.getText();

        // ilk cikan sonuca tikladik
        WebElement ilkSonuc = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        ilkSonuc.getText();

        // list kullanarak tüm sonuclari aliyoruz
        List<WebElement> tumsonuclar = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        // for each kullanarak tüm sonuclari yazdiriyoruz
        for(WebElement w : tumsonuclar ) {
            System.out.println(w.getText());

        }

        driver.quit();



    }
}
