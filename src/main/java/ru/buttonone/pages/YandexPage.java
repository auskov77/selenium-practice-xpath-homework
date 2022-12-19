package ru.buttonone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.buttonone.utils.Props;

public class YandexPage extends BasePage {
    private final WebElement searchField;

    public YandexPage(WebDriver driver) {
        super(driver);
        driver.navigate().to(Props.getProperty("url"));
        searchField = driver.findElement(By.xpath("//input[contains(@class, 'input')]"));
    }

    public SearchingResultDrive2Page searchByPhraseOnDrive2PageAndClickEnter(String phrase) {
        searchField.click();
        searchField.sendKeys(phrase);
        searchField.sendKeys(Keys.RETURN);
        return new SearchingResultDrive2Page(driver);
    }

    public SearchingResultAsusPage searchByPhraseOnAsusPageAndClickEnter(String phrase) {
        searchField.click();
        searchField.sendKeys(phrase);
        searchField.sendKeys(Keys.RETURN);
        return new SearchingResultAsusPage(driver);
    }


}
