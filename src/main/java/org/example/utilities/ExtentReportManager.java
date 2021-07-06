package org.example.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

    public static ExtentReports getExtentReport() {
        final String reportPath = "./ExtentReports/ExtentReport.html";
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(reportPath);
        ExtentReports extentReports = new ExtentReports();

        extentReports.setSystemInfo("OS Name", System.getProperty("os.name"));
//        extentReports.setSystemInfo("Browser", System.getProperty("browser"));

        extentSparkReporter.config().setDocumentTitle("Selenium practice test report");
        extentSparkReporter.config().setReportName("Google test");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setTimeStampFormat("MM dd, yyyy HH:mm:ss");
        extentReports.attachReporter(extentSparkReporter);

        return extentReports;
    }
}
