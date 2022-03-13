package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/*
   In this class only general utility methods that are not related to some specific page.
    */

import java.util.Set;

public class BrowserUtils {
     /*
   This method will accept int(int seconds) and execute Thread.sleep for given duration
    */

    public static void sleep(int second){
        second*=1000;

        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }
    /*
       This method accepts 3 arguments.
       Arg1: webdriver
       Arg2: expectedInUrl : for verify if the url contains given String.
           - If condition matches, will break loop.
       Arg3: expectedInTitle to be compared against actualTitle
        */
    public static void switchWindowAndVerify(String expectedInURL, String expectedInTitle){
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: "+ Driver.getDriver().getCurrentUrl());
            if(Driver.getDriver().getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }
        //5. Assert: Title contains “Etsy”
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    //this method accepts a String "expectedTitle" and Assert if it is true
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

}
