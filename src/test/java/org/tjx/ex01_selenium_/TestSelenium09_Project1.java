package org.tjx.ex01_selenium_;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestSelenium09_Project1 {

    @Description("project to open website and verify error message")
    @Test

    public void TestWebsite()throws Exception {
        WebDriver driver= new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        //Now picture starts, we need to find the elements of html so,

        //first box is-email address- find its elements as below
        //<input type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username" ....................to use here
        // data-qa="hocewoqisi"
        // fdprocessedid="mm3siz">

        //as per rules we need to use ID first

        WebElement emailinputBox=driver.findElement(By.id("login-username"));
        emailinputBox.sendKeys("subodh@mailinator.com");

        //now for password fields, find the elements same as per above one, where we get the id again But if ID not found then need to take name hence
        //we are using name now.
        //<input type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // fdprocessedid="9iujg3">

        WebElement passwordfield=driver.findElement(By.name("password"));
        passwordfield.sendKeys("subodh");

        //last for click sign in,
        //<button type="submit"
        // id="js-login-btn"
        // class="btn btn--positive
        // btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)"
        // data-qa="sibequkica" fdprocessedid="skh27a">

        //we will take id only
        WebElement Signin=driver.findElement(By.id("js-login-btn"));
        Signin.click();

        Thread.sleep(3000);

        //now for error message..
        //<div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");


        driver.quit();


    }
}
