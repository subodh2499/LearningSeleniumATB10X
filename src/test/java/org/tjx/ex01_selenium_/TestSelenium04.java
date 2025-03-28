package org.tjx.ex01_selenium_;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {
    @Description("test open google")
    @Test
    public void TestSelenium04(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
