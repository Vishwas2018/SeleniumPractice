package org.example;

import org.example.base.BaseTest;
import org.testng.annotations.Test;

@Test
public class InstagreamTest extends BaseTest {
    public static void firstTest() {
        webDriver.navigate().to("https://instagram.com");
    }

}
