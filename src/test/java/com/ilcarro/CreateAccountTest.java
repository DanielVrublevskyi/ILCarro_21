package com.ilcarro;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions(){
//
        if (!isElementPresent(By.cssSelector("[href='/signup']"))){
            wd.findElement(By.xpath("//a[contains(.,'logOut')]")).click();
        }
    }


    @Test
    public void signUpTest(){
        wd.findElement(By.cssSelector("[href='/signup']")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));



        wd.findElement(By.cssSelector("#first_name")).click();
        wd.findElement(By.cssSelector("#first_name")).clear();
        wd.findElement(By.cssSelector("#first_name")).sendKeys("Vv");

        wd.findElement(By.cssSelector("#second_name")).click();
        wd.findElement(By.cssSelector("#second_name")).clear();
        wd.findElement(By.cssSelector("#second_name")).sendKeys("Vv");

        wd.findElement(By.cssSelector("#email")).click();
        wd.findElement(By.cssSelector("#email")).clear();
        wd.findElement(By.cssSelector("#email")).sendKeys("Vv@vv.com");

        wd.findElement(By.cssSelector("#password")).click();
        wd.findElement(By.cssSelector("#password")).clear();
        wd.findElement(By.cssSelector("#password")).sendKeys("Vv12345678");

        wd.findElement(By.cssSelector("#check_policy")).click();
    }

}
