package org.example;

import org.example.base.BaseTest;
import org.testng.annotations.Test;

@Test
public class FacebookTest extends BaseTest {
    public static void firstTest() {
        webDriver.navigate().to("https://facebook.com");
    }

}
