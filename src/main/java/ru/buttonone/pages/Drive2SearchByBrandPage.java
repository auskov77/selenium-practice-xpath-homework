package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class Drive2SearchByBrandPage extends BasePage {
    private final WebElement searchByBrand
            = driver.findElement(By.xpath("//h1[@class='x-header']"));

    public Drive2SearchByBrandPage(WebDriver driver) {
        super(driver);
    }
}
