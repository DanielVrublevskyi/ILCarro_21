package com.ilcarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class OpenHomePageTests {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {

        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

    }
    @Test
    public void homePageTest(){
        System.out.println("site is opened");

//        wd.findElement(By.cssSelector("h2"));
        System.out.println("Find Car Form: " + isFindCarFormPresent());
        isFindCarFormPresent2();
    }

    public boolean isFindCarFormPresent(){
        return wd.findElements(By.cssSelector("h2")).size()>0;
    }

    public boolean isFindCarFormPresent2(){
        try{
            wd.findElement(By.cssSelector("h2"));
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        wd.quit();
    }
}
