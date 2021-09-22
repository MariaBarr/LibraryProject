package com.LibraryCTProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LibraryCtLibrarianLoginSuccessfully {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");

        // login with first credential
        //Given librarian is on the loginPage
        //Then verify that the title is “Login - Library”
        //When librarian enters valid email address and password
        //And librarian click sign in button
        //Then verify that there are 3 models on the page

        WebElement username = driver.findElement(By.id("inputEmail"));
        WebElement password = driver.findElement(By.id("inputPassword"));
        username.sendKeys("librarian52@library");
        password.sendKeys("Sdet2022*");


        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(5000);

            List<WebElement> list = driver.findElements(By.xpath("//li[@class='nav-item']"));
            System.out.println(list.size());


            if (list.size() == 3) {
                System.out.println("Test has been passed. There are 3 modules on the page.");
            } else {
                System.out.println("Test has been failed.");
            }


            driver.quit();

           }
           }

