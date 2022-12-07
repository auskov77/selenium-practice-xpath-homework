package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Getter
public class SearchingResultPage extends BasePage {
    private final WebElement mySearchElementOnPage
            = driver.findElement(By.xpath("//a[@href='https://www.drive2.ru/']"));
}
