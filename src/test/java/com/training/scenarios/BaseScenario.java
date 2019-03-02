package com.training.scenarios;

import com.training.interf.scenarios.Scenario;
import com.training.util.PropertyManager;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;

public class BaseScenario implements Scenario {

    public static WebDriver driver;

    @BeforeTest
    @Override
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PropertyManager.url);
    }

    @BeforeSuite
    public void loadData() {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("config.parameters.json").getFile());
        PropertyManager.loadData(file);
    }

    @AfterTest
    public void close() {
        driver.quit();
    }

}

