package com.training.pages.search;

import com.training.interf.pages.Check;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchCheck implements Check {

    public WebDriver driver;
    public SearchSelector searchSelector;

    SearchCheck(WebDriver driver) {
        this.driver = driver;
        searchSelector = new SearchSelector(driver);

    }

    public boolean checkResultText(String checkText) {
        String pageHeader = searchSelector.resultText.getText();

        if (pageHeader.contains(checkText))
            return true;
        return false;

    }

    public boolean checkItemText(String itemText) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(searchSelector.selectedItemHeader));
        String selectedItemText = searchSelector.selectedItemHeader.getText();
        if (selectedItemText.equals(itemText))
            return true;
        return false;

    }
}
