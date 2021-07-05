package com.ilcarro;

import org.testng.annotations.Test;

public class OpenHomePageTests extends TestBase{

    @Test
    public void homePageTest(){
        System.out.println("site is opened");

//        wd.findElement(By.cssSelector("h2"));
        System.out.println("Find Car Form: " + isFindCarFormPresent());
        isFindCarFormPresent2();
    }


}
