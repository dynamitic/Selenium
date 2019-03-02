package com.training.pages.search;

import com.training.interf.pages.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchAction implements Action {

    public WebDriver driver;
    public SearchSelector searchSelector;

    SearchAction(WebDriver driver) {
        this.driver = driver;
        searchSelector = new SearchSelector(driver);
    }

    public void clickSearchButton() {
        searchSelector.searchButton.click();
    }

    public void searchData(String freeText) {
        searchSelector.searchData.sendKeys(freeText);
    }

    public void clickTopButton() {
        searchSelector.scrollTopButton.click();
    }

    public void goToSecondPage() {
        searchSelector.secondPageButton.click();
    }

    public String retrieveSecondItem() {

        WebElement webElement = searchSelector.resultList.get(1)
                .findElement(By.xpath("//h3[@class='productName bold']"));
        String storedSecondItemText = webElement.getText();

        webElement.click();

        return storedSecondItemText;
    }

}

