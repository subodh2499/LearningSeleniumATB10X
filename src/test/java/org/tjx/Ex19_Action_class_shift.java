package org.tjx;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ex19_Action_class_shift {

    @Description("use of various actions")
    @Test

    public void test_actions(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
                driver.manage().window().maximize();

        WebElement first_name= driver.findElement(By.name("firstname"));

        Actions actions=new Actions(driver);
        actions
                .keyDown(Keys.SHIFT)
                .sendKeys(first_name,"subodh patil")
                .keyUp(Keys.SHIFT).build().perform();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));






    }
}
