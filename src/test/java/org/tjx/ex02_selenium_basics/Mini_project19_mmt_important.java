package org.tjx.ex02_selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Mini_project19_mmt_important {


    @Description("check 2nd entry to click")
    @Test

    public void test_booking() throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|RSA|673383350836&s_kwcid=AL!1631!3!673383350836!e!!g!!mmt&gad_source=1&gbraid=0AAAAAD5Az1Q597VjnfFoZnIC05b_RB-qw&gclid=Cj0KCQjwnui_BhDlARIsAEo9GuukngSH9L6Mt-9dCUpFbH8ToaGwpm_dSY8wR0gsanBaFK04MR70yw0aAh7kEALw_wcB");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WebElement model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        model.click();

        WebElement fromCity = driver.findElement(By.id("fromCity"));
        fromCity.click();


        Thread.sleep(Long.parseLong("3000"));


        Actions actions = new Actions(driver);
       actions.moveToElement(fromCity).click().sendKeys("Hyd").build().perform();

        Thread.sleep(Long.parseLong("4000"));

        WebElement second_entry=driver.findElement(By.id("react-autowhatever-1-section-0-item-3"));
        second_entry.click();

        Thread.sleep(Long.parseLong("3000"));


    }

    }







//<input placeholder="Enter airport code/city" autocapitalize="sentences" autocomplete="on" autocorrect="off" class="css-1cwyjr8 r-1yadl64 r-cqee49 r-1b43r93 r-1pi2tsx r-10paoce r-8zlnwy r-1k6034g" dir="auto" spellcheck="false" type="text" data-focusable="true" data-testid="auto-cmp-txt" value="" style="font-family: inherit;">