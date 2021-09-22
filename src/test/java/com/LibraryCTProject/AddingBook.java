package com.LibraryCTProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddingBook {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");


          //  Given librarian is on the homePage



        WebElement email = driver.findElement(By.id("inputEmail"));
        email.sendKeys("librarian18@library");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*");
        password.sendKeys(Keys.ENTER);

        // When librarian click Books module
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
       List< WebElement> hey = driver.findElements(By.className("title"));
       hey.get(2).click();

       //And Librarian click "+Add Book" button
        Thread.sleep(800);
        WebElement entry= driver.findElement(By.className("bg-light"));
        String entryText= entry.getText();
        System.out.println(entryText);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement addBook  = driver.findElement(By.linkText("Add Book"));
        addBook.click();

        //  When librarian enter BookName, ISBN, Year, Author, and Description
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("random book");
        WebElement isbn = driver.findElement(By.name("isbn"));
        isbn.sendKeys("123458787");
        WebElement year = driver.findElement(By.name("year"));
        year.sendKeys("1999");
        WebElement author = driver.findElement(By.xpath("//*[@id=\"add_book_form\"]/div[1]/div/div[2]/div[1]/div/input"));
        author.sendKeys("Bacth23");
        WebElement description = driver.findElement(By.xpath("//*[@id=\"description\"]"));
        description.sendKeys("jdkjsfksaksjn");

        //   And librarian click save changes

        WebElement save = driver.findElement(By.xpath("//*[@id=\"add_book_form\"]/div[2]/button[2]"));
        save.submit();

        //   Then verify a new book is added
        WebElement entry1= driver.findElement(By.id("tbl_books_info"));
        String entry1Text = entry1.getText();
        System.out.println(entry1Text);
        if(!entryText.equals(entry1Text)) {
            System.out.println("Test passed");
            System.out.println("Since we added a new book he count of th entries has been increased as result");
        }else{
            System.out.println("Test Failed");
        }driver.quit();











    }
}
