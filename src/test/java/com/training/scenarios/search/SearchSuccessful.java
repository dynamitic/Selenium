package com.training.scenarios.search;

import com.training.pages.search.SearchPage;
import com.training.scenarios.BaseScenario;
import com.training.util.PropertyManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchSuccessful extends BaseScenario {

    @Test
    public void search() {

        SearchPage searchPage = new SearchPage(driver);

        searchPage.searchAction.searchData(PropertyManager.searchText);
        searchPage.searchAction.clickSearchButton();
        Assert.assertTrue(searchPage.searchCheck.checkResultText(PropertyManager.searchText));
        searchPage.searchAction.goToSecondPage();
        Assert.assertTrue(searchPage.searchCheck.checkItemText(searchPage.searchAction.retrieveSecondItem()));
    }
}