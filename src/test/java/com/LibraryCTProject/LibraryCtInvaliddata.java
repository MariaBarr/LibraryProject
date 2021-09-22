package com.LibraryCTProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryCtInvaliddata {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");


        WebElement username = driver.findElement(By.id("inputEmail"));
        WebElement password = driver.findElement(By.id("inputPassword"));
        username.sendKeys("student107@library");
        password.sendKeys("hgfdk");

        WebElement sign = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
        sign.click();
    Thread.sleep(5000);

        driver.quit();




    }
}
