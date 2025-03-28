package org.tjx.ex01_selenium_;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_import_test {

    @Description("test")
    @Test

    public void TestSubodh(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://uidai.gov.in/");

        if (driver.getPageSource().contains("English")){
            System.out.println("ok woring fine");
        }
        else{
            System.out.println("there is issue subodh");
        }
        driver.quit();
    }
}
