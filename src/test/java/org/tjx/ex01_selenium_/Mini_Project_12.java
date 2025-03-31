package org.tjx.ex01_selenium_;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Mini_Project_12 {

    @Description
    @Test

    public void Mini_project()throws Exception{

        WebDriver driver= new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
                driver.manage().window().maximize();

        WebElement verify_error= driver.findElement(By.partialLinkText("trial"));
        verify_error.click();

        Thread.sleep(4000);
        //<input class="W(100%) Py(14px) input-text"
        // placeholder="name@yourcompany.com"
        // type="email"
        // id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email"
        // required="" fdprocessedid="pe2u4o">

      WebElement email_box=driver.findElement(By.id("page-v1-step1-email"));
      email_box.sendKeys("spl95");

      Thread.sleep(4000);



        //<input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox"
        // name="gdpr_consent_checkbox"
        // id="page-free-trial-step1-cu-gdpr-consent-checkbox"
        // value="true" data-qa="page-free-trial-step1-gdpr-consent-checkbox">

        WebElement checkbox=driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox.click();

        Thread.sleep(4000);

        //<button type="submit"
        // class="button W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit">Create a Free Trial Account</button>

        List<WebElement> button_list= driver.findElements(By.tagName("button"));
        button_list.get(0).click();

        Thread.sleep(5000);

        //<div class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">The email address you entered is incorrect.</div>

        WebElement Verify_final_error= driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(Verify_final_error.getText(),"The email address you entered is incorrect.");

        driver.quit();
    }
}
