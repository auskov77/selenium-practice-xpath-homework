package ru.buttonone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.buttonone.helpers.LoadingHelper;
import ru.buttonone.pages.Drive2Page;
import ru.buttonone.pages.SearchingResultPage;
import ru.buttonone.pages.YandexPage;

import java.util.ArrayList;

import static ru.buttonone.pages.BasePage.driver;

public class MyPageSearchTest {
    private final LoadingHelper loadingHelper = new LoadingHelper();

    @Test
    public void shouldHaveCorrectToOpenYandex() {
        YandexPage yandexPage = new YandexPage();
        SearchingResultPage searchingResultPage = yandexPage.searchByPhraseAndClickEnter("drive2");
        searchingResultPage.getMySearchElementOnPage().click();
        loadingHelper.elementLoading(driver, By.xpath("//a[contains(@class, 'greenurl i-bem')]"));
        ArrayList<String> mySearchingPage = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mySearchingPage.get(1));
        Drive2Page drive2Page = new Drive2Page();
        WebElement allBrandsOfCars = drive2Page.getAllBrandsOfCars();

        Assertions.assertEquals("Все марки машин", allBrandsOfCars.getText());

        drive2Page.quit();
    }
}
