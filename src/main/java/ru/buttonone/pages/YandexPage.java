package ru.buttonone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static ru.buttonone.constants.UrlYandexRu.HTTPS_YA_RU;

public class YandexPage extends BasePage {
    private final WebElement searchField;

    public YandexPage() {
        driver.navigate().to(HTTPS_YA_RU);
        searchField = driver.findElement(By.xpath("//input[contains(@class, 'input')]"));
    }

    public SearchingResultPage searchByPhraseAndClickEnter(String phrase) {
        searchField.click();
        searchField.sendKeys(phrase);
        searchField.sendKeys(Keys.RETURN);
        return new SearchingResultPage();
    }
}
