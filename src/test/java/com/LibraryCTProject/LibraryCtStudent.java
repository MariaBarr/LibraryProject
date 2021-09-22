package com.LibraryCTProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.Element;
import java.util.List;

public class LibraryCtStudent {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");


        WebElement username = driver.findElement(By.id("inputEmail"));
        WebElement password = driver.findElement(By.id("inputPassword"));
        username.sendKeys("student108@library");
        password.sendKeys("Sdet2022*");
        Thread.sleep(5000);


        WebElement sign = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
        sign.click();
        Thread.sleep(5000);

        List<WebElement> List = driver.findElements(By.xpath("//*[@id=\"menu_item\"]/li[2]/a/span[1]"));
        System.out.println(List.size());

        if (List.size() == 2) {
            System.out.println("Test has been passed. There are 2 modules on the page.");
        } else {
            System.out.println("Test has been failed.");


            driver.quit();

        }
    }
}











