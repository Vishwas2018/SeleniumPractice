package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver");
        webDriver = new ChromeDriver();
    }

//    @AfterClass
//    public void tearDown() {
//        webDriver.close();
//    }

}
