package com.training.pages.search;

import com.training.interf.pages.Page;
import org.openqa.selenium.WebDriver;

public class SearchPage implements Page {
    public WebDriver driver;
    public SearchCheck searchCheck;
    public SearchAction searchAction;

    public SearchPage(WebDriver driver){

        this.driver = driver;
        searchCheck = new SearchCheck(driver);
        searchAction = new SearchAction(driver);
    }
}
