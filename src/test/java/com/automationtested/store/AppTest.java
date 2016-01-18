package com.automationtested.store;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AppTest {

    @Test
    public static void Login() throws InterruptedException {

        System.out.println("Test started!");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        //Manually move window to to secondary screen for demo!
        Thread.sleep(5000);

        driver.navigate().to("http://store1.automationtested.com/");

        //Sleep statements were added to visually slow the automation for demonstration purposes.
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Log in")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("tonystark@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("Password123");
        Thread.sleep(2000);


        //Using the class name does not find the element.
        //driver.findElement(By.className("button-1 login-button")).click();

        //Click on the "LOG IN" button.
        driver.findElement(By.cssSelector(".button-1.login-button")).click();

        Thread.sleep(2000);


        driver.findElement(By.partialLinkText("Log out")).click();
        Thread.sleep(2000);

        System.out.println("Login test passed.");

        //Close the active session and FireFox browser currently in use.
        driver.close();

        //Closes all windows opened by WebDriver.
        driver.quit();
    }
}