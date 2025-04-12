package org.tjx;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mini_project17_redbus_test {


    @Description("use of various actions")
    @Test

    public void test_booking() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.id("src"));

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("pune").build().perform();

        WebElement Destination=driver.findElement(By.id("dest"));

        Actions actionss = new Actions(driver);
        actionss.moveToElement(Destination).click().sendKeys("nanded").build().perform();







    }
}

//<input placeholder="Enter airport code/city" autocapitalize="sentences" autocomplete="on" autocorrect="off" class="css-1cwyjr8 r-1yadl64 r-cqee49 r-1b43r93 r-1pi2tsx r-10paoce r-8zlnwy r-1k6034g" dir="auto" spellcheck="false" type="text" data-focusable="true" data-testid="auto-cmp-txt" value="" style="font-family: inherit;">