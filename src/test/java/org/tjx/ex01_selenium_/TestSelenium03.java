package org.tjx.ex01_selenium_;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description("test open the perticular website")
    @Test
    public void test_selenium03(){
        //open the required browser
        EdgeDriver driver=new EdgeDriver();
        //This post the request to open the browser

        //navigate to the website as
        driver.get("https://app.vwo.com");

        //assert the url means Validations,
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
