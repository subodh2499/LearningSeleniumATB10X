package org.tjx.ex01_selenium_;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {

    //write code which basically performs the UI interactions
    @Test
    public void Test_verify_login() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}

