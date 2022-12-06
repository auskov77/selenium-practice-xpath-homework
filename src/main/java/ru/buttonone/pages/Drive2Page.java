package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;

import static ru.buttonone.constants.XpathConstants.ELEMENT_DRIVE2RU_PAGE;

@Getter
public class Drive2Page extends BasePage {


    private final WebElement allBrandsOfCars
            = driver.findElement(ELEMENT_DRIVE2RU_PAGE);
}
