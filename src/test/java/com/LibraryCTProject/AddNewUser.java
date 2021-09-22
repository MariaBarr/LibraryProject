package com.LibraryCTProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddNewUser {

    public static void main(String[] args) throws InterruptedException {




       // And librarian click save changes
        //Then verify a new user is created

        //Given librarian is on the homePage
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");

        //  When librarian enter full name, password, email and address
        WebElement email = driver.findElement(By.id("inputEmail"));
        WebElement password = driver.findElement(By.id("inputPassword"));

        email.sendKeys("librarian18@library");
        password.sendKeys("Sdet2022*");

        WebElement sign = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
        sign.click();

        //When librarian click Users module
        Thread.sleep(1000);
        WebElement usersModule = driver.findElement(By.xpath("//*[@id=\"menu_item\"]/li[2]/a"));
        usersModule.click();

        // And librarian click “+Add User” button
        Thread.sleep(1000);
        WebElement addUser = driver.findElement(By.xpath("//a[@href='tpl/add-user.html']"));
        addUser.click();

        // then librarian enter full name, password, email and address
        Thread.sleep(1000);
        WebElement fullName = driver.findElement(By.name("(//input[@type='text'])[2]"));
        fullName.sendKeys("Maria Barrios");







    }
    }




