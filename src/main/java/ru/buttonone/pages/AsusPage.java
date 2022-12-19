package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class AsusPage extends BasePage{
    private final WebElement eventsAndPromotions = driver.findElement(By.xpath("//*[@id='skipContentFocus']/div[5]/h2"));

    public AsusPage(WebDriver driver) {
        super(driver);
    }
}
