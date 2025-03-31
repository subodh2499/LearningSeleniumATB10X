package org.tjx.ex01_selenium_;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium11__Partial_match {

    //<a
    // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
    // class="text-link"
    // data-qa="bericafeqo">
    // Start a free trial
    // </a>

    @Description("test for link")
    @Test

    public void test_for_link() throws Exception{

        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        WebElement a_tag_free_trial_full_match= driver.findElement(By.partialLinkText("free"));
        a_tag_free_trial_full_match.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
