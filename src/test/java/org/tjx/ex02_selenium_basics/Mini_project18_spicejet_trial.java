package org.tjx.ex02_selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Mini_project18_spicejet_trial {

    @Test
    public void test_actions() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div/div[1]/div/div[1]/input"));

        Actions actions = new Actions(driver);
        //move to element
        // click
        // send keys - BLR , DEL, MOM, CHN , CDG , HYD


        actions.moveToElement(source).click().sendKeys("BLR").build().perform();
    }

}


