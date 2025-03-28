package org.tjx.ex01_selenium_;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium07_Options_class {

    @Description("test_options_class")
    @Test

    public void TestOptionsClass(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--InPrivate");

        EdgeDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://google.com/");

        driver.close();


    }
}
  //<input type="email"
// class="text-input W(100%)"
// name="username"
// id="login-username"
// data-qa="hocewoqisi" fdprocessedid="mm3siz">