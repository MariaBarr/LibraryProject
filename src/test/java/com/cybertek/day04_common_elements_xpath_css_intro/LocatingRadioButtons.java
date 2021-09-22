package com.cybertek.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingRadioButtons {

    public static void main(String[] args) {

        // open chrome navigate here http://practice.cybertekschool.com/radiobuttons

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

      // locate the blue buttom

        WebElement blueRadio = driver.findElement(By.id(""));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());


    }
}
