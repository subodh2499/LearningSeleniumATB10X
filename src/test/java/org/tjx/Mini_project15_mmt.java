package org.tjx;

import io.qameta.allure.Description;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Mini_project15_mmt {

    @Description("verify the cross sign to click by waiting")
    @Test

    public void make_my_trip(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.makemytrip.com/");

      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        WebElement close = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
                      close.click();

                      driver.quit();
    }
}
