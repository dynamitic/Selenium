package com.training.util.ExtentReports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Parameters;

public class ExtentManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtentReports/ExtentReportResults.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        return extent;
    }
}
