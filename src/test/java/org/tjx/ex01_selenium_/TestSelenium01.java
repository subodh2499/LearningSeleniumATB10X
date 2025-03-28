package org.tjx.ex01_selenium_;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {


        //write code which basically performs the UI interactions
        @Test
        public void Test_verify_login(){
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://app.vwo.com");
            System.out.println(driver.getTitle());
            driver.close();
        }
    }

