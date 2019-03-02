package com.training.pages.search;

import com.training.interf.pages.Selector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public final class SearchSelector implements Selector {

    public SearchSelector(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "searchData")
    public WebElement searchData;

    @FindBy(css = "span.icon.iconSearch")
    public WebElement searchButton;

    @FindBy(css = "#contentListing > div > div > div.productArea > section.group.listingGroup.resultListGroup > div.header > div.resultText")
    public WebElement resultText;

    @FindBy(id = "btnScrollTop")
    public WebElement scrollTopButton;

    @FindBy(css = "div.pagination > a:nth-of-type(2)")
    public WebElement secondPageButton;

    @FindBy(xpath = ".//*[starts-with(@class, 'column ')]")
    public List<WebElement> resultList;

    @FindBy(css = "h1.proName")
    public WebElement selectedItemHeader;
}
