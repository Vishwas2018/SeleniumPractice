package org.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    public static void searchText(WebDriver driver, String searchTextInput) {
        WebElement searchTextBox = driver.findElement(By.xpath(".//input[@aria-label='Search']"));
        searchTextBox.sendKeys(searchTextInput);
        searchTextBox.sendKeys(Keys.ENTER);
    }
}
