package com.ilcarro;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{

    @Test
//    public void searchButtonTest(){
//        wd.findElement(By.cssSelector("[class='header__nav desktop'] [href='/search']")).click();
//        Assert.assertTrue(isElementPresent3(By.cssSelector("[class='search-sidebar__inner']")));
//    }

//    public void ltcwButtonTest(){
//        wd.findElement(By.cssSelector("[class='header__nav desktop'] [href='/car']")).click();
//        Assert.assertTrue(isElementPresent3(By.cssSelector("h3")));
//    }

//    public void termsButtonTest(){
//        wd.findElement(By.cssSelector("[class='header__nav desktop'] [href='/terms']")).click();
//        Assert.assertTrue(isElementPresent3(By.cssSelector("h1")));
//    }

//    public void signUpButtonTest(){
//        wd.findElement(By.cssSelector("[href='/signup']")).click();
//        Assert.assertTrue(isElementPresent3(By.cssSelector("h2")));
//    }

    public void logInButtonTest(){
        wd.findElement(By.cssSelector("[href='/login']")).click();
        Assert.assertTrue(isElementPresent3(By.cssSelector("h2")));
    }
}
