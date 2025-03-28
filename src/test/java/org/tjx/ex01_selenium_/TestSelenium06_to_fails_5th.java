package org.tjx.ex01_selenium_;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSelenium06_to_fails_5th {

    @Description("Verify the Header on website")
        @Test
    public void verify_page_header(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if(driver.getPageSource().contains("subodh")){
            System.out.println("Banner is visible");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("no banner visible");
            Assert.assertFalse(false);
        }
        driver.quit();

        }

}
