package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class Drive2Page extends BasePage {
    private final WebElement allBrandsOfCars
            = driver.findElement(By.xpath("//button[@class='x-box-more']"));

    private final WebElement searchByBrand
            = driver.findElement(By.xpath("//h1[@class='x-header']"));

    public Drive2Page(WebDriver driver) {
        super(driver);
    }
}
