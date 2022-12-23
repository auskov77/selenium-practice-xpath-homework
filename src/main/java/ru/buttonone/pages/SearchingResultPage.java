package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class SearchingResultPage extends BasePage {
    private final By mySearchElementOnPageDrive2Ru = By.xpath("//a[@href='https://www.drive2.ru/']");

    private final By mySearchElementOnPageAsus = By.xpath("//b[text()='asus.com']");

    public SearchingResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDrive2Element() {
        return driver.findElement(mySearchElementOnPageDrive2Ru);
    }

    public WebElement getAsusElement() {
        return driver.findElement(mySearchElementOnPageAsus);
    }
}
