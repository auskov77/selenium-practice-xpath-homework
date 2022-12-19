package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class Drive2AllBrandsOfCarsPage extends BasePage {
    private final WebElement allBrandsOfCars
            = driver.findElement(By.xpath("//button[@class='x-box-more']"));

    public Drive2AllBrandsOfCarsPage(WebDriver driver) {
        super(driver);
    }
}
