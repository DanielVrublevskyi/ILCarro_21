package com.ilcarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver wd;

    @BeforeMethod
    public void setUp() {

        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

    }

    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }

    public boolean isFindCarFormPresent(){
        return isElementPresent(By.cssSelector("h2"));
    }

    public boolean isFindCarFormPresent2(){
        try{
            wd.findElement(By.cssSelector("h2"));
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public  boolean isFindCarFormPresent3(){
       return isElementPresent3(By.cssSelector("h2"));
    }

    public boolean isElementPresent3(By l){
        try{
            wd.findElement(l);
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
