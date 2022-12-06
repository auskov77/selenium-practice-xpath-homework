package ru.buttonone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.buttonone.pages.Drive2Page;
import ru.buttonone.pages.SearchingResultPage;
import ru.buttonone.pages.YandexPage;

import java.time.Duration;
import java.util.ArrayList;

import static ru.buttonone.TestConstants.XPATH_DRIVE2RU;
import static ru.buttonone.pages.BasePage.driver;

public class MyPageSearchTest {

    @Test
    public void shouldHaveCorrectToOpenYandex() {
        YandexPage yandexPage = new YandexPage();
        SearchingResultPage searchingResultPage = yandexPage.searchByPhraseAndClickEnter("drive2");
        searchingResultPage.getMySearchElementOnPage().click();
        pageLoad(driver, XPATH_DRIVE2RU);
        ArrayList<String> mySearchingPage = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mySearchingPage.get(1));
        Drive2Page drive2Page = new Drive2Page();
        WebElement allBrandsOfCars = drive2Page.getAllBrandsOfCars();

        Assertions.assertEquals("Все марки машин", allBrandsOfCars.getText());

        drive2Page.quit();
    }

    public void pageLoad(WebDriver driver, By by) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception ex) {
            System.err.println("Element not found!");
            ex.getStackTrace();
        }
    }
}
