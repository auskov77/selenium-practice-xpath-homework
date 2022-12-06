package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;

import static ru.buttonone.constants.XpathConstants.SEARCH_ELEMENT_ON_PAGE;

@Getter
public class SearchingResultPage extends BasePage{

    private final WebElement mySearchElementOnPage
            = driver.findElement(SEARCH_ELEMENT_ON_PAGE);
}
