package ru.buttonone.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static ru.buttonone.constants.SomeConstants.HTTPS_YA_RU;
import static ru.buttonone.constants.XpathConstants.SEARCH_FIELD;

public class YandexPage extends BasePage{
    private final WebElement searchField;

    public YandexPage(){
        driver.navigate().to(HTTPS_YA_RU);
        searchField = driver.findElement(SEARCH_FIELD);
    }

    public SearchingResultPage searchByPhraseAndClickEnter(String phrase){
        searchField.click();
        searchField.sendKeys(phrase);
        searchField.sendKeys(Keys.RETURN);
        return new SearchingResultPage();
    }

}
