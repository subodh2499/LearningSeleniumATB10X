package org.tjx.ex01_selenium_;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestSelenium11_linkText {

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

        WebElement a_tag_free_trial_full_match= driver.findElement(By.linkText("Start a free trial"));
        a_tag_free_trial_full_match.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
