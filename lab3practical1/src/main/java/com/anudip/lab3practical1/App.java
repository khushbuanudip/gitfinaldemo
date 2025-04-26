package com.anudip.lab3practical1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

          System.out.println("git demo");
        // Locate search box using Name locator
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

  

    }
}
