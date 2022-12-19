package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class SearchingResultAsusPage extends BasePage {
    private final WebElement mySearchElementOnPageAsus
            = driver.findElement(By.xpath("//b[text()='asus.com']"));

    public SearchingResultAsusPage(WebDriver driver) {
        super(driver);
    }
}
