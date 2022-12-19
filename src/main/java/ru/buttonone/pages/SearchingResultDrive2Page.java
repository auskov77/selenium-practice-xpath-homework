package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class SearchingResultDrive2Page extends BasePage {
    private final WebElement mySearchElementOnPageDrive2Ru
            = driver.findElement(By.xpath("//a[@href='https://www.drive2.ru/']"));

    public SearchingResultDrive2Page(WebDriver driver) {
        super(driver);
    }
}
