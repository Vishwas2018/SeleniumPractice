package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.example.base.BaseTest;
import org.example.pageobjects.GoogleSearchPage;
import org.example.utilities.ExtentReportManager;
import org.example.utilities.TestDataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;


@Test(dataProvider = "Data", dataProviderClass = TestDataProvider.class)
public class GoogleTest extends BaseTest {

    public static void firstTest(Hashtable<String, String> dataTable) {
        webDriver.navigate().to("https://google.com.au");

        System.out.println("user dir: " + System.getProperty("user.dir"));

        ExtentReports extentReports = ExtentReportManager.getExtentReport();
        ExtentTest extentTest = extentReports.createTest("Google Test");
        extentTest.log(Status.PASS, "Google page displayed");

        System.out.println("The username is: " + dataTable.get("UserName"));
        System.out.println("The password is: " + dataTable.get("Password"));

        GoogleSearchPage googleSearchPage = new GoogleSearchPage();

        GoogleSearchPage.searchText(webDriver, dataTable.get("UserName"));

        System.out.println("The extent test is: " + extentReports.toString());

        extentReports.flush();

    }

}
